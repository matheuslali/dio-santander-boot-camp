package one.digitalinnovation.desafiopadraoprojetosspring.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
