package com.codegym;

public class Main {

    public static void main(String[] args) {
      Squares squares = new Squares();

      squares = new Squares(1.3);
        System.out.println(squares);

        squares= new Squares("yellow",true,1.1);
        System.out.println(squares);
//

    }
}
