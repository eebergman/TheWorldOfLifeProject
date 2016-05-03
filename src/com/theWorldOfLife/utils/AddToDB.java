package com.theWorldOfLife.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class AddToDB {

	static final String JBDC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/?user=root"; 
	static final String USER = "root";
	static final String PASSWORD = "sesame";
	static Scanner sc = new Scanner(System.in);

	private static Connection conn = null;
	private static Statement stmt = null;
	private static PreparedStatement prepStmt = null;
	private static ResultSet resSet = null;
	static boolean passOrFail = false;

	public static void connectAelDatabase() {

		try {
			Class.forName(JBDC_DRIVER);

			System.out.println("Connecting to a selected DB...");
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			System.out.println("Connected to DB successfully.");

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
	}

	public static void readDatabase() {

		try {
			ArrayList<DatabaseEntry> entryList = new ArrayList<>();

			connectAelDatabase();
			stmt = conn.createStatement();
			resSet = stmt.executeQuery("SELECT * FROM `the_life_project`.`the_life_project_table`");

			while (resSet.next()) {
				DatabaseEntry inDb = new DatabaseEntry();

				inDb.setSpeciesName(resSet.getString("`species_name`"));
				inDb.setAniGen(resSet.getString("`genus`"));
				inDb.setAniFam(resSet.getString("`family`"));
				inDb.setAniOrd(resSet.getString("`order_`"));
				inDb.setSpeciesName(resSet.getString("`class`"));
				inDb.setAniPhy(resSet.getString("`phylum`"));
				inDb.setAniKin(resSet.getString("`kingdom`"));
				inDb.setAniCom(resSet.getString("`common_name`"));
				inDb.setAveWei(resSet.getString("`averge_weight`"));
				inDb.setAveLif(resSet.getString("`average_lifespan`"));
				inDb.setAniDom(resSet.getString("`domesticated`"));
				inDb.setAniHab(resSet.getString("`habitats`"));
				inDb.setAniFamEx(resSet.getString("`famous_examples`"));

				entryList.add(inDb);
			}

			for (DatabaseEntry databaseEntry : entryList) {
				System.out.println(databaseEntry.getAniCom());
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void addToTheDB(DatabaseEntry newDatabaseEntry) {

		try {
			connectAelDatabase();
			prepStmt = conn.prepareStatement(sql);

			prepStmt.setString(1, newDatabaseEntry.getSpeciesName());
			prepStmt.setString(2, newDatabaseEntry.getAniGen());
			prepStmt.setString(3, newDatabaseEntry.getAniFam());
			prepStmt.setString(4, newDatabaseEntry.getAniOrd());
			prepStmt.setString(5, newDatabaseEntry.getAniClas());
			prepStmt.setString(6, newDatabaseEntry.getAniPhy());
			prepStmt.setString(7, newDatabaseEntry.getAniKin());
			prepStmt.setString(8, newDatabaseEntry.getAniCom());
			prepStmt.setString(9, newDatabaseEntry.getAveWei());
			prepStmt.setString(10, newDatabaseEntry.getAveLif());
			prepStmt.setString(11, newDatabaseEntry.getAniDom());
			prepStmt.setString(12, newDatabaseEntry.getAniHab());
			prepStmt.setString(13, newDatabaseEntry.getAniFamEx());

			prepStmt.executeUpdate();
			passOrFail = true;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			passOrFail = false;
		}
	}

//		User needs to be able to select animal common name from dropbox.
	
	public static DatabaseEntry searchForResults(String searchParam){
		
		try {
			connectAelDatabase();
			stmt = conn.createStatement();
			resSet = stmt.executeQuery("SELECT * FROM `the_life_project`.`the_life_project_table`)");
		
			while (resSet.next()) {
				String userSearchParam = resSet.getString("`common_name`");
				
				if (searchParam.equalsIgnoreCase(userSearchParam)) {
					
					DatabaseEntry databEntry = new DatabaseEntry();
					
					databEntry.setSpeciesName(resSet.getString("`species_name`"));
					databEntry.setAniGen(resSet.getString("`genus`"));
					databEntry.setAniFam(resSet.getString("`family`"));
					databEntry.setAniOrd(resSet.getString("`order_`"));
					databEntry.setAniClas(resSet.getString("`class`"));
					databEntry.setAniPhy(resSet.getString("`phylum`"));
					databEntry.setAniKin(resSet.getString("`kingdom`"));
					databEntry.setAniCom(resSet.getString("`common_name`"));
					databEntry.setAveWei(resSet.getString("`averge_weight`"));
					databEntry.setAveLif(resSet.getString("`average_lifespan`"));
					databEntry.setAniDom(resSet.getString("`domesticated`"));
					databEntry.setAniHab(resSet.getString("`habitats`"));
					databEntry.setAniFamEx(resSet.getString("`famous_examples`"));
					
					return databEntry;
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		return null;
	}

	private static String sql = "INSERT INTO `the_life_project`.`the_life_project_table`"
			+ "(`species_name`, `genus`, `family`, `order_`, `class`, `phylum`, "
			+ "`kingdom`, `common_name`, `averge_weight`, `average_lifespan`, "
			+ "`domesticated`, `habitats`, `famous_examples`) " + " VALUES " + "(?,?,?,?,?,?,?,?,?,?,?,?,?)";

}
