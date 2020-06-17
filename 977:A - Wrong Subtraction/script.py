n,c = map(int,raw_input().split())
i = 0
while i<c :
    if [char for char in str(n)][-1] == "0" :
        n=n/10
    else :
        n-=1
    i+=1
print(n)