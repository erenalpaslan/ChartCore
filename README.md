[![Android CI](https://github.com/ErenAlpaslan/ChartCore/actions/workflows/maven-publish.yml/badge.svg)](https://github.com/ErenAlpaslan/ChartCore/actions/workflows/maven-publish.yml)


## ChartCore
Data visualization library 📊 for Android. Based on Chart.js javascript library which is currently the most popular library for web development. Extremely customizable, supports pie, doughnut, line, bar, radar, area, bubble, scatter and mixed types.

***
## Features

1. Support `Android`、`Kotlin` & `Java`.
2. Supports pie, doughnut, line, bar, radar, area, bubble, scatter and mixed types of chart
3. Interactive、animated, the `animation` effect is exquisite 、delicate、 smooth and beautiful.[Underdevelopment] 
4. Support `chain programming syntax` like system framework.

***
## Installation
[![](https://jitpack.io/v/ErenAlpaslan/ChartCore.svg)](https://jitpack.io/#ErenAlpaslan/ChartCore)

### Gradle
#### Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```groovy
	allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
```
	
#### Step 2. Add the dependency

```groovy
	dependencies {
	        implementation 'com.github.ErenAlpaslan:ChartCore:1.0.0'
	}
```

## Usage

1. Create the instance object of chart view:`ChartCoreView`
```xml
    <com.github.chartcore.view.ChartCoreView
            android:id="@+id/chartCore"
            android:layout_width="300dp"
            android:layout_height="300dp" />
```
2. Configure the properties of chart model:`ChartCoreModel`
```kotlin  
  val data = mapOf(
            "2019" to 60.0,
            "2020" to 50.0,
            "2021" to 40.0,
            "2022" to 120.0,
            "2023" to 10.0
        )

  val coreData = ChartData()
      .addDataset(
          ChartNumberDataset()
              .data(data.values.toList())
              .label("Acquisitions by year")
              .offset(10)
      )
      .labels(data.keys.toList())

  val chartOptions = ChartOptions()
            .plugin(
                Plugin()
                    .subtitle(
                        Title()
                            .display(true)
                            .text("Subtitle example")
                            .position(Position.BOTTOM)
                    ).title(
                        Title()
                            .display(true)
                            .text("Title")
                            .position(Position.TOP)
                            .align(TextAlign.CENTER)
                            .color("red")
                    )
                    .tooltip(
                        Tooltip(false)
                    )
            )
            .elements(
                Elements()
                    .line(
                        Line()
                            .tension(0.5f)
                    )
            )

  val chartModel = ChartCoreModel()
            .type(ChartTypes.LINE)
            .data(coreData)
            .options(chartOptions)
```
3. And you need to set core model to view: 

```kotlin  
   binding.chartCore.draw(chartModel)
```

4. 🚀 And thats it.
<img width="358" alt="image" src="https://user-images.githubusercontent.com/45710175/208260307-a1958a0d-1ff9-4eb3-8643-4eafcc19dead.png">


## LICENSE

![](https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/License_icon-mit-88x31-2.svg/128px-License_icon-mit-88x31-2.svg.png)

ChartCore is available under the MIT license. See the [LICENSE](https://github.com/ErenAlpaslan/ChartCore/blob/master/LICENSE) file for more information. 
