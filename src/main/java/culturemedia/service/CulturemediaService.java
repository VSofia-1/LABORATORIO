package culturemedia.service;

import culturemedia.model.Video;
import culturemedia.model.View;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CulturemediaService {
    List<Video> findAll();  // Encuentra todos los videos
    Video save(Video save); // Guarda un video
    View save(View save);   // Guarda una vista
    List<Video> findByTitle(String title);
    List<Video> findByDuration(double minDuration, double maxDuration);
}