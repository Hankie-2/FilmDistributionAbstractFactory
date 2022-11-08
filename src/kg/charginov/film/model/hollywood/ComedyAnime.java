package kg.charginov.film.model.hollywood;

import kg.charginov.film.model.Anime;

import java.util.List;

public class ComedyAnime implements Anime {

    List<String> subtitles = List.of("ENG","JAP");

    String subtitle;

    public ComedyAnime(String subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public void distributeAnime() {
        if (!subtitles.contains(subtitle)) {
            System.out.println("Нет комедийного аниме с '"+subtitle + "' субтитрами.");
        }else{
            System.out.println("В кинопрокате есть комедийное аниме с '"+subtitle+"' субтитрами.");
        }
    }
}
