package org.baranbatur;

public class House {
    private String address;
    private int price;
    private int size;
    private int livingRoom;
    private int numberOfRooms;

    public House(String address, int price, int size, int livingRoom, int numberOfRooms) {
        this.address = address;
        this.price = price;
        this.size = size;
        this.livingRoom = livingRoom;
        this.numberOfRooms = numberOfRooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(int livingRoom) {
        this.livingRoom = livingRoom;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String toString() {
        return "Address: " + address + " Price: " + price + " Size: " + size + " Living Room: " + livingRoom + " Number of Rooms: " + numberOfRooms;
    }


}
