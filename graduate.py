from svgwrite import grad

level = int(input('Enter your current academic level: '))
graduated = False

while level <= 500:
    print(level)
    level += 100

if level > 500:
    graduated = True

if graduated:
    print('Yay! You have successfully graduated from the University... 🎉🎊🤝')
