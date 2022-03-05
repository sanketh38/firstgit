#The below code will show a runtime error because x is greater than 2 and when python tries to divide by 0, it will fail.
x = 6
y = 0
x>2 and (x/y)>2
#To prevent this error from occuring we strategically place a guardian evaluation just before the condition that might produce an error
a = 8
b = 0
x>2 and x != 0 and (x/y)>0
#In the above code, python stops executing at x!=0 because it is false and the whole statement is false no matter what.   