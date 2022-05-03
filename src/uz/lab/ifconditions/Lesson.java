package uz.lab.ifconditions;

public class Lesson {
    public static void main(String[] args) {
        //if else if else
        //> katta
        // < kichik
        // == teng
        //! emas !< kichik emas != teng emas
        // 6%5==1
        int number = 9;
        if (number<9){
            System.out.println("Ha 9 dan kichik");
        }else if (number > 10){
            System.out.println("Yo'q 10 dan katta ");
        }else if(number == 10){
            System.out.println("Ha 10 ga teng");
        }else {
            System.out.println("raqam 9 ga teng");
        }
    }
}
