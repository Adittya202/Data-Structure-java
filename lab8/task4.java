public class task4 {
    public static int[] LargestK(int[] num, int k) {

        MaxHeap heap = new MaxHeap(num.length);

        for (int i = 0; i < num.length; i++) {
            heap.insert(num[i]);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.extractMax();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 10, 2, 8, 6, 7 };
        int k = 3;

        int[] res = LargestK(nums, k);

        
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
