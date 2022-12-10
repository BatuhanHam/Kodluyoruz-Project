package OgrNotSistemi;

public class Courses {


    Teachers teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    Courses(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        this.verbalNote = 0;

    }

    void addTeacher(Teachers teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else
            System.out.println("Öğrentmen ve Ders Bölümleri Uyuşmuyor.");

    }

    void printTeacher() {
        this.teacher.print();
    }

}
