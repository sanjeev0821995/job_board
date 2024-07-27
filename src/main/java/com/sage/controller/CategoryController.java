package com.sage.controller;

import com.sage.dto.CategoryDto;
import com.sage.dto.ResponseDto;
import com.sage.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> create(CategoryDto categoryDto){
        categoryService.addCategory(categoryDto);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new ResponseDto("201","Category is created Successfully!"));
    }
}
