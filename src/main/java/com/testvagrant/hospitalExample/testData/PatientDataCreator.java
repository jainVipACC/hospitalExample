package com.testvagrant.hospitalExample.testData;

import com.testvagrant.hospitalExample.Patient;
import com.testvagrant.hospitalExample.Visit;
import com.testvagrant.hospitalExample.builders.PatientBuilder;
import com.testvagrant.hospitalExample.builders.VisitInfoBuilder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class PatientDataCreator {

    public List<Patient> createPatients() {

        List<Patient> allPatients = new ArrayList<>();
        Visit visitInfo1 = new VisitInfoBuilder().withDate(new GregorianCalendar(2019, Calendar.OCTOBER, 11).getTime())
                .withDoctorName("Radha")
                .build();
        Visit visitInfo2 = new VisitInfoBuilder().withDate(new GregorianCalendar(2019, Calendar.OCTOBER, 12).getTime())
                .withDoctorName("Radha")
                .build();
        Visit visitInfo3 = new VisitInfoBuilder().withDate(new GregorianCalendar(2019, Calendar.OCTOBER, 13).getTime())
                .withDoctorName("Krishna")
                .build();

        allPatients.add(new PatientBuilder().withName("abc").withLocation("Bengaluru")
                .withVisitingInfo(visitInfo1).build());
        allPatients.add(new PatientBuilder().withName("xyz").withLocation("Hoskote")
                .withVisitingInfo(visitInfo2).build());
        allPatients.add(new PatientBuilder().withName("qwe").withLocation("KGF")
                .withVisitingInfo(visitInfo3).build());


        return allPatients;
    }
}
