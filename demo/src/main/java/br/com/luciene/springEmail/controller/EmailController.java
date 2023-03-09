package br.com.luciene.springEmail.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luciene.springEmail.dto.EmailDto;
import br.com.luciene.springEmail.model.EmailModel;
import br.com.luciene.springEmail.service.EmailService;
import jakarta.validation.Valid;

@RestController
public class EmailController {
	
	@Autowired
	EmailService emailService;
	
	@PostMapping("/mail")
	public ResponseEntity<EmailModel>sendingEmail(@RequestBody @Valid EmailDto emailDto){
	EmailModel emailModel = new EmailModel();
	BeanUtils.copyProperties(emailDto, emailModel); //converte de dto p model
	emailService.sendEmail(emailModel);
	return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
	}
}


