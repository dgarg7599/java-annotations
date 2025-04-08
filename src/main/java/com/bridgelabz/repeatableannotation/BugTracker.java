package com.bridgelabz.repeatableannotation;

import java.lang.reflect.Method;

public class BugTracker {

    public static void main(String[] args) throws NoSuchMethodException {
        Class<BugTracker> cls = BugTracker.class;
        Method method = cls.getMethod("submitBug");
        for(Bug bug : method.getAnnotationsByType(Bug.class)){
            System.out.println("Bug Description: " + bug.description());
        }

    }

    @Bug(description = "NullPointerException")
    @Bug(description = "Array out of bounds exception")
    public void submitBug(){
        System.out.println("Submitting Bugs...");
    }
}
