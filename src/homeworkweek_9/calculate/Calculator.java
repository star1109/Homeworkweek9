package homeworkweek_9.calculate;
/*1. Create one package with name homeworkweek_9.calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”,
and “multiplication”. All methods are instance method and it doesn’t
return anything. But it has two parameters with name “int a” and “int
b”. Also each method have System.out.println(). This prints the result.
Also create all one more method with name “calculateResult” with
three parameter with name int a, int b and char symbol. Write the logic
in calculateResult method that when user enter first number and
second number and symbol based on symbol it does homeworkweek_9.calculate.
4. Write a “main” method into main class. It has scanner that takes user
input. Also write the logic that it ask user to “Enter first Number:”,
“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
enter + symbol result like “Addition of 5 and 10 is: 15” and respective
for other symbol.
5. With the result it’s also print one more message “Would you like to do
more calculation Please enter “Y” or “N” :” (Hint use while loop if user
enter Y program asking the user to enter First Number, and if user enter
N programme should terminate)
* */
public class Calculator {
        int a, b, ans;
        char symbol;

        void addition( int a, int b){
            ans = a+b;
            System.out.println("Addition of " + a + "and"+ b + "is: " + ans);
        }
        void subtraction( int a, int b){
            ans = a-b;
            System.out.println("Subtraction of " + a + "and"+ b + "is: " + ans);
        }
        void division(int a, int b){
            ans = a/b;
            System.out.println("Division of " + a + "and"+ b + "is: " + ans);
        }
        public void multiplication (int a, int b){
            ans = a*b;
            System.out.println("Multiplication of " + a + "and"+ b + "is: " + ans);
        }
        void calculateResult(int a, int b, char symbol){
            switch( symbol){
                case '+':
                    addition(a,b);
                    break;
                case'-':
                    subtraction(a,b);
                    break;
                case '/':
                    division(a,b);
                    break;
                case'*':
                    multiplication(a,b);
                    break;
                default:
                    System.out.println("Please enter valid input");
            }
        }
    }

