import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.List;

public class HouseList {
    private List<House> houseList = new ArrayList<>();

    public void addHouse(House house) {
        houseList.add(house);
    }

    public void printApartmentListWithGivenNumberOfRooms(int rooms) {
        System.out.println("Список квартир имеющих " + rooms + " комнат");
        for (House house : houseList) {
            if (house.getRooms() == rooms) {
                System.out.println(house.toString());
            }
        }
    }

    public void printAptListWithGivenRoomsOnFloorInterval(int rooms, int floorMin, int floorMax) {
        System.out.println("Список квартир имеющих " + rooms + " комнат и расположенных на этажах с " + floorMin + " по " + floorMax);
        for (House house : houseList) {
            if (house.getRooms() == rooms && house.getFloor() >= floorMin && house.getFloor() <= floorMax) {
                System.out.println(house.toString());
            }
        }
    }

    public void printApartmentListWithExceedingArea(int area) {
        System.out.println("Список квартир имеющих площадь превосходящую " + area);
        for (House house : houseList) {
            if (house.getArea() > area) {
                System.out.println(house.toString());
            }
        }
    }

    public void printApartmentList() {
        for (House house : houseList) {
            System.out.println(house.toString());
        }
    }
}
