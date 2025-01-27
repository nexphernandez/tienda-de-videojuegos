package es.nexphernandez.tienda.de.videojuegos.model;
import java.util.Objects;
/**
 * @author nexphernadez
 * @version 1.0.0
 */
public abstract class PersonaModel {
    private String nombre;
    private String dni;

    /**
     * Constructor vacio
     */
    public PersonaModel() {}

    /**
     * Constructor del atributo principal de la clase
     * @param dni dni de la persona
     */
    public PersonaModel(String dni) {
        this.dni = dni;
    }

    /**
     * Constructor de los atributos de la clase
     * @param nombre nombre de la persona
     * @param dni dni de la persona
     */
    public PersonaModel(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Funcion equals de la clase persona
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PersonaModel)) {
            return false;
        }
        PersonaModel personaModel = (PersonaModel) o;
        return Objects.equals(dni, personaModel.dni);
    }

    /**
     * Funcion hashCode de la clase persona
     */
    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    /**
     * Funcion t
     */
    @Override
    public String toString() {
        return "" +
            " nombre='" + getNombre() + "'" +
            ", dni='" + getDni() + "'" +
            "";
    }
    

}
