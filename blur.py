"""
@Chatbot AI
@Mopheshi
"""

import cv2
import numpy as np

# Load the img
img = cv2.imread("Images/l'agertha.jpg")

# Convert to grayscale
gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

# Create a kernel The size of the kernel affects the amount of blurring. A larger kernel size will result in stronger
# blurring. However, increasing the kernel size also increases the execution time of the algorithm.
kernel_size = 5
kernel = np.ones((kernel_size, kernel_size), np.float32)
kernel = kernel / (kernel_size * kernel_size)

# Convolution
result = cv2.filter2D(gray, -1, kernel)

# Convert grayscale to RGB
# blurredImage = cv2.cvtColor(img, cv2.COLOR_GRAY2RGB)

# Save the blurred img
cv2.imwrite("Images/blurred_image.jpg", result)

# Show blurred img
cv2.imshow("Original Image", img)
cv2.imshow("Blurred Image", result)
# waitKey = 0 means the system will continue to show img until user presses any key
cv2.waitKey(0)
