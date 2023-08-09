class Person:
    def __init__(self, greenApples, redApples, greenAppleCost, redAppleCost):
        self.greenApples = greenApples
        self.redApples = redApples
        self.greenAppleCost = greenAppleCost
        self.redAppleCost = redAppleCost

    def getGreenAppleCost(self):
        return self.greenApples * self.greenAppleCost

    def getRedAppleCost(self):
        return self.redApples * self.redAppleCost


if __name__ == "__main__":
    greenAppleCost = 31
    redAppleCost = 26

    John = Person(36, 13, greenAppleCost, redAppleCost)
    Peter = Person(41, 16, greenAppleCost, redAppleCost)
    Ann = Person(6, 21, greenAppleCost, redAppleCost)

    print("John total cost for the Apples is:", John.getGreenAppleCost() + John.getRedAppleCost())
    print("Peter total cost for the Apples is:", Peter.getGreenAppleCost() + Peter.getRedAppleCost())
    print("Ann total cost for the Apples is:", Ann.getGreenAppleCost() + Ann.getRedAppleCost())
