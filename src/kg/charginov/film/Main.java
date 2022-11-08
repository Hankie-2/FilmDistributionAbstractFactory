package kg.charginov.film;

import kg.charginov.film.model.Anime;
import kg.charginov.film.model.Cartoon;
import kg.charginov.film.model.FilmDistributionFactory;
import kg.charginov.film.model.Movie;
import kg.charginov.film.model.bollywood.BollywoodDistributionFactory;
import kg.charginov.film.model.hollywood.HollywoodDistributionFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hollywood Film Distribution");
        FilmDistributionFactory factory1 = new HollywoodDistributionFactory();
        Anime anime = factory1.getAnime("JAP");
        Cartoon cartoon = factory1.getCartoon("RUS");
        Movie movie = factory1.getMovie("CHN");

        anime.distributeAnime();
        cartoon.distributeCartoon();
        movie.distributeMovie();

        System.out.println();
        System.out.println("Bollywood Film Distribution");
        System.out.println();
        FilmDistributionFactory factory2 = new BollywoodDistributionFactory();
        Anime anime1 = factory2.getAnime("IND");
        Cartoon cartoon1 = factory2.getCartoon("JAP");
        Movie movie1 = factory2.getMovie("RUS");

        anime1.distributeAnime();
        cartoon1.distributeCartoon();
        movie1.distributeMovie();

    }
}
