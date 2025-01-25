package es.nexphernandez.tienda.de.videojuegos.controller;

import es.nexphernandez.tienda.de.videojuegos.model.JuegoModel;
import es.nexphernandez.tienda.de.videojuegos.model.file.JuegoFile;
import es.nexphernandez.tienda.de.videojuegos.view.JuegoView;
import java.util.Objects;

/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class JuegoController {

    JuegoFile juegoFile;

    /**
     * Constructor vacio
     */
    public JuegoController (){
        juegoFile = new JuegoFile();
    }

    public JuegoFile getJuegoFile() {
        return this.juegoFile;
    }

    public void setJuegoFile(JuegoFile juegoFile) {
        this.juegoFile = juegoFile;
    }

    /**
     * Funcion para añadir juegos a la tienda
     * @param juegoView juego a añadir
     * @return true / false
     */
    public boolean add(JuegoView juegoView){
        if (juegoView == null) {
            return false;
        }
        return false;
    }

    /**
     * Funcion para buscar un juego por el codigo
     * @param codigo codigo del juego a buscar
     * @return juego encontrado / null
     */
    public JuegoView getById(String codigo){
        if (codigo == null || codigo.isEmpty()) {
            return null;
        }
        JuegoModel juegoABuscar = new JuegoModel(codigo);
        juegoABuscar = juegoFile.getJuego(juegoABuscar);
        JuegoView juegoView = new JuegoView(juegoABuscar.getNombre(),juegoABuscar.getCodigo(),juegoABuscar.getGenero());
        return juegoView;
    }

    /**
     * Funcion para eliminar un juego de la tienda
     * @param codigo codigo del juego a eliminar
     * @return true / false
     */
    public boolean remove(String codigo){
        if (codigo == null || codigo.isEmpty()) {
            return false;
        }
        return false;
    }

    /**
     * Funcion toString de la clase
     */
    @Override
    public String toString() {
        return "Juego={" +
            " juegoFile='" + getJuegoFile() + "'" +
            "}";
    }

    /**
     * Funcion equals de la clase
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof JuegoController)) {
            return false;
        }
        JuegoController juegoController = (JuegoController) o;
        return Objects.equals(juegoFile, juegoController.juegoFile);
    }
    
}
