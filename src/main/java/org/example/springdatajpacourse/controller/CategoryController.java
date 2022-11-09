package org.example.springdatajpacourse.controller;

import org.example.springdatajpacourse.entity.Category;
import org.example.springdatajpacourse.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/add")
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }

    @GetMapping({"/", "/getall"})
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @GetMapping("/getbyid")
    public Category getCategoryById(Long id){
        return categoryService.getCategoryById(id);
    }

}
