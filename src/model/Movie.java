/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Movie {
    private String mid, title, genre, language, subtitle;
    private int duration;
    private String director, cast;
    private LocalDate release_date, end_date;
    private String description;

    public Movie() {
        this.mid = new String();
        this.title = new String();
        this.genre = new String();
        this.language = new String();
        this.subtitle = new String();
        this.director = new String();
        this.cast = new String();
        this.description = new String();
        this.duration = 0;
        this.release_date = LocalDate.of(2000,1,1);
        this.end_date = LocalDate.of(2000,1,1);
//        this.release_date = new Date();
//        this.end_date = new Date();
    }

    public Movie(String mid, String title, String genre, String language, String subtitle, int duration, String director, String cast, LocalDate release_date, LocalDate end_date, String description) {
        this.mid = mid;
        this.title = title;
        this.genre = genre;
        this.language = language;
        this.subtitle = subtitle;
        this.duration = duration;
        this.director = director;
        this.cast = cast;
        this.release_date = release_date;
        this.end_date = end_date;
        this.description = description;
    }

    public String getMid() {
        return mid;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public int getDuration() {
        return duration;
    }

    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
    }

    public LocalDate getRelease_date() {
        return release_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public String getDescription() {
        return description;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public void setRelease_date(LocalDate release_date) {
        this.release_date = release_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public static LocalDate convertLocalDateFromSqlDate(Date sqlDate) {
        if (sqlDate != null) {
            return LocalDate.ofInstant(sqlDate.toInstant(), ZoneId.systemDefault());
        }
        return null;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.mid);
        hash = 29 * hash + Objects.hashCode(this.title);
        hash = 29 * hash + Objects.hashCode(this.genre);
        hash = 29 * hash + Objects.hashCode(this.language);
        hash = 29 * hash + Objects.hashCode(this.subtitle);
        hash = 29 * hash + this.duration;
        hash = 29 * hash + Objects.hashCode(this.director);
        hash = 29 * hash + Objects.hashCode(this.cast);
        hash = 29 * hash + Objects.hashCode(this.release_date);
        hash = 29 * hash + Objects.hashCode(this.end_date);
        hash = 29 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (this.duration != other.duration) {
            return false;
        }
        if (!Objects.equals(this.mid, other.mid)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.genre, other.genre)) {
            return false;
        }
        if (!Objects.equals(this.language, other.language)) {
            return false;
        }
        if (!Objects.equals(this.subtitle, other.subtitle)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.cast, other.cast)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.release_date, other.release_date)) {
            return false;
        }
        return Objects.equals(this.end_date, other.end_date);
    }

    @Override
    public String toString() {
        return "Movie{" + "mid=" + mid + ", title=" + title + ", genre=" + genre + ", language=" + language + ", subtitle=" + subtitle + ", duration=" + duration + ", director=" + director + ", cast=" + cast + ", release_date=" + release_date + ", end_date=" + end_date + ", description=" + description + '}';
    }

    
}
