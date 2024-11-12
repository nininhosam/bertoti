import java.util.ArrayList;
import java.util.List;

public class EmailTopic {
    public String topicName;
    private List<Subscriber> subscribers;
    public EmailTopic(String topic){
        this.topicName = topic;
        this.subscribers = new ArrayList<Subscriber>();
    }
    public void subscribe(User user){
        subscribers.add(user);
    }
    public void unsubscribe(User user){
        subscribers.remove(user);
    }
    public void sendEmail(){
        for (Subscriber sub: subscribers) {
            sub.receiveEmail(topicName);
        }
    }
}
