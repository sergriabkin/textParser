package com.company.springboot.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractEntity {

    public static final int START_SEQ = 1000;

    @Id
    @SequenceGenerator(name = "global_seq", sequenceName = "global_seq", allocationSize = 1, initialValue = START_SEQ)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    protected Integer id;

}
