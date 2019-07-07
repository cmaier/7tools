[![GitHub license](https://img.shields.io/github/license/dcendents/android-maven-gradle-plugin.svg)](http://www.apache.org/licenses/LICENSE-2.0.html) |
[![Release](https://jitpack.io/v/cmaier/7tools.svg)](https://jitpack.io/#cmaier/7tools) |
`Release 1.4.2` [![Build Status](https://travis-ci.com/cmaier/7tools.svg?branch=1.4.2)](https://travis-ci.com/cmaier/7tools) |
`Master` [![Build Status](https://travis-ci.com/cmaier/7tools.svg?branch=master)](https://travis-ci.org/cmaier/7tools)

# 7tools - Kotlin tools for Android projects

In the last year I've written several tools that helped me in my Android App projects to work with resources and the Android framework. Now I'm putting all these tools in one project so it will help me and maybe others enjoying developing Kotlin a little more.

## :bangbang: There might be breaking changes on new releases.

### How to add it to my Android project?

#### First - Add the repo to your projects repositories:

```Gradle
allprojects {
    repositories {
        // ...
        maven { url 'https://jitpack.io' }
    }
}
```

#### Second - Add it to the dependencies on app oder module level:

```Gradle
dependencies {
    compile 'com.github.cmaier:7tools:1.4.2'
}
```

#### Third - Make a :coffee:, grab a :beer: or whatever you fancy and try it out
