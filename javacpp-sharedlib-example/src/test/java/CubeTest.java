import org.junit.Test;

public class CubeTest {

	@Test
	public void testNativeCube() {
		JavaCube cube = new JavaCube();
		cube.setSide(9.21);
		System.out.println(cube.getSide());
		System.out.println(cube.getVolume());
		System.out.println(cube.getArea());
	}

}
