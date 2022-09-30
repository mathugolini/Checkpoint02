package br.com.email.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emails")
public class Email {
	
	@Id
	@GeneratedValue
	private Long id;
	private Instant dataEmail;
	private String assuntoEmail;
	private String status;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Instant getDataEmail() {
		return dataEmail;
	}
	public void setDataEmail(Instant dataEmail) {
		this.dataEmail = dataEmail;
	}
	public String getAssuntoEmail() {
		return assuntoEmail;
	}
	public void setAssuntoEmail(String assuntoEmail) {
		this.assuntoEmail = assuntoEmail;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
