# adneomMaisonTest


+ cloner "maisontest"
+ exécuter la commande "mvn clean install"

+ Ajouter la dependence "maisontest" dans votre pom

```
<dependency>
	<groupId>net.adneom</groupId>
	<artifactId>maisontest</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```
 
+ importer la methode partition : 
```
import static maisontest.MaisonTest.partition;
...
partition({1,2,3}, 2);
```

+ OU importer MaisonTest : 
```
import static maisontest.MaisonTest.partition;
...
MaisonTest.partition({1,2,3}, 2);
```
