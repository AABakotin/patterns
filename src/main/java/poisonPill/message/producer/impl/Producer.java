package poisonPill.message.producer.impl;


import poisonPill.message.simple.impl.SimpleMessage;
import poisonPill.message.simple.Message;
import poisonPill.message.producer.MqPublishPoint;

import java.util.Date;

public class Producer implements MqPublishPoint {

    private final String name;
    private final MqPublishPoint queue;
    private boolean isStopped;

    public Producer(String name, MqPublishPoint queue) {
        this.name = name;
        this.queue = queue;
        this.isStopped = false;
    }

    public void send(String body) {
        if (isStopped) {
            throw new IllegalStateException(
                    String.format(
                            "Producer %s was stopped and fail to deliver requested message [%s].", body, name
                    ));
        }
        Message msg = new SimpleMessage();
        msg.addHeader(Message.Headers.DATE, new Date().toString());
        msg.addHeader(Message.Headers.SENDER, name);
        msg.setBody(body);

        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e);
        }
    }

    public void stop() {
        isStopped = true;
        try {
            queue.put(Message.POISON_PILL);
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e);
        }
    }

    @Override
    public void put(Message message) throws InterruptedException {
        try {
            queue.put(message);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
