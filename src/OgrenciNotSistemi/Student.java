package OgrenciNotSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;

    }
    void addBulkExamNote(int note1, int note2, int note3,int noteVerbal1,int noteVerbal2,int noteVerbal3){
        if (note1>=0 && note1<=100)
            c1.note = note1;

        if (note2>=0 && note2<=100)
            c2.note = note2;

        if (note3>=0 && note3<=100)
            c3.note = note3;

        if (noteVerbal1>=0 && noteVerbal1<=100)
            this.c1.verbalNote = noteVerbal1;

        if (noteVerbal2>=0 && noteVerbal2<=100)
            this.c2.verbalNote = noteVerbal2;

        if (noteVerbal3>=0 && noteVerbal3<=100)
            this.c3.verbalNote = noteVerbal3;

    }
    void printNote(){
        System.out.println(c1.name + " Notu\t:" + c1.note+"\n" +c1.name+" Sözlü Notu : " + c1.verbalNote);
        System.out.println(c2.name + " Notu\t:" + c2.note+"\n" +c2.name+" Sözlü Notu : " + c2.verbalNote);
        System.out.println(c3.name + " Notu\t:" + c3.note+"\n" +c3.name+" Sözlü Notu : " + c3.verbalNote);
        System.out.println("Ortalammanız : "+ String.format("%.2f",this.avarage));


    }

    void isPass(){
        System.out.println("=================");
        this.avarage =(((c1.note*0.8)+c1.verbalNote*0.2)+((c2.note*0.8)+c2.verbalNote*0.2)+((c3.note*0.8)+c3.verbalNote*0.2))/3;
        if (this.avarage >55){
            System.err.println("Sınıfı Başarılı Şekilde Geçtiniz.");
            this.isPass = true;
        }
        else{
            System.err.println("Sınıfta Kaldınız.");
            this.isPass = false;
        }
        printNote();
    }
}

