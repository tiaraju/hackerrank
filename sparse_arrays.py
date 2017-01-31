num_strings = int(input())
map = {}
for i in range(num_strings):
	s = input()
	if s in map.keys():
		map[s] = map[s]+1
	else:
		map[s]=1

num_queries = int(input())
for i in range(num_queries):
	s = input()
	if s in map.keys():
		print( map[s])
	else:
		print(0)
