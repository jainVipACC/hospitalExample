package com.testvagrant.hospitalExample;

import com.testvagrant.hospitalExample.builders.HospitalBuilder;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class DecisionMaker {

    public static void main(String[] args) {

        Date fromDate = new GregorianCalendar(2019, Calendar.OCTOBER, 01).getTime();
        Date toDate = new GregorianCalendar(2019, Calendar.OCTOBER, 30).getTime();


        Hospital hospital = new HospitalBuilder().withName("CMH").withLocation("Bengaluru").build();

        List<Patient> patients = new Hospital().patientsWithinTheDateRange(fromDate, toDate);


        long inPatientCount = patients.stream().filter(p -> p.getLocation().equalsIgnoreCase(hospital.getLocation())).count();
        long outPatientCount = patients.size() - inPatientCount;

        System.out.println("Total in " + hospital.getLocation() + " -- " + inPatientCount);
        System.out.println("Total Outstation -- " + outPatientCount);

        Double inPatientPercentage = Double.valueOf(inPatientCount * 100 / patients.size());
        Double outPatientPercentage = Double.valueOf(outPatientCount * 100 / patients.size());

        System.out.println("Patients " + hospital.getLocation() + " -- " + inPatientPercentage);
        System.out.println("Patients from outside Bengaluru -- " + outPatientPercentage);


    }


}
