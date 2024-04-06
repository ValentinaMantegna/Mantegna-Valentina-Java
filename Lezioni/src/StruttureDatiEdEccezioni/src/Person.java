package StruttureDatiEdEccezioni.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person {
    private String name;
    private String surname;
    private String birthDate;
    private String nickname;

    public Person(String name, String surname, String birthDate, String nickname) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.nickname = nickname;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}

class Country {
    private String name;
    private Map<String, List<String>> regions = new HashMap<>();

    public Country(String name) {
        this.name = name;
    }

    public void addCity(String region, String city) {
        regions.computeIfAbsent(region, k -> new ArrayList<>()).add(city);
    }

    public Map<String, List<String>> getRegions() {
        return regions;
    }
}

class Subject {
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Subject(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public List<Integer> getGrades() {
        return grades;
    }
}

