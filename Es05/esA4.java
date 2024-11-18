public class esA4 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        System.out.print("Array invertito: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
