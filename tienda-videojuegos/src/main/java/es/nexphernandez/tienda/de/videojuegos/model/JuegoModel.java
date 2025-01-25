package es.nexphernandez.tienda.de.videojuegos.model;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class JuegoModel {
    String codigo;
    String nombre;
    String genero;

    /**
     * Constructor vacio
     */
    public JuegoModel(){}

    /**
     * Constructor con el atributo principal de la clase
     * @param codigo del juego
     */
    public JuegoModel(String codigo){
        this.codigo = codigo;
    }

    /**
     * Constructor con los atributos de la clase
     * @param codigo codigo del juego
     * @param nombre nombre del juego
     * @param genero genero del juego
     */
    public JuegoModel(String codigo, String nombre, String genero){
        this.codigo = codigo;
        this.genero = genero;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Funcion toString de la clase
     */
    @Override
    public String toString() {
        return "Juego={" +
            " codigo='" + getCodigo() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", genero='" + getGenero() + "'" +
            "}";
    }

    /**
     * Funcion equals de la clase
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof JuegoModel)) {
            return false;
        }
        JuegoModel juegoModel = (JuegoModel) o;
        return Objects.equals(codigo, juegoModel.codigo);
    }

    /**
     * Funcion hashcode de la clase
     */
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
    
}
