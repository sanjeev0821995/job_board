package com.sage.service;

import com.sage.dto.CategoryDto;

import java.util.List;

public interface ICategoryService {

    void addCategory(CategoryDto categoryDto);

    List<CategoryDto> getAllCategories();
}
