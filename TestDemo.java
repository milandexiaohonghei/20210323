import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class TestDemo {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //
        //Class.forName("com.mysql.jdbc.Driver");

        //
        String url = "jdbc:mysql://127.0.0.1:3306/test0311?useSSL=false";
        String username = "root";
        String password = "111111";

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);

        Connection connection = dataSource.getConnection();

        //Connection connection = DriverManager.getConnection(url,username,password);

        //
        String uname = "bit3";
        String upsass = "123";
        //String sql = "select * from user where name = '"+uname+"' and password = '"+upsass+"'";
        String sql = "delete from user where id_number = ?";
        PreparedStatement prepareStatement = connection.prepareStatement(sql);
        prepareStatement.setInt(1,1);


        //Statement statement = connection.createStatement();
        int ret = prepareStatement.executeUpdate();
        if(ret != 0){
            System.out.println("删除成功");
        }
        prepareStatement.close();
        connection.close();


    }

    public static void main6(String[] args) throws ClassNotFoundException, SQLException {
        //
        //Class.forName("com.mysql.jdbc.Driver");

        //
        String url = "jdbc:mysql://127.0.0.1:3306/test0311?useSSL=false";
        String username = "root";
        String password = "111111";

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);

        Connection connection = dataSource.getConnection();

        //Connection connection = DriverManager.getConnection(url,username,password);

        //
        String uname = "bit3";
        String upsass = "123";
        //String sql = "select * from user where name = '"+uname+"' and password = '"+upsass+"'";
        String sql = "update user set name = ? where password = ?";
        PreparedStatement prepareStatement = connection.prepareStatement(sql);
        prepareStatement.setString(1,uname);
        prepareStatement.setString(2,upsass);

        //Statement statement = connection.createStatement();
        int ret = prepareStatement.executeUpdate();
        if(ret != 0){
            System.out.println("更新成功");
        }
        prepareStatement.close();
        connection.close();


    }

    public static void main5(String[] args) throws ClassNotFoundException, SQLException {
        //
        //Class.forName("com.mysql.jdbc.Driver");

        //
        String url = "jdbc:mysql://127.0.0.1:3306/test0311?useSSL=false";
        String username = "root";
        String password = "111111";

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);

        Connection connection = dataSource.getConnection();

        //Connection connection = DriverManager.getConnection(url,username,password);

        //
        String uname = "bit";
        String upsass = "123";
        //String sql = "select * from user where name = '"+uname+"' and password = '"+upsass+"'";
        String sql = "insert into user(id_number,name,password)values(?,?,?)";
        PreparedStatement prepareStatement = connection.prepareStatement(sql);
        prepareStatement.setInt(1,2);
        prepareStatement.setString(2,uname);
        prepareStatement.setString(3,upsass);

        //Statement statement = connection.createStatement();
        int ret = prepareStatement.executeUpdate();
        if(ret != 0){
            System.out.println("插入成功");
        }
        prepareStatement.close();
        connection.close();


    }
    public static void main3(String[] args) throws ClassNotFoundException, SQLException {
        //
        //Class.forName("com.mysql.jdbc.Driver");

        //
        String url = "jdbc:mysql://127.0.0.1:3306/test0311?useSSL=false";
        String username = "root";
        String password = "111111";

        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);

        Connection connection = dataSource.getConnection();

        //Connection connection = DriverManager.getConnection(url,username,password);

        //
        String uname = "bit";
        String upsass = "123";
        //String sql = "select * from user where name = '"+uname+"' and password = '"+upsass+"'";
        String sql = "select * from user where name = ? and password = ?";
        PreparedStatement prepareStatement = connection.prepareStatement(sql);
        prepareStatement.setString(1,uname);
        prepareStatement.setString(2,upsass);

        //Statement statement = connection.createStatement();
        ResultSet resultSet = prepareStatement.executeQuery();

        User user = new User();
        if(resultSet.next()){
            //System.out.println(resultSet.getInt(1));
            //System.out.println(resultSet.getString(2));
            //System.out.println(resultSet.getString(3));
            user.setId_number(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));
            System.out.println(user);
        }
    }
    public static void main2(String[] args) throws ClassNotFoundException, SQLException {
        //
        Class.forName("com.mysql.jdbc.Driver");

        //
        String url = "jdbc:mysql://127.0.0.1:3306/test0311?useSSL=false";
        String username = "root";
        String password = "111111";
        Connection connection = DriverManager.getConnection(url,username,password);

        //
        String uname = "bit";
        String upsass = "123";
        String sql = "select * from user where name = '"+uname+"' and password = '"+upsass+"'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        User user = new User();
        if(resultSet.next()){
            //System.out.println(resultSet.getInt(1));
            //System.out.println(resultSet.getString(2));
            //System.out.println(resultSet.getString(3));
            user.setId_number(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));
            System.out.println(user);
        }
    }

    public static void main1(String[] args) throws ClassNotFoundException, SQLException {
        //
        Class.forName("com.mysql.jdbc.Driver");

        //
        String url = "jdbc:mysql://127.0.0.1:3306/test0311?useSSL=false";
        String username = "root";
        String password = "111111";
        Connection connection = DriverManager.getConnection(url,username,password);

        //
        String sql = "select * from user";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        User user = new User();
        if(resultSet.next()){
            //System.out.println(resultSet.getInt(1));
            //System.out.println(resultSet.getString(2));
            //System.out.println(resultSet.getString(3));
            user.setId_number(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));
            System.out.println(user);
        }
    }
}
