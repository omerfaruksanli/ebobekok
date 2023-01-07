import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number1,number2,snumber;
        int i = 1 ;
        Scanner input=new Scanner(System.in);

        System.out.print(" İlk sayıyı giriniz : ");
        number1 = input.nextInt();
        System.out.print(" İkinci sayıyı giriniz : ");
        number2 = input.nextInt();

        if (number1 < number2){
            snumber=number1;
        }else {
            snumber=number2;
        }while (snumber>= 1 ){
            if ((number1 % snumber==0)&&(number2 % snumber==0)){
                System.out.println("Ebob : " + snumber); ;
                break;
            }
            snumber--;

        }while (i<=number1 * number2){
            if((i % number1 == 0)&& (i%number2==0)){
                System.out.println("Ekok : "+ i);
                break;
            }
            i++;
        }


    }
}