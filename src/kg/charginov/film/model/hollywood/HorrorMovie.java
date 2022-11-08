package kg.charginov.film.model.hollywood;

import kg.charginov.film.model.Movie;

import java.util.List;

public class HorrorMovie implements Movie {

    List<String> subtitles = List.of("RUS","ENG","ESP");

    String subtitle;

    public HorrorMovie(String subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public void distributeMovie() {
        if (!subtitles.contains(subtitle)) {
            System.out.println("Нет хоррор фильма с '"+subtitle + "' субтитрами.");
        }else{
            System.out.println("В кинопрокате есть хоррор фильм с '"+subtitle+"' субтитрами.");
        }
    }
}
