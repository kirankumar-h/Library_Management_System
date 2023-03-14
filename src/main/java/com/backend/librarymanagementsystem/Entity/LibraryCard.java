package com.backend.librarymanagementsystem.Entity;

import com.backend.librarymanagementsystem.Enum.CardStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LibraryCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;

    private String validTill;

    @Enumerated(EnumType.STRING)
    private CardStatus status;

    @OneToOne
    @JoinColumn
    Student student;
}
