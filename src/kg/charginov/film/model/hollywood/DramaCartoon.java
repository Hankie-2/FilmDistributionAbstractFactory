package kg.charginov.film.model.hollywood;

import kg.charginov.film.model.Cartoon;

import java.util.List;

public class DramaCartoon implements Cartoon {

    List<String> subtitles = List.of("ENG","JAP");

    String subtitle;

    public DramaCartoon(String subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public void distributeCartoon() {
        if (!subtitles.contains(subtitle)) {
            System.out.println("Нет мультфильма драмы с '"+subtitle + "' субтитрами.");
        }else{
            System.out.println("В кинопрокате есть мультфильм драма с '"+subtitle+"' субтитрами.");
        }
    }
}
