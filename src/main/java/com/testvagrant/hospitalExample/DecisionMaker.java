package com.testvagrant.hospitalExample;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class DecisionMaker {

    public static void main(String[] args) {

        Date fromDate = new GregorianCalendar(2019, Calendar.OCTOBER, 01).getTime();
        Date toDate = new GregorianCalendar(2019, Calendar.OCTOBER, 30).getTime();


        List<Patient> patients = new Hospital().patientsWithinTheDateRange(fromDate, toDate);


        long inPatientCount = patients.stream().filter(p -> p.getLocation().equalsIgnoreCase("Bengaluru")).count();
        long outPatientCount = patients.size() - inPatientCount;

        System.out.println("Total in Bangalore -- " + inPatientCount);
        System.out.println("Total Outstation -- " + outPatientCount);

    }


}
