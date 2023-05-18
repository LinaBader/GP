/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class readtextfile {
   private Scanner input;
   public void open_file(String fileName){
       try{
           input = new Scanner(new File(fileName));}
        catch(FileNotFoundException e){
            System.err.println("error creating or opening file ");
            System.exit(1);}}
   public void read_file(){
     try{
         while(input.hasNext()){
             System.out.println(input.nextLine());}}
     catch (NoSuchElementException e){
         System.err.println("file improperly formed");
         input.close();
         System.exit(1);}
     catch(IllegalStateException e){
         System.err.println("error reading from file");
         System.exit(1);}}
   public void close_file(){
       if (input!=null)
            input.close();}
}
