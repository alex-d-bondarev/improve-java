package org.example.datastructures.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MyBinaryMaxHeap {
    private ArrayList<Integer> heap;

    public MyBinaryMaxHeap() {
        heap = new ArrayList<>();
    }

    private static int parent(int index) {
        return Math.floorDiv((index - 1), 2);
    }

    private static int leftChild(int index) {
        return index * 2 + 1;
    }

    private static int rightChild(int index) {
        return index * 2 + 2;
    }

    private void heapifyUp(int index) {
        while (index > 0 && heap.get(parent(index)) < heap.get(index)) {
            Collections.swap(heap, parent(index), index);
            index = parent(index);
        }
    }

    private void heapifyDown(int index) {
        var size = heap.size();
        int largest = index;
        int left, right;

        while (true) {
            left = leftChild(index);
            right = rightChild(index);

            if (left < size && heap.get(left) > heap.get(largest))
                largest = left;

            if (right < size && heap.get(right) > heap.get(largest))
                largest = right;

            if (largest != index) {
                Collections.swap(heap, largest, index);
                index = largest;
            } else {
                break;
            }
        }
    }

    public Optional<Integer> getMax() {
        if (!heap.isEmpty()) return Optional.of(heap.getFirst());
        return Optional.empty();
    }

    public Optional<Integer> extractMax() {
        if (!heap.isEmpty()) {
            int last = heap.size() - 1;
            Integer maximum = heap.getFirst();

            if (heap.size() > 1) {
                heap.set(0, heap.get(last));
            }
            heap.remove(last);
            heapifyDown(0);

            return Optional.of(maximum);
        }
        return Optional.empty();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public void buildHeap(List<Integer> another) {
        heap = new ArrayList<>(another);

        int lastNonLeaf = Math.floorDiv(heap.size(), 2) - 1;
        for (int i = lastNonLeaf; i >= 0; i--) {
            heapifyDown(i);
        }
    }
}
