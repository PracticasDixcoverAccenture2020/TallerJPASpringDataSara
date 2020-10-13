package es.biblioteca.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @author sara.pedrosa.ruiz
 * Usuario que puede obetener diversos prestamos en la biblioteca
 * 
 */

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
	
	/**
	 * Integer que representa el Id de un usuario
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/**
	 * String que representa el nombre del usuario 
	 */
	private String nombre;
	
	/**
	 * ArryList que contiene los prestamos que el usuario realiza
	 */
	@OneToMany(mappedBy="usuario")
	private List<Prestamo> prestamos;
	
	

}
