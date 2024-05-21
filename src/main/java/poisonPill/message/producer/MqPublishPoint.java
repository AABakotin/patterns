package poisonPill.message.producer;

import poisonPill.message.simple.Message;

public interface MqPublishPoint {

    void put(Message message) throws InterruptedException;
}
