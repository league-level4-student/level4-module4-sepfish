package _04_hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Patient> patients;
	ArrayList<Doctor> doctors;

	Hospital() {
		patients = new ArrayList<Patient>();
		doctors = new ArrayList<Doctor>();
	}

	public void addPatient(Patient p) {
		patients.add(p);

	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void addDoctor(Doctor d) {
		doctors.add(d);
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void assignPatientsToDoctors() { //need to fix this >:( ----------------------------------------------------
		for (int i = 0; i < doctors.size(); i++) {
			for (int j = 0; j < patients.size(); j++) {
				try {
					doctors.get(i).assignPatient(patients.get(j));
				} catch (DoctorFullException e) {
					i++;
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
