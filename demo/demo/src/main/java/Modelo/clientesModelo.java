package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name= "clientes")
@Entity

public class clientesModelo {
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column (name= "id_cliente")
	private Integer id_cliente;
	
	@Column (name= "nome_cliente")
	private String nome_cliente;
	
	@Column (name= "cpf")
	private String cpf;

	@Column (name= "telefone")
	private String telefone;
	
	@Column (name= "email")
	private String email;

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
