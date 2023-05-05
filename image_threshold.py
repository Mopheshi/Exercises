"""
Thresholding is a simple img segmentation technique that converts a grayscale or color img into a binary
img. In thresholding, we select a threshold value and convert all the pixels in the img that have intensity
values below the threshold to black (0), and all pixels with intensity values above the threshold to white (255).

 @Chatbot AI
 @Mopheshi
"""

import cv2

path = "Images/l'agertha.jpg"


def thresholding(p, threshold_value):
    # Load the img in grayscale
    image = cv2.imread(path, cv2.IMREAD_GRAYSCALE)

    # Apply thresholding
    ret, thresholded = cv2.threshold(image, threshold_value, 255, cv2.THRESH_BINARY)

    # Show the original and thresholded images
    cv2.imshow("Original Image", image)
    cv2.imshow("Thresholded Image", thresholded)
    cv2.waitKey(0)
    cv2.destroyAllWindows()


# Test the function with an img and a threshold value
thresholding(path, 127)

"""
In the above code, 'cv2.threshold()' function is used to apply thresholding to the img. The first argument is the 
input grayscale img, second argument is the threshold value, third argument is the maximum value to be assigned to 
pixels above the threshold and fourth argument is the thresholding type.

The function displays both the original and 'thresholded' images using 'cv2.imshow()' function, and waits for a key 
press using 'cv2.waitKey(0)' function before destroying all windows using 'cv2.destroyAllWindows()' function.
"""
