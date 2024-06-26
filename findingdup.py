li=list(map(int,input("Enter the list of elements :").split()))
li2=set(li)
count=0
for j in li2:
    for i in li:
        if j==i:
            count+=1
    if count>1:
        print("Duplicate element",j)
    count=0
    
