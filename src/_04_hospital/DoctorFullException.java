package _04_hospital;

import javax.swing.JOptionPane;

public class DoctorFullException extends Exception {
	DoctorFullException() {
		System.out.println("\nDoctor has too many patients :(");
	}
}
