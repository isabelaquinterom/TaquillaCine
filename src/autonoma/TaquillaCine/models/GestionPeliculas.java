package autonoma.TaquillaCine.models;

import java.util.List;

public interface GestionPeliculas {
    void agregarPelicula(Pelicula pelicula);
    void eliminarPelicula(String titulo);
    void actualizarPelicula(Pelicula pelicula);
    List<Pelicula> listarPeliculas();
}