package com.bytedance.nacosprovidermovie.bean;

public class Movie {
    Integer id;
    String movieName;

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                '}';
    }

    public Movie() {
    }

    public Movie(Integer id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
