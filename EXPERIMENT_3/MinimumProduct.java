public class MinimumProduct {
    public static void main(String[] args) {
        int[] array = {2, 5, 4, 1};
        int minProduct = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int product = array[i] * array[j];
                if (product < minProduct) minProduct = product;
            }
        }
        System.out.println("Minimum product: " + minProduct);
    }
}
