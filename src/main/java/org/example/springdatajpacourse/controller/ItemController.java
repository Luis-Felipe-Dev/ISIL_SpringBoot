package org.example.springdatajpacourse.controller;

import org.example.springdatajpacourse.entity.Item;
import org.example.springdatajpacourse.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("/add")
    public void addItem(@RequestBody Item item){
        itemService.addItem(item);
    }

    @GetMapping({"/", "/getall"})
    public List<Item> getAllCategories(){
        return itemService.getAllItems();
    }

    @GetMapping("/getbyid")
    public Item getItemById(Long id){
        return itemService.getItemById(id);
    }

}
