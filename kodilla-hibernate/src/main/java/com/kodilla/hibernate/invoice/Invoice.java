package com.kodilla.hibernate.invoice;

import jakarta.validation.constraints.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    private int id;

    @Column(name = "NUMBER")
    private String number;

    @OneToMany(
            targetEntity = InvoiceItem.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<InvoiceItem> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }
}
