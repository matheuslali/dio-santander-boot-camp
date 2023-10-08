package one.digitalinnovation.desafiopadraoprojetosspring.controllers;

import one.digitalinnovation.desafiopadraoprojetosspring.model.Product;
import one.digitalinnovation.desafiopadraoprojetosspring.model.ProductRecord;
import one.digitalinnovation.desafiopadraoprojetosspring.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    public List<ProductRecord> listar(){
        List<ProductRecord> products = repository.findAll().stream().map(product -> new ProductRecord(product.getNome(), product.getPreco())).toList();
        return products;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Product cadastrar(@RequestBody ProductRecord productRecord){
        var product = new Product(productRecord);
        return repository.save(product);
    }

    @GetMapping("/{id}")
    public Product buscarPorId(@PathVariable Long id){
        var productOptional = repository.findById(id);
        if (productOptional.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return productOptional.get();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus (code = HttpStatus.NO_CONTENT)
    public void excluirPorId (@PathVariable Long id){
        var productOptional = repository.findById(id);
        if (productOptional.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        repository.delete(productOptional.get());
    }

    @PutMapping("/{id}")
    public Product atualizarProduto(@PathVariable Long id, @RequestBody Product product){
        var productOptional = repository.findById(id);
        if(productOptional.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        product.setId(id);
        return repository.save(product);
    }

    @DeleteMapping
    @ResponseStatus (code = HttpStatus.NO_CONTENT)
    public void excuirAll (){
        repository.deleteAll();
    }
}
