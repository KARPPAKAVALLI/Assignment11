package com.assignment11;

import java.util.ArrayList;

public class Movie {
    //3. Similarly, add a constructor to the Movie class already created to add and display.
    String title;
    String genre;
    String actress;
    String actor;
    float budget;
    Movie(String title,String genre,String actress, String actor,float budget){
        this.title=title;
        this.genre=genre;
        this.actress=actress;
        this.actor=actor;
        this.budget=budget;
    }
    public void display(){
        System.out.println("Title: "+this.title);
        System.out.println("Genre: "+this.genre);
        System.out.println("Actress: "+this.actress);
        System.out.println("Actor: "+this.actor);
        System.out.println("Budget: "+this.budget);
    }

    public static void main(String[] args) {
        Movie movies[]=new Movie[3];
        movies[0]=new Movie("Singam","Action","Anushka","Suriya",2455000);
        movies[1]=new Movie("SpiderMan","SuperHero","Zendaya","Tom Holland",5679000);
        movies[2]=new Movie("Avatar","Fantasy","Zoe","Sam",19807056);

        for (Movie m:movies){
            m.display();
            System.out.println();
        }
    }
}
