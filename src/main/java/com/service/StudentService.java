package com.service;

import com.core.Student;
import com.dao.StudentDao;

import java.util.Collection;

public interface StudentService {

    Student get(long id);

    Collection<Student> getAllStudents();

    StudentDao getStudentDao();

    void setStudentDao(StudentDao studentDao);
}
