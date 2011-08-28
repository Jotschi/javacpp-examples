#ifndef CUBE_H
#define CUBE_H

class Cube {
	private:
		double side;
	public:
		Cube() {};
		~Cube() {};

		// copy constructor
		Cube(class Cube& cube) {
			side = cube.side;
		}

		void setSide(double s);
		double getSide();
		double getArea();
		double getVolume();
};



#endif
