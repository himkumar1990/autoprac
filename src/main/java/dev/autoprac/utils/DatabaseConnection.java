package dev.autoprac.utils;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseConnection {
	private Connection connection;
	private static DatabaseConnection instance;

	private DatabaseConnection() throws Exception {
		Properties properties = new Properties();
		FileReader reader = new FileReader(new File(this.getClass().getResource("/db.properties").toURI()));
		properties.load(reader);
		try {
			Class.forName(properties.getProperty("db.driver"));
			connection = DriverManager.getConnection(properties.getProperty("db.url"),
					properties.getProperty("db.username"), properties.getProperty("db.password"));

		} catch (ClassNotFoundException e) {
			throw e;
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public static DatabaseConnection getInstance() throws Exception {
		if (instance != null) {
			return instance;
		} else {
			return new DatabaseConnection();
		}
	}

}
