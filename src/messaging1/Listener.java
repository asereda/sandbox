package messaging1;

public interface Listener {

    void received(Topic topic, Object message);

    // On server side can be disconnected from different clients
    void connected(Connection connection);
    void disconnected(Connection connection);

}
