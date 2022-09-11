def findSum(A, N): 
    max=A[0]
    min=A[0]
    for i in range(N):
        if max<A[i]:    max=A[i] 
    for i in range(N):
        if min>A[i]:   min=A[i]
    return max+min

N =5
A = [4, 3, 8, 1, 2]
print(findSum(A, N))
