import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number to multiply: ");
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        myObj.close();
        for (int i =1; i < 11; i++) {
            int result = i * num;
            System.out.println(i + " x " + num + " = " + result);
        }
    }
}