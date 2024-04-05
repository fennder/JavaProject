package model;

public class People {
	//Atritutos de People
	private String name; //Nome
	private String lastName; //sobreNome = ultimoNome
	private String cpf; //CPF
	private int age; //idade
	private String birthDay; //dataNascimento
	private String phoneNumber; // telefone
	
	public People(String name, String lastName, String cpf, int age, String birthDay, String phoneNumber) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.cpf = cpf;
		this.age = age;
		this.birthDay = birthDay;
		this.phoneNumber = phoneNumber;
	}
	
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
