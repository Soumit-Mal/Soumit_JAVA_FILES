import java.util.*;

class StockPrices {
    public static void main(String[] args) {
        String[][] stocks = {
            {"09:00", "100"},
            {"10:00", "102"},
            {"11:00", "98"}
        };
        for (String[] stock : stocks) {
            System.out.println("Time: " + stock[0] + ", Value: " + stock[1]);
        }
    }
}
