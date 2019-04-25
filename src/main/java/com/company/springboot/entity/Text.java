package com.company.springboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@Table(name = "Text")
public class Text extends AbstractEntity {

    @Column
    private String name;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "text")
    private List<Sentence> sentences;


    public Text(String name) {
        this.name = name;
        this.sentences = new ArrayList<>();
    }

}
