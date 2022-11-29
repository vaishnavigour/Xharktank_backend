//package com.sharktank.sharktank.services;
//
//import com.sharktank.sharktank.dao.CourseDao;
//import com.sharktank.sharktank.entity.Course;
//import com.sharktank.sharktank.services.CourseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//@Service
//public class CourseServiceImpl implements CourseService {
//
////    List<Course> list;
//    @Autowired
//    private CourseDao courseDao;
//    public CourseServiceImpl() {
//
//
////        list = new ArrayList<>();
////        list.add(new Course(12,"java","this is java description"));
////        list.add(new Course(1245,"c++","this is c++ description"));
//    }
////
////    @Override
////    public List<Course> getCourses() {
////        return courseDao.findAll();
////    }
//
////    @Override
////    public Course getCourse(long CourseID) {
////        return null;
////    }
//
////    @Override
////    public Course getCourse(long CourseID) {
//////        Course c = null;
//////        for(Course course:list){
//////            if(course.getId()==CourseID){
//////                c = course;
//////                break;
//////            }
//////        }
////        return courseDao.getById(CourseID);
////    }
////
////    @Override
////    public Course addCourse(Course course) {
//////        list.add(course);
////        courseDao.save(course);
////        return course;
////    }
////
////    @Override
////    public Course updateCourse(Course course) {
//////        list.forEach(e -> {
//////            if(e.getId()==course.getId()){
//////                e.setTitle(course.getTitle());
//////                e.setDescription(course.getDescription());
//////            }
//////        });
////        courseDao.save(course);
////        return course;
////    }
//
//    //@Override
////    public void deleteCourse(long parseLong) {
////        //list= this.list.stream().filter(e -> e.getId()!=parseLong).collect(Collectors.toList());
////        Course entity = courseDao.getById(parseLong);
////        courseDao.delete(entity);
////    }
//
//
//}
