import YoutubePackage.Criador;
import YoutubePackage.Espectador;
import YoutubePackage.Video;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var criador1 = new Criador();
        criador1.setNomeUsuario("Paulin Bacana");
        criador1.setEmail("paulin27@gmail.com");
        criador1.PostarVideo(new Video(
                "Video1",
                "Informação",
                0,
                new String[]{"Paulin", "Primeiro", "Ferramentas"}
        ));
        criador1.PostarVideo(new Video(
                "Vídeo2",
                "Educação",
                0,
                new String[]{"Paulin", "Segundo", "Comico"}
        ));
        criador1.PostarVideo(new Video(
                "Vídeo3",
                "Entreterimento",
                0,
                new String[]{"Paulin", "Terceiro", "Pararelepipedo"}
        ));

        var espectador1 = new Espectador();
        espectador1.setNomeUsuario("Um Cara Aí");
        espectador1.setEmail("carA1@outlook.com");

        System.out.println(criador1);
    }
}