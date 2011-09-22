#include "Cube.h"


void Cube::setSide(double s) {
	side = s <= 0 ? 1 : s;
}

double Cube::getSide() {
	return side;
}

double Cube::getArea() {
	return 6 * side * side;
}

double Cube::getVolume() {
	return side * side * side;
}
