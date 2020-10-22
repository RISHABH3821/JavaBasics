# Modularity in Java

## packages 
We group classes in different packages to provide a library to other programs for use.

But with packages every class is accessible and that is not what we want all the time, some classes which are required by the classes inside a package could contain certain code or implementation which we don't wanna expose to the world,
and since class has to be public in order to be accessible to others the public classes in package are by default exposed, so to avoid this JDK 9 introduced modules.
Also one noteworthy problem with using just packages were having two classes with same name required in two different packages, this could lead to run time failure.

## Modules
In modules we can define which packages to export and which package a module will require.
```java
module com.rishabh.mymodule {
    requires javafx.graphics;

    exports com.rishabh.mymodule.util;
}
```
