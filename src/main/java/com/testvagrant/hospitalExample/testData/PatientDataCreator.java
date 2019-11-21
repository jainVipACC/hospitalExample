package com.testvagrant.hospitalExample.testData;

import com.testvagrant.hospitalExample.Patient;
import com.testvagrant.hospitalExample.builders.PatientBuilder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class PatientDataCreator  {

    public List<Patient> createPatients(){

        List<Patient> allPatients = new ArrayList<>();

        allPatients.add(new PatientBuilder().withName("abc").withLocation("Bengaluru")
                .withDate(new GregorianCalendar(2019, Calendar.OCTOBER, 11).getTime()).build());
        allPatients.add(new PatientBuilder().withName("xyz").withLocation("Hoskote")
                .withDate(new GregorianCalendar(2019, Calendar.OCTOBER, 12).getTime()).build());
        allPatients.add(new PatientBuilder().withName("qwe").withLocation("KGF")
                .withDate(new GregorianCalendar(2019, Calendar.OCTOBER, 13).getTime()).build());

        return allPatients;
    }
}
