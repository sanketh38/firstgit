age=input("Enter you age ")
age=int(age)
text="my age is {}"
print(text.format(age))

#below is a code to execute multiple formats in a single statement.
quantity=3
intemno=567
price=49.97
txt="I want {} pieces of item no {} for {} dollars"
print(txt.format(quantity,intemno,price))



#below code demontrates how index numbers can be used to make sure that arguements are placed in the desired placeholders.
quantity=3
intemno=567
price=49.97
words="I am willing to pay {2} dollars for {0} of intem no {1}"
print(words.format(quantity,intemno,price))