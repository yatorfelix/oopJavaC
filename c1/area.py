class Addition:
    def __init__(self,x,y):
        self.length = x
        self.width = y
        
        
    def add(self):
        result = self.length  * self.width 
        print (result)
        

x=int(input("Enter length \n"))
y=int(input("Enter width \n"))

tom = Addition(x,y)
tom.add()
