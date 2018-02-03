package com.sourceit.test;

import com.sourceit.exceptions.MySaturdayMorningException;

public class Saturday {
    final boolean isBadMorning;

    public Saturday(boolean isBadMorning) {
        this.isBadMorning = isBadMorning;
    }

    public void morning() throws MySaturdayMorningException {
        if (isBadMorning)
            throw new MySaturdayMorningException();

        int a = 5/0;

        System.out.println("Good Morning");

    }
}
