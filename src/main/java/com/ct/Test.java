package com.ct;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Optional;

import com.ct.model.POA_Employee;
import com.ct.model.POD_Employee_1;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args)
			throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException, NoSuchMethodException, SecurityException {

		Optional<List<String>> optValue = AppReader
				.getPropertiesFileValueList("./properties/fileProperties.properties");

		if (optValue.isPresent()) {
			List<String> pathList = optValue.get();

			for (String string : pathList) {
				Optional<String> optContent = AppReader.getContentFromFile(string);
				if (optContent.isPresent()) {
					if (string.contains("poa")) {
						System.out.println(new ObjectMapper().readValue(optContent.get(), POA_Employee.class));
					} else {
						System.out.println(CommpoUtils.convertToPoaEmployee(
								new ObjectMapper().readValue(optContent.get(), POD_Employee_1.class)));
					}
				}
			}
		}
	}

}
