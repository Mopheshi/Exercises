# To run this, download the BeautifulSoup zip file
# http://www.py4e.com/code3/bs4.zip
# and unzip it in the same directory as this file

from urllib.request import urlopen
from bs4 import BeautifulSoup
import ssl

ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

link = input("http://py4e-data.dr-chuck.net/comments_1699413.html")
html = urlopen(link, context=ctx).read()
soup = BeautifulSoup(html, 'html.parser')

tags = soup('span')
s = 0
c = 0
for tag in tags:
    c += 1
    s += int(tag.contents[0])
print("count is ", c)
print("sum is ", s)
