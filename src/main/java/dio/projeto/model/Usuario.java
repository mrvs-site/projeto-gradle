package dio.projeto.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Usuario {

    private int id;

    private String nome;

    private LocalDate dataNascimento;

}
