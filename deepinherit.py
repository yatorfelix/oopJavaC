class Shapes:
    def __init__(self):
        self.width = 0
        self.length = 0
        self.area = 0
        self.perimeter = 0
    
    def get_length(self):
        print("Enter the length of the rectangle:")
        self.length = float(input())
        print("Enter the width of the rectangle:")
        self.width = float(input())


class Rectangle(Shapes):
    def find_area(self):
        self.area = self.length * self.width
        print("The result is", self.area)
        return self.area
    
    def find_perimeter(self):
        self.perimeter = 2 * (self.length + self.width)
        print("The result is", self.perimeter)
        return self.perimeter


class Triangle(Shapes):
    def __init__(self):
        super().__init__()
        self.base = 0
        self.height = 0
    
    def find_area(self):
        self.area = self.base * self.height
        print("The result is", self.area)
        return self.area
    
    def find_perimeter(self):
        self.perimeter = self.base + self.base + self.base
        print("The result is", self.perimeter)
        return self.perimeter


if __name__ == "__main__":
    a = Rectangle()
    a.get_length()
    a.find_area()
    a.find_perimeter()

    t = Triangle()
    t.get_length()
    t.find_area()
    t.find_perimeter()
