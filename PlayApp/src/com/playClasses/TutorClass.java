package com.playClasses;

import java.util.Objects;

public class TutorClass implements WorkerInterface {

	private String workerType;
	private String workerShift;
	private String workerFirstName;
    private String workerLastName;
	private String workerId;
	private Double workPayRate;
	

	@Override
	public void calculateWorkerPayRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void workerInformation() {
		// TODO Auto-generated method stub
		
	}
	
	
	public String getWorkerType() {
		return workerType;
	}

	public void setWorkerType(String workerType) {
		this.workerType = workerType;
	}

	public String getWorkerShift() {
		return workerShift;
	}

	public void setWorkerShift(String workerShift) {
		this.workerShift = workerShift;
	}

	public String getWorkerFirstName() {
		return workerFirstName;
	}

	public void setWorkerFirstName(String workerFirstName) {
		this.workerFirstName = workerFirstName;
	}

	public String getWorkerLastName() {
		return workerLastName;
	}

	public void setWorkerLastName(String workerLastName) {
		this.workerLastName = workerLastName;
	}

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	public Double getWorkPayRate() {
		return workPayRate;
	}

	public void setWorkPayRate(Double workPayRate) {
		this.workPayRate = workPayRate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int hashCode() {
		return Objects.hash(workPayRate, workerFirstName, workerId, workerLastName, workerShift, workerType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TutorClass other = (TutorClass) obj;
		return Objects.equals(workPayRate, other.workPayRate) && Objects.equals(workerFirstName, other.workerFirstName)
				&& Objects.equals(workerId, other.workerId) && Objects.equals(workerLastName, other.workerLastName)
				&& Objects.equals(workerShift, other.workerShift) && Objects.equals(workerType, other.workerType);
	}

	@Override
	public String toString() {
		return "TutorClass [workerType=" + workerType + ", workerShift=" + workerShift + ", workerFirstName="
				+ workerFirstName + ", workerLastName=" + workerLastName + ", workerId=" + workerId + ", workPayRate="
				+ workPayRate + "]";
	}
	
	

}
