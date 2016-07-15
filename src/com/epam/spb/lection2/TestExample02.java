package com.epam.spb.lection2;

import java.util.Scanner;

/**
 * Created by andronovdo on 01.07.2016.
 */
public class TestExample02 {

    public static void main(String[] args) {

            System.out.println ("Выберете нужный \"class\" по его номеру:");
            System.out.println ("1 - Arguments Example");
            System.out.println ("2 - Auto Pack");
            System.out.println ("3 - Big Example");
            System.out.println ("4 - Bit Operations");
            System.out.println ("5 - Chars Test");
            System.out.println ("6 - Class Example");
            System.out.println ("7 - Cover Classes");
            System.out.println ("8 - Data Types");
            System.out.println ("9 - Import");
            System.out.println ("10 - InstanceOf");
            System.out.println ("11 - Logic Operations");
            System.out.println ("12 - Main");
            System.out.println ("13 - Operators");
            System.out.println ("14 - String Transformation");
            System.out.println ("15 - Unary Operators");
            System.out.println ("Или наберите \"exit\" - для выхода");

            Scanner input = new Scanner (System.in);
            String selection = input.nextLine ();

        switch(selection){
            case "1":
                System.out.println("Вы выбрали \"Arguments Example\"");
                ArgumentsExample.main (null);
                break;
            case "2":
                System.out.println("Вы выбрали \"Auto Pack\"");
                AutoPack.main (null);
                break;
            case "3":
                System.out.println("Вы выбрали \"Big Example\"");
                BigExample.main(null);
                break;
            case "4":
                System.out.println("Вы выбрали \"Bit Operations\"");
                BitOperations.main(null);
                break;
            case "5":
                System.out.println("Вы выбрали \"Chars Test\"");
                CharsTest.main(null);
                break;
            case "6":
                System.out.println("Вы выбрали \"Class Example\"");
                ClassExample.main(null);
                break;
            case "7":
                System.out.println("Вы выбрали \"Cover Classes\"");
                CoverClasses.main(null);
                break;
            case "8":
                System.out.println("Вы выбрали \"Data Types\"");
                DataTypes.main(null);
                break;
            case "9":
                System.out.println("Вы выбрали \"Import\"");
                Import.main(null);
                break;
            case "10":
                System.out.println("Вы выбрали \"Instance Of\"");
                InstanceOf.main(null);
                break;
            case "11":
                System.out.println("Вы выбрали \"Logic Operations\"");
                LogicOperations.main(null);
                break;
            case "12":
                System.out.println("Вы выбрали \"Main\"");
                Main.main(null);
                break;
            case "13":
                System.out.println("Вы выбрали \"Operators\"");
                Operators.main(null);
                break;
            case "14":
                System.out.println("Вы выбрали \"String Transformation\"");
                StringTransformation.main(null);
                break;
            case "15":
                System.out.println("Вы выбрали \"Unary Operators\"");
                UnaryOperators.main(null);
                break;
            default:
                System.out.println("FATALLL ERRROR!!!!");
        }
        while (!selection.equals("exit"));

    }
}
