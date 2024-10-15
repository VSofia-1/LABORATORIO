package culturemedia.repository;
import java.util.List;
import culturemedia.model.Video;
import culturemedia.model.View

public interface CulturemediaService {
    List<Video> findAll();
    Video save(Video save);
    View save(View save);
}