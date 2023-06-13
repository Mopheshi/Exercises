import speech_recognition as sr

# Create a SpeechRecognizer object
r = sr.Recognizer()

# Use the record() method to capture audio from an audio file or microphone, and store it in an AudioData object.

with sr.AudioFile('audio_file.wav') as source:
    audio_data = r.record(source)

# Use the recognize_google() method to recognize and convert the audio data to text.
text = r.recognize_google(audio_data)
print(text)

"""
Note that the audio file must be in a supported format (WAV, AIFF, FLAC, etc.). In addition, depending on the size 
and quality of the audio file, the conversion process may take some time to complete.
"""
