def longseq(arr,n):
    val = []
    count = 0
    for i in range(n):
        n=1
        while arr[i]+n in arr:
            count+=1
            n+=1
        val.append(count+1)
        count = 0
    print(*val)
    return max(val)




li = list(map(int,input().split()))
print("Longest con. sub.sq is : ",longseq(li,len(li)))
