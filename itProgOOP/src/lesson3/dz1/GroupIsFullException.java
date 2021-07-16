package lesson3.dz1;

public class GroupIsFullException extends Exception{
    public GroupIsFullException() {
    }

    public GroupIsFullException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Group is full";
    }
}