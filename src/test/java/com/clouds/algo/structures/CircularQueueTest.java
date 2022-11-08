package com.clouds.algo.structures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * @author clouds
 * @version 1.0
 */
class CircularQueueTest {

    @Test
    void Test() {
        CircularQueue circularQueue = new CircularQueue(4);
        assertTrue(circularQueue.enqueue("a"));
        assertTrue(circularQueue.enqueue("b"));
        assertTrue(circularQueue.enqueue("c"));
        assertFalse(circularQueue.enqueue("d"));
        assertFalse(circularQueue.enqueue("e"));

        assertEquals(circularQueue.dequeue(), "a");
        assertEquals(circularQueue.dequeue(), "b");
        assertEquals(circularQueue.dequeue(), "c");
        assertNull(circularQueue.dequeue());
        assertNull(circularQueue.dequeue());

        assertTrue(circularQueue.enqueue("a"));
        assertTrue(circularQueue.enqueue("b"));
        assertTrue(circularQueue.enqueue("c"));
        assertEquals(circularQueue.dequeue(), "a");
        assertTrue(circularQueue.enqueue("e"));
        assertEquals(circularQueue.dequeue(), "b");
        assertEquals(circularQueue.dequeue(), "c");
        assertEquals(circularQueue.dequeue(), "e");
    }
}