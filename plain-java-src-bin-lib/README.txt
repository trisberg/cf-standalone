Deploy to cf with:

$ vmc push plain-java-src-bin-lib --path bin
Detected a Standalone Application, is this correct? [Yn]: 
1: java
2: node
3: node06
4: ruby18
5: ruby19
Select Runtime [java]: 1
Selected java
Start Command: ./test.sh
Application Deployed URL [None]: 
Memory reservation (128M, 256M, 512M, 1G, 2G) [512M]: 
How many instances? [1]: 
Bind existing services to 'plain-java-src-bin-lib'? [yN]: 
Create services to bind to 'plain-java-src-bin-lib'? [yN]: 
Would you like to save this configuration? [yN]: 
Creating Application: OK
Uploading Application:
  Checking for available resources: OK
  Processing resources: OK
  Packing application: OK
  Uploading (2K): OK   
Push Status: OK
Staging Application 'plain-java-src-bin-lib': OK                                
Starting Application 'plain-java-src-bin-lib': OK                               

$ vmc logs plain-java-src-bin-lib
====> /logs/stdout.log <====

Testing ...
Plain Java
Java Version: 1.6.0_24
Spring Version: 3.0.7.RELEASE
PATH: /var/vcap/packages/dea_jvm/bin:/var/vcap/packages/ruby/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games
...

