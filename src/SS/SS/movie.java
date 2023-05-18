/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SS;

/**
 *
 * @author leena
 */
public final class movie extends media {
    private int lengthInMin;

    public movie(int lenghtInMin, String name, String genre, String ageRating) {
        super(name, genre, ageRating);
        this.lengthInMin = lenghtInMin;
    }

    public int getLenghtInMin() {
        return lengthInMin;
    }

    public void setLenghtInMin(int lenghtInMin) {
        this.lengthInMin = lenghtInMin;
    }

    @Override
    public String toString() {
        return String.format("movie title: %s, age rating: %s, genre: %s, length: %dm", super.getName(), super.getAgeRating(),super.getGenre(),lengthInMin);
    }
    
}
