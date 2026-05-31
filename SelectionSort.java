public class SelectionSort {
    public static int [] selectionSortWithTwoArrays(int[] input) {
        int n = input.length;
        int[] A = new int[n];
        int[] B = new int[n];
        System.arraycopy(input, 0, A, 0, n);

        int bIndex = 0;
        for (int i=0; i<n; i++){
            // tim phan tu nho nhat trong A
            int minIdx = 0;
            for (int j = 1; j <n -i; j++) {
                if(A[j] < A[minIdx]) {
                    minIdx = j;
                }
            }
            // dua phan tu nho nhat sang B
            B[bIndex++] = A[minIdx];

            //xoa phan tu nho nhat khoi A (bang cach dich cac phan tu phia sau len)
            for (int j = minIdx; j< n -i -1; j++) {
                A[j] = A[j+1];
            }
        }
        return B;
        }
    public static void main(String[] args) {
        int[] input = {64, 25, 12, 22, 11};
        int[] sorted = selectionSortWithTwoArrays(input);

        System.out.println("Sorted array: ");
        for(int num : sorted) {
            System.out.println(num + "  ");
        }
    }
}
