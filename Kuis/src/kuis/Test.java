/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author WXO
 */
public class Test extends Peserta{
    private int tesTulis, tesCoding, tesWawancara;

    public Test(int tesTulis, int tesCoding, int tesWawancara, String NIK, String nama) {
        super(NIK, nama);
        this.tesTulis = tesTulis;
        this.tesCoding = tesCoding;
        this.tesWawancara = tesWawancara;
    }
    
    //Setter
    public void setTesTulis(int tesTulis) {
        this.tesTulis = tesTulis;
    }

    public void setTesCoding(int tesCoding) {
        this.tesCoding = tesCoding;
    }

    public void setTesWawancara(int tesWawancara) {
        this.tesWawancara = tesWawancara;
    }

    // Getter
    public int getTesTulis() {
        return tesTulis;
    }

    public int getTesCoding() {
        return tesCoding;
    }

    public int getTesWawancara() {
        return tesWawancara;
    }
}
