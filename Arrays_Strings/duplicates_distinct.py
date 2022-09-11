# returns duplicate elements 
def duplicates(arr, n): 
    count = {}
    for n in arr:
        if n not in count:
            count[n] = 1
        else:
            count[n] += 1
    list = [key for key, value in count.items() if value>1]
    list.sort()
    if len(list)==0:
        return [-1]
    else:
        return list
n = int(input())
arr = [2,3,1,2,3] # {2,3,1,2,3}
print(duplicates(arr, n))

# returns distinct elements
'''
A = list(map(int, input().split()))
count = {}
for n in A:
    #print(n)
    if n not in count:
        count[n] = 1
        #print(count)
    else:
        count[n] += 1
        #print(count)
list = [key for key, value in count.items() if value>=1]
print(list)
'''