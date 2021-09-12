package com.SelfDemo.Service;

import com.SelfDemo.Exception.StudentNotFoundException;
import com.SelfDemo.Model.course;
import com.SelfDemo.Model.student;
import com.SelfDemo.Repository.CourseRepo;
import com.SelfDemo.Repository.StudentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private CourseRepo courseRepo;
   private static Logger logger= LoggerFactory.getLogger(StudentService.class);
    public List<course> getCourseForStudeny(int id) {
        List name = new ArrayList();

        student st = studentRepo.findById(id);

        if (st != null) {
            return st.getCourses();
        } else if (st == null) {
            logger.error("Student not registered,thrown exception");
            throw new StudentNotFoundException("Student Not Found At This Id");
        }
        List<course> courses = st.getCourses();
        for (course Courses : courses) {
            name.add(Courses.getName());

        }
        return name;
    }
}
