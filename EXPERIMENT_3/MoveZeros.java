public class MoveZeros {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 2, 4, 7, 7, 4, 5, 0, 8, 0, 0};
        int index = 0;
        for (int num : array) if (num != 0) array[index++] = num;
        while (index < array.length) array[index++] = 0;
        for (int num : array) System.out.print(num + " ");
    }
}
