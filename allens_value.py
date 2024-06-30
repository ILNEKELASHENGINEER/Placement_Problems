input1 = int(input("Enter the size of array : "))
input2 = list(map(int,input("Enter init array : ").split(",")))
input3 = list(map(int,input("Enter the second array : ").split(",")))

input2.sort()
input3.sort()

print(input3[0]-input2[0])
