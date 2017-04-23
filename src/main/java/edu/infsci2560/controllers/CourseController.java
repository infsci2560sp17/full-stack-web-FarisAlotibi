/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Course;
import edu.infsci2560.repositories.CourseRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;


/**
 *
 * @author faris
 */
@Controller
public class CourseController {
    @Autowired
    private CourseRepository repository;
    
    @RequestMapping(value = "courses", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("courses", "courses", repository.findAll());
    }
    
    @RequestMapping(value = "courses/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Course course, BindingResult result) {
        repository.save(course);
        return new ModelAndView("courses", "courses", repository.findAll());
    }

    
    @RequestMapping(value = "courses/delete/{id}", method = RequestMethod.DELETE, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView delete(@PathVariable("id") Long id) {
        // repository.delete(repository.findOne(id));
        // @ModelAttribute;
        repository.deleteById(id);
        // return new ModelAndView("infoArms", "infoArms", repository.findAll());
        return new ModelAndView("redirect:/courses");
    }

    @RequestMapping(value = "coursesUpdate/update/{id}", method = RequestMethod.GET)
    public ModelAndView getRecord(@PathVariable("id") Long id) {
  
        Course course = repository.findById(id);
        ModelAndView modelAndView = new ModelAndView("coursesUpdate");
        modelAndView.addObject("course", course);
        return modelAndView;
    }

    @RequestMapping(value = "coursesUpdate/update/{id}" , method =  RequestMethod.PUT)
    public ModelAndView create(@PathVariable("id") Long id, @ModelAttribute @Valid Course course, BindingResult result) {
        repository.save(course);
        return new ModelAndView("redirect:/courses"); // inforArms template name
    }
}