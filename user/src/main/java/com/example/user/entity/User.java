package com.example.user.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int id_Dep;
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
	public int getId_Dep() {
		return id_Dep;
	}
	public void setId_Dep(int id_Dep) {
		this.id_Dep = id_Dep;
	}
	public User(int id, String name, int id_Dep) {
		super();
		this.id = id;
		this.name = name;
		this.id_Dep = id_Dep;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", id_Dep=" + id_Dep + "]";
	}


}
