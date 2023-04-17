"""
@Chatbot AI
@Mopheshi
"""

import cv2
import numpy as np

# Load the image
img = cv2.imread("Images/lagertha.jpg")

# Convert to grayscale
gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

# Create a kernel The size of the kernel affects the amount of blurring. A larger kernel size will result in stronger
# blurring. However, increasing the kernel size also increases the execution time of the algorithm.
kernel_size = 5
kernel = np.ones((kernel_size, kernel_size), np.float32)
kernel = kernel / (kernel_size * kernel_size)

# Convolution
result = cv2.filter2D(gray, -1, kernel)

# Show blurred image
cv2.imshow("Image", result)
cv2.waitKey(1)

# Save the blurred image
cv2.imwrite("Images/blurred_image.jpg", result)