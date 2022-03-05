public class House {
    private int id;
    private static int count = 0;
    private int apartmentNumber;
    private int area;
    private int floor;
    private int rooms;
    private String street;
    private String buildingType;
    private String lifetime;

    public House(int apartmentNumber, int area, int floor, int rooms, String street, String buildingType, String lifetime) {
        setId(++count);
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.rooms = rooms;
        this.street = street;
        this.buildingType = buildingType;
        this.lifetime = lifetime;
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
        House.count = count;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getLifetime() {
        return lifetime;
    }

    public void setLifetime(String lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", Номер квартиры=" + apartmentNumber +
                ", Площадь=" + area +
                ", Этаж=" + floor +
                ", Количество комнат=" + rooms +
                ", Улица='" + street + '\'' +
                ", Тип здания='" + buildingType + '\'' +
                ", Срок эксплуатации='" + lifetime + '\'' +
                '}';
    }
}
