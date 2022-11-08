package kg.charginov.film.model.bollywood;

import kg.charginov.film.model.Movie;

import java.util.List;

public class ComedyMovie implements Movie {
    List<String> subtitles = List.of("IND");

    String subtitle;

    public ComedyMovie(String subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public void distributeMovie() {
        if (!subtitles.contains(subtitle)) {
            System.out.println("Нет комедийного фильма с '"+subtitle + "' субтитрами.");
        }else{
            System.out.println("В кинопрокате есть комедийный фильм с '"+subtitle+"' субтитрами.");
        }
    }
}
