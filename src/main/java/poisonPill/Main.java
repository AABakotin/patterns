package poisonPill;

import poisonPill.message.queue.MessageQueue;
import poisonPill.message.consumer.impl.Consumer;
import poisonPill.message.producer.impl.Producer;
import poisonPill.message.queue.impl.SimpleMessageQueue;

public class Main {
    public static void main(String[] args) {
        MessageQueue queue = new SimpleMessageQueue(10000);

        final var producer = new Producer("PRODUCER_1", queue);
        final var consumer = new Consumer("CONSUMER_1", queue);

        new Thread(consumer::consume).start();

        new Thread(() -> {
            producer.send("hand shake");
            producer.send("some very important information");
            producer.send("bye!");
            producer.stop();
        }).start();
    }
}
