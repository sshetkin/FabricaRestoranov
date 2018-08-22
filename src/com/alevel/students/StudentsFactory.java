package com.alevel.students;

import com.alevel.fastFuds.RestoranFactory.PropertyRestoran;

import java.util.ArrayList;
import java.util.List;

public class StudentsFactory {
    public static Students greatStudentMajor(){
        List<PropertyRestoran> propertyStudent = new ArrayList<PropertyRestoran>();
        propertyStudent.add(PropertyRestoran.PARKOVKA);
        propertyStudent.add(PropertyRestoran.WIFI);
        propertyStudent.add(PropertyRestoran.LOCATIONCENTER);
        return new Students(Students.StudentType.MAJOR, propertyStudent);
    }
    public static Students greatStudentLOh(){
        List<PropertyRestoran> propertyStudent = new ArrayList<PropertyRestoran>();
        propertyStudent.add(PropertyRestoran.WIFI);
        propertyStudent.add(PropertyRestoran.METRO);
        propertyStudent.add(PropertyRestoran.SKIDKI);
        return new Students(Students.StudentType.LOX, propertyStudent);
    }
    public static Students greatStudentAziat(){
        List<PropertyRestoran> propertyStudent = new ArrayList<PropertyRestoran>();
        propertyStudent.add(PropertyRestoran.VELOPARKOVKA);
        propertyStudent.add(PropertyRestoran.SPICESOUS);
        return new Students(Students.StudentType.AZIAT, propertyStudent);
    }
}
