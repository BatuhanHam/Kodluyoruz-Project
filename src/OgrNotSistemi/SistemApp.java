package OgrNotSistemi;

public class SistemApp {
    public static void main(String[] args) {
        Teachers t1 = new Teachers("Mahmut Hoca", "TRH", "905000");
        Teachers t2 = new Teachers("Graham Bell", "FZK", "0000");
        Teachers t3 = new Teachers("Külyutmaz", "BIO", "1111");

        Courses tarih = new Courses("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Courses fizik = new Courses("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Courses biyo = new Courses("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);

        Students s1 = new Students("İnek Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100, 100, 100, 100, 100, 100);
        s1.isPass();

        Students s2 = new Students("Güdük Necmi", "444", "4", tarih, fizik, biyo);
        s2.addBulkExamNote(50, 50, 50, 40, 50, 50);
        s2.isPass();

    }
    }
