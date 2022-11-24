package com.dao;

import com.core.Student;

import java.util.Collection;

public interface StudentDao {
    Student getOne(long id);

    Collection<Student> getAll();
}
