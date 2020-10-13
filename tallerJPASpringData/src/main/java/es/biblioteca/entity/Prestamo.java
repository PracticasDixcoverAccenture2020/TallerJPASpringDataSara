package es.biblioteca.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sara.pedrosa.ruiz
 * 
 * Préstamo que pueden realizar los usuarios
 *
 */


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Prestamo {	
	
	
	/**
	 * Integer que representa el Id de un prestamo
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/**
	 * Usuario Id
	 */
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Usuario usuario;
	
	/**
	 * Libro Id
	 */
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Libro libro;
	
	/**
	 * Date que representa la fecha en la que se realiza el prestamo
	 */
	@Temporal(TemporalType.DATE)
	private Date fecha_inicio;
	
	/**
	 * Date que representa la fecha en la que termina el prestamo
	 */
	@Temporal(TemporalType.DATE)
	private Date fecha_devolucion;
	
	

}
