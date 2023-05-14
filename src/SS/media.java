/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SS;

/**
 *
 * @author leena
 */
public abstract class media {
    private String name;
    private String genre;
    private String ageRating;

    public media(String name, String genre, String ageRating) {
        this.name = name;
        this.genre = genre;
        this.ageRating = ageRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getAgeRating() {
        return ageRating;
    }
}
