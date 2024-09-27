package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise32 {

    public static void main(String[] args) {
        printToFile("Hola");
        printToFile("Me gustan los videojuegos");
    }

    public static String generateStringToSave(String string) {
        String result = "Inicio " + string + " Fin";
        result = string;
        return string;
    }

    private static String generateUserInputToSave(){
        StringBuilder sb = new StringBuilder();
        System.out.println("Escribe debajo el texto que quieras. Pulsa \"ENTER\" 2 veces seguidas para finalizar:");
        String string;
        while(!(string = Utils.string()).isEmpty()){
            sb.append(string).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void printToFile(String string) {
        try {

            FileWriter writer = new FileWriter("src/main/resources/data.txt");

            writer.write(string);

            writer.close();

            System.out.println("El string ha sido escrito en el archivo");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }


}
