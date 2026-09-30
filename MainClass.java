package com.mycompany.taskregina;

import java.util.ArrayList;


public class MainClass {
    public static void main(String[] args) {
        ArrayList<ClassMahasiswa> daftarMahasiswa = new ArrayList<>();
        //add
        ClassMahasiswa mahasiswa1 = new ClassMahasiswa(
        "001",
        "Axel",
        "Informatika"
        );
        
        ClassMahasiswa mahasiswa2 = new ClassMahasiswa(
        "002",
        "Cia",
        "Informatika"
        );
        daftarMahasiswa.add(mahasiswa1);
        daftarMahasiswa.add(mahasiswa2);
        
        //update
        mahasiswa2.setNama("Cantika");
        mahasiswa2.setJurusan("Farmasi");
        
        //delete
        daftarMahasiswa.remove(mahasiswa1);
        //read
        for (ClassMahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("NIM : " + mahasiswa.getNim());
            System.out.println("NAMA : " + mahasiswa.getNama());
            System.out.println("JURUSAN : " + mahasiswa.getJurusan());
            
        }
        
       
        
    }
    
}
