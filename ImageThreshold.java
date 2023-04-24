/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author MOPHE
 */
public class ImageThreshold {

    /* In this implementation, we first load the input image using the 'ImageIO.read()' method.
    * We then apply thresholding to the image by looping through each pixel and calculating the grayscale value of that pixel.
    * We define a threshold value (here, 127) to determine whether to set the pixel color to black or white.
    * If the grayscale value is less than the threshold, we set the pixel color to black (0x000000),
    * otherwise we set it to white (0xffffff).
    *
    * Finally, we write the binary image to file using the 'ImageIO.write()' method.
    * This implementation uses the standard Java BufferedImage library and should work with most Java applications.
    */
    public static void main(String[] args) throws IOException {
        final String importPath = "C:\\Users\\MOPHE\\Documents\\NetBeansProjects\\Exercises\\src\\exercises\\Images\\lagertha.jpg";
        final String exportPath = "C:\\Users\\MOPHE\\Documents\\NetBeansProjects\\Exercises\\src\\exercises\\Images\\black%whiteLagertha.jpg";

        // Load the image
        BufferedImage image = ImageIO.read(new File(importPath));

        // Apply thresholding
        int threshold = 127;
        int width = image.getWidth();
        int height = image.getHeight();
        BufferedImage binaryImage = new BufferedImage(width, height,
                BufferedImage.TYPE_BYTE_BINARY);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int rgb = image.getRGB(i, j);
                int r = (rgb >> 16) & 0xff;
                int g = (rgb >> 8) & 0xff;
                // Zero constant can be removed
                int b = (rgb) & 0xff;
                // int b = (rgb >> 0) & 0xff;
                int gray = (r + g + b) / 3;
                if (gray < threshold) {
                    binaryImage.setRGB(i, j, 0x000000);
                } else {
                    binaryImage.setRGB(i, j, 0xffffff);
                }
            }
        }

        // Write the binary image to file
        File output = new File(exportPath);
        ImageIO.write(binaryImage, "jpg", output);
    }
}
