class Observer {
    public static void main (String[] args){
        EmailTopic sports = new EmailTopic("sports");
        EmailTopic technology = new EmailTopic("technology");
        User john = new User("John");
        User mary = new User("Mary");
        User victor = new User("Victor");

        System.out.println("\n\t*Subscribing users to Sports*");
        sports.subscribe(john);
        sports.subscribe(victor);
        sports.sendEmail();

        System.out.println("\n\t*Subscribing users to Technology*");
        technology.subscribe(mary);
        technology.subscribe(victor);
        technology.sendEmail();

        System.out.println("\n\t*Unsubscribing user John from Sports*");
        sports.unsubscribe(john);
        sports.sendEmail();
    }
}