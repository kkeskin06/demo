package com.example.demo.entity;


import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "SirketYetkilisi")
public class SirketYetkilisi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sirketyetkilisi_id")
    private Long id;

    @Column(name = "sirketyetkilisi_adi")
    private String ad;

    @Column(name = "sirketyetkilisi_soyadi")
    private String soyad;

    @Column(name = "sirketyetkilisi_unvan")
    private String unvan;

    @Column(name = "sirketyetkilisi_telno")
    private String telno;

    @Column(name = "Sirket_id")
    private Long Sirket_id;

}
