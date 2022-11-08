package kg.charginov.film.model.bollywood;

import kg.charginov.film.model.Anime;

import java.util.List;

public class FantasticAnime implements Anime {
    List<String> subtitles = List.of("IND");

    String subtitle;

    public FantasticAnime(String subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public void distributeAnime() {
        if (!subtitles.contains(subtitle)) {
            System.out.println("Нет фантастического аниме с '"+subtitle + "' субтитрами.");
        }else{
            System.out.println("В кинопрокате есть фантастическое аниме с '"+subtitle+"' субтитрами.");
        }
    }
}
