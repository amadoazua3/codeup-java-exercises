package movies;

import util.Input;

import java.sql.SQLOutput;
import java.util.Scanner;


public class MoviesApplication {

    public static void main(String[] args) {

        Input input = new Input();
        printMovies(input.showOptions());

    }

    private static void printMovies(int userInput){

        switch (userInput){

            case 0:
                return;
            case 1:
                MoviesArray.getMovies();
                break;
            case 2:
                MoviesArray.getMoviesByCategory("animated");
                break;
            case 3:
                MoviesArray.getMoviesByCategory("drama");
                break;
            case 4:
                MoviesArray.getMoviesByCategory("horror");
                break;
            case 5:
                MoviesArray.getMoviesByCategory("scifi");
                break;
            case 6:
                MoviesArray.getMoviesByCategory("musical");
                break;
            default:
                System.out.println("Invalid choice!");

        }

        Input input = new Input();
        printMovies(input.showOptions());

    }


}
