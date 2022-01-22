package com.alexshab;

public class task1 {
    private static final int HOURS = 24;
    private static final int MINUTES = 60;

    public static void main(String[] args) {

        StringBuilder Hours = new StringBuilder("00");
        StringBuilder Minutes = new StringBuilder("00");
        StringBuilder Temp = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < HOURS; i++) {
            Temp.append(i);
            if (i < 10) {
                Hours.replace(1, 2, Temp.toString());
            } else {
                Hours.replace(0, 2, Temp.toString());
            }
            Temp.delete(0, Temp.length());

            Hours.reverse();
            for (int j = 0; j < MINUTES; j++) {
                Temp.append(j);
                if (j < 10) {
                    Minutes.replace(1, 2, Temp.toString());
                } else {
                    Minutes.replace(0, 2, Temp.toString());
                }
                Temp.delete(0, Temp.length());
                if (Hours.toString().equals(Minutes.toString())) {
                    counter++;
                }
            }
            Hours.reverse();
        }
        System.out.println(counter);
    }
}
