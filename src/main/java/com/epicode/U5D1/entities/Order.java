package com.epicode.U5D1.entities;

import com.epicode.U5D1.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Order {
    private Table table;
    private int numSeats;
    private OrderStatus status;
    private int startHour;
    private int orderId;
    private double totalBill;

    //  @Value("${coperto.value}")
    private double coperto;

    private List<Item> completeOrder;

    public Order(Table table, int numSeats, double coperto) {
        this.numSeats = numSeats;
        this.table = table;
        this.orderId = 1;
        this.startHour = 20;
        this.status = OrderStatus.IN_PROGRESS;
        this.completeOrder = new ArrayList<>();
        this.coperto = coperto;
    }

    public void addToOrder(Item itemToAdd) {
        completeOrder.add(itemToAdd);
        getTotalBill();
    }

    public void getTotalBill() {
        double totalCoperti = this.coperto * this.numSeats;
        double totalItems = this.completeOrder.stream()
                .mapToDouble(e -> e.getPrice())
                .sum();
        this.totalBill = totalCoperti + totalItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "table=" + table +
                ", numSeats=" + numSeats +
                ", status=" + status +
                ", startHour=" + startHour +
                ", orderId=" + orderId +
                ", totalBill=" + totalBill +
                ", coperto=" + coperto +
                ", completeOrder=" + completeOrder +
                '}';
    }
}
