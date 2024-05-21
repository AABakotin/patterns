package poisonPill.message.queue.impl;

import poisonPill.message.simple.Message;
import poisonPill.message.queue.MessageQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class SimpleMessageQueue implements MessageQueue {

    private final BlockingQueue<Message> queue;

    public SimpleMessageQueue(int capacity) {
        this.queue = new ArrayBlockingQueue<>(capacity);
    }

    @Override
    public void put(Message message) throws InterruptedException {
        queue.put(message);
    }

    @Override
    public Message take() throws InterruptedException {
        return queue.take();
    }

}
