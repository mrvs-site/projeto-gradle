package dio.projeto.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UsuarioDTO {

 private int code;
 private String nome;
 private LocalDate dataAniversario;

}
