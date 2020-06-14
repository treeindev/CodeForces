input()
t, li, l = input().split(" "), 0, []
for i,a in enumerate(t) :
    if (i+1<len(t) and int(a) > int(t[i+1])) or (i+1==len(t)) :
        l.append(len(t[li:(i+1)]))
        li = i+1
l.sort(reverse=True)
print(l[0])