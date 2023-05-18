/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SS;
import java.util.*;
public class Main {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //saving content in a text file 
        account a= new account();
        writetextfile text= new writetextfile();
        text.open_file("contentFile.txt");
        for(media m: account.getContent())
            text.wriet_file(m);
        text.close_file();  
        // gui (creating account and subscription)
        signup signup = new signup();
        signup.setDefaultCloseOperation(signup.HIDE_ON_CLOSE);
        subscription s1 = null;
        while(s1==null){
        signup.setVisible(true);
        s1=signup.sub; 
        }
        
        // confirmation and closing the gui
        if(s1!=null){
            s1.confirm();
            signup.close();
        } 
        // if the user confirms 
        if(s1.getStatus()!=null){
            System.out.println("welcome to our streaming service \n"+s1);
            System.out.println("would you like to view movies or tv shows? m/s");
            char answer = input.next().charAt(0);
            switch (answer) {
                case 'm':
                    s1.getAccount().displaymovies();
                    break;
                case 's':
                    s1.getAccount().displayshows();
                    break;
                default:
                    System.out.println("sorry that's not an option heres a list of all available content");
                    readtextfile read = new readtextfile();
                    read.open_file("contentFile.txt");
                    read.read_file();
                    read.close_file();
                    break;
            }
            System.out.println("would you like to add any to your watchlist?\nif yes enter the title");
            String add = input.next();
            s1.getAccount().addShowToWatchList(add);
            
        }
        // if they don't 
        else{
            System.exit(0);
        }
     }
}