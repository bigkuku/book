package com.bx.book.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bx.book.entity.Book;
import com.bx.book.mapper.BookMapper;
import org.springframework.stereotype.Service;

@Service
public class BookService extends ServiceImpl<BookMapper,Book> {
}
