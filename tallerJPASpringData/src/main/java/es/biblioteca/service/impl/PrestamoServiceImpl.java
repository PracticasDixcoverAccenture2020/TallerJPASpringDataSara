package es.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.biblioteca.entity.Libro;
import es.biblioteca.entity.Prestamo;
import es.biblioteca.entity.Usuario;
import es.biblioteca.repository.PrestamoRepository;
import es.biblioteca.service.PrestamoService;

public class PrestamoServiceImpl implements PrestamoService {
	
	@Autowired
	private PrestamoRepository prestamoRepository;

	@Override
	public List<Prestamo> findAll() {
		
		return prestamoRepository.findAll();

	}

	@Override
	public Prestamo findById(Integer id) {
		

		return prestamoRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Integer id) {
		
		prestamoRepository.deleteById(id);
		
	}

	@Override
	public Prestamo nuevoPrestamo(Prestamo prestamo) {
		
		return prestamoRepository.save(prestamo);
		
	}

	@Override
	public List<Prestamo> findByUsuario(Usuario usuario) {
		
		return prestamoRepository.findByUsuario(usuario);
	}

	@Override
	public List<Prestamo> findByLibro(Libro libro) {
		
		return prestamoRepository.findByLibro(libro);
	}

}
