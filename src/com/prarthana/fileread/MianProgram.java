/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.fileread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Pavilion G4
 */
public class MianProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String fileName="C:\\Users\\Pavilion G4\\Desktop\\filename.txt";
       /* FileReader reader=new FileReader(fileName);
  int i=0;
  while((i=reader.read())!=-1){
      System.out.println((char)i);
  }
  reader.close();*/
            URL url = new URL("http://www.tutorialspoint.com/java/java_basic_syntax.htm");
            URLConnection con=url.openConnection();
            
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }

}
