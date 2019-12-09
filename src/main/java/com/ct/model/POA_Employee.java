package com.ct.model;

public class POA_Employee {

	private String name;
	private CommunicationAddress communicationAddr;
	private String mobile;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public CommunicationAddress getCommunicationAddr() {
		return communicationAddr;
	}

	public void setCommunicationAddr(CommunicationAddress communicationAddr) {
		this.communicationAddr = communicationAddr;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static class Address {
		private String addressLine1;

		public String getAddressLine1() {
			return addressLine1;
		}

		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}

		@Override
		public String toString() {
			return "Address [addressLine1=" + addressLine1 + "]";
		}
	}

	public static class CommunicationAddress {
		private Address address;

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "CommunicationAddress [address=" + address + "]";
		}

	}

	@Override
	public String toString() {
		return "POA_Employee [name=" + name + ", communicationAddr=" + communicationAddr + ", mobile=" + mobile
				+ ", salary=" + salary + "]";
	}

	

}
