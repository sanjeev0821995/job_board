package com.sage.dto;

import com.sage.entity.Category;
import lombok.Data;

@Data
public class JobDto {

    private String eligibility;


    private String location;


    private String description;


    private String designation;


    private CategoryDto categoryDto;


    private String skills;


    private String salaryType;


    private String salary;


    private String experience;


    private int sortOrder;


    private boolean status;

}
