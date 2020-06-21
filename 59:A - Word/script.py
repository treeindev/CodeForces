i=list(raw_input())
u=0
for l in i :
    u = u+1 if l.isupper() else u
print( ''.join(i).lower() if u<=len(i)/2.0 else ''.join(i).upper() )