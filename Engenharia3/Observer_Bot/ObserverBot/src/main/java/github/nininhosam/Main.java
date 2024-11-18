package github.nininhosam;

public class Main {
    public static void main(String[] args) {
        String token = "";
        ChatBot bot = new ChatBot(token);

        ProductObserver product = new ProductObserver("Memória RAM");
        bot.addObserver(product);
        bot.addObserver(new ServiceObserver("Instalação de Windows"));
        bot.pollUpdates();

    }
}