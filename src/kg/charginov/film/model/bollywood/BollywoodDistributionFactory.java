package kg.charginov.film.model.bollywood;

import kg.charginov.film.model.Anime;
import kg.charginov.film.model.Cartoon;
import kg.charginov.film.model.FilmDistributionFactory;
import kg.charginov.film.model.Movie;

public class BollywoodDistributionFactory implements FilmDistributionFactory {
    @Override
    public Movie getMovie(String subtitle) {
        return new ComedyMovie(subtitle);
    }

    @Override
    public Cartoon getCartoon(String subtitle) {
        return new FantasticCartoon(subtitle);
    }

    @Override
    public Anime getAnime(String subtitle) {
        return new FantasticAnime(subtitle);
    }
}
