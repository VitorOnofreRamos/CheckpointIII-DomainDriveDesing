package YoutubePackage;

import java.util.ArrayList;
import java.util.List;

public class Espectador extends Usuarios{
    private List<Video> videosAssistidos = new ArrayList<>();

    public Espectador(){
        super();
    }

    public Espectador(List<Video> videosAssistidos) {
        this.videosAssistidos = videosAssistidos;
    }

    public List<Video> getVideosAssistidos() {
        return videosAssistidos;
    }

    public void setVideosAssistidos(List<Video> videosAssistidos) {
        this.videosAssistidos = videosAssistidos;
    }

    @Override
    public String toString() {
        return "Espectador{" +
                "videosAssistidos=" + videosAssistidos +
                '}';
    }

    public void AssitirVideo(Video videoAssistidos){
        this.videosAssistidos.add(videoAssistidos);
    }
}

