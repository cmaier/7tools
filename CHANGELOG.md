# CHANGELOG

## [Unreleased]

### Added
* VersionUtils: Support functions for OreoMR1(27) and Pie(28)

### Changed
### Removoed
### Fixed

## [1.4.0] - 2019-04-05
### Added
* AndroidX support
* NonNull Boolean extension functions `onTrue()` and `onFalse()`
* `Int.newWithAlpha(Float)` to create a new ColorInt from an existing one with an alpha set

### Changed
* Koltin updated to `1.3.21`
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
