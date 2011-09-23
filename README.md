
# Examples
You can import the examples via the m2eclipse plugin into your eclipse workspace. Please note that the examples currently are only tested under linux. 

## javacpp-sharedlib-example
This example shows how to use a sharedlib together with javacpp

## javacpp-libc6-example
This example show how to use javacpp in combination with the libc6 c library

## javacpp-stdlib-example
This example shows how to use javacpp in combination with the stdlib c++ library

## javacpp-android-example
This example shows how to use javacpp within a maven project for android 

Note: If you have an error within your project please try to update the maven project settings.

Please add the following profile to your maven settings.xml:

    <profiles>
        <profile>
            <id>android</id>
            <activation>
                <activeByDefault>true</activeByDefault>
            </activation>
            <properties>
                <android.sdk.path>YOUR_PATH_TO_THE_ANDROID_SDK</android.sdk.path>
                <android.ndk.path>YOUR_PATH_TO_THE_ANDROID_NDK</android.ndk.path>
            </properties>
        </profile>
    </profiles>
