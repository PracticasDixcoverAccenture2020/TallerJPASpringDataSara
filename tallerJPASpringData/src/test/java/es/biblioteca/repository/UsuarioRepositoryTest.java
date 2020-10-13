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

import es.biblioteca.entity.Usuario;


@DataJpaTest
@DBRider
@DisplayName("JUnit Test unitario repositorio Usuario")
public class UsuarioRepositoryTest {

	@Autowired
	UsuarioRepository usuarioRepository;


	@Test
	@DataSet(value = "usuarios.yml, prestamos.yml, libros.yml, autores.yml, categorias.yml, editoriales.yml", cleanBefore = true, cleanAfter = true)
	@DisplayName("Test unitario buscar todos")
	public void testFindAll() {

		List<Usuario> usuarios =  usuarioRepository.findAll();

		assertEquals(usuarios.size(),10);
		assertEquals(usuarios.get(0).getPrestamos().size(), 28);
	}



	@Test
	@DataSet(value = "usuarios.yml", cleanBefore = true, cleanAfter = true)
	@DisplayName("Test unitario buscar por id")
	public void testFindById() {

		Optional<Usuario> usuario = usuarioRepository.findById(1);

		assertEquals(usuario.isPresent(), true);
		assertEquals(usuario.get().getNombre(),"Agapito");

	}



}
