package dev.autoprac.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ExecuteQuery {

	public static void executeStatement(String query, Connection conn) throws Exception {

		try (Statement st = conn.createStatement()) {
			List<Row> rows = new ArrayList<>();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				Row row = new Row();
				for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
					row.addValue(rs.getMetaData().getColumnName(i), rs.getString(i));
				}
				rows.add(row);
			}

			for (Row r : rows) {
				System.out.println(r);
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
}
