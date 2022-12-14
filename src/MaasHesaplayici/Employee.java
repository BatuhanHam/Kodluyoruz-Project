package MaasHesaplayici;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }
    double tax(){
        if(this.salary <1000){
        return salary;
        }

        else{
            int temp = salary;
            int tax = temp*3/100;
            return tax;
        }
    }

    int bonus(){
        if (workHours>40){
            int bonusSalary=(workHours-40)*30;
            return bonusSalary;
        }
        else
            return 0;
    }

    int  raiseSalary(){
        int temp = 2021-this.hireYear;

        if (temp < 10){
            int zam = this.salary*5/100;
            return zam;
        }
        else if ((temp > 9) && (temp<20)) {
            int zam = this.salary*10/100;
            return zam;
        }
        else{
            int zam = this.salary*15/100;
            return zam;
        }

    }
    void print(){
        System.out.println("Adı: "+this.name+"\n"+
                           "Çalışma Saati: "+this.workHours+"\n"+
                           "Başlangıç Yılı: "+this.hireYear+"\n"+
                           "Vergi: "+tax()+"\n"+
                           "Bonus: "+bonus()+"\n"+
                           "Maaş Artışı: "+raiseSalary()+"\n"+
                           "Vergi ve Bonuslar İle Birlikte Maaş: "+((this.salary)-tax()+bonus())+"\n"+
                           "Toplam Maaş: "+(this.salary+raiseSalary()));
    }
}
