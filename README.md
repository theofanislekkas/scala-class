# Scala

This is a repo for learning Scala with Coursera's Scala programming courses.  More about the courses can be found at the following link: https://www.coursera.org/specializations/scala

#### This repository is not being currently maintained, but active work may begin again.

# Setup Instructions

**The following instructions are copied from the first course in the Coursera Scala specialization.**

________________________________________________________________________________________________________________
In order to work on the programming assignments, you need to have the following tools installed on your machine:

Oracle JDK, the Java Development Kit, version 1.8. Note some assignments may work with Java 1.7, but we grade the assignments with 1.8, so we strongly recommend to use Java 1.8. Check you have the right version by typing in the console:

`java -version`

Sbt, a build tool for Scala, version 0.13.x.
The Scala IDE for Eclipse, Intellij IDEA or another IDE of your choice.
Please follow the instructions on this page carefully.

## Installing the JDK

### Linux

Ubuntu, Debian: To install the JDK using apt-get, execute the following command in a terminal sudo apt-get install openjdk-8-jdk
Fedora, Oracle, Red Had: To install the JDK using yum, execute the following command in a terminal su -c "yum install java-1.8.0-openjdk-devel"
Manual Installation: To install the JDK manually on a Linux system, follow these steps:
Download the .tar.gz archive from the Oracle website
2. Unpack the downloaded archive to a directory of your choice

3. Add the bin/ directory of the extracted JDK to the PATH environment variable. Open the file ~/.bashrc in an editor (create it if it doesn't exist) and add the following line:

`export PATH="/PATH/TO/YOUR/jdk1.8.0-VERSION/bin:$PATH"`

If you are using another shell, add that line in the corresponding configuration file (e.g. ~/.zshrc for zsh).

Verify your setup: Open a new terminal (to apply the changed ~/.bashrc in case you did the manual installation) and type java -version. If you have problems installing the JDK, ask for help on the forums.

### Mac OS X

Mac OS X either comes with a pre-installed JDK, or installs it automatically.

To verify your JDK installation, open the Terminal application in /Applications/Utilities/ and type java -version. If the JDK is not yet installed, the system will ask you if you would like to download and install it. Make sure you install Java 1.8.

### Windows

- Download the JDK installer for Windows from the Oracle website
- Run the installer
- Add the bin\ directory of the installed JDK to the PATH environment variable, as described here: http://www.java.com/en/download/help/path.xml

To verify the JDK installation, open the Command Prompt and type java -version. If you have problems installing the JDK, ask for help on the forums.

# Installing sbt

Follow the instructions for your platform here to get it running.

This course requires sbt version 0.13.x. If you have previously installed sbt 0.12.x, you need to uninstall it and install a newer version. sbt 0.13.x can be used for projects and other courses requiring sbt 0.12.x, but not the other way around. If in doubt, you can check your currently installed sbt like this: in an arbitrary directory that is not a programming assignment or otherwise an sbt project, run:

 `sbt about`
 
You should see something like this:

`This is sbt 0.13.11`

If the sbt command is not found, or if you get a non-0.13.x version, you need to install sbt 0.13.x.


