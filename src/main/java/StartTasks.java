public class StartTasks {
    public static void main(String[] args) {
        taskStudent();
        taskBook();
        taskHouse();
        taskCar();
    }

    public static void taskStudent() {
        Student student1 = new Student("Иванов", "Иван", "Иванович", "12.05.1984", "пер. Калужский, 12", "80222787878", "Технический", 3, "ТФ-311");
        Student student2 = new Student("Петров", "Петр", "Петрович", "15.03.1985", "ул. 3я Волжская, 22-21", "80222123456", "Инженерный", 2, "ИФ-222");
        Student student3 = new Student("Сидоров", "Иван", "Иванович", "04.11.1984", "ул. Запарожская, 12-12", "80222111111", "Физический", 3, "ФФ-333");
        Student student4 = new Student("Андреев", "Константин", "Петрович", "15.01.1985", "ул. Запарожская, 11-56", "80222222222", "Математический", 2, "МФ-244");
        Student student5 = new Student("Ватрушкин", "Александр", "Игнатьевич", "11.11.1986", "ул. Запарожская, 77-10", "80222332211", "Инженерный", 1, "ИФ-122");
        Student student6 = new Student("Петрушкин", "Олег", "Олегович", "12.12.1982", "пер. Калужский, 21", "80222784565", "Математический", 5, "МФ-544");
        Student student7 = new Student("Федоров", "Евгений", "Герасимов", "10.10.1985", "ул. Пионерская, 22-02", "80222114451", "Инженерный", 2, "ИФ-222");
        Student student8 = new Student("Фурсов", "Игнат", "Маркович", "18.12.1982", "ул. Пионерская, 12-12", "80222658456", "Физический", 5, "ФФ-533");
        Student student9 = new Student("Семенов", "Марк", "Олегович", "19.01.1983", "пер. Калужский, 76", "80222848448", "Математический", 4, "МФ-444");
        Student student10 = new Student("Жучков", "Игорь", "Иванович", "11.04.1984", "ул. 3я Волжская, 14-10", "80222959559", "Технический", 3, "ТФ-311");
        Student student11 = new Student("Паучков", "Олег", "Петрович", "03.11.1985", "ул. 3я Волжская, 12-99", "80222484815", "Технический", 2, "ТФ-211");
        Student student12 = new Student("Бумажкин", "Иван", "Александрович", "20.11.1984", "ул. Пионерская, 44-01", "80222456545", "Математический", 3, "");
        Student student13 = new Student("Манеткин", "Александр", "Евгеньевич", "30.01.1982", "пер. Калужский, 33", "80222445544", "Физический", 5, "ФФ-533");
        Student student14 = new Student("Супов", "Евгений", "Константинович", "22.11.1983", "ул. Запарожская, 23-33", "80222445577", "Инженерный", 4, "ИФ-422");
        Student student15 = new Student("Борщев", "Петр", "Маркович", "07.07.1985", "ул. Запарожская, 54-14", "80222265948", "Математический", 2, "МФ-244");

        StudentsList studentsList = new StudentsList();
        studentsList.addStudent(student1);
        studentsList.addStudent(student2);
        studentsList.addStudent(student3);
        studentsList.addStudent(student4);
        studentsList.addStudent(student5);
        studentsList.addStudent(student6);
        studentsList.addStudent(student7);
        studentsList.addStudent(student8);
        studentsList.addStudent(student9);
        studentsList.addStudent(student10);
        studentsList.addStudent(student11);
        studentsList.addStudent(student12);
        studentsList.addStudent(student13);
        studentsList.addStudent(student14);
        studentsList.addStudent(student15);

        //studentsList.printAllStudents();
        studentsList.printFaculty("Математический"); //список студентов определенного факультета
        studentsList.printGroup("МФ-244"); //список студентов определенной группы
        studentsList.printBirthYear("1983"); // список студентов родившихся после определенного года
        studentsList.printFacultyCourse("Математический", 2); //список студентов определенного факультета и курса
    }

    public static void taskBook() {
        String[] authors1 = {"Пауло Коэльо"};
        Book book1 = new Book("Алхимик", authors1, "АСТ", 1988, 200, 124, "Обвязка");
        String[] authors2 = {"Рэй Брэдбери"};
        Book book2 = new Book("451 градус по Фаренгейту", authors2, "Время", 1940, 200, 214, "Переплет");
        String[] authors3 = {"Lyon Sprague de Camp", "Robert E. Howard"};
        Book book3 = new Book("The God in the Bowl", authors3, "Gnome Press", 1952, 50, 224, "Строчка");
        String[] authors4 = {"Lyon Sprague de Camp", "Robert E. Howard", "Linwood Vrooman Carter"};
        Book book4 = new Book("The Hand of Nergal", authors4, "Gnome Press", 1967, 35, 240, "Термоскрепление");
        String[] authors5 = {"Robert E. Howard"};
        Book book5 = new Book("Conan the Barbarian", authors5, "Gnome Press", 1955, 350, 210, "Переплет");
        String[] authors6 = {"Иоганн Вольфганг фон Гёте"};
        Book book6 = new Book("Фауст", authors6, "АСТ", 1831, 494, 204, "Обвязка");
        String[] authors7 = {"Станислав Лем"};
        Book book7 = new Book("Солярис", authors7, "Время", 1961, 340, 14, "Переплет");

        BooksList booksList = new BooksList();
        booksList.addBook(book1);
        booksList.addBook(book2);
        booksList.addBook(book3);
        booksList.addBook(book4);
        booksList.addBook(book5);
        booksList.addBook(book6);
        booksList.addBook(book7);

        //booksList.printAllBooks();
        booksList.printAuthorBooks("Robert E. Howard");//книги автора
        booksList.printPublisherBooks("Время");//книги издательства
        booksList.printBooksReleasedAfterYear(1960);//книги после определенного года
    }

    public static void taskHouse(){
        House house1 = new House(1, 70, 1, 3, "ул. Крупской, 10", "Блочный", "40 лет");
        House house2 = new House(2, 80, 1, 3, "ул. Крупской, 10", "Блочный", "40 лет");
        House house3 = new House(3, 36, 1, 1, "ул. Крупской, 10", "Блочный", "40 лет");
        House house4 = new House(4, 30, 1, 1, "ул. Крупской, 10", "Блочный", "40 лет");
        House house5 = new House(5, 54, 2, 2, "ул. Крупской, 10", "Блочный", "40 лет");
        House house6 = new House(6, 60, 2, 2, "ул. Крупской, 10", "Блочный", "40 лет");
        House house7 = new House(7, 49, 2, 2, "ул. Крупской, 10", "Блочный", "40 лет");
        House house8 = new House(8, 50, 2, 2, "ул. Крупской, 10", "Блочный", "40 лет");
        House house9 = new House(9, 80, 3, 3, "ул. Крупской, 10", "Блочный", "40 лет");
        House house10 = new House(10, 56, 3, 2, "ул. Крупской, 10", "Блочный", "40 лет");
        House house11 = new House(11, 53, 3, 2, "ул. Крупской, 10", "Блочный", "40 лет");
        House house12 = new House(12, 30, 3, 1, "ул. Крупской, 10", "Блочный", "40 лет");
        House house13 = new House(13, 98, 4, 4, "ул. Крупской, 10", "Блочный", "40 лет");
        House house14 = new House(14, 50, 4, 2, "ул. Крупской, 10", "Блочный", "40 лет");
        House house15 = new House(15, 30, 4, 1, "ул. Крупской, 10", "Блочный", "40 лет");
        House house16 = new House(16, 32, 4, 1, "ул. Крупской, 10", "Блочный", "40 лет");
        House house17 = new House(17, 110, 5, 5, "ул. Крупской, 10", "Блочный", "40 лет");
        House house18 = new House(18, 28, 5, 1, "ул. Крупской, 10", "Блочный", "40 лет");
        House house19 = new House(19, 36, 5, 1, "ул. Крупской, 10", "Блочный", "40 лет");
        House house20 = new House(20, 30, 5, 1, "ул. Крупской, 10", "Блочный", "40 лет");

        HouseList houseList = new HouseList();
        houseList.addHouse(house1);
        houseList.addHouse(house2);
        houseList.addHouse(house3);
        houseList.addHouse(house4);
        houseList.addHouse(house5);
        houseList.addHouse(house6);
        houseList.addHouse(house7);
        houseList.addHouse(house8);
        houseList.addHouse(house9);
        houseList.addHouse(house10);
        houseList.addHouse(house11);
        houseList.addHouse(house12);
        houseList.addHouse(house13);
        houseList.addHouse(house14);
        houseList.addHouse(house15);
        houseList.addHouse(house16);
        houseList.addHouse(house17);
        houseList.addHouse(house18);
        houseList.addHouse(house19);
        houseList.addHouse(house20);

        //houseList.printApartmentList(); //список всех квартир
        houseList.printApartmentListWithGivenNumberOfRooms(3); //список квартир, имеющих заданное число комнат
        houseList.printAptListWithGivenRoomsOnFloorInterval(3 , 2, 4); //список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке
        houseList.printApartmentListWithExceedingArea(70); //список квартир, имеющих площадь, превосходящую заданную
    }

    public static void taskCar(){
        Car car1 = new Car("","",2000,"", 10000,"");
    }
}
