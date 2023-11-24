
package com.mycompany.musicdb.logica;

import com.mycompany.musicdb.persistencia.ControladorPersistencia;
import java.util.List;

/**
 *
 * @author Andres
 */
public class Controlador {

    ControladorPersistencia controlP = new ControladorPersistencia();
    
    public void guardar(String titulo, String artista, int anio, int duracion, String genero) {

        Song song = new Song();
        
        song.setTitulo(titulo);
        song.setArtista(artista);
        song.setAnio(anio);
        song.setDuracion(duracion);
        song.setGenero(genero);
        
        controlP.guardar(song);
    }

    public List<Song> traerSong() {
        
        return controlP.traerSong();
    }

    public void borrarSong(int idSong) {
        controlP.borrarSong(idSong);
    }

    public Song traerSong(int idSong) {
        return controlP.traerSong(idSong);
    }

    public void modificarSong(Song song, String titulo, String artista, int anio, int duracion, String genero) {
        
        song.setTitulo(titulo);
        song.setArtista(artista);
        song.setAnio(anio);
        song.setDuracion(duracion);
        song.setGenero(genero);
        
        controlP.modificarSong(song);
        
    }
    
}
