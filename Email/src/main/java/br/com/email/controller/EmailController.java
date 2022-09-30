package br.com.email.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.email.command.ListaComandos;
import br.com.email.model.Email;
import br.com.email.repository.EmailRepository;

@RestController
@RequestMapping("emails")
public class EmailController {

	private EmailRepository emailRepository;
	private ListaComandos comandos;
	
	
	public EmailController(EmailRepository emailRepository) {
		this.emailRepository = emailRepository;
		this.comandos = new ListaComandos();
	}
	
	
	@GetMapping("/listar")
	public List<Email> listaEmail() {
		return comandos.listaEmail(emailRepository);
	}
	
	@PostMapping("/salvar")
	public Email criaEmail(@RequestBody Email email) {
		return comandos.criaEmail(emailRepository, email);
	}  

	@DeleteMapping("/{id}")
	public void deletaEmail(@PathVariable("id")Long id) {
		comandos.deletaEmail(emailRepository, id);
	}

	@PutMapping("/update/{id}")
	public Email alteraEmail(@PathVariable Long id, @RequestBody Email email) {
		return comandos.updateEmail(emailRepository, id, email);
	}
}
