package YoutubePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Video {
    private String nomeVideo;
    private String categoria;
    private int visualizacoes;
    private String[] tags;

    public Video(String nomeVideo, String categoria, int visualizacoes, String[] tags) {
        this.nomeVideo = nomeVideo;
        this.categoria = categoria;
        this.visualizacoes = visualizacoes;
        this.tags = tags;
    }

    public String getNomeVideo() {
        return nomeVideo;
    }

    public void setNomeVideo(String nomeVideo) {
        this.nomeVideo = nomeVideo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Video{" +
                "nomeVideo='" + nomeVideo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", visualizacoes=" + visualizacoes +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }
}