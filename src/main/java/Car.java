public class Car {
    private int id;
    private static int count = 0;
    private String brand;
    private String model;
    private int releaseYear;
    private String color;
    private double price;
    private String registrationNumber;

    public Car(String brand, String model, int releaseYear, String color, double price, String registrationNumber) {
        setId(++count);
        this.brand = brand;
        this.model = model;
        this.releaseYear = releaseYear;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Car.count = count;
    }

    public String getBrand() {
        return brand;
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

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", Марка='" + brand + '\'' +
                ", Модель='" + model + '\'' +
                ", Год выпуска=" + releaseYear +
                ", Цвет='" + color + '\'' +
                ", Цена=" + price +
                ", Регистрационный номер='" + registrationNumber + '\'' +
                '}';
    }
}
