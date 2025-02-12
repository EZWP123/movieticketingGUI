
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dbConnect 
{
    private Connection connect;

    
    
    
    //=========================================
    // CONSTRUCTOR TO CONNECT TO OUR DATABASE
    //=========================================
    public dbConnect()
    {
        try
        {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/theater_db", "root", "");
        }catch(SQLException ex)
        {
            System.out.println("Can't connect to database: "+ex.getMessage());
        }
    }


    
    
    
    //=========================================
    //          FUNCTION TO SAVE DATA
    //=========================================

    public int insertData(String sql)
    {
        int result;
        try
        {
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.executeUpdate();
            System.out.println("Inserted Successfully!");
            pst.close();
            result =1;
        }catch(SQLException ex)
        {
            System.out.println("Connection Error: "+ex);
            result =0;
        }
        return result;
    }       
}
