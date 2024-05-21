package poisonPill.message.consumer.impl;

import poisonPill.message.simple.Message;
import poisonPill.message.consumer.MqSubscribePoint;

import static poisonPill.message.simple.Message.*;

public class Consumer implements MqSubscribePoint {
    private final MqSubscribePoint queue;
    private final String name;


    public Consumer(String name, MqSubscribePoint queue) {
        this.queue = queue;
        this.name = name;
    }

    @Override
    public Message take() throws InterruptedException {
        return queue.take();
    }

    public void consume() {
        while (true) {
            Message msg;
            try {
                msg = take();
                if (msg == POISON_PILL) {
                    System.out.printf("Consumer receive request to terminate 'POISON PILL': %s", name);
                    break;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
                return;
            }

            String sender = msg.getHeader(Headers.SENDER);
            String body = msg.getBody();
            System.out.printf("Message [%s] from [%s] received by [%s]%n", body, sender, name);
        }


    }
}
