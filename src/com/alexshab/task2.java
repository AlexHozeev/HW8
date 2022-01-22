package com.alexshab;

public class task2 {
    private static final int Value_FROM = 1;
    private static final int Value_TO = 999999;

    public static void main(String[] args) {

        int result = NumberLuckyTickets(Value_FROM, Value_TO);
        System.out.println(result);
    }

    private static int NumberLuckyTickets(int a, int b) {
        int counter = 0;
        StringBuilder Ticket = new StringBuilder("000000");
        StringBuilder Tmp = new StringBuilder();

        for (int i = a; i <= b; i++) {
            Tmp.append(i);
            int Position = Ticket.toString().length() - Tmp.toString().length();
            Ticket.replace(Position, Ticket.length(), Tmp.toString());
            boolean isLucky = TicketLucky(Ticket.toString());
            if (isLucky) {
                counter++;
            }
            Tmp.delete(0, Tmp.length());
        }
        return counter;
    }

    private static boolean TicketLucky(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() / 2) {
                sum += Integer.parseInt(s.substring(i, i + 1));
            } else {
                sum -= Integer.parseInt(s.substring(i, i + 1));
            }
        }
        if (sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}
