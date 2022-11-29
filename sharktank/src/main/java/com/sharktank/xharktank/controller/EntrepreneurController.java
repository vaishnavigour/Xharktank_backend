package com.sharktank.xharktank.controller;


import com.sharktank.xharktank.exception.ResourceNotFoundException;
import com.sharktank.xharktank.model.Entrepreneur;
import com.sharktank.xharktank.repository.EntrepreneurRepository;
import com.sharktank.xharktank.responseDTO.IdDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EntrepreneurController {

    @Autowired
    private EntrepreneurRepository entrepreneurRepository;

    //get entrepreneurs
    @GetMapping("pitches")
    public List<Entrepreneur> getAllEntrepreneurs(){
        return this.entrepreneurRepository.findAll();
    }
    //get entrepreneur by id
    @GetMapping("pitches/{id}")
    public ResponseEntity<Entrepreneur> getEntrepreneurbyId(@PathVariable(value = "id") Long entrepreneurId)
        throws ResourceNotFoundException {
        Entrepreneur entrepreneur=entrepreneurRepository.findById(entrepreneurId)
                .orElseThrow(()-> new ResourceNotFoundException("Entrepreneur Not found for this id :"));
        return ResponseEntity.ok().body(entrepreneur);
    }

    //post and entrepreneur
//    @PostMapping("pitches")
////    public ResponseEntity<Entrepreneur> createEntrepreneur(@RequestBody Entrepreneur entrepreneur){
////        this.entrepreneurRepository.save(entrepreneur);
////        return ResponseEntity.created(entrepreneur).body(entrepreneur);
////    }
//    @ResponseStatus(code = HttpStatus.CREATED)
//    public Entrepreneur createEntrepreneur(@RequestBody Entrepreneur entrepreneur){
//
//        return this.entrepreneurRepository.save(entrepreneur);
//        //return this.entrepreneur.getId();
//    }

    @PostMapping("pitches")
    @ResponseStatus(code = HttpStatus.CREATED)
    public IdDTO createEntrepreneur(@RequestBody Entrepreneur entrepreneur){
        this.entrepreneurRepository.save(entrepreneur);
        IdDTO obj=new IdDTO(entrepreneur.getId());
        return obj;
        //return this.entrepreneurRepository.save(entrepreneur);
        //return this.entrepreneur.getId();
    }
    // post... make a counteroffer to a pitch
}
