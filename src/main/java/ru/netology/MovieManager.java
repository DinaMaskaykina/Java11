package ru.netology;

public class MovieManager {
    private String[] moviesPoster = new String[0];
    private int maxLength = 10;

    public MovieManager() {
    }

    public MovieManager(int maxLength) {

        this.maxLength = maxLength;
    }

    public String[] getMoviesPoster() {
        return moviesPoster;
    }
    public void setMoviesPoster(String[] moviesPoster) {
        this.moviesPoster = moviesPoster;
    }

    public int getMaxLimitLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public void add(String movie) {
        int length = moviesPoster.length + 1;
        String[] largePoster = new String[length];
        for (int i = 0; i < moviesPoster.length; i++) {
            largePoster[i] = moviesPoster[i];
        }
        int lastIndex = largePoster.length - 1;
        largePoster[lastIndex] = movie;
        moviesPoster = largePoster;
    }

    public void findAll() {

        getMoviesPoster();
    }

    public String[] findLast() {
        int endLength = moviesPoster.length;
        if (endLength > maxLength) {
            endLength = maxLength;
        }

        String[] lastFilm = new String[endLength];
        for (int i = 0; i < lastFilm.length; i++) {
            int index = moviesPoster.length -i - 1;
            lastFilm[i] = moviesPoster[index];
        }
        return lastFilm;
    }
}
