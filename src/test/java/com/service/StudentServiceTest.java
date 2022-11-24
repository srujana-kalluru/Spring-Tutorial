package com.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private ApplicationContext context;
    private StudentService studentService;
    private StudentService studentServiceEnhanced;
    private StudentService studentServiceSuperEnhanced;

    public StudentServiceTest() {
    }

    @BeforeEach
    void setUp() {
        studentService = context.getBean("studentServiceImpl", StudentService.class);
        studentServiceEnhanced = context.getBean("studentServiceEnhancedImpl", StudentService.class);
        studentServiceSuperEnhanced = context.getBean("studentServiceSuperEnhancedImpl", StudentService.class);
    }

    @Test
    void testGetOneStudent() {
        assertNotNull(studentService);
        assertNotNull(studentService.getStudentDao());

        assertNotNull(studentServiceEnhanced);
        assertNotNull(studentServiceEnhanced.getStudentDao());

        assertNotNull(studentServiceSuperEnhanced);
        assertNotNull(studentServiceSuperEnhanced.getStudentDao());
    }

}
