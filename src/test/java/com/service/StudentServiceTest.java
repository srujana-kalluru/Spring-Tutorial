package com.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentServiceTest {

    private ClassPathXmlApplicationContext context;
    private StudentService studentService;
    private StudentService studentServiceEnhanced;
    private StudentService studentServiceSuperEnhanced;

    public StudentServiceTest() {
    }

    @BeforeEach
    void setUp() {
        context = new ClassPathXmlApplicationContext("beans.xml");
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
