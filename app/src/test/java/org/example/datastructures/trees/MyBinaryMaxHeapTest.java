package org.example.datastructures.trees;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MyBinaryMaxHeapTest {
    @Test
    public void testEmptyHeap() {
        var heap = new MyBinaryMaxHeap();
        Assert.assertTrue("Should be empty", heap.getMax().isEmpty());
        Assert.assertTrue("Should have no max", heap.extractMax().isEmpty());
        Assert.assertTrue("Should be empty", heap.isEmpty());
        Assert.assertEquals("Should have 0 size", 0, heap.size());
    }

    @Test
    public void testSingleElement() {
        var heap = new MyBinaryMaxHeap();
        heap.insert(10);

        Assert.assertEquals(1, heap.size());
        Assert.assertEquals(10, heap.getMax().get().intValue());
        Assert.assertEquals(10, heap.extractMax().get().intValue());
        Assert.assertTrue("Should have no max now", heap.extractMax().isEmpty());
    }

    @Test
    public void testTwoElements() {
        var heap = new MyBinaryMaxHeap();
        heap.insert(10);
        heap.insert(20);

        Assert.assertEquals(2, heap.size());
        Assert.assertEquals(20, heap.getMax().get().intValue());
        Assert.assertEquals(20, heap.extractMax().get().intValue());
        Assert.assertEquals(10, heap.extractMax().get().intValue());
        Assert.assertTrue("Should have no max now", heap.extractMax().isEmpty());
    }

    @Test
    public void testFromAnotherList() {
        var heap = new MyBinaryMaxHeap();
        var another = List.of(10, 20);
        heap.buildHeap(another);

        Assert.assertEquals(2, heap.size());
        Assert.assertEquals(20, heap.getMax().get().intValue());
        Assert.assertEquals(20, heap.extractMax().get().intValue());
        Assert.assertEquals(10, heap.extractMax().get().intValue());
        Assert.assertTrue("Should have no max now", heap.extractMax().isEmpty());
    }

    @Test
    public void testBuiltVsGrown() {
        var builtHeap = new MyBinaryMaxHeap();
        var another = List.of(10, 5, 7, 20, 9, 15);
        builtHeap.buildHeap(another);

        var grownHeap = new MyBinaryMaxHeap();
        grownHeap.insert(10);
        grownHeap.insert(5);
        grownHeap.insert(7);
        grownHeap.insert(20);
        grownHeap.insert(9);
        grownHeap.insert(15);

        Assert.assertEquals(20, builtHeap.extractMax().get().intValue(), grownHeap.extractMax().get().intValue());
        Assert.assertEquals(15, builtHeap.extractMax().get().intValue(), grownHeap.extractMax().get().intValue());
        Assert.assertEquals(10, builtHeap.extractMax().get().intValue(), grownHeap.extractMax().get().intValue());
        Assert.assertEquals(9, builtHeap.extractMax().get().intValue(), grownHeap.extractMax().get().intValue());
        Assert.assertEquals(7, builtHeap.extractMax().get().intValue(), grownHeap.extractMax().get().intValue());
        Assert.assertEquals(5, builtHeap.extractMax().get().intValue(), grownHeap.extractMax().get().intValue());
    }
}
