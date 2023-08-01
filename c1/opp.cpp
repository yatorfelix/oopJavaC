include <iostream>

class Person {
private:
    int greenApples;
    int redApples;
    int greenAppleCost;
    int redAppleCost;

public:
    Person(int greenApples, int redApples, int greenAppleCost, int redAppleCost) {
        this->greenApples = greenApples;
        this->redApples = redApples;
        this->greenAppleCost = greenAppleCost;
        this->redAppleCost = redAppleCost;
    }

    int getGreenAppleCost() {
        return greenApples * greenAppleCost;
    }

    int getRedAppleCost() {
        return redApples * redAppleCost;
    }
};

int main() {
    int greenAppleCost = 31;
    int redAppleCost = 26;

    Person John(36, 13, greenAppleCost, redAppleCost);
    Person Peter(41, 16, greenAppleCost, redAppleCost);
    Person Ann(6, 21, greenAppleCost, redAppleCost);

    std::cout << "John total cost for the Apples is :" << John.getGreenAppleCost() + John.getRedAppleCost()  << std::endl;
    std::cout << "Peter total cost for the Apples is :" << Peter.getGreenAppleCost() + Peter.getRedAppleCost() << std::endl;
    std::cout << "Ann total cost for the Apples is :" << Ann.getGreenAppleCost() + Ann.getRedAppleCost() << std::endl;
   
    };