public class User implements Subscriber{
    public String name;
    public User(String name){
        this.name = name;
    }
    @Override
    public void receiveEmail(String topic) {
        System.out.println(name+": I have received an Email about "+topic+"!");
    }
}
