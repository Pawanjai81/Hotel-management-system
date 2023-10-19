package com.geekster.roomApp.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "oyo")
public class Room {

    @Id
    private Integer roomId;


    private Integer roomNumber;

    private Type roomType;

    @Column(name = "available")
    private boolean roomAvailable;


    private double roomPrice;


}
