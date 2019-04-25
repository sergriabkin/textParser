package com.company.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Sentence")
public class Sentence extends AbstractEntity {

    @Column
    private String data;

    @ManyToOne
    @JoinColumn(name = "TEXT_ID")
    private Text text;

}
