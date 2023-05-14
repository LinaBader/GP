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
    private int NumOfEpisodes;
    private episod[] episodelist= new episod[NumOfEpisodes];

    public show(int NumOfSeasons, int NumOfEpisods, episod[] episodlist, String name, String genre, String ageRating) {
        super(name, genre, ageRating);
        this.NumOfSeasons = NumOfSeasons;
        this.NumOfEpisodes = NumOfEpisods;
        this.episodelist = episodlist;
    }

    public int getNumOfSeasons() {
        return NumOfSeasons;
    }

    public void setNumOfSeasons(int NumOfSeasons) {
        this.NumOfSeasons = NumOfSeasons;
    }

    public int getNumOfEpisodes() {
        return NumOfEpisodes;
    }

    public void setNumOfEpisodes(int NumOfEpisods) {
        this.NumOfEpisodes = NumOfEpisods;
    }

    public episod[] getEpisodelist() {
        return episodelist;
    }

    public void setEpisodelist(episod[] episodlist) {
        this.episodelist = episodlist;
    }
    public void displayEpisodlist(){
        for (episod e : episodelist) {
            System.out.println(e);
        }
    }
    @Override
    public String toString() {
        return "show title" +super.getName()+"age rating: "+ super.getAgeRating()+"\ngenre:"+super.getGenre()+"Seasons:" + NumOfSeasons + ", Episods:" + NumOfEpisodes ;
}}
