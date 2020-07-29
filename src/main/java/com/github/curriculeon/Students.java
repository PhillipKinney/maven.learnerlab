package com.github.curriculeon;

public class Students extends People<Student> {
    private static final Students instance = new Students();

    private Students(){
        this.add(new Student(0L, "Julia"));
        this.add(new Student(1L, "David"));
        this.add(new Student(2L, "Ghasan"));

    }


}
