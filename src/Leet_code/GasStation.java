package Leet_code;
//https://leetcode.com/problems/gas-station
public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalFuel = 0, totalCost = 0, currentFuel = 0, start = 0;

        for (int i = 0; i < gas.length; i++) {
            totalFuel += gas[i];
            totalCost += cost[i];
            currentFuel += gas[i] - cost[i];

            if (currentFuel < 0) {
                start = i + 1;
                currentFuel = 0;
            }
        }

        return totalFuel >= totalCost ? start : -1;
    }


    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int res=canCompleteCircuit(gas,cost);
        System.out.println("circuit will start at index : " + res);

    }
}

