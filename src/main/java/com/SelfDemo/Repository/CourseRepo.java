package com.SelfDemo.Repository;

import com.SelfDemo.Model.course;
import com.SelfDemo.Model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<course,Integer>
{

}
