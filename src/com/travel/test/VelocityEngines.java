package com.travel.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.junit.Test;

public class VelocityEngines {
	public void initTemplate(Map<String, String> argMap, String vmUrl,
			String fileUrl) {
		Properties localProperties = new Properties();

		// 设置vm文件加载方式 （为从src目录下加载）
		localProperties.setProperty("resource.loader", "class");
		localProperties
				.setProperty("class.resource.loader.class",
						"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		VelocityEngine velocityEngine = new VelocityEngine();
		Template template = velocityEngine.getTemplate(vmUrl);

		VelocityContext velocityContext = new VelocityContext();
		for (String str : argMap.keySet()) {
			velocityContext.put(str, argMap.get(str));
		}

		try {
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
					new FileOutputStream(new File(fileUrl)));
			template.merge(velocityContext, outputStreamWriter);
			outputStreamWriter.flush();
			outputStreamWriter.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void mkdirDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/90travel", "root", "root");
			DatabaseMetaData metaData = connection.getMetaData();

			ResultSet tables = metaData.getTables(connection.getCatalog(),
					null, null, new String[] { "table" });
			while (tables.next()) {
				String tableName = tables.getString("table_name");
				String modelName = new StringBuilder()
						.append(Character.toUpperCase(tableName.charAt(0)))
						.append(tableName.substring(1)).toString();
				String url = "D:\\Workspaces\\travel\\src\\com\\travel\\dao\\"
						+ modelName + "Dao.java";
				Map<String, String> argMap = new HashMap<String, String>();
				argMap.put("modelName", modelName);
				argMap.put("tableName", tableName);
				this.initTemplate(argMap, "src/daoTmpl.vm", url);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
