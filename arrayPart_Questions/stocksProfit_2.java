package arrayPart_Questions;

public class stocksProfit_2 {

    public static int sellAndBuyStocks(int price[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i=0; i<price.length; i++){
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = price[i];
            }           
        } 
        return maxProfit;
    }
    public static void main(String[] args) {
        
        int prices[] = {7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println(sellAndBuyStocks(prices));
    }
}
