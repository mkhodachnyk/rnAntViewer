
# react-native-ant-weaver

## Getting started

`$ npm install react-native-ant-weaver --save`

### Mostly automatic installation

`$ react-native link react-native-ant-weaver`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-ant-weaver` and add `RNAntWeaver.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNAntWeaver.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNAntWeaverPackage;` to the imports at the top of the file
  - Add `new RNAntWeaverPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-ant-weaver'
  	project(':react-native-ant-weaver').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-ant-weaver/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-ant-weaver')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNAntWeaver.sln` in `node_modules/react-native-ant-weaver/windows/RNAntWeaver.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Ant.Weaver.RNAntWeaver;` to the usings at the top of the file
  - Add `new RNAntWeaverPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNAntWeaver from 'react-native-ant-weaver';

// TODO: What to do with the module?
RNAntWeaver;
```
  