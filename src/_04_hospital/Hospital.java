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

	public void assignPatientsToDoctors() { 
		int doctorNumber = 0;
		for (int i = 0; i < patients.size();) {
			try {
				System.out.println("\ndoctor number " + doctorNumber + " adding patient number " + i);
				doctors.get(doctorNumber).assignPatient(patients.get(i));
				i++;
			} catch (DoctorFullException e) {
				doctorNumber++;
			}
		}
	}
	
}
