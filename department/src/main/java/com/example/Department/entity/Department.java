package com.example.Department.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String diachi;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public Department(int id, String name, String diachi) {
		super();
		this.id = id;
		this.name = name;
		this.diachi = diachi;
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", diachi=" + diachi + "]";
	}

}
