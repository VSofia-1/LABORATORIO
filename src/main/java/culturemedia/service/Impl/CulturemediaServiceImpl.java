package culturemedia.service.Impl;

import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.service.CulturemediaService;
import java.util.List;

public class CulturemediaServiceImpl implements CulturemediaService {

    @Override
    public List<Video> findAll() {
        return List.of();  // Devuelve una lista vacía de videos
    }

    @Override
    public Video save(Video video) {
        System.out.println("Saving video: " + video);
        return video;  // Aquí se implementa la lógica real de guardado
    }

    @Override
    public View save(View view) {
        System.out.println("Saving view: " + view);
        return view;  // Implementa la lógica real de guardado para vista
    }
}
