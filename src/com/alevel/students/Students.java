package com.alevel.students;

import com.alevel.fastFuds.Client;
import com.alevel.fastFuds.Restoran;
import com.alevel.fastFuds.RestoranFactory;

import java.util.ArrayList;
import java.util.List;

public class Students implements Client {

    public StudentType type;
    List<RestoranFactory.PropertyRestoran> propertyStudent = new ArrayList<RestoranFactory.PropertyRestoran>();
    public  enum StudentType{
        MAJOR, LOX, AZIAT
    }

    public Students(StudentType type, List<RestoranFactory.PropertyRestoran> propertyStudent) {
        this.type = type;
        this.propertyStudent = propertyStudent;
        System.out.println("student - "+type);
    }

    @Override
    public float getMath(Restoran restoran) {
        return 0;
    }


}



