package poisonPill.message.queue;

import poisonPill.message.producer.MqPublishPoint;
import poisonPill.message.consumer.MqSubscribePoint;

public interface MessageQueue extends MqPublishPoint, MqSubscribePoint {

}
