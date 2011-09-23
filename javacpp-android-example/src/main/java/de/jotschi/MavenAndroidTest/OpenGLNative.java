package de.jotschi.MavenAndroidTest;

import static com.googlecode.javacpp.Loader.load;

import com.googlecode.javacpp.annotation.Platform;
import com.googlecode.javacpp.annotation.Properties;
//includepath=genericIncludepath, linkpath=genericLinkpath
@Properties({ 
	@Platform(cinclude = {"opengltest.h"},link="opengltest" )
})
public class OpenGLNative {

	static {
		load();
	}

	public static native void setColor();

}