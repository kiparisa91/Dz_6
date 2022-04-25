package com.company;

public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arrRandom = new int[30];
        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] = random.nextInt(100_000) + 100_000;
            //   System.out.println(arr[i]);
        }
        return arrRandom;
    }

    public static void main(String[] args) {
	// write your code here
       // Задача1
      int[] arr = generateRandomArray();
        for(int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

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
