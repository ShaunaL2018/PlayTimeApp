package com.playClasses;

import java.util.Objects;

public class MySingletonClass {

	private static MySingletonClass instance = null;
	private String DBConnection = null;
	
	private MySingletonClass() {
		DBConnection = "Good Connection Value";
	}
	
	public static MySingletonClass getInstance() {
		if (instance ==null) {
			instance = new MySingletonClass();
		}
		return instance;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(DBConnection);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MySingletonClass other = (MySingletonClass) obj;
		return Objects.equals(DBConnection, other.DBConnection);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingletonClass newInstance = MySingletonClass.getInstance();
		String dbConn = newInstance.DBConnection;
		
		System.out.println("DBConnection " + dbConn);
	}

}
