
public class MessageMain {

    public static void main(String[] args) {
        MessagingService service = new MessagingService();

        service.add(new Message("Alice", "Hey!"));
        service.add(new Message("Bob", "This is a really long message that definitely goes over 280 characters..." +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque vitae orci ut mauris vulputate pharetra."));

        for (Message message : service.getMessages()) {
            System.out.println(message);
        }
    }
}
