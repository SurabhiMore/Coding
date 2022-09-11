# list slicing
def rev(s):
    return s[::-1]

# iterative method
def reverse(arr, start, end):
    while start<end:
        arr[start], arr[end] = arr[end], arr[start]
        start+=1
        end-=1

# recursive method
def reverseArray(arr, start, end):
    if start>=end:
        return
    arr[start], arr[end] = arr[end], arr[start]
    reverseArray(arr, start+1, end-1)

# string reversal method with extra var
def reverseString(s):
    S = ""
    for char in s:
        S = char + S
    return S

size = int(input())
arr = []
for i in range(size):
    arr.append(int(input()))

reverse(arr, 0, size-1) # iterative array
print(arr)

reverseArray(arr, 0, size-1)    # recursive array
print(arr)

print(rev(arr)) # list comprehension - array

s = "Geeks"
# for string reversal
print(rev(s))   # list slicing
print(reverseString(s)) # extra var

#Function to reverse words in a given string.
def reverseWords(S): 
    words = S.split(".")
    words.reverse()
    str = '.'.join(words)
    return str
print(reverseWords("like.a.cinnamon.roll"))

# reverse each word in string
def wordrev(s):
        word_list=s.split('.')
        for i in range(len(word_list)):
            word_list[i] = word_list[i][::-1]
        string='.'.join(word_list)
        return string
print(wordrev("like.a.cinnamon.roll"))