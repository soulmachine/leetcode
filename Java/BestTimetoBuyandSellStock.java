package leetcode;

/**
 * problem:Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share 
 * of the stock), design an algorithm to find the maximum profit.
 * @author chenbo
 */
public class BestTimetoBuyandSellStock 
{
    static int maxProfit(int[] prices)
    {
        int min = 0;
        int different = 0;
        int maxDifferent = 0;
        int buy = 0;
        int sell = 0;
        
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[min] > prices[i]) min = i;
            different = prices[i] - prices[min];
            if(different > maxDifferent)
            {
                maxDifferent = different;
                buy = min;
                sell = i;
            }
        }
        return maxDifferent;
    }
    
    public static void main(String[] args)
    {
        int[] array = {3, 4, 1, 8 , 0};
        System.out.println(maxProfit(array));
    }
}
