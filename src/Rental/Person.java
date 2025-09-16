package Rental;

abstract class Person{

    private String name;
    private String cpf;

    public Person(String cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.cpf);
    }
}
