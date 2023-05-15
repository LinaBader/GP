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
    private static media[] content ;
    private ArrayList<media> watchList;

    public account(String username, String password) {
        this.username = username;
        this.password = password;
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

    public static void setContent(media[] content) {
        account.content = content;
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
