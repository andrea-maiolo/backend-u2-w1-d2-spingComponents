package com.epicode.U5D1.entities;

import com.epicode.U5D1.enums.TableStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Table {
    private int tableNumber;
    private int maxSeats;
    private TableStatus status;

    public Table() {
    }

    public Table(int tableNumber, int maxSeats) {
        this.maxSeats = maxSeats;
        this.tableNumber = tableNumber;
        this.status = TableStatus.FREE;
    }
}
