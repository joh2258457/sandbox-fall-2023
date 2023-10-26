package org.example.queue;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQueue<T> implements Queue<T> {

    final private List<T> queue;

    public ArrayListQueue() {
        this.queue = new ArrayList<>();
    }

    @Override
    public boolean offer(T t) {
        return this.queue.add(t);
    }

    @Override
    public T poll() {
        return this.queue.remove(0);
    }

    @Override
    public T peek() {
        return this.queue.get(0);
    }

    @Override
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }
}
