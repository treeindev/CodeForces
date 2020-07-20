from functools import reduce
c,p = map(int, raw_input().split()), map(int, raw_input().split())
print( reduce( lambda s,i : s+1 if i <= c[1] else s+2, p, 0) )