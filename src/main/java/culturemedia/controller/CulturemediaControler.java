package culturemedia.controller;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.service.CulturemediaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.List;

@RestController
public class CulturemediaControler {
    CulturemediaService culturemediaService;

    public CulturemediaControler(CulturemediaService culturemediaService){
        this.culturemediaService = culturemediaService;
    }

    @GetMapping("/videos")
    public List<Video> findAllVideos() throws VideoNotFoundException{
        List<Video> videos = culturemediaService.findAll();
        return videos;
    }

    @PostMapping("/videos")
    public Video save(@RequestBody Video video){
        culturemediaService.save(video);
        return video;
    }
}