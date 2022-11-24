package com.service;

import com.core.Student;
import com.dao.StudentDao;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    @Override
    public Student get(long id) {
        return studentDao.getOne(id);
    }

    @Override
    public Collection<Student> getAllStudents() {
        return studentDao.getAll();
    }

}