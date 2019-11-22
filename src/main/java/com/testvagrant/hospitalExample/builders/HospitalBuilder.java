package com.testvagrant.hospitalExample.builders;

import com.testvagrant.hospitalExample.Hospital;

public class HospitalBuilder {

    Hospital hospital = new Hospital();

    public HospitalBuilder withName(String name){
        hospital.setName(name);
        return this;
    }


    public HospitalBuilder withLocation(String location){
        hospital.setLocation(location);
        return this;
    }

    public Hospital build() {
        return hospital;
    }
}
