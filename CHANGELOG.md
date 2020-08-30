# CHANGELOG

## [Unreleased]
### Added
### Changed
### Removed
### Fixed


## [1.8.0] - 2020-08-30
### Fixed
* ReplaceWith didn't work correctly w/ io() extension function

### Changed
* Gradle Wrapper updated from 6.2.2 to 6.6.1
* Android Gradle Plugin updated from 3.6.1 to 4.0.1
* Kotlin updated from 1.3.70 to 1.4.0
* AndroidX Fragment from 1.2.0 to 1.2.5 _(and Fragment-KTX)_
* AndroidX AppCompat from 1.1.0 to 1.2.0
* Migrated to new KoTest _(ex KotlinTest)_ 4.2.2

## [1.7.0] - 2020-03-18
### Added
* Improve logging methods for Throwable receivers #27

### Changed
* Gradle Wrapper updated from 6.0.1 to 6.2.2
* Android Gradle Plugin updated from 3.5.2 to 3.6.1
* Kotlin updated from 1.3.60 to 1.3.70
* AndroidX Fragment from 1.1.0 to 1.2.3

## [1.6.1] - 2019-11-27
### Added
* Missing log level info has been added #25 

### Changed
* All log wrapping functions now support throwable as parameter. The default value is null. #25 

## [1.6.0] - 2019-11-26
### Added
* The Logcat logging functions _(Log.d, eg)_ had been wrapped around a generic, so they can be used to easy log anything. #24 

### Changed
* LetNotNull Functions and the related n-Tuples has been deprecated. #23
* Gradle Wrapper updated from 5.6.2 to 6.0.1
* Android Gradle Plugin updated from 3.5.0 to 3.5.2

## [1.5.0] - 2019-09-06
### Added
* Support for Github Actions added

### Changed
* Gradle update from 5.3.1 to 5.6.2
* `compileSdkVersion` set to `29`
* `targetSdkVersion` set to `29`
* `androidx.appcompat` set to `1.1.0` 
* `androidx.fragment` set to `1.1.0` 

### Removed
* Support for Travis CI removed

## [1.4.2] - 2019-07-07
## Changed
* VersionUtils: Lint now recognizes support functions

## [1.4.1] - 2019-04-11
### Added
* VersionUtils: Support functions for OreoMR1(27) and Pie(28)

## [1.4.0] - 2019-04-05
### Added
* AndroidX support
* NonNull Boolean extension functions `onTrue()` and `onFalse()`
* `Int.newWithAlpha(Float)` to create a new ColorInt from an existing one with an alpha set

### Changed
* Kotlin updated to `1.3.21`
* `compileSdkVersion` set to `28`
* `targetSdkVersion` set to `28` 

### Removed
* Android Support Library

## [1.3.2] - 2018-11-01
### Fixed
* `minSdkVersion` downgraded to `19`

## [1.3.1] - 2018-11-01
### Fixed
* Android Support Library downgraded to `27.1.1`
* `compileSdkVersion` downgraded to `27`

## [1.3.0] - 2018-11-01
### Added
* Added Boolean extension function allowing to run a block depending on the Boolean's value _(true, false or null)_
* Sources are now included in the library

### Changed
* Kotlin updated to `1.3.0
* Android Support Library updated to `28.0.0`
* `compileSdkVersion` set to `28`
* `minSdkVersion` set to `21`

## [1.2.2] - 2018-03-17
### Changed
* Kotlin updated to `1.2.30`
* Android Support Library updated to `27.1.0`
* buildToolsVersion updated to `27.0.3`

## [1.2.1] - 2017-12-06
### Changed
* Kotlin updated to `1.2.0`
* Android Support Library updated to `27.0.2`
* buildToolsVersion updated to `27.0.2`

## [1.2.0] - 2017-11-24
### Added
* Actions for `VersionSupport` functions:
  * Mandatory `support` function parameter
  * Optional `unsupported` function paramter

### Changed
* targetSdkVersion is now `27`
* !! Breaking change in `Fragment#toast()` methods
* !! Breaking change in extension method `Context.drawable()` - return type is now nullable
* Tuples `let` and `letNotNull` methods are now inlined

## [1.1.0] - 2017-09-29
### Added
* Tuples `letNotNull` with a new variant where the block is being called with similar tuple instead of every property


## [1.0.0] - 2017-09-17
### Added
* Initial release
