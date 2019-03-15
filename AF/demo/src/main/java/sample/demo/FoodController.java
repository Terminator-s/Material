/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Giga
 */
@CrossOrigin
@RestController
@RequestMapping("/foods")
public class FoodController {
    @Autowired
    private FoodRepo foodRepo;

    @GetMapping("/")
    public List<Food> getAllFoods()
    {
       List<Food> foods = this.foodRepo.findAll();
       return foods;
    }
    
    @GetMapping("/all")
    public String[] getAll(@RequestParam("ids") String[] ids)
    {
        return ids;
    }
    
    @PostMapping(path="/", consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> insert(@RequestBody Food food) {
        try {
            Food savedFood = this.foodRepo.insert(food);
            return new ResponseEntity<>(savedFood, HttpStatus.CREATED);
        }
        catch(Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }
}
