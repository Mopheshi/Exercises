/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @ChatGPT
 * @author MOPHE
 */
public class EdgeDetection {

    public static void main(String[] args) throws IOException {
        final String importPath = "C:\\Users\\MOPHE\\Documents\\NetBeansProjects\\Exercises\\src\\exercises\\Images\\lagertha.jpg";
        final String exportPath = "C:\\Users\\MOPHE\\Documents\\NetBeansProjects\\Exercises\\src\\exercises\\Images\\edgedLagertha.jpg";

        // Load image
        BufferedImage image = ImageIO.read(new File(importPath));

        // Write the binary image to file
        File output = new File(exportPath);
        ImageIO.write(detectEdges(image), "jpg", output);
    }

    public static BufferedImage detectEdges(BufferedImage inputImage) {
        // Define the convolution matrix (also called kernel or filter)
        int[][] matrix = {{-1, -1, -1}, {-1, 8, -1}, {-1, -1, -1}};
        // int matrixSize = 3;

        // Create a new output image with the same dimensions as the input image
        BufferedImage outputImage = new BufferedImage(
                inputImage.getWidth(), inputImage.getHeight(), BufferedImage.TYPE_INT_RGB);

        // Iterate over all pixels of the input image
        for (int y = 0; y < inputImage.getHeight(); y++) {
            for (int x = 0; x < inputImage.getWidth(); x++) {

                // Apply the convolution matrix to the surrounding pixels
                int sumRed = 0, sumGreen = 0, sumBlue = 0;
                for (int j = -1; j <= 1; j++) {
                    for (int i = -1; i <= 1; i++) {
                        if (x + i < 0 || x + i >= inputImage.getWidth() || y + j < 0
                                || y + j >= inputImage.getHeight()) {
                            continue; // Ignore pixels outside of the image boundary
                        }
                        int rgb = inputImage.getRGB(x + i, y + j);
                        int weight = matrix[j + 1][i + 1];
                        sumRed += weight * ((rgb >> 16) & 0xFF);
                        sumGreen += weight * ((rgb >> 8) & 0xFF);
                        sumBlue += weight * (rgb & 0xFF);
                    }
                }

                // Set the color of the output pixel based on the edge strength
                int newRGB = new Color(
                        clamp(sumRed), clamp(sumGreen), clamp(sumBlue)).getRGB();
                outputImage.setRGB(x, y, newRGB);
            }
        }

        return outputImage;
    }

    /**
     * Ensures that the output pixel values are between 0 and 255, which is the
     * valid range for RGB values. This method is called for each of the red,
     * green, and blue color components of the output pixel.
     */
    private static int clamp(int value) {
        // Ensure that the value is between 0 and 255
        return Math.min(Math.max(value, 0), 255);
    }

}
