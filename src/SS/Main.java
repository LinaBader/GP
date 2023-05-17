/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SS;
import java.util.*;
public class Main {
   
    public static void main(String[] args) {
        //saving content in a text file 
        account a= new account();
        writetextfile text= new writetextfile();
        text.open_file("contentFile.txt");
        for(media m: account.getContent())
            text.wriet_file(m);
        text.close_file();  
        // end
        signup signup= new signup();
        subscription s1 = null;
        while(s1==null){
        signup.setVisible(true);
        s1=signup.sub; }
        if(s1!=null)
        s1.confirm();
        signup.close();
        if(s1.getStatus()!=null)
            System.out.println(s1);
  }
}