package br.senac.sp.epictask.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Loja {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank
    String marca;

    @Size(min = 5, message = "Digite um produto")
    String tituloProd;
 
    @Min(value = 1, message = "quantidade não pode ser negativo")
    Integer tamanho;

    @Min(value = 1, message = "quantidade não pode ser negativo")
    Integer quantidade;

    @Size(min = 1, message = "Digite uma descrição com pelo menos 1 caracteries")
    String genero;

    @Size(min = 4, message = "Digite uma descrição com pelo menos 4 caracteries")
    String cor;

    @Size(min = 5, message = "Digite uma descrição com pelo menos 5 caracteries")
    String descricao;
    
    @Size(min = 3, message = "Digite uma descrição com pelo menos 3 caracteries")
    String material;

}
