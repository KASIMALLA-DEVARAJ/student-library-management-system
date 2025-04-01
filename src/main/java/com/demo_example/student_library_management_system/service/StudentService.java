package com.demo_example.student_library_management_system.service;

import com.demo_example.student_library_management_system.converters.StudentConverter;
import com.demo_example.student_library_management_system.enums.CardStatus;
import com.demo_example.student_library_management_system.model.Card;
import com.demo_example.student_library_management_system.model.Student;
import com.demo_example.student_library_management_system.repository.StudentRepository;
import com.demo_example.student_library_management_system.requestdto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String addStudent(StudentRequestDto studentRequestDto) {

        // first convert the studentRequestDto into student model class.
        Student stu = StudentConverter.convertStudentRequestDtoIntoStudent(studentRequestDto);

        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVE);
        card.setBloodGroup(studentRequestDto.getBloodGroup());
        card.setStudent1(stu);

        stu.setCard(card);

        studentRepository.save(stu);
        return "Student Successfully saved";
    }
}
