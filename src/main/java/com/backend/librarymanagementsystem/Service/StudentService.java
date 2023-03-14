package com.backend.librarymanagementsystem.Service;

import com.backend.librarymanagementsystem.Entity.LibraryCard;
import com.backend.librarymanagementsystem.Entity.Student;
import com.backend.librarymanagementsystem.Enum.CardStatus;
import com.backend.librarymanagementsystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void addStudent(Student student) {
        //set the value of card
        LibraryCard card = new LibraryCard();
        card.setStatus(CardStatus.ACTIVATED);
        card.setValidTill("03/2025");
        card.setStudent(student);

        //set the card attribute in student
        student.setCard(card);

        studentRepository.save(student);
    }

    public String findByEmail(String email) {
        Student student = studentRepository.findByEmail(email);
        return student.getName();
    }


}
