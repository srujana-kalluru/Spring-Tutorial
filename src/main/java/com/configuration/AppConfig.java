package com.configuration;

import com.dao.StudentDao;
import com.service.StudentService;
import com.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    StudentDao studentDaoImpl;

    @Autowired
    public AppConfig(StudentDao studentDaoImpl) {
        this.studentDaoImpl = studentDaoImpl;
    }

    @Bean
    public StudentService studentServiceEnhancedImpl() {
        StudentService studentServiceEnhancedImpl = new StudentServiceImpl();
        studentServiceEnhancedImpl.setStudentDao(studentDaoImpl);
        return studentServiceEnhancedImpl;
    }

    @Bean
    public StudentService studentServiceSuperEnhancedImpl() {
        StudentService studentServiceSuperEnhancedImpl = new StudentServiceImpl();
        studentServiceSuperEnhancedImpl.setStudentDao(studentDaoImpl);
        return studentServiceSuperEnhancedImpl;
    }
}
