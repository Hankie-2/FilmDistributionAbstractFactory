package kg.charginov.film.model.hollywood;

import kg.charginov.film.model.Anime;
import kg.charginov.film.model.Cartoon;
import kg.charginov.film.model.FilmDistributionFactory;
import kg.charginov.film.model.Movie;

public class HollywoodDistributionFactory implements FilmDistributionFactory {
    @Override
    public Movie getMovie(String subtitle) {
        return new HorrorMovie(subtitle);
    }

    @Override
    public Cartoon getCartoon(String subtitle) {
        return new DramaCartoon(subtitle);
    }

    @Override
    public Anime getAnime(String subtitle) {
        return new ComedyAnime(subtitle);
    }
}
