package de.jotschi.javacpp.example;
import org.junit.Test;

import com.googlecode.javacpp.Loader;
import com.googlecode.javacpp.Pointer;
import com.googlecode.javacpp.PointerPointer;
import com.googlecode.javacpp.annotation.ByRef;
import com.googlecode.javacpp.annotation.Cast;
import com.googlecode.javacpp.annotation.Name;
import com.googlecode.javacpp.annotation.Namespace;
import com.googlecode.javacpp.annotation.Platform;

@Platform(include = "<vector>")
@Namespace("std")
public class VectorTest {
	static {
		Loader.load();
	}

	@Name("vector<void*>")
	public static class PointerVector extends Pointer {
		public PointerVector() {
			allocate();
		}

		public PointerVector(long n) {
			allocate(n);
		}

		// this = (vector<void*>*)p
		public PointerVector(Pointer p) {
			super(p);
		} 

		// this = new std::vector<void*>()
		private native void allocate(); 

		// this = new std::vector<void*>(n)
		private native void allocate(long n); 

		@Name("operator=")
		public native @ByRef
		PointerVector copy(@ByRef PointerVector x);

		public native long size();

		public native @Cast("bool")
		boolean empty();

		@Name("operator[]")
		public native @ByRef
		PointerPointer get(long n);

		public native @ByRef
		PointerPointer at(long n);
	}

	@Test
	public void testPointerVector() {
		PointerVector v = new PointerVector(42);
		Pointer p = new Pointer() {
			{
				address = 0xDEADBEEFL;
			}
		};
		v.get(0).put(p);

		PointerVector v2 = new PointerVector().copy(v);
		Pointer p2 = v2.at(0).get();
		System.out.println(v2.size() + "  " + p2);

	}

	@Test(expected = RuntimeException.class)
	public void testPointerVectorError() {
		PointerVector v2 = new PointerVector();
		v2.at(42);
	}

}