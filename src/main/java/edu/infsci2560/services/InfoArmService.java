/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.services;

import edu.infsci2560.models.InfoArm;
import edu.infsci2560.models.InfoArm.TicketType;
import edu.infsci2560.repositories.InfoArmRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author kolobj
 */
@RestController
@RequestMapping("/public/api/infoArms")
public class InfoArmService {

    @Autowired
    private InfoArmRepository repository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<InfoArm>> list() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findAll(), headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<InfoArm> list(@PathVariable("id") Long id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findOne(id), headers, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    public ResponseEntity<InfoArm> create(@RequestBody InfoArm infoArm) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.save(infoArm), headers, HttpStatus.OK);
    }
}