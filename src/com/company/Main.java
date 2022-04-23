package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // Задача1
      int[] arr={150_200, 115_100, 105_600, 103_400, 180_300, 165_900, 154_400, 175_900, 134_300, 107_500, 109_300, 118_200,
      190_700, 123_600, 179_500, 144_700, 185_400, 146_800, 153_600, 163_700, 137_700, 145_500, 153_800, 172_100, 163_500, 188_100, 110_300,
      113_600, 114_800, 151_900};
      int sum = 0;
      for(int i=0; i< arr.length; i++) {
          sum += arr[i];
      }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

      //Задача2
      int index = 0;
      for (int i=1; i < arr.length; i++) {
          if (arr[i] < arr[index])
              index=i;
      }
        System.out.println("Минимальная сумма трат за день составила " + arr[index] + " рублей.");
      index = 0;
      for (int i=1; i < arr.length; i++) {
          if (arr[i] > arr[index])
              index=i;
      }
        System.out.println("Максимальная сумма трат за день составила " + arr[index] + " рублей.");


      //Задача3
      double mean = sum / arr.length;
      System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей.");


      //Задача4
      char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
      for (int i=reverseFullName.length-1; i >= 0; i=i-1) {
          System.out.print(reverseFullName[i]);
      }


    }

}
