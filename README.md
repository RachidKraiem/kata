# How to build gilded-rose-kata

1) make sure that you have java 1.8 is the default java version installed in your machine

	JAVA_HOME=D:\DevWorks\jdk1.8.0_121
	PATH=%JAVA_HOME%\bin;........
	
2) make sure that you have maven version (java 1.8 compatible) installed in your machine (example : apache-maven-3.2.5)

	M2_HOME=D:\DevWorks\apache-maven-3.2.5
	PATH=%JAVA_HOME%\bin;%M2_HOME%\bin;........
	
3) make sure that this java and maven version was integrated in your EDI (example : eclipse)

4) move under "gilded-rose-kata" project and run it as follow :

	mvn clean install
