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
public class Android extends Test implements PembobotanNilai{
    final double pTulis = 0.2, pCoding=0.5, pWawancara=0.3;

    public Android(String NIK, String nama, int tesTulis, int tesCoding, int tesWawancara) {
        super(tesTulis, tesCoding, tesWawancara, NIK, nama);
    }    
    
    @Override
    public void getKelulusan() {
        double nilaiAkhir = (getTesTulis()*pTulis) + (getTesCoding()*pCoding) + (getTesWawancara()*pWawancara);
        if(nilaiAkhir >= nilaiLulus){
            System.out.println("Selamat kepada " + NIK + " telah diterima sebagai Android");
        }else{
            System.out.println("Mohon maaf kepada " + NIK + " telah ditolak sebagai Android");
        } 
    }
    
    
}
