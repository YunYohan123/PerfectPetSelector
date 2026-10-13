//Yohan Yun
//10/7/2026
//This program finds the best pet for you based on your favorite color, season, and your name.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("In lower case and each in a different line, enter favorite color, favorite season, and name:");

    // String input
    String color = myObj.nextLine().toLowerCase();
    String season = myObj.nextLine().toLowerCase();
    String name = myObj.nextLine().toLowerCase();
    
  myObj.close();

    // Output input by user
    System.out.println("Favorite Color: " + color);
    System.out.println("Favorite Season: " + season);
    System.out.println("Name: " + name);
    
    
  

    if (color.equals("blue") && season.equals("fall")){
      System.out.println("Your perfect pet is an alligator!");
    }
    else if (color.equals("blue") && season.equals("spring")){
      System.out.println("Your perfect pet is an ostrich!");
    }
    else if (color.equals("green") && (!("aeiouAEIOU".indexOf(name.substring(0,1))>0)) && season.equals("winter")){
      System.out.println("Your perfect pet is an giraffe!");
    }
    //unless you already got giraffe
    else if (color.equals("green") && (!(season.equals("fall")))){
      System.out.println("Your perfect pet is a dog!");
    }
    else if (color.equals("red") && !("aeiouAEIOU".indexOf(name.substring(0,1))>0)){
      System.out.println("Your perfect pet is a panda!");
    }
    else if (color.equals("red") && ("aeiouAEIOU".indexOf(name.substring(0,1))>0)){
      System.out.println("Your perfect pet is a porcupine!");
    }
    //unless already getting dog, panda, or porcupine
    else if (season.equals("summer")){
      System.out.println("Your perfect pet is a pony!");
    }
    //unless already have ostrich
    else if (color.equals("blue") && !("aeiouAEIOU".indexOf(name.substring(0,1))>0) && !season.equals("summer") && !season.equals("fall")){
      System.out.println("Your perfect pet is an axolotl!");
    }
    
    else {
      System.out.println("Your perfect pet is a rock!");
    }

    return;
  } 
}
