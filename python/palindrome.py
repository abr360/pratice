n=int(input())
temp=n
d=0
while temp>0:
    rem=temp%10
    d=d*10+rem
    temp=temp//10
print(f"The given number {n} is "+("palindrome"if n==d else "not palindrome"))
