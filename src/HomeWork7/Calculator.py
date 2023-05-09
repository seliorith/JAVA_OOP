
class Calculator:
    def __init__(self):
        self.first_operand = None
        self.operator = None
        self.second_operand = None

    def set_first_operand(self, operand):
        self.first_operand = float(operand)

    def set_operator(self, operator):
        self.operator = operator

    def set_second_operand(self, operand):
        self.second_operand = float(operand)

    def get_result(self):
        if self.operator == '+':
            return self.first_operand + self.second_operand
        elif self.operator == '-':
            return self.first_operand - self.second_operand
        elif self.operator == '*':
            return self.first_operand * self.second_operand
        elif self.operator == '/':
            if self.second_operand == 0:
                return "Error: Division by zero"
            return self.first_operand / self.second_operand
        else:
            return "Error: Invalid operator"
