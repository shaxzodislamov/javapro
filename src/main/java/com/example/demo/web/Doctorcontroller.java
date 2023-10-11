package com.example.demo.web;

import com.example.demo.model.Doctor;
import com.example.demo.repository.Doctorrepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
public class Doctorcontroller {

    private Doctorrepository doctorrepository;

    public Doctorcontroller(Doctorrepository doctorrepository){
        this.doctorrepository = doctorrepository;
    }

    @GetMapping("/doctorcontroller")
    public ResponseEntity getAll(){
        List<Doctor> list = doctorrepository.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/doctorcontroller")
    public ResponseEntity addDoctor(@RequestBody Doctor doctor){

        Doctor doctor1 = doctorrepository.save(doctor);
        return ResponseEntity.ok(doctor1);
    }

    @PutMapping("/doctorcontroller")
    public ResponseEntity updateDoctor(@RequestBody Doctor doctor){

        Doctor doctor1 = doctorrepository.save(doctor);
        return ResponseEntity.ok(doctor1);
    }

    @DeleteMapping("/doctorcontroller/{id}")
    public ResponseEntity deleteDoctor (@PathVariable("id") int id){

        doctorrepository.deleteById(id);
        return ResponseEntity.ok("Information Deleted");
    }

}
