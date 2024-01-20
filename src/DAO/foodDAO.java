package DAO;

import java.sql.*;
import model.food;
import connect.connectDb;
import java.util.ArrayList;

public class foodDAO {

    public static boolean them(food f) {
        Connection con = connectDb.getConnect();
        String sql = "insert into thucpham (mathucpham, tenthucpham, soluong, giatien, donvitinh, mota) "
                + "values(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, f.getMaTP());
            pst.setString(2, f.getTenTP());
            pst.setString(3, f.getSl());
            pst.setString(4, f.getGiatien());
            pst.setString(5, f.getDonViTinh());
            pst.setString(6, f.getMoTa());
            pst.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean sua(food f) {
        Connection con = connectDb.getConnect();
        String sql = "update thucpham set tenthucpham= ? , soluong= ? , giatien=? , donvitinh= ? , mota=? where mathucpham = ? ";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(6, f.getMaTP());
            pst.setString(1, f.getTenTP());
            pst.setString(2, f.getSl());
            pst.setString(3, f.getGiatien());
            pst.setString(4, f.getDonViTinh());
            pst.setString(5, f.getMoTa());
            pst.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean xoa(food f) {
        Connection con = connectDb.getConnect();
        String sql = "delete from thucpham where mathucpham = ? ";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, f.getMaTP());
            pst.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    public static ArrayList<food> dsach() {
        ArrayList<food> ds = new ArrayList<>();
        String sql = "select * from thucpham ";
        try {
            Connection con = connectDb.getConnect();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String matp = rs.getString("mathucpham");
                String tentp = rs.getString("tenthucpham");
                String sl = rs.getString("soluong");
                String gt = rs.getString("giatien");
                String dvt = rs.getString("donvitinh");
                String mt = rs.getString("mota");
                food f = new food(matp, tentp, sl, gt, dvt, mt);
                ds.add(f);
            }
            connectDb.closeConnect(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    public static ArrayList<food> timkiem(String condition) {
        ArrayList<food> ds = new ArrayList<>();
        String sql = "select * from thucpham where mathucpham = '"+ condition +"'";
        try {
            Connection con = connectDb.getConnect();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String matp = rs.getString("mathucpham");
                String tentp = rs.getString("tenthucpham");
                String sl = rs.getString("soluong");
                String gt = rs.getString("giatien");
                String dvt = rs.getString("donvitinh");
                String mt = rs.getString("mota");
                food f = new food(matp, tentp, sl, gt, dvt, mt);
                ds.add(f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }
}
