package Repositorio;

import org.springframework.data.repository.Repository;

import Modelo.produtosModelo;
import java.util.List;

public interface produtosRepositorio extends Repository<produtosModelo, Integer> {
	List<produtosModelo> findAll();
	produtosModelo  findById(Integer Id_produto );
	void delete (produtosModelo produto);

}

