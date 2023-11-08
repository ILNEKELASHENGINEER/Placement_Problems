class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tot_gas = 0;
        int tot_cost = 0;
        for(int i=0;i<gas.length;i++){
            tot_gas +=gas[i];
            tot_cost +=cost[i];
        }
        if(tot_cost>tot_gas) return -1;
        int strt = 0;
        int tank = 0;
        for(int i=0;i<gas.length;i++){
            tank+= gas[i]-cost[i];
            if(tank<0){
                tank=0;
                strt = i+1;
            }
        }
        return strt;
        
    }
}
