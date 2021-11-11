package com.itfactory.stack;

public class Utils {
    public static String[] convertNumberInStringArray(int number) {

        char[] array = String.valueOf(number).toCharArray();
        String[] strArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            strArray[i] = String.valueOf(array[i]);
        }
        return strArray;
    }

    //Exemplu de transormare
    public static void main(String[] args) {
        String[] arr = Utils.convertNumberInStringArray(1234);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
