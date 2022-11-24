package com.dao;

import com.core.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component//("StudentDaoImpl")
public class StudentDaoImpl implements StudentDao {

    private Map<Long, Student> students;

    {
        students = new HashMap<>();
        students.put(1L, new Student("Eric", "Colbert", "English Literature", 145.00));
        students.put(2L, new Student("Mary", "Contrary", "Physiscs", 155.00));
        students.put(3L, new Student("Jason", "Stewart", "English Literature", 145.00));
    }

    @Override
    public Student getOne(long id) {
        return students.get(id);
    }

    @Override
    public Collection<Student> getAll() {
        return students.values();
    }
}
