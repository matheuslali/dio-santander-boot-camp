package one.digitalinnovation.desafiopadraoprojetosspring.model;

import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record ProductRecord(
        @NotBlank
        String nome,
        @NotBlank
        BigDecimal preco
        ) {
}
