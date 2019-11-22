package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
      System.out.println("Area and Perimeter Calculator");

    //This commented code below was the first draft of the CodeReview, more closely aligned to the Requirements.
      // Uncomment this section to check for functionality.

      /*Scanner myObj = new Scanner(System.in);
    System.out.println("Please input the width of the first rectangle: ");
    int width = myObj.nextInt();
    System.out.println("Please input the height of the first rectangle: ");
    int height = myObj.nextInt();
    System.out.println("width: " + width + "m");
    System.out.println("height: " + height + "m");
    System.out.println("area of the rectangle: " + (width * height) + "m^2\r\n");

    calculateRectArea(20, 30);
    calculateRectArea(40, 50);
    System.out.println("Please input the side length of a square: ");
    int side = myObj.nextInt();
    calculateSquareArea(side);
    calculateSquarePerimeter(side);
    System.out.println("Several Areas with function calls: ");
    calculateRectArea(10, 30);
    calculateSquareArea(5);
    calculateRectArea(15, 25);
    calculateSquareArea(7);
    calculateRectArea(8, 12);
    calculateSquareArea(10);

    int[] widthArray = {13, 14, 20, 112, 234};
    int[] heigthArray = {34, 156, 203, 11, 45};

    for (int i = 0; i < widthArray.length; i++) {
      calculateRectArea(widthArray[i], heigthArray[i]);
    }
    calculateRectArea(Integer.parseInt(args[0]), Integer.parseInt(args[1]));*/

      //The code below makes a menu which extends the functionality of the program
      //Just comment the section below and uncomment the section above to change into the previous version

    int i=0;
    while (i !=7){
        i = menu(args);
    }
  }

  public static void calculateRectArea(int width2, int height2) {
    System.out.println("width: " + width2 + "cm");
    System.out.println("height: " + height2 + "cm");
    System.out.println("area of the rectangle: " + (width2 * height2) + "cm^2\r\n");
  }

  public static void calculateSquareArea(int side) {
    System.out.println("side: " + side + "cm");
    System.out.println("area of the square: " + (side * side) + "cm^2\r\n");
  }

  public static void calculateSquarePerimeter(int side) {
    System.out.println("perimeter of the square: " + (side * 4) + "cm^2\r\n");
  }

  private static int getRandomNumberInRange(int min, int max) {

    if (min >= max) {
      throw new IllegalArgumentException("max must be greater than min");
    }

    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
  }

  public static int menu(String[] args) {
    System.out.println("Menu:");
    System.out.println("Calculate the area of a rectangle: (1)");
    System.out.println("Calculate the area of a square: (2)");
    System.out.println("Calculate the perimeter of a square: (3)");
    System.out.println("Calculate the area of a rectangle from program arguments: (4)");
    System.out.println("Calculate the area of 5 rectangles from arrays with random values: (5)");
    System.out.println("Calculate the area of 5 rectangle from random values with function calls: (6)");
    System.out.println("Quit the application: (7)");
    System.out.print("your choice: ");
    Scanner myObj = new Scanner(System.in);
    int choice = myObj.nextInt();
    char choiceChar;
    System.out.println(" ");
    switch (choice) {
      case 1:
        System.out.println("Would you like to input your own values? (y/n)");
        choiceChar = myObj.next().charAt(0);
        if (choiceChar=='y') {
          System.out.println("Input width: ");
          int width = myObj.nextInt();
          System.out.println("Input height: ");
          int height = myObj.nextInt();
          calculateRectArea(width, height);
        } else {
          calculateRectArea(getRandomNumberInRange(1, 100), (getRandomNumberInRange(1, 100)));
        }
        return 6;
      case 2:
        System.out.println("Would you like to input your own values? (y/n)");
          choiceChar = myObj.next().charAt(0);
          if (choiceChar=='y') {
          System.out.println("Input side length: ");
          int side = myObj.nextInt();
          calculateSquareArea(side);
        } else {
          calculateSquareArea(getRandomNumberInRange(1, 100));
        }
        return 6;
      case 3:
        System.out.println("Would you like to input your own values? (y/n)");
          choiceChar = myObj.next().charAt(0);
          if (choiceChar=='y') {
          System.out.println("Input side length: ");
          int side2 = myObj.nextInt();
          calculateSquarePerimeter(side2);
        } else {
          calculateSquarePerimeter(getRandomNumberInRange(1, 100));
        }
        return 6;
      case 4:
        calculateRectArea(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        return 6;
      case 5:
        int[] widthArray = {
          getRandomNumberInRange(1, 100),
          getRandomNumberInRange(1, 100),
          getRandomNumberInRange(1, 100),
          getRandomNumberInRange(1, 100),
          getRandomNumberInRange(1, 100)
        };
        int[] heigthArray = {
          getRandomNumberInRange(1, 100),
          getRandomNumberInRange(1, 100),
          getRandomNumberInRange(1, 100),
          getRandomNumberInRange(1, 100),
          getRandomNumberInRange(1, 100)
        };
        for (int i = 0; i < widthArray.length; i++) {
          calculateRectArea(widthArray[i], heigthArray[i]);
        }
        return 6;
      case 6:
        for (int i = 0; i < 5; i++) {
          calculateRectArea(getRandomNumberInRange(1, 100), getRandomNumberInRange(1, 100));
        }
        return 6;
      case 7:
        return 7;
      default:
        System.out.println("Wrong Input! starting over");
        return 6;
    }
  }
}
