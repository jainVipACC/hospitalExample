package com.testvagrant.hospitalExample.builders;

import com.testvagrant.hospitalExample.Patient;
import com.testvagrant.hospitalExample.Visit;

public class PatientBuilder {

    Patient patient = new Patient();

    public Patient build() {
        return patient;
    }

    public PatientBuilder withName(String name) {
        patient.setName(name);
        return this;
    }

    public PatientBuilder withLocation(String location) {
        patient.setLocation(location);
        return this;
    }


    public PatientBuilder withVisitingInfo(Visit visitingInfo) {
        patient.setVisitingInfo(visitingInfo);
        return this;
    }
}
