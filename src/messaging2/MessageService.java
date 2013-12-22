package messaging2;

public interface MessageService {


    void add(Listener listener);
    void remove(Listener listener);

    Topic topic();

    /**
     * Creates a wrapper service which always sends (or receives) messages on the specified topic.
     */
    MessageService forTopic(Topic topic);

    Connection connection();

}
