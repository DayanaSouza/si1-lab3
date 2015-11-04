package models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe Anuncio 
 * @author dayana
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ANUNCIO")
public class Anuncio implements Serializable{


	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "descricao")
	private String descricao;

	@Column(name = "email")
	private String email;

	
	//-----------------------------------------------Construtores-----------------------------------------------//
	
	 //Construtor para o Hibernate
	public Anuncio(){
       
    }

	 //Construtor da Classe
	public Anuncio(String titulo, String cidade,
			String bairro, String contato, String descricao, String email) throws Exception {
		
		if(!(titulo == null || titulo.equals(""))){
			this.titulo = titulo;	
		}else{
			throw new NullPointerException("Título é nulo ou inválido");
		}
		
		if(!(cidade == null || cidade.equals(""))){
			this.cidade = cidade;	
		}else{
			throw new NullPointerException("cidade é nulo ou inválido");
		}

		if(!(bairro == null || bairro.equals(""))){
			this.bairro = bairro;	
		}else{
			throw new NullPointerException("bairro é nulo ou inválido");
		}

		if(!(descricao == null || descricao.equals(""))){
			this.descricao = descricao;	
		}else{
			throw new NullPointerException("descricao é nulo ou inválido");
		}
		
		if(!(email == null || email.equals(""))){
			this.email = email;	
		}else{
			throw new NullPointerException(" é nulo ou inválido");
		}
	}

	
	//-----------------------------------------------Gets e Sets-----------------------------------------------//
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
