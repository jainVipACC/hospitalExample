package com.testvagrant.hospitalExample;


import com.testvagrant.hospitalExample.testData.PatientDataCreator;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {

    public List<Patient> patientsWithinTheDateRange(Date fromDate, Date toDate) {
        List<Patient> allPatients = allPatients();

        return allPatients.stream().filter(patient -> patient.getVisitDate().after(fromDate) &&
                patient.getVisitDate().before(toDate)).collect(Collectors.toList());
    }

    private List<Patient> allPatients() {
        return new PatientDataCreator().createPatients();
    }
}
