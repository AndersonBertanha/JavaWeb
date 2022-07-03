package Repositorio;


	import org.springframework.data.repository.Repository;

	import Modelo.vendasModelo;
	import java.util.List;

	public interface vendasRepositorio extends Repository<vendasModelo, Integer> {
		List<vendasModelo> findAll();
		vendasModelo  findById(Integer Id_venda );
		void delete (vendasModelo venda);

	}



