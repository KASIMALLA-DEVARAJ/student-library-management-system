package com.demo_example.student_library_management_system.converters;


import com.demo_example.student_library_management_system.model.Card;
import com.demo_example.student_library_management_system.requestdto.CardRequestDto;

public class CardConverter {
    public static Card convertCardRequestDtoToCard(CardRequestDto cardRequestDto) {
        Card card = new Card();
        card.setCardStatus(card.getCardStatus());
        card.setBloodGroup(card.getBloodGroup());

        // Foreign keys present in requestDto are not used in converters.
        //they are directly used in sservice class while writing business logic.
        return card;
    }

}
