package edu.infsci2560.services;

import edu.infsci2560.models.Course;
import edu.infsci2560.repositories.CourseRepository;
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
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author faris
 */
@RestController
@RequestMapping("/public/api/courses")
public class CourseService {

    @Autowired
    private CourseRepository repository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<Course>> list() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findAll(), headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/course", method = RequestMethod.GET)
    public ModelAndView course() {

        Course course = repository.findById(7L);
        ModelAndView modelAndView = new ModelAndView("Ajax/course");
        modelAndView.addObject("course", course);
        return modelAndView;
        // return new ModelAndView("Ajax/course", "course", course);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Course> list(@PathVariable("id") Long id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findOne(id), headers, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    public ResponseEntity<Course> create(@RequestBody Course course) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.save(course), headers, HttpStatus.OK);
    }
}