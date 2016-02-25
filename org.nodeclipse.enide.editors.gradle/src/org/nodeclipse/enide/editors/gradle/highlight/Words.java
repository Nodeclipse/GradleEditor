package org.nodeclipse.enide.editors.gradle.highlight;

public class Words {

    public static final String[] KEYWORDS = {
		// Java keywords
        "assert",
        "if", "else",
        "void",
        "new", "return",
        "try", "catch", 
        
        // Groovy stuff
        "def", 
        
		// Gradle DSL http://gradle.org/docs/current/dsl/ {
        // Build script blocks
		//        allprojects { }
		//        artifacts { }
		//        buildscript { }
		//        configurations { }
		//        dependencies { }
		//        repositories { }
		//        sourceSets { }
		//        subprojects { }
		//        publishing { }
        "allprojects", "artifacts", "buildscript", "configurations",
        "dependencies", "repositories", "sourceSets", "subprojects", "publishing",
        //?
		"task", "apply", "sourceCompatibility", 
        "test",
        "version","group", "name",
        
        "project",
        "ext", 
        "plugins", //since 2.1
        //}
        
        // Android plugin
//        defaultConfig {v}	
//        The default configuration, inherited by all build flavors (if any are defined).
//        sourceSets {v}	
//        Configures the source sets. Note that the Android plugin uses its own implementation of source sets, AndroidSourceSet.
//        buildTypes {v}	
//        Configures the build types.
//        signingConfigs {v}	
//        Configures the signing configs.
//        productFlavors {v}	
//        Configures the product flavors.
//        testOptions {v}	
//        Configures the test options.
//        aaptOptions {v}	
//        Configures aapt options.
//        lintOptions {v}	
//        Configure lint options.
//        dexOptions {v}	
//        Configures dex options.
//        compileOptions {v}	
//        Configures compile options.
//        packagingOptions {v}	
//        Configures packaging options.
//        jacoco {v}	
//        Configures JaCoCo options.
//        splits {v}	
//        Configures APK splits.        
        "android", "compileOptions", 
        "compileSdkVersion", "buildToolsVersion",//
        "sourceSets", "main", "manifest",//
        "srcFile", "srcDirs", "setRoot",//
        "defaultConfig", "signingConfigs", "buildTypes",//
        "productFlavors", "debug", "release",//
        "lintOptions", "packagingOptions",
        "aaptOptions", "dexOptions", "adbOptions",
        "testOptions",
        "jacoco", "splits",
        
        // other plugins
        "robolectric",

    };

    public static final String[] RESERVEDWORDS = { "let", "yield",//
            "abstract", "enum", "int", "short",//
            "boolean", "export", "interface", "static",//
            "byte", "extends", "long", "super",//
            "char", "final", "native", "synchronized",//
            "class", "float", "package", "throws",//
            "const", "goto", "private", "transient",//
            "debugger", "implements", "protected", "volatile",//
            "double", "import", "public",//
            
    };

    public static final String[] NODE_WORDS = new String[] { "require", "__filename",//
            "__dirname", "module", "exports", "setInterval"//
    };

}
