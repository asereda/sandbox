package messaging1;

import com.google.common.util.concurrent.ListenableFuture;

public interface MessageClient   {

    void addListener(Topic topic, Listener listener);
    void removeListener(Topic topic, Listener listener);

    ListenableFuture<?> request(Topic topic, Object message);


}
