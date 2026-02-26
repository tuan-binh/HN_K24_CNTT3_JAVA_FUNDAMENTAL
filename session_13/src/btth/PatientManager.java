package btth;

import java.util.ArrayList;
import java.util.List;

public class PatientManager {

    private List<Patient> patients = new ArrayList<>();

    public void add(Patient patient) {
        patients.add(patient);
    }

    public void display() {
        for (Patient p : patients) {
            System.out.println(p);
        }
    }

}
