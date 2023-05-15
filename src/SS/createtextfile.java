/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SS;
import java.util.*;
import java.io.*;
/**
 *
 * @author leena
 */
public class createtextfile {
    private Formatter output;
    public void openFile(){
        try{
            output = new Formatter("contentfile.txt");
        }
        catch(FileNotFoundException e){
            System.err.println("error creating or opening file ");
            System.exit(1);
        }
    }
    
    public void addrecrods(media m){
        try{
            String x= m.toString();
            output.format(x);
            output.format("\n");
        }
        catch(FormatterClosedException e){
           System.err.println("error writing file");
        }
    }
    
    public void closeFile(){
        if (output!=null)
            output.close();
    }
}
