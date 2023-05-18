/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SS;
import java.util.*;
import java.io.*;
public class writetextfile {
    private Formatter output;
   
   public void open_file(String fileName){
       try{
           output = new Formatter(fileName);}
        catch(FileNotFoundException e){
            System.err.println("error creating or opening file ");
            System.exit(1);
        }}
   public void wriet_file(media m){
       try{
            output.format("%s\n----------------------------------------------------------------------------------------------------------------------\n",m.toString());
        }
        catch(FormatterClosedException e){
           System.err.println("error writing file"); }}
   public void close_file(){
       if (output!=null)
            output.close();
   }
}
