def fact(n):
    if(n==0 or n==1):
        return 1
    fact = n*(fact(n-1))