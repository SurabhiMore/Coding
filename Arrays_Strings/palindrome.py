# list slicing method
def ispalin(s):
    if s==s[::-1]:
        return "Is palindrome"
    return "Not palindrome"

# string reversal method with extra var
def palin(s):
    string = ""
    for char in s:
        string = char + string
    if string==s:
        return "Is palindrome"
    return "Not palindrome"

# iterative method
def palindrome(s):
    start = 0
    end = len(s)-1
    while start<end:
        if(s[start]!=s[end]):
            return "Not palindrome"
        start+=1
        end-=1
    return "Is palindrome"

s = "malayalam"
print(ispalin(s))
print(palin(s))
print(palindrome(s))

# 'str' object does not support item assignment