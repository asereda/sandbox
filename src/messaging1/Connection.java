package messaging1;

import com.google.common.util.concurrent.ListenableFuture;

public interface Connection {

    /**
     * Sends a message on a topic
     */
    ListenableFuture<?> send(Object message);
}
