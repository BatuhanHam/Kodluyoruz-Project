package BoksMaci;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int first;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }
    void run(){
        if (isCheck()) {
            while (this.f1.health >0 && this.f2.health>0){

                if (start() == 0) {
                    System.out.println("=====YENİ ROUND=====");
                    f2.health = f1.hit(f2);
                    System.out.println(this.f1.name + " Sağlık :"+ this.f1.health);
                    System.out.println(this.f2.name + " Sağlık :"+ this.f2.health);
                   if (isWin()) {
                        break;
                    }
                }

                 else if (start() == 1) {
                    System.out.println("=====YENİ ROUND=====");
                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f1.name + " Sağlık :"+ this.f1.health);
                    System.out.println(this.f2.name + " Sağlık :"+ this.f2.health);
                    if (isWin()) {
                        break;
                    }
                }


            }

        }
        else
            System.err.println("Sporcuların sikletleri uymuyor.");
    }
    boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }

    boolean isWin(){
        if (this.f1.health ==0){
            System.out.println(f2.name +" Kazandı.");
            return true;
        }
        if (this.f2.health == 0){
            System.out.println(f1.name+ " Kazandı.");
            return true;
        }
        return false;
    }
    int start(){
        this.first = (int)(Math.random()*2);
        return first;
    }


}
