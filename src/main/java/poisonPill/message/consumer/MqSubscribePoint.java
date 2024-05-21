package poisonPill.message.consumer;

import poisonPill.message.simple.Message;

public interface MqSubscribePoint {
    Message take() throws InterruptedException;
}
