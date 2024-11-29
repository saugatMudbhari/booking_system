package com.Transaction.transaction.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketNo;
    @Column(unique = true)
    private String seatNumber;
    @OneToOne
    @JoinColumn(name = "seat_Id", referencedColumnName = "id")
    private Seat seat;
    @ManyToOne
    @JoinColumn(name = "booking_id", referencedColumnName = "id")
    private BookingTicket bookingTicket;

}
