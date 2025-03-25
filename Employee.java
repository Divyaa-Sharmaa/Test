package com.example.demo.employees;

import java.time.LocalDate;

import org.hibernate.annotations.NotFound;

import com.example.demo.Department.Department;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name; //email, department, salary, joining date
	
	private String email;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	
	private double salary;
	private LocalDate joiningDate;

}
