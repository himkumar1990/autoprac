package dev.autoprac.utils;

import java.util.HashMap;
import java.util.Map;

public class Row {

	Map<String, String> map = new HashMap<>();

	public void addValue(String columnName, String value) {
		map.put(columnName, value);
	}

	public String getColumnValue(String column) {
		String value = map.get(column);
		if (value == null)
			value = "";
		return value;
	}

	@Override
	public String toString() {
		return map.toString();
	}
}
