package LogIn;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args)throws Exception{
        LoginForm LF = new LoginForm();
//        LF.display();
        LF.init();
    }
}

class LoginForm{
    private UserDAO dao;
    private String username;
    private String password;
    private boolean isLogin;
    public void init() throws Exception {
        System.out.println("welcome to login page!");
        System.out.println("please enter username(请输入用户名):");

        //存储用户名
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            username = scanner.next();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("please enter password(请输入密码):");

        //储存密码
        try {
            scanner = new Scanner(System.in);
            password = scanner.next();
        }
        finally {
            if(scanner!=null)
                scanner.close();
        }

        validate();
        display();
    }
    public void display()throws Exception{
        if(isLogin){
            System.out.println("页面");
        }else{
            //do nothing
        }
    }
    public void validate() throws Exception{
        UserDAO dao = new UserDAO();
        if(dao.findUser(username,password)){
            isLogin = true;
            System.out.println("登录成功,正在跳转至页面...");
        }else{
            isLogin =false;
            System.out.println("登录失败,再试一次");
        }
    }
}
class UserDAO{
    /*
    DAO 模式
    DAO (Data Access objects 数据存取对象)是指位于业务逻辑和持久化数据之间实现对持久化数据的访问。通俗来讲，就是将数据库操作都封装起来。
     */
    private DBUtil db;//没必要,一般DBtil的方法为静态方法
    public boolean findUser(String username, String password)throws Exception{
        Connection conn = null;
        Statement stmt = null;

        /* 处理SQL,执行SQL */
        try {
            conn = DBUtil.getConnection(); // 得到数据库连接

            // 执行查询
            System.out.println("实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;

            //演示需要,存在安全问题
            sql = "SELECT * FROM user where username='"+username+"'and password='"+password+"'";
            ResultSet rs = stmt.executeQuery(sql);
//            System.out.println( rs.getString("username"));
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace(); // 处理SQLException异常
        } finally {
            try {
                DBUtil.closeAll(conn, stmt, null);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
       return  false;
    }

}
class DBUtil{
    // MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
//    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//    static final String DB_URL = "jdbc:mysql://localhost:3306/test";

    // MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://47.100.229.141:3306/test?useSSL=false&serverTimezone=UTC";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "star";
    static final String PASS = "relai246";
    static{
        try{
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException{
            // 打开链接
            System.out.println("连接数据库...");
            return DriverManager.getConnection(DB_URL,USER,PASS);

    }
    public static void closeAll(Connection conn,Statement stmt,ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (stmt != null) {
            stmt.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}
