package com.internousdev.personal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.personal.dto.InquiryDTO;
import com.internousdev.personal.util.DBConnector;

public class InquiryCompleteDAO {
	List<InquiryDTO> inquiryDTOList=new ArrayList<InquiryDTO>();
	public List<InquiryDTO> select(){
		DBConnector db=new DBConnector();
		Connection connection=db.getConnection();

		String sql="SELECT * FROM inquiry";
		try{
			PreparedStatement ps=connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				InquiryDTO dto=new InquiryDTO();
				dto.setName(rs.getString("name"));
				dto.setQtype(rs.getString("qtype"));
				dto.setBody(rs.getString("body"));
				inquiryDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return inquiryDTOList;
	}

	public int insert(String name,String qtype,String body){
		int ret=0;
		DBConnector db=new DBConnector();
		Connection connection=db.getConnection();

		String sql="INSERT INTO inquiry VALUES(?,?,?)";
		try{
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2, qtype);
			ps.setString(3, body);
			int i=ps.executeUpdate();
			if(i > 0){
				System.out.println(i + "件登録されました");
				ret=i;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return ret;
	}
}