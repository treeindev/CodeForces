a = input().split(" ")
l,b = int(a[0]), int(a[1])
y = 0
while( l<=b ) :
    l=l*3
    b=b*2
    y+=1
print(y)