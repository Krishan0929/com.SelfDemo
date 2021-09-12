package com.SelfDemo.Repository;

import com.SelfDemo.Model.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<student,Integer>
{
    student findById(int id);
}
