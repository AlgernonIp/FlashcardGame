package com.flashcardgame.cardgame.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.aot.generate.Generated;

import java.math.BigInteger;

@Entity
public class Flashcard {

    protected Flashcard() {}

    //TODO create Constructor

    @Getter
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private BigInteger id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String question;
    @Getter @Setter
    private String answer;
    @Getter @Setter
    private String[] options;


}
