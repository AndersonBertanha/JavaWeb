package Repositorio;


import org.springframework.data.repository.Repository;

import Modelo.usuariosModelo;
import java.util.List;

public interface usuariosRepositorio extends Repository<usuariosModelo, Integer> {
	List<usuariosModelo> findAll();
	usuariosModelo  findById(Integer Id_usuario );
	void delete (usuariosModelo usuario);

}
