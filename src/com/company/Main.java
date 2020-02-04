package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
       ReadData m = new ReadData();
       m.getClass();
    	try {
            //WriteData.Test();
            ReadData.Test();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Finally Im done");

        }
    }

}
