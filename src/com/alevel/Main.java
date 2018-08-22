package com.alevel;

import com.alevel.fastFuds.Client;
import com.alevel.fastFuds.Restoran;
import com.alevel.fastFuds.RestoranFactory;
import com.alevel.students.Students;
import com.alevel.students.StudentsFactory;

public class Main {

    public static final int StudentsCount = 10;
    public static void main (String args []) {

//        StudentsFactory factory = new StudentsFactory();
       RestoranFactory restoranFactory = new RestoranFactory();

        Restoran[] restorans = new Restoran[]{restoranFactory.greatRestoran(RestoranFactory.RestoranType.MAC),
                                     restoranFactory.greatRestoran(RestoranFactory.RestoranType.BURGER)};

        Students[] students = new Students[StudentsCount];
        for ( int i = 0; i<StudentsCount; i++){
            if (i%3==0) {
                students[i]= StudentsFactory.greatStudentMajor();
            }else if (i%2==0) {
                students[i]= StudentsFactory.greatStudentLOh();
            }else  {
                students[i]= StudentsFactory.greatStudentAziat();
            }

        }

        for ( int i = 0; i<StudentsCount; i++){
        //    restorans[0].feed(students[i]);
           Restoran restoran = cooshRestoran(students[i], restorans);
           if (restoran!= null) restoran.feed(students[i]);
        }
    }

    private static Restoran cooshRestoran(Client client, Restoran[] restorans) {
        float beastMath = 0f;
        Restoran restoran = null;


        for (int i = 0; i<restorans.length; i++){
          float math = client.getMath(restorans[i]);
          if (math<beastMath) {
              restoran = restorans[i];
              beastMath = math;
          }
        }
        return restoran;
    }

}
