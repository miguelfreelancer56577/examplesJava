package practice;

import java.io.Serializable;

public enum Operations {

	insert("insert into table"),
	ipdate("update into table");
	
	private String sql;
	
	Operations(String sql){
		this.sql = sql;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}
	
}
