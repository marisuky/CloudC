package controlador;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import modelo.negocio.GestionarCoches;
import modelo.entidad.Coche;



@RestController
public class Controlador {
	@Autowired
	public GestionarCoches gestioncoche;

	@Autowired
	private Environment environment;

	@GetMapping("coche")
	public ResponseEntity<List<Coche>> listar() {
		List<Coche> lista = gestioncoche.listar();
		ResponseEntity<List<Coche>> re = new ResponseEntity<List<Coche>>(lista, HttpStatus.OK);
		return re;
	}

	@PostMapping("coche")
	public ResponseEntity<Coche> alta(@RequestBody Coche coche) {
		Coche c = null;
		try {
			c = gestioncoche.altaCoche(coche);
		} catch (IllegalArgumentException e) {
			System.out.println("La matrícula ya existe.");
		}

		HttpStatus codigoRespuesta = null;

		if (c != null) {
			codigoRespuesta = HttpStatus.CREATED;
		} else {
			codigoRespuesta = HttpStatus.BAD_REQUEST;
		}
		ResponseEntity<Coche> re = new ResponseEntity<Coche>(c, codigoRespuesta);
		return re;
	}

	@GetMapping("coches/{id}")
	public ResponseEntity<Coche> obtener(@PathVariable("id") int id) {
		Coche c = gestioncoche.obtener(id);
		HttpStatus codigoRespuesta = null;
		if (c != null) {
			String serverPort = environment.getProperty("local.server.port");
			c.setMarca(serverPort+":"+c.getMarca());
			codigoRespuesta = HttpStatus.OK;
		} else {
			codigoRespuesta = HttpStatus.NOT_FOUND;
		}
		ResponseEntity<Coche> re = new ResponseEntity<Coche>(c, codigoRespuesta);
		return re;
	}

	@PutMapping("coche/{id}")
	public ResponseEntity<Coche> modificar(@RequestBody Coche coche, @PathVariable("id") int id) {

		coche.setId(id);
		Coche c = null;
		try {
			c = gestioncoche.modificar(coche);
		} catch (IllegalArgumentException e) {
			System.out.println("Estás intentando poner a este coche una matrícula ya existente");
		}
		HttpStatus codigoRespuesta = null;

		if (c != null) {
			codigoRespuesta = HttpStatus.OK;

		} else {
			codigoRespuesta = HttpStatus.BAD_REQUEST;

		}
		ResponseEntity<Coche> re = new ResponseEntity<Coche>(c, codigoRespuesta);
		return re;

	}

	@DeleteMapping("coche/{id}")
	public ResponseEntity<Integer> borrar(@PathVariable("id") int id) {

		boolean cocheBorrado = gestioncoche.borrarCoche(id);
		HttpStatus codigoRespuesta = null;

		if (cocheBorrado) {
			codigoRespuesta = HttpStatus.OK;

		} else {
			codigoRespuesta = HttpStatus.BAD_REQUEST;

		}
		ResponseEntity<Integer> re = new ResponseEntity<Integer>(id, codigoRespuesta);
		return re;

	}
}
