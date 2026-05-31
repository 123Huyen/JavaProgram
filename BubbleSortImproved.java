public class BubbleSortImproved {

    private void swap (int [] array, int i, int j) {
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public void sortImprovement1 (int [] numbers){
        for (int i = 1; i< numbers.length; i++ ) {
            for (int j = 0; j < numbers.length -1; j++) {
                if (numbers[j] > numbers [j+1]) {
                    swap(numbers,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        /*int size= 10000;
        int [] array = new int [size];
        java.util.Random rand = new java.util.Random();
            for (int i =0; i <size; i++) {
                array[i] = rand.nextInt(100000);
            }*/
         int [] array = {
            215, 99221, 99237, 99238, 99240, 99241, 99257, 99258, 99266, 99279, 99288, 99310, 99321, 99326, 99343, 99349, 99378, 99381, 99413, 99415, 99421, 99462, 99466, 99469, 99478, 99486, 99496, 99505, 99508, 99527, 99542, 99578, 99594, 99603, 99611, 99619, 99619, 99620, 99629, 99631, 99652, 99661, 99674, 99683, 99684, 99686, 99688, 99723, 99724, 99730, 99742, 99744, 99786, 99800, 99810, 99811, 99814, 99815, 99817, 99840, 99848, 99857, 99857, 99860, 99872, 99874, 99883, 99886, 99898, 99903, 99906, 99906, 99919, 99953, 99957, 99964, 99965, 99965, 99970, 99971, 99983, 99993, 99997
        };

        BubbleSortImproved sorter = new BubbleSortImproved();
        long startTime = System.currentTimeMillis(); // start time
        sorter.sortImprovement1(array);
        long endTime = System.currentTimeMillis();
        
        System.out.println("Sorted array: " );
            for (int num : array) {
                System.out.println(num + " ");
            }
        System.out.println("\n Executed time " + (endTime -startTime) + " ms");
    }
}
