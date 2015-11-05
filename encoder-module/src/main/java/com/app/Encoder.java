package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;

/**
 * Created by alexander.mayboroda on 05-Nov-15.
 */
public class Encoder {

    public static final String IMAGE_PATH = "D:\\images\\image.jpg";
    private byte[] imageBytes;

    public Encoder() {}

    public String encode(File inputImage) {
        File image = inputImage;
        try {
            FileInputStream input = new FileInputStream(image);
            imageBytes = new byte[(int) image.length()];
            input.read(imageBytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = Base64.getEncoder().encodeToString(imageBytes);
        return str;
    }

    public String encode() {
        File encImage = new File(IMAGE_PATH);
        return encode(encImage);
    }

}
