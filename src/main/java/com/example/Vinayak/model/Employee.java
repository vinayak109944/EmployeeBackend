package com.example.Vinayak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
    private long empid;
    private String empname;
    private String contact;
    private String dob;
    private String emailId;
    private String emprole;
    private String doj;
    
    
 
    public Employee() {
  
    }
 
  
    public Employee(long empid, String empname, String contact, String dob, String emailId, String emprole,
			String doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.contact = contact;
		this.dob = dob;
		this.emailId = emailId;
		this.emprole = emprole;
		this.doj = doj;
	}


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long getEmpid() {
		return empid;
	}


	public void setEmpid(long empid) {
		this.empid = empid;
	}
	 @Column(name = "empname", nullable = false)
    public String getEmpname() {
		return empname;
	}
    public void setEmpname(String empname) {
		this.empname = empname;
	}

	 @Column(name = "contact", nullable = false)
	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}

	 @Column(name = "dob", nullable = false)
	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}

	 @Column(name = "emailId", nullable = false)
	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	 @Column(name = "emprole", nullable = false)
	public String getEmprole() {
		return emprole;
	}


	public void setEmprole(String emprole) {
		this.emprole = emprole;
	}

	 @Column(name = "doj", nullable = false)
	public String getDoj() {
		return doj;
	}


	public void setDoj(String doj) {
		this.doj = doj;
	}


	


	
 
}