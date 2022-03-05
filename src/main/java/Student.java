public class Student {
    private int id;
    private static int count = 0;
    private String surname;
    private String firstName;
    private String middleName;
    private String dateOfBirth;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private String group;

    public Student(String surname, String firstName, String middleName, String dateOfBirth, String address, String phone, String faculty, int course, String group) {
        setId(++count);
        //this.id = count++;
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Фамилия='" + surname + '\'' +
                ", Имя='" + firstName + '\'' +
                ", Отчество='" + middleName + '\'' +
                ", Дата рождения='" + dateOfBirth + '\'' +
                ", Адрес='" + address + '\'' +
                ", Телефон='" + phone + '\'' +
                ", Факультет='" + faculty + '\'' +
                ", Курс=" + course +
                ", Группа='" + group + '\'' +
                '}';
    }
}
