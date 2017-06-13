# First Time Setup (Windows)
--------------------------
1. [Download](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and install the JDK (version 8u131 as of this writing)
2. Add the binary directory to your Windows PATH environment variable.
	Open a command prompt and type...
	```
		set path="%path%;C:\Program Files\Java\jdk1.8.0_131\bin"
	```
	Test it out by typing...
	```
		javac
	```
	If a summary of the compile command is displayed then it worked.
3. Install [TextPad](https://www.textpad.com/download/) (version 8 as of this writing)

# How to Use Commandline Java
---------------------------
1. Open the Windows command prompt
```
	cmd
```
2. Change directories to the path of your current project
```
	cd C:\your\project\path
```
3. Use the Java compile command to build your source code into executable bytecode
```
	javac MyProgram.java
```
4. Execute the compiled .class file (don't include the .class extension when typing the command)
```
	java MyProgram
```
