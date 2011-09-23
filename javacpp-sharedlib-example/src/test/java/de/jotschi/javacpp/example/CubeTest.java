package de.jotschi.javacpp.example;

import org.junit.Test;

public class CubeTest {

	@Test
	public void testNativeCube() {
		JavaCube cube = new JavaCube();
		cube.setSide(9.21);
		System.out.println("Cube1 Side: " + cube.getSide());
		System.out.println("Cube1 Volume: " + cube.getVolume());
		System.out.println("Cube1 Area: " + cube.getArea());
		
		JavaCube cube2 = new JavaCube();
		cube2.setSide(12.1);
		System.out.println("Cube1 Area: " + cube.getArea());
		System.out.println("Cube2 Area: " + cube2.getArea());
		
	}

}
