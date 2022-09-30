package br.com.email.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.email.model.Email;

public interface EmailRepository extends JpaRepository<Email, Long>{

}
