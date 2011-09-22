package de.jotschi.MavenAndroidTest;
import static com.googlecode.javacpp.Loader.load;


import com.googlecode.javacpp.Pointer;
import com.googlecode.javacpp.annotation.Name;
import com.googlecode.javacpp.annotation.Platform;

@Platform(include = "Cube.h", link = "Cube")
public class JavaCube {

	NativeCube cube;
	static {
		load();
	}

	public JavaCube() {
		cube = new NativeCube();
	}

	public void setSide(double s) {
		cube.setSide(s);

	}

	public double getArea() {
		return cube.getArea();
	}

	public double getSide() {
		return cube.getSide();
	}

	public double getVolume() {
		return cube.getVolume();
	}

	@Name("Cube")
	public static class NativeCube extends Pointer {

		static {
			load();
		}

		public NativeCube() {
			allocate();
		}

		public NativeCube(Pointer p) {
			super(p);
		}

		public native void setSide(double s);

		// this = new Cube()
		private native void allocate();

		private native double getArea();

		private native double getSide();

		private native double getVolume();

	}
}