package practice.arrays;

public class StockBuyAndSell2 {

	public static void main(String[] args) {

		int arr[] = { 7, 1, 5, 3, 6, 4 };
		System.out.println(getStockBuyAndSell2(arr));
	}

	public static int getStockBuyAndSell2(int prices[]) {
		int profit = 0;

		for (int i = 0; i <= prices.length - 2; i++) {
			if (prices[i] < prices[i + 1]) {
				profit = profit + (prices[i + 1] - prices[i]);
			}
		}
		return profit;
	}
}
