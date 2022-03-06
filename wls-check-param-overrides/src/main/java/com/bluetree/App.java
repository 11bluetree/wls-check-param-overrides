package com.bluetree;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        String aoki = "aoki-haru";

        String[] haru =  aoki.split("-");

        aoki = aoki.replaceAll("-", "");

        System.out.println(aoki);
        System.out.println(haru);
    }
}
