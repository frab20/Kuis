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
        System.out.println("Nilai akhir : " + nilaiAkhir);
        if(nilaiAkhir >= nilaiLulus){
            System.out.println("Keterangan : LULUS");
            System.out.println("Selamat kepada " + super.nama + " telah diterima sebagai Android");
        }else{
            System.out.println("Keterangan : GAGAL");
            System.out.println("Mohon maaf kepada " + super.nama + " telah ditolak sebagai Android");
        } 
    }
    
    
}
