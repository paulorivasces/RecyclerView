package com.example.recyclerview;

public class ModelClass {
    private int imagenprincipal;
    String titulo1;
    String titulo2;
    String titulo3;

    public ModelClass(int imagenprincipal, String titulo1, String titulo2, String titulo3) {
        this.imagenprincipal = imagenprincipal;
        this.titulo1 = titulo1;
        this.titulo2 = titulo2;
        this.titulo3 = titulo3;
    }

    public int getImagenprincipal() {
        return imagenprincipal;
    }

    public String getTitulo1() {
        return titulo1;
    }

    public String getTitulo2() {
        return titulo2;
    }

    public String getTitulo3() {
        return titulo3;
    }
}
