package com.demo_example.student_library_management_system.converters;

import com.demo_example.student_library_management_system.model.Book;
import com.demo_example.student_library_management_system.requestdto.BookRequestDto;

public class BookConverter {
    public static Book convertBookRequestDtoToBook(BookRequestDto bookRequestDto) {
        Book book = new Book();
        book.setTitle(bookRequestDto.getTitle());
        book.setPages(bookRequestDto.getPages());
        book.setPublisherName(bookRequestDto.getPublisherName());
        book.setAvailability(bookRequestDto.isAvailability());
        book.setPublishDate(bookRequestDto.getPublishDate());
        book.setPrice(bookRequestDto.getPrice());
        book.setRackNo(bookRequestDto.getRackNo());
        book.setEdition(bookRequestDto.getEdition());
        book.setCategory(bookRequestDto.getCategory());


        return book;
    }
}