package org.example;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {



       Punct punct=new Punct(100,100);
       punct.muta();
       System.out.println(punct.toString());

        Dreptunghi dreptunghi= new Dreptunghi(100,100,80,70);
        dreptunghi.muta();
        System.out.println(dreptunghi.toString());

        Cerc cerc= new Cerc(100,100,100);
        cerc.muta();
        System.out.println(cerc.toString());
    }
}
