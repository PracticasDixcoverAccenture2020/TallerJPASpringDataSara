package es.biblioteca.service;

import java.util.List;

import es.biblioteca.entity.Categoria;
import es.biblioteca.entity.Prestamo;
import es.biblioteca.entity.Usuario;



public interface CategoriaService {

    public List<Categoria> findAll();

    public Categoria findById(Integer id);

    public void deleteById(Integer id);

    public Categoria nuevaCategoria(Categoria categoria);
    
    public List<Prestamo> findByUsuario(Usuario usuario);
    
    public List<Usuario> findByNombre(String nombre);
}