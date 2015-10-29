
class people {
    String name;
    int age;

    people() {
    }

    people(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("in people");
    }

}

class graduate extends student {
    graduate() {
        System.out.println("in graduate");
    }

}

class student extends people {
    String school;

    student() {
        this(null, 0, null);
        System.out.println("in school1");
    }

    student(String name, int age, String school) {
        super(name, age);
        this.school = school;
        System.out.println("in school2");
    }
}

class Exam3_16 {
    public static void main() {
        people p = new graduate();
    }
}
