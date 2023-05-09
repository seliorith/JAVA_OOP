import Calculator
import re

if __name__ == "__main__":
    operation_pattern = re.compile(
        r"^([-+]?[0-9]{1,}[.,]?[0-9]*)([+\-*\/])([0-9]{1,}[.,]?[0-9]*)$")
    while True:
        cmd_str = input()
        match = operation_pattern.match(cmd_str)
        if match:
            calc = Calculator()
            calc.set_first_operand(match.group(1))
            calc.set_operator(match.group(2))
            calc.set_second_operand(match.group(3))
            print(calc.get_result())
        if cmd_str == "exit":
            break
