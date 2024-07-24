package com.sage.dto;


import lombok.Data;


@Data
public class CategoryDto {

    private String categoryName;

    private boolean status;

    private int sortOrder;
}
