# Sample Gradle Project

### Root Directory Build Options:
**Clean**
```
./gradlew clean
```
This will remove the build directory containing the binaries.

**Build All**
```
./gradlew compileApp
```
This will build each module and add all of the jars to the root directory. found within rootProjectDir/build/services
  
### Transitivity:

By default, Gradle dependencies are transitive. 
Transitive dependencies are described more in Maven Repositories, 
but for now, all you need to know is that 
one module may depend on other modules, and Gradle can discover 
those dependencies-of-dependencies when it resolves the declared dependency 
against a repository.

When adding dependencies use the following declarations for each use case:
  - compile with implementation (if you don't need transitivity)
  - compile with api (if you need transitivity)
