package business;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestXml {

	public static void main(String[] args) {
		XMLCreator xml = new XMLCreator();
		Path p = Paths.get("C:\\NetBeansProjects\\equals_work\\bin\\business\\Missing_KYC.csv");
		Path d = Paths.get("C:\\NetBeansProjects\\equals_work\\bin\\business\\Missing_KYC.xml");
		String csvFileName = p.getFileName().toString();
		String xmlFileName = d.getFileName().toString();
		String delimiter = ",";
		//String file = p.getFileName().toString();

		//System.out.println(file);
		xml.convertFile(csvFileName, xmlFileName, delimiter);
		
		System.out.println("DONE !!!!!!!!!!!!!!!!!");

	}

}
