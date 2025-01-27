package es.nexphernandez.tienda.de.videojuegos.model.file;

import es.nexphernandez.tienda.de.videojuegos.model.PersonaModel;

public interface IFile {
    public boolean add (PersonaModel persona);
    public boolean read (PersonaModel persona);
    public boolean update (PersonaModel persona);
    public boolean delete (PersonaModel persona);
    public boolean delete (String identificador);

}
