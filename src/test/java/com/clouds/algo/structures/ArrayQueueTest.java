package com.clouds.algo.structures;

import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class ArrayQueueTest {

    @Test
    void queueTest() {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        assert arrayQueue.enQueue("a");
        assert arrayQueue.deQueue().equals("a");
        assert arrayQueue.enQueue("a");
        assert arrayQueue.enQueue("b");
        assert arrayQueue.enQueue("c");
        assert arrayQueue.enQueue("d");
        assert arrayQueue.deQueue().equals("a");
        assert arrayQueue.deQueue().equals("b");
        assert arrayQueue.deQueue().equals("c");
        assert arrayQueue.deQueue().equals("d");
        assert arrayQueue.deQueue() == null;
    }
}