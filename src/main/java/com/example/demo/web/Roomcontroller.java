package com.example.demo.web;

import com.example.demo.model.Patient;
import com.example.demo.model.Room;
import com.example.demo.repository.Patientrepository;
import com.example.demo.repository.Roomrepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class Roomcontroller {

    private Roomrepository roomrepository;

    public Roomcontroller(Roomrepository roomrepository){
        this.roomrepository = roomrepository;
    }

    @GetMapping("/roomcontroller")
    public ResponseEntity getAll(){
        List<Room> list = roomrepository.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/roomcontroller")
    public ResponseEntity addRoom(@RequestBody Room room){

        Room room1 = roomrepository.save(room);
        return ResponseEntity.ok(room1);
    }

    @PutMapping("/roomcontroller")
    public ResponseEntity updateRoom(@RequestBody Room room){

        Room room1 = roomrepository.save(room);
        return ResponseEntity.ok(room1);
    }

    @DeleteMapping("/roomcontroller/{id}")
    public ResponseEntity deleteroom(@PathVariable("id") int id){

        roomrepository.deleteById(String.valueOf(id));
        return ResponseEntity.ok("Information Deleted");
    }
}
