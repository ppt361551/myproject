package com.ray;

public class Ticket {
    int oringin;
    int destination;
    int price;

    public Ticket() {
    }

    public Ticket(int oringin, int destination, int price) {
        this.oringin = oringin;
        this.destination = destination;
        this.price = price;
    }

    public int getOringin() {
        return oringin;
    }

    public void setOringin(int oringin) {
        this.oringin = oringin;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
