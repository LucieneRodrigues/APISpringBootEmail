package br.com.luciene.springEmail.dto;

import jakarta.validation.constraints.Email;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDto {
	
	@NotBlank //ñ vasio
	private String owerRef;
	@NotBlank
	@Email
	private String emailFrom;
	@NotBlank
	@Email //verifica se ah um email valido
	private String emailTo;
	@NotBlank
	private String subject;
	@NotBlank
	private String text;
	
	
	//obs @Data  ñ precisa de get e set

}
