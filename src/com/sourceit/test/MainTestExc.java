package com.sourceit.test;

import com.sourceit.exceptions.MySaturdayMorningException;

public class MainTestExc {

    public static void main(String[] args) {
        Saturday mySaturday = new Saturday(false);
        try {
            mySaturday.morning();

            System.out.println("other code");
        } catch (MySaturdayMorningException e) {
            System.out.println("Is not good doesn't mean is bad");
        } catch (Exception e) {
            System.out.println("Other exception:" + e.getMessage());
        } finally {
            System.out.println("Finally works always");
        }
    }
}
