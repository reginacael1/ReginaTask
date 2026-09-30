package com.mycompany.taskregina;

public class ClassMahasiswa {
    public String nim;
    public String nama;
    public String jurusan;
    
    public ClassMahasiswa (String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getJurusan() {
        return jurusan;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    
    
}
