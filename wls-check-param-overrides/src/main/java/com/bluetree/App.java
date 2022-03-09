package com.bluetree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.json.XML;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String kebab = "sec:role-mapper";
        System.out.println(kebab);

        System.out.println(kebabToCamel(kebab));

        sample();
    }

    public static void sample() {
        // String examplexml = "<?xml version=\"1.0\" ?><root><test
        // attribute=\"Name\">Bill Gates</test><test
        // attribute=\"RollNumber\">01</test></root>";

        File file = new File(
                "C:/Users/laxbl/git-repository/wls-check-param-overrides/wls-check-param-overrides/src/main/resource/config.xml");
        try {
            FileReader filereader = new FileReader(file);
            System.out.println(filereader.toString());
            filereader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String aoki = Paths.get("").toAbsolutePath().toString();
        System.out.println("パス: " + aoki);

        String examplexml = "<embedded-ldap><name>base_domain</name><credential-encrypted>{AES256}Mgcl7G17ZBtP9Fp6z2KgbfYhMPAM7a/dX3aKc/Pe+XG3BPcGqbSRbrEgUdUbgZ3a</credential-encrypted></embedded-ldap>";

        try {
            JSONObject json = XML.toJSONObject(examplexml);
            String jsonString = json.toString(4);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }

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
