# MomBiz

## Bash
```sh
gradle init --type java-application  --dsl kotlin 
./gradlew build --scan
./gradlew codereview:task1

cd gradle
mkdir license-plugin
cd license-plugin
gradle init --dsl kotlin --type kotlin-gradle-plugin --project-name license
./gradlew projects
```

When in the project root, running:

```sh
./gradlew build - Builds app and lib

./gradlew :app:build - Builds app and lib

./gradlew :lib:build - Builds lib only

./gradlew :license-plugin:plugin:build - Builds license-plugin only
```


```sh
./gradlew tasks --all

./gradlew :app:greeting
```

```sh
./gradlew :app:tasks
```

```sh
./gradlew -q projects
./gradlew -q run
```