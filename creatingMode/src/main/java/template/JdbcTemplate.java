package template;

import org.springframework.boot.jdbc.DatabaseDriver;

import javax.annotation.security.DenyAll;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource){
        this.dataSource=dataSource;
    }

    public void exectureQurey(String sql,Object[] values) throws SQLException {

        //连接数据库
        Connection connection = dataSource.getConnection();
        //创建数据集
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);




    }
}
