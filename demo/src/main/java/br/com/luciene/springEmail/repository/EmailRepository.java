package br.com.luciene.springEmail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luciene.springEmail.model.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{

}
