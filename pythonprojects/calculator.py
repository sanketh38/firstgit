#two number calculator
def add(x,y):
    z = x+y
    print(z)
def subrtact(x,y):
    if(x>y):
        difference = x-y
    else:
        difference = y-x
    print(difference)
def multiply(x,y):
    product = x*y
    print(product)
def divide(x,y):
    if (x>y and y!=0):
        quotient = x/y
    elif(y>x and x!=0):
        quotient = y/x
    print(quotient)    
     
multiply(10,12)
subrtact(10,12)
divide(12,6)
add(10,8)