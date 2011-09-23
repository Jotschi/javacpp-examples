package de.jotschi.javacpp.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.googlecode.javacpp.Loader;
import com.googlecode.javacpp.annotation.Platform;
import com.googlecode.javacpp.annotation.Properties;

@Properties({ @Platform(cinclude = "string.h") })
public class StringTest {

	static {
		Loader.load();
	}

	public static native int strlen(String string);

	/**
	 * This basic test will measure the length of a small string
	 */
	@Test
	public void testStrLen() {
		assertEquals(4, strlen("ABCD"));
	}

}