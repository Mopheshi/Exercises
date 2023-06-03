import pyttsx4

# Initialize the engine
engine = pyttsx4.init()

# Convert a given text to speech
engine.say("Hello World!")
engine.runAndWait()

# Set speech rate
rate = engine.getProperty('rate')
engine.setProperty('rate', rate + 50)

# Set pitch
engine.setProperty('pitch', 0.9)

# Set volume
engine.setProperty('volume', 0.8)

"""
Note that there are other TTS libraries available in Python such as gTTS, pyTTSx, etc. but pyttsx3 offers more 
flexibility in terms of voice manipulation and customization.
"""
