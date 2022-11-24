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
    private boolean mode;
    private int num1;
    private int num2;

    public StudentServiceImpl() {
    }

    public StudentServiceImpl(StudentDao studentDao, boolean mode) {
        this.studentDao = studentDao;
        this.mode = mode;
    }

    public StudentServiceImpl(StudentDao studentDao, boolean mode, int num1, int num2) {
        this.studentDao = studentDao;
        this.mode = mode;
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Student get(long id) {
        return studentDao.getOne(id);
    }

    @Override
    public Collection<Student> getAllStudents() {
        return studentDao.getAll();
    }

}