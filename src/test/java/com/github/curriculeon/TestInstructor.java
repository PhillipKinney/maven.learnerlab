package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        //given
        Instructor instructor = new Instructor(0L, null);

        //when
        boolean outcome = instructor instanceof Teacher;

        //then
        Assert.assertTrue(outcome);

    }
    @Test
    public void testInheritence(){
        //given
        Instructor instructor = new Instructor(0L, null);

        //when
        boolean outcome = instructor instanceof Person;

        //then
        Assert.assertTrue(outcome);

    }

    @Test
    public void testTeach(){
        //given
        Instructor instructor = new Instructor(0L, null);
        Learner learner =  new Student(0L, null);
        Double numberOfHoursToTeach = 134.0;
        Double preStudyTime = learner.getTotalStudyTime();
        Double expected = preStudyTime + numberOfHoursToTeach;

        //when
        instructor.teach(learner, numberOfHoursToTeach);
        Double actual = learner.getTotalStudyTime();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLecture(){
        //given
        Teacher teacher = new Instructor(0L, null);
        Learner[] learners = new Learner[]{
                new Student(0L, "Phillip"),
                new Student(1L, "J"),
                new Student(2L, "Kinney"),
        };
        Double numberOfHours = 12.0;
        Double expected = numberOfHours/learners.length;

        //when
        teacher.lecture(learners, numberOfHours);

        //then
        for (int i = 0; i < learners.length; i++) {
            Learner learner = learners[i];
            Double actual = learner.getTotalStudyTime();
            Assert.assertEquals(expected, actual);
        }


        }
    }


