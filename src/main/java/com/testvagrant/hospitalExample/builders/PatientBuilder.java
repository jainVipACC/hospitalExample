package com.testvagrant.hospitalExample.builders;

import com.testvagrant.hospitalExample.Patient;

import java.util.Date;

public class PatientBuilder {

    Patient patient = new Patient();

    public Patient build() {
        return patient;
    }

    public PatientBuilder withName(String name){
        patient.setName(name);
        return this;
    }

    public PatientBuilder withLocation (String location){
        patient.setLocation(location);
        return this;
    }

    public PatientBuilder withDate(Date visitDate){
        patient.setVisitDate(visitDate);
        return this;
    }
}
