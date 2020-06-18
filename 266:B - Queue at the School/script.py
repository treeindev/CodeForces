c,q = map(int, raw_input().split()),list(raw_input())
a,b = 0,0
while( a<c[1] ) :
    while (b<c[0]) :
        if q[b] == "B" and b+1<len(q) and q[b+1] == "G" :
            q[b] = "G"
            q[b+1] = "B"
            b += 1
        b += 1
    a+=1
    b=0
print(''.join(q))
