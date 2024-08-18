package PlataformaStreaming;

import java.util.ArrayList;
import java.util.List;

// Clase Catalogo
class Catalogo {
    private List<ContenidoMultimedia> contenido;

    public Catalogo() {
        this.contenido = new ArrayList<>();
    }

    public void agregarContenido(ContenidoMultimedia contenido) {
        this.contenido.add(contenido);
    }

    public void eliminarContenido(String nombre) {
        this.contenido.removeIf(c -> c.getNombre().equals(nombre));
    }

    public List<ContenidoMultimedia> recomendarContenido() {
        // Ordenar por calificación descendente
        contenido.sort((c1, c2) -> Double.compare(c2.getCalificacion(), c1.getCalificacion()));
        return contenido.subList(0, Math.min(5, contenido.size())); // Devuelve las 5 mejores calificadas
    }

    public List<ContenidoMultimedia> getContenido() {
        return contenido;
    }
}

public class PlataformaStreaming {
    public static void main(String[] args) {
        // Creación de usuarios
        Usuario usuario1 = new Usuario("Juan Ignacio", "NikeJustDoit");
        Usuario usuario2 = new Usuario("Geronimo", "713713TravisScott");

        // Creación del catálogo
        Catalogo catalogo = new Catalogo();

        // Agregar contenido al catálogo
        catalogo.agregarContenido(new Pelicula("Mortal Kombat", "Cole Young, luchador de MMA, desconoce su ascendencia y tampoco sabe por qué el emperador Shang Tsung ha enviado a su mejor guerrero para atraparlo. Ante esta situación, Cole busca a Sonya Blade siguiendo las indicaciones de Jax.", 5.1, 110));
        catalogo.agregarContenido(new Serie("Breaking Bad", "El profesor calmado de química de una secundaria, Walter White cree que su vida no puede ser peor. Su salario apenas le alcanza para sostener a su familia, una situación que no mejora cuando su esposa da a luz y su hijo adolescente sufre de parálisis cerebral, pero Walter queda anonadado cuando se entera que tiene un cáncer terminal. Al concluir que su enfermedad iba a arruinar financieramente a su familia, él toma una decisión desesperada con el fin de ganar más dinero durante el tiempo que le queda y transforma un viejo vehículo de recreación en un laboratorio de matanfetaminas sobre ruedas.", 10, 50));
        catalogo.agregarContenido(new Documental("Ciudad de Dios", "Después de formar una pandilla en Río de Janeiro, un joven y su mejor amigo pasan de los robos, al narcotráfico y a los asesinatos.", 9, 130 ));

        // Mostrar contenido recomendado
        List<ContenidoMultimedia> recomendados = catalogo.recomendarContenido();
        System.out.println("Contenido recomendado:");
        for (ContenidoMultimedia contenido : recomendados) {
            System.out.println(contenido.getNombre() + " - " + contenido.getCalificacion());
        }
    }
}