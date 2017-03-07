
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TANUJA BAMETA
 */
public class loginclass {
     private String login;
     private String password;
     HttpServletRequest request;
     HttpServletResponse response;
    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
     int logdata() throws NamingException, SQLException, ServletException, IOException
    {
        int r=0;
            Context ctx=new InitialContext();
            DataSource ds=(DataSource)ctx.lookup("jdbc/__default");
            Connection con=ds.getConnection();
            PreparedStatement st=con.prepareStatement("select * from register where login=? and password=?");
            st.setString(1,login);
            st.setString(2,password);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                r=1;
            }
            return r;
    }
    
}
