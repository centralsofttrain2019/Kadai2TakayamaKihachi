package jp.co.central_soft.co.jp.train2019.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao
{
	private static final String CONNECT_STR =
			"jdbc:mysql://"
			+ "localhost"
			+ "/"
			+ "sqat_schema"
			+ "?serverTimezone=JST";

	//-------------------------------------------------
	public static Connection getConnection()
			throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = null;
		con = DriverManager.getConnection(
					CONNECT_STR,
					"root",
					"root"
					);
		return con;
	}

	//-------------------------------------------------
	public static Connection getConnectionByPool()
			throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = null;
		con = DriverManager.getConnection(
					CONNECT_STR,
					"root",
					"root"
					);
		return con;
	}


}
