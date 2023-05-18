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
        while(signup.sub==null){
        signup.setVisible(true);
        }
        
        // confirmation and closing the gui
        if(signup.sub!=null){
            signup.sub.confirm();
            signup.close();
        } 
        // if the user confirms 
        if(signup.sub.getStatus()!=null){
            System.out.println("welcome to our streaming service \n"+signup.sub);
            int cont = 0;
            while(cont!=4){
            System.out.println("1- view conten "
                    + "\n2-add show to watchlist"
                    + "\n3-view watchlist"
                    + "\n4-exist");
            cont = input.nextInt();
            switch (cont){
               case 1 : System.out.println("would you like to view movies or tv shows? m/s");
                    char answer = input.next().charAt(0);
                    switch (answer) {
                    case 'm':
                           signup.sub.getAccount().displaymovies();
                           break;
                    case 's':
                           signup.sub.getAccount().displayshows();
                           break;
                    default:
                           System.out.println("sorry that's not an option heres a list of all available content");
                           readtextfile read = new readtextfile();
                           read.open_file("contentFile.txt");
                           read.read_file();
                           read.close_file();
                           break;} 
                    break;
               case 2: System.out.println("would you like to add any to your watchlist?\nif yes enter the title");
                    String add = input.next();
                    signup.sub.getAccount().addShowToWatchList(add);
                    break;
               case 3:          
                    System.out.println("your watch list :");
                    for( media m :signup.sub.getAccount().getWatchList())
                    System.out.println(m);  break;
               case 4: 
                   System.exit(0);
                   break;
            }   
        }}
        // if they don't 
        else{
            System.exit(0);
        }
}}