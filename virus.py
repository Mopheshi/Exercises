import turtle as tl

a, b, x, y, boolean = 0, 0, 0, 200, True

tl.bgcolor('black')
tl.speed(x)
tl.pencolor('red')
tl.penup()
tl.goto(x, y)
tl.pendown()

while boolean:
    tl.forward(a)
    tl.right(b)
    a, b = a + 3, b + 1
    if b == y: break

tl.exitonclick()
