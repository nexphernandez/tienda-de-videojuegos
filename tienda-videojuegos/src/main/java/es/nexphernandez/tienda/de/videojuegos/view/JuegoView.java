package es.nexphernandez.tienda.de.videojuegos.view;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class JuegoView {

    private String nombre;
    private String codigo;
    private String genero;

    /**
     * Constructor vacio
     */
    public JuegoView(){}

    /**
     * Contructor con el atributo principal de la clase
     * @param codigo codigo del juego
     */
    public JuegoView(String codigo){
        this.codigo = codigo;
    }

    /**
     * Constructor de los atributos de la clase
     * @param nombre nombre del juego
     * @param codigo codigo del juego
     * @param genero genero del juego
     */
    public JuegoView(String nombre, String codigo, String genero){
        this.codigo = codigo;
        this.nombre = nombre;
        this.genero = genero;
    }
    

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
            " nombre='" + getNombre() + "'" +
            ", codigo='" + getCodigo() + "'" +
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
        if (!(o instanceof JuegoView)) {
            return false;
        }
        JuegoView juegoView = (JuegoView) o;
        return Objects.equals(codigo, juegoView.codigo);
    }

    /**
     * Funcion hashCode de la clase
     */
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
    
}
