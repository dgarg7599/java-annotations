package com.bridgelabz;

class LegacyApi{
    @Deprecated
    static void oldFeature(){
        System.out.println("old feature");
    }
    static void newFeature(){
        System.out.println("new feature");
    }
}

public class DeprecatedAnnotation {
    public static void main(String[] args) {
        LegacyApi.oldFeature();
        LegacyApi.newFeature();
    }
}
