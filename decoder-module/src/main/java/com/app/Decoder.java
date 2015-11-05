package com.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

/**
 * Created by alexander.mayboroda on 05-Nov-15.
 */
public class Decoder {

    public static final String IMAGE_PATH = "D:\\images\\decoded_image.jpg";

    public Decoder() { }

    public void decode(String image) {
        byte[] restoredImage = Base64.getDecoder().decode(image);
        FileOutputStream output = null;
        try {
            output = new FileOutputStream(new File(IMAGE_PATH));
            output.write(restoredImage);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Decoded successfully.");
    }

}
