public class Message {

// properties

    private String text;
    private String recipient;
    private int id;

// constructor

    public Message(String text, String recipient, int id) {
        this.text = text;
        this.recipient = recipient;
        this.id = id;
    }


// getters and setters

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


//Methods

    public void getDetails() {
        System.out.println("contact's name: " + recipient +
        "\nMessage: " + text +
        "\nid: " + id);

    }


}
