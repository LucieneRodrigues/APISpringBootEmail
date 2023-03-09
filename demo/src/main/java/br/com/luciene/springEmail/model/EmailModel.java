package br.com.luciene.springEmail.model;

import java.io.Serializable;

import java.time.LocalDateTime;

import br.com.luciene.springEmail.enums.StatusEmail;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "email")
public class EmailModel implements Serializable{
	//essa classe chama entidade
	//obs @Data  ñ precisa de get e set
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long emailId;
	private String ownerRef; //id do usuaria q será enviado o email
	private String emailFrom; //quem está mandando o email
	private String emailTo; // para quem vai receber
	private String subject; //titulo email
	@Column(columnDefinition = "TEXT") //para textos longos, bastante caractere
	private String text; //corpo do email
	private LocalDateTime sendDateEmail; //data de envio
	private StatusEmail statusEmail; //status do email, enviado ou nao, criar classe enum	
	
	
	public Long getEmailId() {
		return emailId;
	}
	public void setEmailId(Long emailId) {
		this.emailId = emailId;
	}
	public String getOwnerRef() {
		return ownerRef;
	}
	public void setOwnerRef(String ownerRef) {
		this.ownerRef = ownerRef;
	}
	public String getEmailFrom() {
		return emailFrom;
	}
	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}
	public String getEmailTo() {
		return emailTo;
	}
	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public LocalDateTime getSendDateEmail() {
		return sendDateEmail;
	}
	public void setSendDateEmail(LocalDateTime sendDateEmail) {
		this.sendDateEmail = sendDateEmail;
	}
	public StatusEmail getStatusEmail() {
		return statusEmail;
	}
	public void setStatusEmail(StatusEmail statusEmail) {
		this.statusEmail = statusEmail;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
		
	}
	
	
	
	
	


