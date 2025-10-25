public class MinHeap {
    private int[] heap;
    private int size;

    public MinHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public void insert(int elem) {
        if (size == heap.length) {
            System.out.print("Heap is full");
            return;
        }
        heap[size] = elem;
        swim(size);
        size++;
    }

    public int extractMin() {
        if (size == 0) {
            System.out.print("Heap is empty");
            return -1;
        }
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        sink(0);
        return min;
    }

    private void swim(int s) {
        while (s > 0 && heap[s] < heap[(s - 1) / 2]) {
            swap(s, (s - 1) / 2);
            s = (s - 1) / 2;
        }
    }

    private void sink(int s) {
        int child = 0;
        while (2 * s + 1 < size) {
            child = 2 * s + 1;
            if (child + 1 < size && heap[child + 1] < heap[child]) {
                child++;
            }
            if (heap[s] <= heap[child])
                break;
            swap(s, child);
            s = child;
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void sort() {
        int mainSize = size;
        for (int i = 0; i < mainSize; i++) {
            int min = extractMin();
            System.out.print(min + " ");
        }
        System.out.println();
        size = mainSize;

    }
}