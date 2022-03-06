import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarList {
    private List<Car> carList = new ArrayList<>();

    public void addCar(Car car) {
        carList.add(car);
    }

    public void printAllCarsInList() {
        System.out.println("Список всех машин");
        for (Car car : carList) {
            System.out.println(car.toString());

        }
    }

    public void printCarListWithGivenBrand(String brand) {
        System.out.println("Список автомобилей марки " + brand);
        for (Car car : carList) {
            if (car.getBrand().equals(brand)) {
                System.out.println(car.toString());
            }
        }
    }

    public void printCarListWithGivenBrandAndYearsOfUse(String brand, int years) {
        System.out.println("Список автомобилей модели " + brand + ", которые эксплуатируются больше " + years + " лет");
        Date date = new Date();
        int currentYear = 1900 + date.getYear();
        for (Car car : carList) {
            if (car.getBrand().equals(brand) && (currentYear - car.getReleaseYear()) > years) {
                System.out.println(car.toString());
            }
        }
    }

    public void printCarListWithGivenReleaseYearAndBiggerPrice(int releaseYear, double price) {
        System.out.println("Список автомобилей " + releaseYear + " года выпуска, цена которых больше " + price);
        for (Car car : carList) {
            if (car.getReleaseYear() == releaseYear && car.getPrice() > price) {
                System.out.println(car.toString());
            }
        }
    }
}
