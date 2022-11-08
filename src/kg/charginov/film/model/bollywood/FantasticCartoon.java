package kg.charginov.film.model.bollywood;

import kg.charginov.film.model.Cartoon;

import java.util.List;

public class FantasticCartoon implements Cartoon {
    List<String> subtitles = List.of("IND");

    String subtitle;

    public FantasticCartoon(String subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public void distributeCartoon() {
        if (!subtitles.contains(subtitle)) {
            System.out.println("Нет фантастического мультфильма с '"+subtitle + "' субтитрами.");
        }else{
            System.out.println("В кинопрокате есть фантастический мультфильм с '"+subtitle+"' субтитрами.");
        }
    }
}
