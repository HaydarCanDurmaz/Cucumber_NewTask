package _JDBC.Gun01;

import _JDBC._JDBC_Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPrevAbsRel extends _JDBC_Parent {
    @Test
            public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        rs.next();// ilk satır
        System.out.println("1.satır DilAdi=" + rs.getString(2));// konum adı 2 colum sırası Englisch

        rs.next();// 2 satır
        System.out.println("2.satır DilAdi=" + rs.getString(2));// italian

        rs.next();// 3 satır
        System.out.println("3.satır DilAdi=" + rs.getString(2));// Japanese

        rs.previous(); // 2 satıra geri gitti
        System.out.println("2.satır DilAdi=" + rs.getString(2));// italien
    }
}
