
This is an example of multi-module project gradle configuration.

### Hierarchical and Flat Project Layouts

In multi-module project `settting.gradle` is required to specify module location.
 ( While for simple project you can play with build using `gradle -b` option
 to specify what `build.gradle` to use, e.g. `gradle -b second.gradle`,
 for multi-module project `settings.gradle` is the only way. )
 
> `-b` allows to pass a different build script for a single-project build.
> It is not meant to be used for multi-project builds, where `settings.gradle` alone determines where build scripts are located. 

hierarchical project layout

	- app
		build.gradle
	- module
		build.gradle
	build.gradle
	settings.gradle
	

flat project layout

	- app
		build.gradle
	- module
		build.gradle
	- parent	
		build.gradle
		settings.gradle

So with flat project layout you can achieve different composition for a build, e.g.   

	- app
		build.gradle
	- module
		build.gradle
	- parent	
		build.gradle
		settings.gradle
	- second	
		build.gradle
		settings.gradle

However when executing build from
[command line](http://www.gradle.org/docs/current/userguide/gradle_command_line.html)
for flat project layout, you may must to specify
location of `settings.gradle` if it is not in current folder, e.g. when in `app` folder 

	gradle build -c ../parent/settings.gradle
	
_I think default file name should be `components.gradle` or other start with c._
_Besides settings is t0o general word._ 	

### Links

