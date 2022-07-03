package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name= "produtos")
@Entity

public class produtosModelo {
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column (name= "id_produto")
	private Integer id_produto;
	
	@Column (name= "descricao_produto")
	private String descricao_produto;
	
	@Column (name= "quantidade_produto")
	private Integer quantidade_produto;

	@Column (name= "valor")
	private Integer valor;

	public Integer getId_produto() {
		return id_produto;
	}

	public void setId_produto(Integer id_produto) {
		this.id_produto = id_produto;
	}

	public String getDescricao_produto() {
		return descricao_produto;
	}

	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}

	public Integer getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(Integer quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	
	

}

