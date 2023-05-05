import numpy as np
import cv2

import image_threshold

"""
@Chatbot AI
@Mopheshi

In this code, we first define a kernel matrix of size 3x3 that we will use for edge detection. We then apply the 
convolution operation to the input img using this kernel matrix.
Finally, we normalize the output img and return it.

We can then apply this function to any img that we want to apply an edge detection effect to. In the example usage 
code above, we load an img from a file (using the `cv2.imread()` function), apply the `detect_edges()` function to 
it, and then display both the original and edge-detected images side by side using the `cv2.imshow()` function. Note 
that we're converting the output img to `uint8` data type (using the `np.uint8()` function) before clipping its 
values, since OpenCV expects images to be in that format.
"""

path = "Images/l'agertha.jpg"


def detectEdges(img, kernel_size=3):
    # Define the kernel for edge detection
    kernel = np.array([[-1, -1, -1], [-1, 8, -1], [-1, -1, -1]])

    # Apply the convolution operation to the img using the kernel
    outputimg = cv2.filter2D(img, -1, kernel)

    # Normalize the output img
    outputimg = np.uint8(np.clip(outputimg, 0, 255))

    return outputimg


image = cv2.imread(path, cv2.IMREAD_GRAYSCALE)
edgeDetectedImage = detectEdges(image)

# Show the original and edge-detected images side by side
combinedImage = np.hstack((image, edgeDetectedImage))
cv2.imshow(f'{path} edges', combinedImage)
cv2.waitKey(0)
