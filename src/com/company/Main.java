package com.company;

import javafx.scene.shape.SVGPath;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int a;
        boolean b;
        int tedad=0;


        Scanner scanner=new Scanner(System.in);
        System.out.println("tedade afrad ra vared konid : ");
        tedad=scanner.nextInt();
        for (int i=0;i<tedad;i++) {
            System.out.println("insert your full name : ");
            name = scanner.nextLine();
            StudentsInfo studentsInfo = new StudentsInfo();
            studentsInfo.namee(name);

                    System.out.println("insert your gardes : ");
                    a = scanner.nextInt();
                    studentsInfo.Grades(a);
            System.out.println("pass situ");
            b = scanner.nextBoolean();
            studentsInfo.Pass(b);
        }
        }

}
