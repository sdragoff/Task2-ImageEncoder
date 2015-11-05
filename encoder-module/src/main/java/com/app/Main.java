package com.app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by alexander.mayboroda on 05-Nov-15.
 */
public class Main {

    public static final String CIPHER_PATH = "D:\\images\\cipher.txt";

    public static void main(String[] args) {

        Encoder encoder = new Encoder();
        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter(new FileWriter(CIPHER_PATH));
            writer.write(encoder.encode());

        }
        catch ( IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if ( writer != null) {
                    writer.close( );
                }
            }
            catch ( IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Encode complete.");
    }
}
