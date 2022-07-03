package Controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Modelo.clientesModelo;
import Repositorio.clientesRepositorio;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")

public class clientesControle {
	
	@Autowired
	clientesRepositorio clientesrep;
	
	@RequestMapping(value="/clientes", method = RequestMethod.GET)
	public @ResponseBody List<clientesModelo> consultar (){
		return this.clientesrep.findAll();
		
	}
	

}
