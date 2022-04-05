/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.util.Scanner;        
/**
 *
 * @author WXO
 */
public class Kuis {
    
    static int t, c, w;
    static String NIK, nama;
    static Scanner key = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pil = 1, pilih = 0;
        // TODO code application logic here
        
        System.out.println("+-----------------------------+");
        System.out.println("|  Form Pendaftaran PT.UDIN   |");
        System.out.println("+-----------------------------+");
            
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih\t: ");
        pilih = key.nextInt();
        
        System.out.print("Input NIK: "); NIK = key.nextLine();
        key.next();
        System.out.print("Input nama: "); nama = key.nextLine();
        key.next();
        
        Input();
        switch(pilih){
            case 1 : {Android peserta1 = new Android(NIK, nama, t,c,w);
                    while(pil != 3){
            
                        System.out.println("\nMenu");
                        System.out.println("----");
                        System.out.println("1. Edit");
                        System.out.println("2. tampil");
                        System.out.println("3. Exit");
                        System.out.print("Pilih\t: ");
                        pil = key.nextInt();

                        switch(pil){
                            case 1 : Input();
                                     peserta1.setTesTulis(t);
                                     peserta1.setTesCoding(c);
                                     peserta1.setTesWawancara(w);
                                     break;
                            case 2 : peserta1.getKelulusan(); break;
                            default: System.out.println("Opsi tidak ada, Mohon masukan opsi dengan benar!");
                        }
                    }   
                    }break;
            case 2 : {Web peserta2 = new Web(NIK, nama, t,c,w); 
                    while(pil != 3){
            
                        System.out.println("\nMenu");
                        System.out.println("----");
                        System.out.println("1. Edit");
                        System.out.println("2. tampil");
                        System.out.println("3. Exit");
                        System.out.print("Pilih\t: ");
                        pil = key.nextInt();

                        switch(pil){
                            case 1 : Input();
                                     peserta2.setTesTulis(t);
                                     peserta2.setTesCoding(c);
                                     peserta2.setTesWawancara(w);
                                     break;
                            case 2 : peserta2.getKelulusan(); break;
                            default: System.out.println("Opsi tidak ada, Mohon masukan opsi dengan benar!");
                        }
                    }break;
            }
        }
        
    }
    
    static void Input(){
        System.out.print("Input Nilai Tes Tulis: "); t = key.nextInt();
        System.out.print("Input Nilai Tes Coding: "); c = key.nextInt();
        System.out.print("Input Nilai Tes Wawancara: "); w = key.nextInt();
    }
    
}
    