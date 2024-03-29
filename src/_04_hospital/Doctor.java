package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	
	ArrayList<Patient> patients;
	
	Doctor() {
		patients = new ArrayList<Patient>();
	}
	
	public boolean performsSurgery() {
		return false;
	}
	
	public boolean makesHouseCalls() {
		return false;
	}
	
	public void assignPatient(Patient p) throws DoctorFullException {
		if (patients.size() < 3) {
			patients.add(p);
		} else {
			throw new DoctorFullException();
		}
		
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public void doMedicine() {
		for (Patient p: patients) {
			p.checkPulse();
		}
	}
	
	
}
