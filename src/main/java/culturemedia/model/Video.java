package culturemedia.model

public class Video {
    //Creacion de los datos que van en la clase
    private String code;
    private String title;
    private String director;
    private Double duration;

    //Constructor
    public Video(String code, String title, String director, int duration){
        this.code = code
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    //Métodos set y get
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}