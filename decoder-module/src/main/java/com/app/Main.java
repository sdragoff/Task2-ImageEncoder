package com.app;

import java.io.*;

/**
 * Created by alexander.mayboroda on 05-Nov-15.
 */
public class Main {

    public static final String CIPHER_PATH = "D:\\images\\cipher.txt";

    public static void main(String[] args) {

        Decoder decoder = new Decoder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(CIPHER_PATH)));
            decoder.decode(reader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
