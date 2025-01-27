package es.nexphernandez.tienda.de.videojuegos.model;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class UsuarioModel extends PersonaModel{
    private String email;
    private String password;

    /**
     * Cosntructor vacio de la clase
     */
    public UsuarioModel() {
    }

    /**
     * Constructor de los atributos de la clase
     * @param nombre nombre del ususario
     * @param dni dni del ususario
     * @param email email del usuario
     * @param password password del usuario
     */
    public UsuarioModel(String nombre, String dni, String email, String password) {
        super(nombre, dni);
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UsuarioModel email(String email) {
        setEmail(email);
        return this;
    }

    public UsuarioModel password(String password) {
        setPassword(password);
        return this;
    }

    /**
     * Funcion de la clase ToStrind de la clase Usuario
     */
    @Override
    public String toString() {
        return "" +
            super.toString() +
            " email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            "";
    }
    
}
