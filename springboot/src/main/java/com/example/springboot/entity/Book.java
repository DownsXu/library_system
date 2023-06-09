package com.example.springboot.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 图书实体类
 */
@Data
public class Book extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 类别(图书/书刊)
     */
    private String type;

    /**
     * 出版日期
     */
    private String publishDate;

    /**
     * 作者
     */
    private String author;

    /**
     * 出版社
     */
    private String publisher;

    /**
     * 分类
     */
    private String category;

    /**
     * 标准码
     */
    private String bookNo;

    /**
     * 封面
     */
    private String cover;

    private List<String> categories;
    private Integer score;
    private Integer nums;


}
