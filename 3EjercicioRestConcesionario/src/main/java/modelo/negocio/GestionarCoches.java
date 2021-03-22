package modelo.negocio;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidad.Coche;
import modelo.persistencia.DaoCoche;



@Service
public class GestionarCoches {
	@Autowired
	private DaoCoche daocoche;

	public List<Coche> listar() {
		List<Coche> lista = daocoche.findAll();
        return lista;
	}
	public Coche altaCoche(Coche coche) {
		
		Coche c = daocoche.save(coche);
		return c;
	}
	
	public Coche obtener(int id) {
		Optional<Coche> opt = daocoche.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			return null;
		}
	}
	
	public Coche modificar(Coche c) {
		
		Coche coche = daocoche.save(c);
		return coche;
	}
	

	public boolean borrarCoche(int id) {
		if(daocoche.findById(id).isPresent()){
			daocoche.deleteById(id);
			return true;
		}
		return false;
	}
}
