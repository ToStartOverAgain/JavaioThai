/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class JavaNio {
    public static void main(String[] args) {
         Path path = Paths.get("gio.txt");
        try {
            BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF-8"));
        } catch (IOException ex) {
            Logger.getLogger(JavaNio.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
}
