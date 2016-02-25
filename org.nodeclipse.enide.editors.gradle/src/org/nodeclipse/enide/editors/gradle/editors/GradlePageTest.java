package org.nodeclipse.enide.editors.gradle.editors;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.nodeclipse.enide.editors.gradle.editors.GradlePage.Node;

//Testing using string and files from this project
public class GradlePageTest {

	static void log(String s) {
		System.out.println(s);
	}

	static void processString(String s){
		log(s);
		GradlePage model = new GradlePage(s);
		log("-- Resulted Nodes:");
		for (Node node : model.nodes) {
			log(node.name);
		}
	}
	
	static void processFromFile(String path) throws IOException{
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		String text = new String(encoded, Charset.defaultCharset());
		log(text);
		processString(text);		
	}

	public static void main(String[] args) throws IOException {
		String s = "task initSourceFolders { // add << before { to prevent executing during configuration phase";
		//processString(s);
		
		// docs/java/examples/build.gradle
		processFromFile("docs/java/examples/build.gradle");
		
		///org.nodeclipse.enide.editors.gradle/docs/java/classic/build.gradle
		//processFromFile("docs/java/classic/build.gradle");
	}
	
}
