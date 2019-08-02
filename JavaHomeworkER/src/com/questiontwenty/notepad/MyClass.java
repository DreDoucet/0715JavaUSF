package com.questiontwenty.notepad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MyClass {
	
        public static void main(String[] args) throws IOException {
            BufferedReader reader = null;
            try{
                reader = new BufferedReader(new FileReader("./Data.txt")); //file location and name
                String line;
                while((line = reader.readLine()) != null){

                    String[] data = line.split(":"); //string split method with ":" as delimiter 

                    System.out.println("Name: "+data[0]+" "+data[1]);
                    System.out.println("Age: "+ data[2]+" years");
                    System.out.println("State: "+ data[3]+" State");
                    System.out.println("\n");
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }finally{
                if(reader != null){
                    reader.close();
                }
            }
        }
}
