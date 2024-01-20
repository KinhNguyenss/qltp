package DAO;

import connect.connectDb;
import model.taikhoan;
import java.sql.*;

public class taikhoanDAO {

    public static boolean checkLogin(taikhoan account) {

        try {
            String sql = "select * from taikhoan where Username=? and Password= ?";
            Connection con = connectDb.getConnect();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, account.getTaikhoan());
            ps.setString(2, account.getMatkhau());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }
}
