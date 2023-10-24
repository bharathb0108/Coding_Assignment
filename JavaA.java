/* Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. */
public class JavaA {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffle(array);
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }
    
    public static void shuffle(int[] array) {
        int n = array.length;
        for (int i = n - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            
            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
