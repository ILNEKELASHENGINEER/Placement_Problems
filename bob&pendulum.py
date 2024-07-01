# Bob is doing a research in Pendulum.
# He is just pushing the pendulum aside and the pendulum started moving in to-and-fro motion.
# Bob will push the pendulum always towards his right side to start the oscillation.
# Bob wanted to calculate the distance between extreme position and the centre position of pendulum for each oscillations.
# He somehow calculated all the possible distance.
# Since he is busy in this research he is giving the task to his assistant who needs to arrange the values as instructed.
# Since he is pushing the pendulum to his right always.
# He wanted to store that distance in the right extreme of the arrangement.
# And the pendulum will move towards the extreme left at that time he want that value to be stored in the left most extreme in the arrangement.
# And this continues till the pendulum stops.
# He is also sure that the distance reached at that oscillation will always be lesser than the previous oscillation towards that particular end.
# Write a program to arrange the distance as instructed.
# Sample Input: 5 13254 
# Sample Output: 42135 
# Explanation: 
# The maximum distance in the given data is 5 hence that is placed in the right most end 
# The next maximum element is 4 which is placed in the left most end.
# Again the pendulum oscillates towards right to cover a distance of 3 and this continues. 

def finddis(n,distancearr):
    distancearr.sort()
    res=[0]*n
    midindex = n//2
    left = midindex-1
    right = midindex+1
    res[midindex] = distancearr[0]
    ifleft = True
    
    for i in range(1,n):
        if ifleft:
            res[left] = distancearr[i]
            left-=1
        else:
            res[right] = distancearr[i]
            right+=1
        ifleft = not ifleft
    return res
            

n = int(input())
distance = int(input())
distancearr = [int(digit) for digit in str(distance)]
# distancearr = list(map(int,input().split()))
resarr = finddis(n,distancearr)
for i in resarr:
    # print(i,end=" ")
    print(i,end="")
