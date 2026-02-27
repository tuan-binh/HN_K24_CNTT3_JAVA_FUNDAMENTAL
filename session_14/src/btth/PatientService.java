package btth;

import java.util.*;

public class PatientService implements Manageable<Patient> {

    Set<Patient> patients = new HashSet<>();

    @Override
    public void add(Patient patient) {
        patients.add(patient);
    }

    @Override
    public void update(String id) {
        Scanner sc = new Scanner(System.in);
        List<Patient> patientList = new ArrayList<>(patients);
        int indexUpdate = -1;
        for (int i = 0; i < patientList.size(); i++) {
            if(patientList.get(i).getId().equals(id)) {
                indexUpdate = i;
                break;
            }
        }

        if(indexUpdate != -1) {
            System.out.println("Nhập vào tên: ");
            patientList.get(indexUpdate).setName(sc.nextLine());
            System.out.println("Nhập vào tuổi: ");
            patientList.get(indexUpdate).setAge(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhập vào số điện thoại: ");
            patientList.get(indexUpdate).setPhone(sc.nextLine());
        }
    }

    @Override
    public void delete(String id) {
        Iterator<Patient> iterator = patients.iterator();
        while (iterator.hasNext()) {
            Patient p = iterator.next();
            if(p.getId().equals(id)) {
                iterator.remove();
                break;
            }
        }
    }

    @Override
    public void displayAll() {
        for (Patient p : patients) {
            p.displayInfo();
        }
    }
}
