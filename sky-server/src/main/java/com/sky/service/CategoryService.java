package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.result.PageResult;

public interface CategoryService {
    void insert(CategoryDTO categoryDTO);

    PageResult pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    void deleteById(Integer id);
}
