package com.bridgelabz.markimportant;

import java.lang.reflect.Method;

public class EmployeeReflection {
    public static void main(String[] args) {
        Class<Employee> cls = Employee.class;
        for(Method m : cls.getDeclaredMethods()) {
            if(m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = m.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + m.getName());
                System.out.println("Level: " + annotation.level());
            }
        }
    }
}
