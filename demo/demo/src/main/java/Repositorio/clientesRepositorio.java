package Repositorio;

import org.springframework.data.repository.Repository;

import Modelo.clientesModelo;
import java.util.List;

public interface clientesRepositorio extends Repository<clientesModelo, Integer> {
	List<clientesModelo> findAll();
	clientesModelo  findById(Integer Id_cliente );
	void delete (clientesModelo cliente);

}
