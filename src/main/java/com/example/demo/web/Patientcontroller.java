package com.example.demo.web;

import com.example.demo.model.Patient;
import com.example.demo.repository.Patientrepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class Patientcontroller {

    private Patientrepository patientrepository;

    public Patientcontroller(Patientrepository patientrepository){
        this.patientrepository = patientrepository;
    }

    @GetMapping("/patientcontroller")
    public ResponseEntity getAll(){
        List<Patient> list = patientrepository.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/patientcontroller")
    public ResponseEntity addPatient(@RequestBody Patient patient){

        Patient patient1 = patientrepository.save(patient);
        return ResponseEntity.ok(patient1);
    }

    @PutMapping("/patientcontroller")
    public ResponseEntity updatePatient(@RequestBody Patient patient){

        Patient patient1 = patientrepository.save(patient);
        return ResponseEntity.ok(patient1);
    }

    @DeleteMapping("/patientcontroller/{id}")
    public ResponseEntity deletePatient(@PathVariable("id") int id){

        patientrepository.deleteById(String.valueOf(id));
        return ResponseEntity.ok("Information Deleted");
    }
}
