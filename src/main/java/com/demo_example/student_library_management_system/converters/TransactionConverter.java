package com.demo_example.student_library_management_system.converters;

import com.demo_example.student_library_management_system.model.Transaction;
import com.demo_example.student_library_management_system.requestdto.TransactionRequestDto;

public class TransactionConverter {

    public static Transaction convertTransactionReDtoToTransaction(TransactionRequestDto transactionRequestDto) {
        Transaction transaction = new Transaction();

        transaction.setTransactionType(transactionRequestDto.getTransactionType());
        transaction.setFine(transactionRequestDto.getFine());
        transaction.setDueDate(transactionRequestDto.getDueDate());
        return transaction;
    }
}
