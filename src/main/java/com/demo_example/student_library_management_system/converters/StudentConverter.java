package com.demo_example.student_library_management_system.converters;

import com.demo_example.student_library_management_system.model.Student;
import com.demo_example.student_library_management_system.requestdto.StudentRequestDto;

public class StudentConverter {

    //converter- it used to convert the requestDto class inputs into model class which saves in database.

    public static Student convertStudentRequestDtoIntoStudent(StudentRequestDto studentRequestDto){
        Student stu = new Student();
        stu.setAddress(studentRequestDto.getAddress());
        stu.setName(studentRequestDto.getName());
        stu.setDob(studentRequestDto.getDob());
        stu.setDept(studentRequestDto.getDept());
        stu.setEmail(studentRequestDto.getEmail());
        stu.setGender(studentRequestDto.getGender());
        stu.setMobile(studentRequestDto.getMobile());
        stu.setSection(studentRequestDto.getSection());
        stu.setSem(studentRequestDto.getSem());

        return stu;

    }

}
