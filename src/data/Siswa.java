/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author SERVER
 */
public class Siswa {
    String nama;
    String nis;
    String alamat;
    String ttl;
    String gender;
    ArrayList<String> hoby;

    public String getNama() {
        return nama;
    }

    public String getNis() {
        return nis;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public String getGender() {
        return gender;
    }

    public ArrayList<String> getHoby() {
        return hoby;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHoby(ArrayList<String> hoby) {
        this.hoby = hoby;
    }

    public Siswa(String nama, String nis, String alamat, String ttl, String gender, ArrayList<String> hoby) {
        this.nama = nama;
        this.nis = nis;
        this.alamat = alamat;
        this.ttl = ttl;
        this.gender = gender;
        this.hoby = hoby;
    }
}
