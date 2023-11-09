package YoutubePackage;

import java.util.ArrayList;
import java.util.List;

public class Criador extends Usuarios{
    private List<Video> videosPostados = new ArrayList<>();

    public Criador(){
        super();
    }

    public Criador(String nomeUsuario, String email, List<Video> videosPostados) {
        super();
        this.videosPostados = videosPostados;
    }

    public List<Video> getVideosPostados() {
        return videosPostados;
    }

    public void setVideosPostados(List<Video> videosPostados) {
        this.videosPostados = videosPostados;
    }

    @Override
    public String toString() {
        return "Criador{" +
                "videosPostados=" + videosPostados +
                '}';
    }

    public void PostarVideo(Video videosPostados){
        this.videosPostados.add(videosPostados);
    }
}
