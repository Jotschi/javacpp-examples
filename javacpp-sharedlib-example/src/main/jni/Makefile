# Example makefile for building a shared lib and a demo application that uses that library

CC	= g++
BASEDIR	= ../../..
VERSION	= ` date "+%Y.%m%d%" `

clean:
	rm *.o *.so *.gch demo
 
main:
	echo "Creating shared lib"
	$(CC) -Wall -fPIC -o $(BASEDIR)/target/cube.o -c Cube.cpp 
	mkdir -p $(BASEDIR)/target/classes/linux-x86
	$(CC) -Wall -shared -o $(BASEDIR)/target/classes/linux-x86/libCube.so $(BASEDIR)/target/cube.o

demo: 
	echo "Creating demo program"
	$(CC) Demo.cpp -o demo -L . -lCube
