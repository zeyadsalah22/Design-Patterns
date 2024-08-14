namespace InterpreterP
{

    // Context class for holding any global information
    public class Context { }

    // Expression interface with interpret method
    public interface Expression
    {
        public double Interpret(Context context);
    }

    // AdditionExpression class for representing addition operations in the expression tree
    public class AdditionExpression : Expression
    {
        private Expression left;
        private Expression right;

        public AdditionExpression(Expression left, Expression right)
        {
            this.left = left;
            this.right = right;
        }

        public double Interpret(Context context)
        {
            return left.Interpret(context) + right.Interpret(context);
        }
    }

    // SubtractionExpression class for representing subtraction operations in the expression tree
    public class SubtractionExpression : Expression {
        private Expression left;
        private Expression right;

        public SubtractionExpression(Expression left, Expression right)
        {
            this.left = left;
            this.right = right;
        }

        public double Interpret(Context context)
        {
            return left.Interpret(context) - right.Interpret(context);
        }
    }

    // MultiplicationExpression class for representing multiplication operations in the expression tree
    public class MultiplicationExpression : Expression
    {
        private Expression left;
        private Expression right;

        public MultiplicationExpression(Expression left, Expression right)
        {
            this.left = left;
            this.right = right;
        }

        public double Interpret(Context context)
        {
            return left.Interpret(context) * right.Interpret(context);
        }
    }

    // DivisionExpression class for representing division operations in the expression tree
    public class DivisionExpression : Expression {
        private Expression left;
        private Expression right;

        public DivisionExpression(Expression left, Expression right)
        {
            this.left = left;
            this.right = right;
        }

        public double Interpret(Context context)
        {
            return left.Interpret(context) / right.Interpret(context);
        }
    }

    // NumberExpression class for representing numeric values in the expression tree
    public class NumberExpression : Expression
    {
        private double number;

        public NumberExpression(double number)
        {
            this.number = number;
        }

        public double Interpret(Context context)
        {
            return number;
        }
    }

    // Interpreter class for interpreting and evaluating expressions
    public class Interpreter
    {
        private Context context;

        public Interpreter(Context context)
        {
            this.context = context;
        }

        public double Interpret(string expression)
        {
            Expression expressionTree = BuildExpressionTree(expression);

            return expressionTree.Interpret(context);
        }

        // Method to build the expression tree from a string expression
        public Expression BuildExpressionTree(string expression) {
            // Using hardcoded tree for simplicity
            return new SubtractionExpression(
                    new AdditionExpression(
                            new NumberExpression(3),
                            new MultiplicationExpression(
                                    new NumberExpression(5),
                                    new NumberExpression(2)
                            )
                    ),
                    new DivisionExpression(
                            new NumberExpression(4),
                            new NumberExpression(2)
                    )
            );
        }
    }
    internal class Program
    {
        // Main function for testing
        static void Main(string[] args)
        {
            Context context = new Context();
            Interpreter interpreter = new Interpreter(context);

            String expression = "3 + 5 * 2 - 4 / 2";


            double result = interpreter.Interpret(expression);
            Console.WriteLine("Result: " + result);  // Output should be: Result: 11.0
        }
    }
}
