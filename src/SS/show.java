/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SS;

/**
 *
 * @author leena
 */
public class show extends media {
    private int NumOfSeasons;
    private int NumOfEpisods;
    private episod[] episodlist;

    public show(int NumOfSeasons, int NumOfEpisods, episod[] episodlist, String name, String genre, String ageRating) {
        super(name, genre, ageRating);
        this.NumOfSeasons = NumOfSeasons;
        this.NumOfEpisods = NumOfEpisods;
        this.episodlist = episodlist;
    }

    public int getNumOfSeasons() {
        return NumOfSeasons;
    }

    public void setNumOfSeasons(int NumOfSeasons) {
        this.NumOfSeasons = NumOfSeasons;
    }

    public int getNumOfEpisods() {
        return NumOfEpisods;
    }

    public void setNumOfEpisods(int NumOfEpisods) {
        this.NumOfEpisods = NumOfEpisods;
    }

    public episod[] getEpisodlist() {
        return episodlist;
    }

    public void setEpisodlist(episod[] episodlist) {
        this.episodlist = episodlist;
    }
    
    @Override
    public String toString() {
        return "show title" +super.getName()+"age rating: "+ super.getAgeRating()+"\ngenre:"+super.getGenre()+"Seasons:" + NumOfSeasons + ", Episods:" + NumOfEpisods ;
}}
