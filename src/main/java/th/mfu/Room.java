package th.mfu;

public class Room {

    private String roomName;
    private double roomPrice;
    private String roomDescription;
    private String roomImage;

    public Room(String roomName, double roomPrice, String roomDescription, String roomImage) {
        this.roomName = roomName;
        this.roomPrice = roomPrice;
        this.roomDescription = roomDescription;
        this.roomImage = roomImage;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public String getRoomImage() {
        return roomImage;
    }

    public void setRoomImage(String roomImage) {
        this.roomImage = roomImage;
    }

    public void setId(int id) {
    }
}
