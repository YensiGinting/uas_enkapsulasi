/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enkapsulasi;

/**
 *
 * @author krist
 */
public class jurusan {
 public static void main (String[]args) {
     mahasiswa wie=new mahasiswa();
     wie.setjurusan ("sistem informasi");
     wie.setmatkul("program beriorentasi objek");
     wie.setnama("yensi ginting");
     wie.setnim("21090097");
     
     
     System.out.println("jurusan"+wie.getjurusan());
     System.out.println("matkul"+wie.getmatkul());
     System.out.println("nama"+wie.getnama());
     System.out.println("nim"+wie.getnim());
     
 }  
  
 
}
