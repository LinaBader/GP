/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SS;

/**
 *
 * @author leena
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        account a= new account();
        createtextfile text= new createtextfile();
        text.openFile();
        for(media m: a.getContent())
            text.addrecrods(m);
        text.closeFile();
        
    }
    
}
