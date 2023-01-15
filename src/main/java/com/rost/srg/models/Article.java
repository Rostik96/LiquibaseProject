package com.rost.srg.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Article {
    @Id
    private int id;

    @Column(nullable = false, length = 100)
    String title;

    @Column(nullable = false)
    String text;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    Author author;
}
