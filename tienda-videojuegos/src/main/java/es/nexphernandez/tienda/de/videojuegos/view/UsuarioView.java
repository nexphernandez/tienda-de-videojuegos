package es.nexphernandez.tienda.de.videojuegos.view;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class UsuarioView {
    String nombreUsuario;
    String nombre;
    String contrasenia;
    String email;

    /**
     * Constructor vacio
     */
    public UsuarioView() {}

    /**
     * Constructor del atriuto principal de la clase
     * @param nombreUsuario nombre de usuario de la clase
     */
    public UsuarioView(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public UsuarioView(String nombreUsuario, String nombre, String contrasenia, String email) {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.email = email;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return this.contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Funcion equals de la clase
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UsuarioView)) {
            return false;
        }
        UsuarioView usuarioView = (UsuarioView) o;
        return Objects.equals(nombreUsuario, usuarioView.nombreUsuario);
    }

    /**
     * Funcion hashCode de la clase
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombreUsuario);
    }

    /**
     * Funcion toString de la clase
     */
    @Override
    public String toString() {
        return "Usuario={" +
            " nombreUsuario='" + getNombreUsuario() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", contrasenia='" + getContrasenia() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }
    
}
