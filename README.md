alguns comandos:

- mvn compile
gera a folder com arquivos compilados: /target (similar a /build do gradle ou /.out do intellij)

Maven looks for source java code on src/main/java directory and any resources like property files in src/main/resources directory. Maven will look for src/test/java for unittest files and src/test/resources for test resource files - importante

- mvn clean
limpa /target

- mvn package
gera o .jar

- mvn clean package
da pra combar os comandos

- java -cp jar_file.jar Main_class_name
pra rodar sem plugin de criar META-INF/MANIFEST.MF e rodar como jar direto

- java -jar jar_file.jar
pra rodar com o plugin (localizado no pom.xml)
