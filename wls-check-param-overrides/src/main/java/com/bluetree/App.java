package com.bluetree;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String kebab = "security-roll-allowed";
        System.out.println(kebab);

        System.out.println(kebabToCamel(kebab));
    }

    public static String kebabToCamel(String kebab) {
        String[] kebabToArray = kebab.split("-");

        String camel = kebabToArray[0];

        for (int i = 1; i < kebabToArray.length; i++) {
            kebabToArray[i] = kebabToArray[i].substring(0, 1).toUpperCase() + kebabToArray[i].substring(1);
            camel = camel.concat(kebabToArray[i]);
        }

        return camel;
    }
}
