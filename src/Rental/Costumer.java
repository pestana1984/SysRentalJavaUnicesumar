package Rental;

import java.util.Date;

public class Costumer extends Person{

    private String creditCardNumber;
    private String licenseNumber;
    private Date expirationLicense;

    public Costumer(String cpf, String name, String creditCardNumber, String licenseNumber) {
        super(cpf, name);
        this.creditCardNumber = creditCardNumber;
        this.licenseNumber = licenseNumber;
    }

    public Costumer(String cpf, String name){
        super(cpf, name);
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void showInfo(){
        System.out.println("Dados Pessoais:\n");
        super.showInfo();
        System.out.println("Habilitação: " + getLicenseNumber());
    }
}
