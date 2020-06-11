n, e = list(input()), list()
t = len(n)
for c in n :
    if n.count(c) > 1 and e.count(c) == 0 :
        t = t - n.count(c) + 1
        e.append(c)
print("CHAT WITH HER!" if t % 2 == 0 else "IGNORE HIM!" )