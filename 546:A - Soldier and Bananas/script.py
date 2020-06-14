i,t,c = input().split(" "),0,1
while c <= int(i[2]) :
    t = t + c * int(i[0])
    c+=1
print( 0 if t - int(i[1]) < 0 else t - int(i[1]) )