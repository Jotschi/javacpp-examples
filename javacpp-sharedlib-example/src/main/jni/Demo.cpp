#include <iostream>
#include "Cube.h"

using namespace std;

int main() {


	Cube* aCube = new Cube();
	aCube->setSide(9);
	cout << "Side: " << aCube->getArea() << endl;
	return (0);

}

