package com.company;

public class ClinicRunner {
    public static void main(String[] args) {
        final Clinic clinic = new Clinic();

        clinic.add(new Client("Julia", new Pet("Gector")));   //success
        clinic.add(new Client("Mary", new Pet("Pshok")));   //success
        clinic.add(new Client("Fedor", new Pet("Luise")));  //success
        clinic.add(new Client("Mary", new Pet("Pshok")));   //failed
        System.out.println();
        clinic.getAllClients();
        System.out.println();
        System.out.println(clinic.findClientbyClientName("Mary"));
        System.out.println(clinic.findClientByPetName("Gector"));
        System.out.println();
        clinic.editClientName("Julia", "JuliaKo");
        clinic.editPetName("Luise", "Kate");
        System.out.println();
        clinic.getAllClients();
    }
}
