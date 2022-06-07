package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    void add() {
        MovieManager manager = new MovieManager();
        String[] moviesMassive = new String[] {"One", "Two", "Three", "Four", "Five"};
        manager.setMoviesPoster(moviesMassive);
        String addMovie = "Six";
        String[] expected = new String[] {"One", "Two", "Three", "Four", "Five", "Six"};

        manager.add(addMovie);
        String[] actual = manager.getMoviesPoster();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findAll() {
        MovieManager manager = new MovieManager();

        String[] moviesMassive = new String[] {"One", "Two", "Three", "Four", "Five", "Six"};
        manager.setMoviesPoster(moviesMassive);
        String[] expected = new String[] {"One", "Two", "Three", "Four", "Five", "Six"};

        manager.findAll();
        String[] actual = manager.getMoviesPoster();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast() {
        MovieManager manager = new MovieManager(5);
        String[] moviesMassive = new String[]{"One", "Two", "Three", "Four", "Five", "Six"};
        manager.setMoviesPoster(moviesMassive);

        String[] expected= new String[] {"Six", "Five", "Four", "Three", "Two"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastMax() {
        MovieManager manager = new MovieManager(10);
        String[] moviesMassive = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine","Ten"};
        manager.setMoviesPoster(moviesMassive);

        String[] expected= new String[] {"Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }


}