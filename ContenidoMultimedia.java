package PlataformaStreaming;

import java.util.ArrayList;
import java.util.List;

abstract class ContenidoMultimedia {
    private String nombre;
    private String descripcion;
    private double calificacion;
    private int duracion; // en minutos

    public ContenidoMultimedia(String nombre, String descripcion, double calificacion, int duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.duracion = duracion; 
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public int getDuracion() {
        return duracion;
    }
}

// Subclase Pelicula
class Pelicula extends ContenidoMultimedia {
    public Pelicula(String nombre, String descripcion, double calificacion, int duracion) {
        super(nombre, descripcion, calificacion, duracion);
    }
}

// Subclase Serie
class Serie extends ContenidoMultimedia {
    public Serie(String nombre, String descripcion, double calificacion, int duracion) {
        super(nombre, descripcion, calificacion, duracion);
    }
}

// Subclase Documental
class Documental extends ContenidoMultimedia {
    public Documental(String nombre, String descripcion, double calificacion, int duracion) {
        super(nombre, descripcion, calificacion, duracion);
    }
}

