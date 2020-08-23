package com.example;


import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_ORDER")
@Data
class Order {

    private @Id
    @GeneratedValue
    Long id;

    private String description;
    private Status status;

    public Order(){}

    public Order(String description, Status status){
        this.description = description;
        this.status = status;
    }
}

enum Status {
    IN_PROGRESS, //
    COMPLETED, //
    CANCELLED
}

@Repository
interface OrderRepository extends JpaRepository<Order, Long> {
}