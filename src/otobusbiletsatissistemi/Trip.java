/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otobusbiletsatissistemi;

public class Trip {

    private String FullName;
    private String nereden;
    private String nereye;
    private String date;
    private String seat;
    private int PNR;
    private String companyName;
    private String fiyat;
    private Boolean isLoggedin;

    public String getName() {
        return FullName;
    }

    public void setName(String funame) {
        this.FullName = funame;
    }

    public String getNereden() {
        return nereden;
    }

    public void setNereden(String nereden) {
        this.nereden = nereden;
    }

    public String getNereye() {
        return nereye;
    }

    public void setNereye(String nereye) {
        this.nereye = nereye;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public int getPNR() {
        return PNR;
    }

    public void setPNR(int pnr) {
        this.PNR = pnr;
    }

    public String getCompany() {
        return companyName;
    }

    public void setCompany(String comName) {
        this.companyName = comName;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public Boolean getisLoggedin() {
        return isLoggedin;
    }

    public void setisLoggedin(Boolean logged) {
        this.isLoggedin = logged;
    }
}
