//Otra manera de crear una clase para almacenar datos, sin tener que hacer los metodos set y get
package culturemedia.model;

import java.time.LocalDateTime;

//Creamos la clase
public record View(String userFullName, LocalDateTime startPlayingTime, Integer age, Video video) {
}