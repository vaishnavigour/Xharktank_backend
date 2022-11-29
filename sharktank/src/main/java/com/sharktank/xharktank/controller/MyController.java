package com.sharktank.xharktank.controller;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import com.sharktank.sharktank.entity.Course;
//import com.sharktank.sharktank.services.CourseService;


//Rest - representational state transfer -
@RestController
public class MyController {
//
//    @Autowired
//    private CourseService courseSerce;

    @GetMapping("/home")
    public String home() {
        return "heyya";
    }

//    //get courses
//    @GetMapping("/courses")
//    public List<Course> getCourses(){
//        return this.courseSerce.getCourses();
//    }
//
//    @GetMapping("/courses/{courseID}")
//    public Course getCourse(@PathVariable String courseID){
//        return this.courseSerce.getCourse(Long.parseLong(courseID));
//    }
//
//    @PostMapping("/courses")
//    public Course addCourse(@RequestBody Course course){
//        return this.courseSerce.addCourse(course);
//    }
//
//    @PutMapping("/courses")
//    public Course updateCourse(@RequestBody Course course){
//        return this.courseSerce.updateCourse(course);
//    }
//
//    @DeleteMapping("/courses/{courseID}")
//    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseID){
//        try{
//            this.courseSerce.deleteCourse(Long.parseLong(courseID));
//            return new ResponseEntity<>(HttpStatus.OK);
//        }catch(Exception e){
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
