i=map(int, raw_input())
c=0
for m in i:
    c = c+1 if m==4 or m==7 else c
print("YES" if c==4 or c==7 else "NO")