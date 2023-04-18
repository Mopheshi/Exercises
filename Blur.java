/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Chatbot AI
 * @author MOPHE
 */
public class Blur {

    public static void main(String[] args) throws Exception {
        final String importPath = "image.jpg";
        final String exportPath = "blurredImage.jpg";

        // Load the image
        BufferedImage img = ImageIO.read(new File(importPath));
        int width = img.getWidth();
        int height = img.getHeight();

        // Create a kernel
        // Note: The performance of the algorithm may decrease for larger images or kernel sizes,
        // so some optimization may be necessary to improve execution time.
        int kernelSize = 5;
        double[][] kernel = new double[kernelSize][kernelSize];
        double kernelSum = 0.0;
        for (int i = 0; i < kernelSize; i++) {
            for (int j = 0; j < kernelSize; j++) {
                kernel[i][j] = 1.0 / (kernelSize * kernelSize);
                kernelSum += kernel[i][j];
            }
        }

        // Convert the image to a two-dimensional array of integers
        int[][] pixels = new int[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                pixels[x][y] = img.getRGB(x, y) & 0xff;
            }
        }

        // Apply the convolution operation using the kernel matrix
        int[][] newPixels = new int[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                double pixelSum = 0.0;
                for (int i = 0; i < kernelSize; i++) {
                    for (int j = 0; j < kernelSize; j++) {
                        int pixelVal = getPixelValue(pixels, width, height, x + i, y + j);
                        pixelSum += kernel[i][j] * pixelVal;
                    }
                }
                newPixels[x][y] = (int) (pixelSum / kernelSum);
            }
        }

        // Replace the original pixels with the new blurred pixels
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int p = (newPixels[x][y] << 16) | (newPixels[x][y] << 8) | newPixels[x][y];
                img.setRGB(x, y, p);
            }
        }

        // Save the blurred image
        ImageIO.write(img, "jpg", new File(exportPath));
    }

    // Get the pixel value of the image, handling out of bounds conditions
    private static int getPixelValue(int[][] pixels, int width, int height, int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            return 0;
        }
        return pixels[x][y];
    }
}
