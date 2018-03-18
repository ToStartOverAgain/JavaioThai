/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class JavaIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileWriter file = new  FileWriter("thai.txt" ,true);
        BufferedWriter br = new BufferedWriter(file);
        br.write("hello");
        br.write("con di");
        
       FileReader file1 = new  FileReader("thai.txt");
       BufferedReader br1 = new BufferedReader(file1);
       
       String tmp;
        while (true) {  
            tmp = br1.readLine();
            if (tmp == null) {
                break;
                
            }
            System.out.println(tmp);
            String[] lineSplit = tmp.split("\\|");
            for (int i = 0; i <lineSplit.length; i++) {
                System.out.println(i + "-" + lineSplit[i].trim()+  "- ");
                
            }
        }
}
}
