package com.example.ecommserver.controller;

import com.example.ecommserver.model.Category;
import com.example.ecommserver.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/category")

public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public String createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        return "success";
    }

    @GetMapping("/List")
    public List<Category> listCategory() {
        return categoryService.listCategory();
    }

    // @PostMapping("/update/{categoryID}")
    // public ResponseEntity<ApiResponse> updateCategory(@PathVariable("categoryID")
    // Integer categoryID,
    // @Valid @RequestBody Category category) {
    // // Check to see if the category exists.
    // if (Objects.nonNull(categoryService.readCategory(categoryID))) {
    // // If the category exists then update it.
    // categoryService.updateCategory(categoryID, category);
    // return new ResponseEntity<ApiResponse>(new ApiResponse(true, "updated the
    // category"), HttpStatus.OK);
    // }

    // // If the category doesn't exist then return a response of unsuccessful.
    // return new ResponseEntity<>(new ApiResponse(false, "category does not
    // exist"), HttpStatus.NOT_FOUND);
    // }

    @PostMapping("/update/{categoryId}")
    public String updateCategory(@PathVariable("categoryId") int categoryId, @RequestBody Category category) {
        System.out.println("category id " + categoryId);
        categoryService.editCategory(categoryId, category);
        return "testing";
    }
}
