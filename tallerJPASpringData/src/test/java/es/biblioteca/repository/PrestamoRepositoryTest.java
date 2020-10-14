package es.biblioteca.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.api.DBRider;

import es.biblioteca.entity.Prestamo;


@DataJpaTest
@DBRider
@DisplayName("JUnit Test unitario repositorio Prestamo")

public class PrestamoRepositoryTest {

	@Autowired
	PrestamoRepository prestamoRepository;


	@Test
	@DataSet(value = "usuarios.yml, prestamos.yml, libros.yml, autores.yml, categorias.yml, editoriales.yml", cleanBefore = true, cleanAfter = true)
	@DisplayName("Test unitario buscar todos los prestamos")
	public void testFindAll() {

		List<Prestamo> prestamos =  prestamoRepository.findAll();

		assertEquals(prestamos.size(),28);

	}



	@Test
	@DataSet(value = "prestamos.yml, usuarios.yml, libros.yml, categorias.yml, editoriales.yml", cleanBefore = true, cleanAfter = true)
	@DisplayName("Test unitario buscar por id los prestamos")
	public void testFindById() {

		Optional<Prestamo> prestamo = prestamoRepository.findById(1);

		assertEquals(prestamo.isPresent(), true);


	}



}
