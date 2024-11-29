package com.Transaction.transaction.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Route")
public class Route12 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(mappedBy = "route12", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, orphanRemoval = true)
    Set<BusInfo> busInfos;
    @ManyToOne
    @JoinColumn(name = "source_id")
    private BusStop sourceBusStop;
    @ManyToOne
    @JoinColumn(name = "destination_id")
    private BusStop destinationBusStop;


}
