package model;

public class food {

    private String maTP;
    private String tenTP;
    private String sl;
    private String giatien;
    private String donViTinh;
    private String moTa;

    public food() {
        super();
    }

    public food(String maTP, String tenTP, String sl, String giatien, String donViTinh, String moTa) {
        this.maTP = maTP;
        this.tenTP = tenTP;
        this.sl = sl;
        this.giatien = giatien;
        this.donViTinh = donViTinh;
        this.moTa = moTa;
    }

    public String getMaTP() {
        return maTP;
    }

    public void setMaTP(String maTP) {
        this.maTP = maTP;
    }

    public String getTenTP() {
        return tenTP;
    }

    public void setTenTP(String tenTP) {
        this.tenTP = tenTP;
    }

    public String getSl() {
        return sl;
    }

    public void setSl(String sl) {
        this.sl = sl;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "food{" + "maTP=" + maTP + ", tenTP=" + tenTP + ", sl=" + sl + ", giatien=" + giatien + ", donViTinh=" + donViTinh + ", moTa=" + moTa + '}';
    }

}
