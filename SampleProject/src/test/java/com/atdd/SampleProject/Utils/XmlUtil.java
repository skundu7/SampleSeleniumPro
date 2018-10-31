package com.atdd.SampleProject.Utils;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;






import org.junit.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



public class XmlUtil {
	
	
	public static String getTestData(String SectionName, String NodeName) {
		
		 SectionName = "Project/"+SectionName+"/"+NodeName;
		
		
		String foundData= null;
		File fxmlFile = new File("TestData.xml");
		DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		Document doc ;
		NodeList nodeList;
		
		try{
			builder = factory.newDocumentBuilder();
			doc = builder.parse(fxmlFile);
			doc.getDocumentElement().normalize();
			XPath xpath = XPathFactory.newInstance().newXPath();
			nodeList = (NodeList) xpath.compile(SectionName).evaluate(doc, XPathConstants.NODESET);
			System.out.println(nodeList.getLength());
		}catch( Exception e){
			Assert.fail("error reading TestData file"+e.getMessage());
			return null;
		}
		
		for(int i=0;i<nodeList.getLength();i++){
			Node nNode = nodeList.item(i);
			System.out.println(nNode.getNodeName());
			if(nNode.getNodeName().equals(NodeName)){
				foundData = nNode.getTextContent().trim();
				System.out.println(foundData);
			}
			
		}
		
		//Assert.assertNotNull("Failed to find test Data for "+SectionName+"and for"+NodeName, foundData);
		

		return foundData;
	}

}
