package com.company.lab3.AnimalRescue;

public class Vet {
    private String vetName;
    private String vetSpecialization;
    private int vetAge;

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }
    public String getVetName() {
        return vetName;
    }

    public void setVetSpecialization(String vetSpecialization) {
        this.vetSpecialization = vetSpecialization;
    }
    public String getVetSpecialization() {
        return vetSpecialization;
    }

    public void setVetAge(int vetAge){
        this.vetAge=vetAge;
    }
    public int getVetAge(){
        return vetAge;
    }
}
