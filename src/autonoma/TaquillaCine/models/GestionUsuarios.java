package autonoma.TaquillaCine.models;

public interface GestionUsuarios {
    void registrarUsuario(Usuario usuario);
    void eliminarUsuario(String identificacion);
    void actualizarUsuario(Usuario usuario);
    Usuario buscarUsuario(String id);
}