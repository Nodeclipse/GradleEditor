# GradleEditor

Gradle Editor for Eclipse IDEs &amp; Enide Studio

## Installing

Recommended installing is within "Gradle IDE pack" 
[marketplace](http://marketplace.eclipse.org/content/gradle-ide-pack)

<a href="http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1640500" class="drag" title="Drag onto your running IDE to install Gradle IDE Pack"><img class="img-responsive" src="http://marketplace.eclipse.org/sites/all/themes/solstice/public/images/marketplace/btn-install.png" alt="Drag onto your running IDE to install Gradle IDE Pack" /></a>

update site `http://www.nodeclipse.org/updates/gradle-ide-pack/`

## Developing

1. `git clone`
2. import into Eclipse IDE with PDE, e.g. Enide 2015 (or newer)
3. In Project Explorer right-click on `org.nodeclipse.enide.editors.gradle` folder and select Open as project,
then again right-click and select Run as Eclipse application.

Now you have version from source running in your IDE.

## Intro

Gradleware works for Gradle tools in Eclipse within Eclipse Buildship project.
And of course have plans for full pledged Editor 
(see [story](https://github.com/eclipse/buildship/blob/master/docs/stories/Editor.md))
but it is not in nearest future (please let use know via raised issue #2 when you see it on Roadmap)

The goal is to give Editor that would work within any Eclipse project, 
with or without Pivotal Gradle IDE or Eclipse Buildship integrations.
This Editor will take no Gradle APIs or Groovy dependency and stay as light as possible.

## Screenshots

from <http://www.nodeclipse.org/enide/editors/gradle>

![](https://marketplace.eclipse.org/sites/default/files/styles/ds_solution_screenshot/public/Minimalist_Gradle_Editor.PNG)

![](http://marketplace.eclipse.org/sites/default/files/eclipse-color-theme-with-rainbowdrops.png)


## History

This has started as Minimalist Gradle Editor within Nodeclipse-1 repository,
and was extracted by Martin Steiger request https://github.com/Nodeclipse/nodeclipse-1/issues/187
Initially it was implemented within one day by cloning on Nodeclipse JavaScript Editor.
