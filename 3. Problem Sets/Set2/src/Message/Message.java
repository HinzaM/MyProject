public class Message {

    //private variables
    private String _sender;
    private String _recipient;
    private String _message;

    //no-argument constructor
    public Message(){}

    //argument constructor
    public Message(String sender, String recipient, String message)
    {
        _sender = sender;
        _recipient = recipient;
        _message = message;
    }

    //mutator
    public void setSender (String sender) {
        _sender = sender;
    }
    public void setRecipient (String recipient) {
        _recipient = recipient;
    }
    public void setMessage(String message) {
        _message = message;
    }

    //accessor
    public String getSender() { return _sender; }
    public String getRecipient() { return _recipient; }
    public String getMessage() { return _message; }

    //toString method
     public String toString() {
        return "\n\nFrom: " + getSender() + "\nTo: " + getRecipient() +
                "\n\nHi! Hope you're doing well. " + getMessage(); }

}
