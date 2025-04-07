package com.bridgelabz.customannotation;

import java.lang.reflect.Method;

public class TaskManager {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<TaskManager> cls = TaskManager.class;
        Method method = cls.getDeclaredMethod("task");
        TaskInfo annotation = method.getAnnotation(TaskInfo.class);
        System.out.println("Annotation: " + annotation);
        System.out.println("Method: " + method.getName());
        System.out.println("Priority: " + annotation.priority());
        System.out.println("Assigned to: " + annotation.assignedTo());
    }

    @TaskInfo(priority = 1, assignedTo = "Divyansh")
    public static void task(){
        System.out.println("This is an annotated task.");
    }
}
