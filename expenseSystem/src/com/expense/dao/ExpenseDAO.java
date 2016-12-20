package com.expense.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.expense.beans.Reimbursment;
import com.expense.beans.UserRoles;
import com.expense.beans.Users;

public class ExpenseDAO {
	
	public static void main(String[] args) throws SQLException {
		
		ExpenseDAO userRoles = new ExpenseDAO();
		System.out.println(userRoles.getReceipts());
	}
	
	//Establish Connection
	private static Connection conn;
	private static final String URL = "jdbc:postgresql://localhost:5432/expense";
	private static final String USER = "postgres";
	private static final String PASS = "maindawg";
	
	static{
		try {
				Class.forName("org.postgresql.Driver");
				conn = DriverManager.getConnection(URL, USER, PASS);
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	
	// Get all database roles
	public List<UserRoles> getRoles() throws SQLException{
		List<UserRoles> userRoles = new ArrayList<>();
		try{
			String sql = "select * from ers_user_roles";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while( rs.next() ){
				UserRoles obj = new UserRoles();
				obj.setUserRoleId( rs.getInt("ERS_USER_ROLE_ID") );
				obj.setUserRole(rs.getString("USER_ROLE") );
				userRoles.add(obj);
			}
			
			}catch(SQLException e){
				e.printStackTrace();
			}
			return userRoles;
		}
	
	// Gets all receipts for a submitter from the table and displays them
	public List<Reimbursment> getReceipts() throws SQLException{
		List<Reimbursment> rem = new ArrayList<>();	
		try{
			String sql = "select reimb_id, reimb_amount, reimb_submitted, reimb_description, user_first_name, user_last_name, reimb_status, reimb_type from ers_reimbursement a inner join ers_users b on a.reimb_author = b.ers_users_id";//where REIMB_AUTHOR = " + rec.getSubmissionId();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while( rs.next() ){
				
				int reimb_id = rs.getInt("REIMB_ID");
				double reimb_amount = rs.getDouble("REIMB_AMOUNT");
				String date = rs.getString("REIMB_SUBMITTED");
				String description = rs.getString("REIMB_DESCRIPTION");
				String Fname = rs.getString("user_first_name");
				String Lname = rs.getString("user_last_name");
				String status = rs.getString("REIMB_STATUS");
				String type = rs.getString("REIMB_TYPE");
				
				Reimbursment obj = new Reimbursment();
				obj.setSubmissionId( reimb_id );
				obj.setAmount( reimb_amount );
				obj.setSubmittedTime( date );
				obj.setDescription( description );
				obj.setUser(Lname + ", " + Fname);
				obj.setStatus(status);
				obj.setType(type);
				rem.add(obj); 
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			return rem;
	}
	
	// Insert a new receipt for approval
	public void addReceipt(Reimbursment rec) throws Exception {
		try{
			String sql = "insert into ers_reimbursement (REIMB_ID, REIMB_AMOUNT, REIMB_DESCRIPTION, REIMB_AUTHOR, REIMB_STATUS, REIMB_TYPE) values(?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rec.getSubmissionId());
			pstmt.setDouble(2, rec.getAmount());
			pstmt.setString(3, rec.getDescription());
			pstmt.setInt(4, rec.getSubmitterId());
			pstmt.setString(5, "Pending");
			pstmt.setString(6, rec.getType());
			pstmt.executeUpdate();
			
			ResultSet rs = pstmt.getGeneratedKeys();
			while(rs.next()){
				System.out.println("Generated key is: " + rs.getInt(1));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	// Gets all receipts from the table depending on status
	public List<Reimbursment> getStatus() throws SQLException{
		List<Reimbursment> rem = new ArrayList<>();
		Reimbursment rec = new Reimbursment();
		try{
			String sql = "select * from ers_reimbursement where reimb_status = 'Pending'" + rec.getStatus();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while( rs.next() ){
				Reimbursment obj = new Reimbursment();
				obj.setSubmissionId( rs.getInt("REIMB_ID") );
				obj.setAmount(rs.getDouble("REIMB_AMOUNT") );
				obj.setSubmittedTime( rs.getString("REIMB_SUBMITTED") );
				obj.setResolvedTime(rs.getString("REIMB_RESOLVED" ) );
				obj.setDescription( rs.getString("REIMB_DESCRIPTION") );
				obj.setSubmitterId(rs.getInt("REIMB_AUTHOR") );
				obj.setResolverId( rs.getInt("REIMB_RESOLVER") );
				obj.setStatus(rs.getString("REIMB_STATUS") );
				obj.setType(rs.getString("REIMB_TYPE") );
				rem.add(obj);
				System.out.println("Added");
			}
			
			}catch(SQLException e){
				e.printStackTrace();
			}
			return rem;
	}
	
	// Update the status of 'approval' or 'decline' based on the submission of the finacial advisor
	public List<Reimbursment> updateStatus(String status, Users resolver) throws SQLException{
		Reimbursment rec = new Reimbursment();
		List<Reimbursment> rem = new ArrayList<>();
		
		try{
			String sql  = " UPDATE ers_reimbursement SET " + rec.getStatus() + ", SET " + rec.getResolverId() + " WHERE reimb_id = " + rec.getSubmissionId();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}
		
		try{
			String sql = "select reimb_id, reimb_amount, reimb_submitted, reimb_description, user_first_name, user_last_name, reimb_status, reimb_type from ers_reimbursement a inner join ers_users b on a.reimb_author = b.ers_users_id";//where REIMB_AUTHOR = " + rec.getSubmissionId();
			Statement stmt = conn.createStatement();
			ResultSet rs1 = stmt.executeQuery(sql);
			while( rs1.next() ){
				
				int reimb_id = rs1.getInt("REIMB_ID");
				double reimb_amount = rs1.getDouble("REIMB_AMOUNT");
				String date = rs1.getString("REIMB_SUBMITTED");
				String description = rs1.getString("REIMB_DESCRIPTION");
				String Fname = rs1.getString("user_first_name");
				String Lname = rs1.getString("user_last_name");
				String status2 = rs1.getString("REIMB_STATUS");
				String type = rs1.getString("REIMB_TYPE");
				
				Reimbursment obj = new Reimbursment();
				obj.setSubmissionId( reimb_id );
				obj.setAmount( reimb_amount );
				obj.setSubmittedTime( date );
				obj.setDescription( description );
				obj.setUser(Lname + ", " + Fname);
				obj.setStatus(status2);
				obj.setType(type);
				rem.add(obj); 
				}
			}catch(SQLException e){
				e.printStackTrace();
			}return rem;
	}
	
	public Users userValidation(String user, String pass) throws SQLException{
		Users test = new Users();
		try{
			String sql = "select ers_username, ers_password from ers_users where ers_username = ? and ers_password = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user);
			pstmt.setString(2, pass);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next() )
			{
				test.setUsername(rs.getString(1));
				test.setPassword(rs.getString(2));
				System.out.println("Working");
			}
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Not Valid Username");
		}
		return test;
	}
}
