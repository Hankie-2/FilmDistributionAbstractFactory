package kg.charginov.film.model;

public interface FilmDistributionFactory {
    Movie getMovie(String subtitle);
    Cartoon getCartoon(String subtitle);
    Anime getAnime(String subtitle);
}
