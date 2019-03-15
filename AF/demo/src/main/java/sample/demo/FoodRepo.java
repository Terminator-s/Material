/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Giga
 */
public interface FoodRepo extends MongoRepository<Food, String> {
    
}
