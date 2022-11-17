package u4pp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    Scanner myScanner = new Scanner(System.in);
    InputHelper myInputHelper = new InputHelper(myScanner);
    myInputHelper.getIntegerInput("You want hot jew pics?", 1, 11);

    }
}