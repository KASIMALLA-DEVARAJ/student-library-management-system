package com.demo_example.student_library_management_system.requestdto;

import com.demo_example.student_library_management_system.enums.CardStatus;

public class CardRequestDto {

    private CardStatus cardStatus;
    //Active, ACTIVE, active, ACtive, acTIvE, ActiVE.....
    private String bloodGroup;
    private int studentId;

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
