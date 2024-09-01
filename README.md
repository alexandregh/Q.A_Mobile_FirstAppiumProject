# FirstAppiumProject
### Appium Session Driver Creation Project for Android and IOS.

<hr>

#### Description: 
<p style="text-align: justify;">This project demonstrates in a simple way, through an example application of the Java main type, how to create/configure a Session Driver of two types as follows:</p>

- **DesiredCapabilities** (class CreateDriverSessionDesiredCapabilities);
- **Options** (class CreateDriverSessionSessionUsingOption).

<hr>

#### Features:
<p style="text-align: justify;">Both approaches to creating/configuring a Session Driver work in a similar way and both the <b>DesiredCapabilities</b> approach and the <b>Options</b> approach can be used without any problems.</p>
<p style="text-align: justify;">The <b>DesiredCapabilities</b> approach creates an instance of an object of the DesiredCapabilities class type and from this instantiated object different configurations can be assigned.</p>
<p style="text-align: justify;">The <b>Options</b> approach creates an instance of an object of the <b>UiAutomator2Options</b> class type, but unlike the <b>DesiredCapabilities</b> approach, this object can be instantiated by assigning it 
several configurations at once, that is, the same configurations that were assigned in the <b>DesiredCapabilities</b> approach now in Options approach are assigned in their instantiation in a concatenated manner.</p>

<hr>

#### Image:
![img.png](img.png)

<hr>

#### Note:
The newest approach called **Options**, from version 2 of Appium, came to be an alternative to the old **DesiredCapabilities** approach.

<hr>

#### Observation:
Although there are snippets of IOS code in both the CreateDriverSessionDesiredCapabilities and CreateDriverSessionSessionUsingOption classes, these are not functional at the moment because IOS app codes only 
work on the MAC Operating System and it is not possible to continue creating/configuring them and testing them.<br>
These are commented.

<hr>

#### Dependencies:
    <!-- https://mvnrepository.com/artifact/io.appium/java-client -->
    <dependency>
        <groupId>io.appium</groupId>
        <artifactId>java-client</artifactId>
        <version>9.3.0</version>
    </dependency>
    Description: Java client for Appium Mobile Webdriver
    Link: https://mvnrepository.com/artifact/io.appium/java-client

<hr>

#### Credits:
This project made in Appium as well as its app **API Demos-debug.apk** was based on the following course:
- https://www.udemy.com/course/the-complete-appium-course-for-ios-and-android/

<br>

#### Links Capabilities:
- https://appium.io/docs/en/2.1/guides/caps/ <br>
- https://appium.github.io/appium.io/docs/en/writing-running-appium/caps/

<hr>

This project was created by **Alexandre Rodrigues da Silva**.