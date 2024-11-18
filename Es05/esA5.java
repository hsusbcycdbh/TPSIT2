public class esA5 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = i + 1;
        }

        int[] array2 = new int[5];
        System.arraycopy(array1, 0, array2, 0, 5);

        System.out.print("Contenuto del secondo array: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
