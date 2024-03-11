import java.util.Date;

public class Person {
    private String firstName;
    private String secondName;
    private String patronymic;
    private String initials;
    private Integer age;
    private String gender;
    private String dateOfBirth;

    Person(String firstName, String secondName, String patronymic, String dateOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.refactorPerson();
    }

    public void refactorPerson() {
        Date currentDate = new Date();
        int[] dateArr = {currentDate.getDate(), currentDate.getMonth() + 1, currentDate.getYear() + 1900};
        String[] dateInfo = dateOfBirth.split("\\.");
        int[] dateInfoInt = new int[3];
        for (int i = 0; i < dateInfo.length; i++) {
            dateInfoInt[i] = Integer.parseInt(dateInfo[i]);
        }


        if (dateArr[1] > dateInfoInt[1]) {
            age = dateArr[2] - dateInfoInt[2];
        } else if (dateArr[1] < dateInfoInt[1]) {
            age = dateArr[2] - dateInfoInt[2] - 1;
        } else {
            if (dateArr[0] >= dateInfoInt[0]) {
                age = dateArr[2] - dateInfoInt[2];
            } else {
                age = dateArr[2] - dateInfoInt[2] - 1;
            }
        }

        if (patronymic.endsWith("ч")) {
            gender = "мужской";
        } else if (patronymic.endsWith("а")) {
            gender = "женский";
        } else {
            gender = "не определён";
        }

        initials = firstName.substring(0, 1) + "." + patronymic.substring(0, 1) + ".";

    }

    public void printPersonInfo() {
        System.out.println(secondName + " " + initials + "\nПол: " + gender + "\nВозраст: " + age.toString());
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
