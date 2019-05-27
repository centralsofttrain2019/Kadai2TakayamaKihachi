package jp.co.central_soft.co.jp.train2019.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jp.co.central_soft.co.jp.train2019.bean.EmployeeDispBean;
import jp.co.central_soft.co.jp.train2019.bean.EmployeeListDispBean;
import jp.co.central_soft.co.jp.train2019.dao.Dao;
import jp.co.central_soft.co.jp.train2019.dao.EmployeesDao;

public class EmployeeService
{

	public EmployeeListDispBean findAll()
	{
		EmployeeListDispBean bean = new EmployeeListDispBean();

		//オートクローズ
		try( Connection con= Dao.getConnection() )
		{
			EmployeesDao dao = new EmployeesDao(con);

			List<EmployeeDispBean> eList = dao.findAll();

			bean.setEmpList(eList);

//			System.out.println("従業員の情報は以下です。\n"
//								+ eList.toString()
//								);
		}
		catch( SQLException | ClassNotFoundException e )
		{
			e.printStackTrace();
			throw new RuntimeException( e );
		}

		return bean;
	}

	public EmployeeDispBean findByKey(String strId)
	{

		EmployeeDispBean emp = null;
		try( Connection con = Dao.getConnection() )
		{

			int id= Integer.parseInt( strId );

			EmployeesDao dao = new EmployeesDao(con);

			emp =  dao.findByKey(id);


		}
		catch( SQLException | ClassNotFoundException e1 )
		{
			e1.printStackTrace();
			throw new RuntimeException( e1 );
		}

		return emp;
	}


}
