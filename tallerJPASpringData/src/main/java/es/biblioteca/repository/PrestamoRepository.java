package es.biblioteca.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import es.biblioteca.entity.Libro;
import es.biblioteca.entity.Prestamo;
import es.biblioteca.entity.Usuario;

public interface PrestamoRepository extends JpaRepository<Prestamo, Integer>{
	/**
	 * 
	 * @param usuario
	 * @return
	 */
	 public ArrayList<Prestamo> findByUsuario(Usuario usuario);
	 
	 /**
	  * 
	  * @param usuario
	  * @return
	  */
	 public ArrayList<Prestamo> findByLibro(Libro libro);
	 
	 /**
	  * 
	  * @param date
	  * @return
	  */
	 //public  List<Prestamo> findByfecha_inicio(Date date);
	 
	 /**
	  * 
	  * @param date
	  * @return
	  */
	 //public  List<Prestamo> findByfecha_devolucion(Date date);

	 /**
	  *    
	  * @return
	  */
	 public Optional<Prestamo> findFirstByOrderByIdDesc();

}
