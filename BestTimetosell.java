package array;

public class BestTimetosell {
    public int maxProfit(int[] prices){
        int profit = 0;
        int buy = 0;
        boolean flag = false;

        for(int i=0; i< prices.length-1;i++){

            if(prices[i] <= prices[i+1]){
                if(flag == false){
                    buy = i;
                    flag = true;
                }

           }else{
                if(flag == true){
                    profit = profit+ (prices[i] - prices[buy]);
                    buy = 0;
                    flag = false;
                }
            }
        }
        if(flag == true){
            profit = profit + prices[prices.length-1]-prices[buy];
        }
        return profit;

    }
    public static void main(String[] args){
        BestTimetosell bestTimetosell = new BestTimetosell();
        int[] prices = new int[]{7,1,5,3,6,4};
        
        System.out.println(bestTimetosell.maxProfit(prices));
    }
}
