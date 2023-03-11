package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoomCreationPojo {
    private Integer price;
    private Integer roomNumber;
    private String roomType;
    private Boolean status;

    public RoomCreationPojo() {
    }

    public RoomCreationPojo(Integer price, Integer roomNumber, String roomType, Boolean status) {
        this.price = price;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.status = status;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RoomCreationPojo{" +
                "price=" + price +
                ", roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", status=" + status +
                '}';
    }
}
