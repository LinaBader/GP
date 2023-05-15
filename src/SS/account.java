/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SS;

import java.util.ArrayList;

/**
 *
 * @author leena
 */
public class account {
    private String username ;
    private String password ;
    private static media[] content = new media[6];
    private ArrayList<media> watchList;

    public account() {
        setContent();
    }

    public account(String username, String password) {
        this.username = username;
        this.password = password;
        setContent();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static media[] getContent() {
        return content;
    }

    public static void setContent() {
        episode[] moonknightElist={new episode("the goldfish problem",47,1), new episode("summon the suit", 52,1), new episode("the friendly type",52,1), new episode("the tomb", 51,1), new episode("asylum",47,1), new episode("gods and monsters",43,1)};
        content[0]= new show(1,6,moonknightElist,"Moon Knight","action and fantsy","TV-14");
        episode[] msmarvelElist ={new episode("generation why",47,1), new episode("crushed",49,1), new episode("destined",45,1), new episode("seeing red",46,1),new episode("time and again",38,1), new episode("no normal",47,1)};
        content[1]= new show(1,6,msmarvelElist,"Ms. Marvel","adventure comdy","TV-14");
        content[2]= new movie(110,"Uncharted","action","PG-13");
        content[3]= new movie(100,"tangle","family comdy", "PG");
        content[4]= new movie(125,"Taylor Swift reputation Studium Tour","concert documenary","PG-12");
        content[5]= new movie(120, "The Princess Diaries", "romcom","PG-12");
    }

    public ArrayList<media> getWatchList() {
        return watchList;
    }

    public void setWatchList(ArrayList<media> watchList) {
        this.watchList = watchList;
    }
     public void displayshows(media cont){
       for ( media m: content){
           if(m instanceof show)
               System.out.println(m+"\n-----------------------------------");
       }
    }
     public void displaymovies(){
        for ( media m: content){
           if(m instanceof movie)
               System.out.println(m+"\n-----------------------------------");
       }
    }
     public void addShowToWatchList(String name){
       for(media m: content){
           if(name.equals(m.getName()))
               watchList.add(m);
           else 
               System.out.println("we're sorry this show/movie is unavailable on our streaming service");
       }      
    }

}
