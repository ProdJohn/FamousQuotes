package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        String[] quotes = {
                "\"It is during our darkest moments that we must focus to see the light.\" — Aristotle",
                "\"Everybody wanted to know what I would do if I didn't win... I guess we'll never know - Kanye West",
                "\"What we think, we become.” – Buddha",
                "\"Your time is limited, don’t waste it living someone else’s life.” – Steve Jobs",
                "\"If you can dream it, you can do it.\" - Walt Disney",
                "\"Don’t cry because it’s over, smile because it happened.” —Dr. Seuss",
                "\"Do, or do not. There is no try.” —Yoda",
                "\"Don’t count the days, make the days count.\" — Muhammad Ali",
                "\"Your story is what you have, what you will always have. It is something to own.\" — Michelle Obama",
                "\"\"To live is the rarest thing in the world. Most people just exist.\" — Oscar Wilde",

        };
        try{
        System.out.println("Pick a quote #1-10:  ");
        int index = Keyboard.nextInt();
        index--;
        System.out.println(quotes[index]);
    }catch (Exception e) {
            System.out.println("Please choose another number as that is not an option choice. ");
            e.printStackTrace();
        }finally {
            Keyboard.close();
        }

    }
}
