package es.biblioteca.service;

import java.util.List;

import es.biblioteca.entity.Libro;
import es.biblioteca.entity.Prestamo;
import es.biblioteca.entity.Usuario;

public interface PrestamoService {

	public List<Prestamo> findAll();

	public Prestamo findById(Integer id);

	public void deleteById(Integer id);

	public Prestamo nuevoPrestamo(Prestamo prestamo);

	public List<Prestamo> findByUsuario(Usuario usuario);

	public List<Prestamo> findByLibro(Libro libro);

}
