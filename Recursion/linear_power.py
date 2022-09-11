def power(x, n):
    if n==0:
        return 1
    xnm1 = power(x, n-1)
    xn = x * xnm1
    return xn
x = int(input())
n = int(input())
print(power(x, n))