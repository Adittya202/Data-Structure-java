public class task3 {
    public static int[] Task3(int[] tasks, int m) {

        MinHeap heap = new MinHeap(tasks.length + m);

        for (int i = 0; i < m; i++) {
            heap.insert(0);
        }

        for (int i = 0; i < tasks.length; i++) {
            int smallestLoad = heap.extractMin();
            int newLoad = smallestLoad + tasks[i];
            heap.insert(newLoad);
        }

        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            result[i] = heap.extractMin();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] tasks = { 2, 4, 7, 1, 6 };
        int m = 4;

        int[] result = Task3(tasks, m);

        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
