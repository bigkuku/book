package com.bx.book.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.bx.book.entity.enums.Category;
import com.bx.book.entity.enums.Suit;
import lombok.Data;
/**
 * 图书实体类
 * */

import java.util.Date;
@Data
@TableName(value = "bs_book")
public class Book {
    private Integer id;
    private String isbn;
    private String author;
    private String publisher;
    private Date publishDate;
    private double oldPrice;
    private double newPrice;
    private String authorLoc;
    private Suit suit;
    private Category category;
    private String info;
    private String imgUrl;

}
