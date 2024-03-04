package exer2;

public class Carro {
    private String brand;
    private String model;
    private String year;

    public Carro (String brand, String model, String year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getYear(){
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
