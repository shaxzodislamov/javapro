package com.example.demo.web;

import com.example.demo.model.Access;
import com.example.demo.repository.Accessrepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class    AccessController {

    private Accessrepository accessrepository;

    public AccessController(Accessrepository accessrepository){
        this.accessrepository = accessrepository;
    }

    @GetMapping("/accesscontroller")
    public ResponseEntity getAll(){
        List<Access> list = accessrepository.findAll();
        return ResponseEntity.ok(list);
    }
    @PostMapping("/accesscontroller")
    public ResponseEntity addAccess(@RequestBody Access access){


        Access access1 = accessrepository.save(access);
        return ResponseEntity.ok(access1);
    }

    @PutMapping("/accesscontroller")
    public ResponseEntity updateAccess(@RequestBody Access access){
            Access access1 = accessrepository.save(access);
        return ResponseEntity.ok(access1);
    }

    @DeleteMapping("/accesscontroller/{id}")
    public ResponseEntity deleteAccess(@PathVariable("id") int id ){

        accessrepository.deleteById(id);
        return ResponseEntity.ok("Information Deleted");

    }
}
