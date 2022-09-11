def logPower(x, n):
    if n==0:
        return 1
    xnb2 = logPower(x, n//2)
    xn = xnb2 * xnb2
    if n%2!=0:
        xn = x * xn
    return xn
print(logPower(2, 5))