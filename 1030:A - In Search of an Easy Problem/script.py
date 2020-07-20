from functools import reduce
c,p = map(int, raw_input().split()), map(int, raw_input().split())
print( reduce( lambda s,i : 'HARD' if i==1 else s, p, 'EASY') )