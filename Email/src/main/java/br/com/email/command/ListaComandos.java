package br.com.email.command;

import java.util.List;

import br.com.email.model.Email;
import br.com.email.repository.EmailRepository;

public class ListaComandos {
	
	public List<Email> listaEmail(EmailRepository emailRepository) {
		return emailRepository.findAll();
	}
	
	public Email criaEmail(EmailRepository emailRepository, Email email) {
		return emailRepository.save(email);
	}

	public void deletaEmail(EmailRepository emailRepository, Long id) {
		if (emailRepository.existsById(id)) {
			emailRepository.deleteById(id);
		}
	}
	
	public Email updateEmail(EmailRepository emailRepository, Long id, Email novoEmail) {
		
		Email email = emailRepository.getById(id);
     
		email.setDataEmail(novoEmail.getDataEmail());
		email.setAssuntoEmail(novoEmail.getAssuntoEmail());
		email.setStatus(novoEmail.getStatus());
	
       return emailRepository.save(email); 
    }

}
