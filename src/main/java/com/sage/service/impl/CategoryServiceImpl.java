package com.sage.service.impl;

import com.sage.dto.CategoryDto;
import com.sage.entity.Category;
import com.sage.mapper.CategoryMapper;
import com.sage.repository.CategoryRepository;
import com.sage.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void addCategory(CategoryDto categoryDto) {
        Category category=CategoryMapper.mapToCategory(new Category(),categoryDto);
        categoryRepository.save(category);
    }

    @Override
    public List<CategoryDto> getAllCategories() {
       List<Category> categories=categoryRepository.findAll();
       List<CategoryDto> categoryDtos=new ArrayList<>();
       for(Category category:categories){
           CategoryDto categoryDto=CategoryMapper.mapToCategoryDto(category,new CategoryDto());
           categoryDtos.add(categoryDto);
       }
       return categoryDtos;
    }
}
