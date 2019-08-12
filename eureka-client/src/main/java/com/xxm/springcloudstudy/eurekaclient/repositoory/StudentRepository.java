package com.xxm.springcloudstudy.eurekaclient.repositoory;

import com.xxm.springcloudstudy.entity.Student;

import java.util.Collection;

/**
 * @author Xiaoming Xu
 */
public interface StudentRepository {
    Collection<Student> findAll();

    Student findById(long id);

    void saveOrUpdate(Student student);

    void deleteById(long id);
}