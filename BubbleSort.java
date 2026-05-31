public class BubbleSort {
	public void sort (int [] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++ ) {
                if (numbers[j] > numbers [j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int size= 10000;
        int [] array = new int [size];
        java.util.Random rand = new java.util.Random();
        for (int i =0; i <size; i++) {
            array[i] = rand.nextInt(100000);
        } 
       
        BubbleSort sorter = new BubbleSort();

        long startTime = System.currentTimeMillis(); // start time
        sorter.sort(array);
        long endTime = System.currentTimeMillis(); //end time

        System.out.println( "Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nExecution time: " +(endTime -startTime) + " ms");
    }
}
 