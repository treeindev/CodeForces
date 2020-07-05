n,s,t = raw_input(), raw_input(),[0,0]
for c in s :
    t=[t[0]+1,t[1]] if c=="A" else [t[0],t[1]+1]
print("Anton" if t[0]>t[1] else "Friendship" if t[0]==t[1] else "Danik")