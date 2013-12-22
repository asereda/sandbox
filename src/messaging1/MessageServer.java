package messaging1;

import com.google.common.util.concurrent.ListenableFuture;

public interface MessageServer   {

   void addListener(Topic topic, Listener listener);
   void removeListener(Topic topic, Listener listener);


   ListenableFuture<?> publish(Topic topic, Object message);

}
