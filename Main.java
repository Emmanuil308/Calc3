import java.util.Scanner;

public class Main {
    public String input;


    public static void main(String[] args) throws Exception {


        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(calc(input));
    }
    public static String calc(String input) throws Exception {
        Rom[] romCif = Rom.values();
        String[] str1 = input.split(" ");

     if (str1.length !=3){
         try {
             System.out.println(str1[3]);
         }catch (Exception e){
             System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
             System.exit (1);
         }
     }
        int a;
        int b;
        int ar;
        int br;
        int sum;
        char ch = str1[1].charAt(0);
        String rez= "Попрубуйте снова";

        switch (str1[0]) {
            case "I":   ar = 1; break;
            case "II":  ar = 2; break;
            case "III": ar = 3; break;
            case "IV":  ar = 4; break;
            case "V":   ar = 5; break;
            case "VI":  ar = 6; break;
            case "VII": ar = 7; break;
            case "VIII":ar = 8; break;
            case "IX":  ar = 9; break;
            case "X":   ar = 10;break;
            default:
                ar = 0;
     }

        switch(str1[2]) {
            case "I":   br = 1; break;
            case "II":  br = 2; break;
            case "III": br = 3; break;
            case "IV":  br = 4; break;
            case "V":   br = 5; break;
            case "VI":  br = 6; break;
            case "VII": br = 7; break;
            case "VIII":br = 8; break;
            case "IX":  br = 9; break;
            case "X":   br = 10;break;
            default:
                br = 0;
    }

        if (ch == '-' && ar > 0 && br >0 ) {
            try{ sum = ar - br;
                rez = String.valueOf(romCif[sum-1]);
            }
            catch (Exception e){System.out.println("Не бывает отрицательных и равных нулю римских цифр");}

        } else if (ch == '+' && ar > 0 && br > 0 ) {
            sum = ar + br;
            rez = String.valueOf(romCif[sum-1]);

        } else if (ch == '*' && ar > 0 && br > 0 ) {
            sum = ar * br;
            rez = String.valueOf(romCif[sum-1]);

        } else if (ch == '/' && ar > 0 && br > 0 ) {
            try{
            sum = ar / br;
            rez = String.valueOf(romCif[sum-1]);}
            catch (Exception e){System.out.println("Не бывает отрицательных и равных нулю римских цифр");}

        } else if (ch == '-' && ar ==0 && br ==0 ) {
            try {
                a = Integer.parseInt(str1[0]);
                b = Integer.parseInt(str1[2]);
                boolean b1 = a > 0 && a < 11;
                boolean b2 = b > 0 && b < 11;
                if (b1 ==true && b2 == true){
                sum = a - b;
                rez = String.valueOf(sum);
                } else if (b1==false ||  b2==false) {
                    System.out.println("Вы ввели арабские цифры меньше 1 или более 10");
                }
            }catch (Exception e){
                System.out.println("Вы ввели не корректную римскую цифру или римское число больше X");
            }
        } else if (ch == '+' && ar ==0 && br ==0) {
            try {
                a = Integer.parseInt(str1[0]);
                b = Integer.parseInt(str1[2]);
                boolean b1 = a > 0 && a < 11;
                boolean b2 = b > 0 && b < 11;
                if (b1 ==true && b2 == true){
                    sum = a + b;
                    rez = String.valueOf(sum);
                } else if (b1==false ||  b2==false) {
                    System.out.println("Вы ввели арабские цифры меньше 1 или более 10");
                }
            }catch (Exception e){
                System.out.println("Вы ввели не корректную римскую цифру или римское число больше X");
            }
        } else if (ch == '*' && ar ==0 && br ==0) {
            try {
                a = Integer.parseInt(str1[0]);
                b = Integer.parseInt(str1[2]);
                boolean b1 = a > 0 && a < 11;
                boolean b2 = b > 0 && b < 11;
                if ((b1 ==true) && (b2 == true)){
                    sum = a * b;
                    rez = String.valueOf(sum);
                } else if (b1==false ||  b2==false) {
                    System.out.println("Вы ввели арабские цифры меньше 1 или более 10");
                }
            }catch (Exception e){
                System.out.println("Вы ввели не корректную римскую цифру или римское число больше X");
            }
        } else if (ch == '/' && ar ==0 && br ==0) {
            try {
                a = Integer.parseInt(str1[0]);
                b = Integer.parseInt(str1[2]);
                boolean b1 = a > 0 && a < 11;
                boolean b2 = b > 0 && b < 11;
                if (b1 ==true && b2 == true){
                    sum = a / b;
                    rez = String.valueOf(sum);
                } else if (b1==false ||  b2==false) {
                    System.out.println("Вы ввели арабские цифры меньше 1 или более 10");
                }
            }catch (Exception e){
                System.out.println("Вы ввели не корректную римскую цифру или римское число больше X");
            }
        } else if (ch!='+' && ch!='-' && ch!='*' && ch!='/' ) {
                System.out.println("Cтрока не является математической операцией");

        } else if (ar !=0 && br ==0) {
            try {b = Integer.parseInt(str1[2]);
                int oshibka1 = ar+b;
                System.out.println("Используются одновременно разные системы счесления");
                }
            catch (Exception e){
                System.out.println("Вы ввели не корректную римскую цифру или римское число больше X");
            }
        }else if (br !=0 && ar ==0) {
            try {a = Integer.parseInt(str1[0]);
                int oshibka2 = br+a;
                System.out.println("Используются одновременно разные системы счесления");}
            catch (Exception e){
                System.out.println("Вы ввели не корректную римскую цифру или римское число больше X");
            }
        }
        return rez;
    }
}