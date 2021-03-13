package practice.arrays;

/**
 *
 *  BUY AND SELL STOCK ONCE : Buy and sell stock only once. 
 * 
 *   https://www.youtube.com/watch?v=mj7N8pLCJ6w&ab_channel=KevinNaughtonJr.
 */
public class StockBuyAndSell1 {

	public static void main(String[] args) {
		int arr[] = { 7, 1, 5, 3, 6, 4 };
		System.out.println(stockAndBuySell1(arr));
	}

	private static int stockAndBuySell1(int prices[]) {
		int min =Integer.MAX_VALUE;
		int max = 0;
		
		for (int i = 0; i <= prices.length - 1; i++) {
			if (prices[i] < min) {
				min = prices[i];
			}
			else {
				max = Integer.max(max,prices[i]-min);
			}
		}
		return max;
		
	}
}
