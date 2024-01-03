class Solution {
    public double nthPersonGetsNthSeat(int n) {
        if(n==1 || n==2) return (double)1/n;
        return 0.5;
        //where the first person will always have p(seat) = 1
        //other persons just have p(seat) = 0.5 [either sit in own seat or other seat ]
    }
}
