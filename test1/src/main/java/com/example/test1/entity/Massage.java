package com.example.test1.entity;

import lombok.*;


import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@With
@Builder
@Entity

@Table(name = "masseges", schema = "public")
public class Massage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "text")
    private String text;
    @Column(name = "tag")
    private String tag;
}
