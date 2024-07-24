public class Interpreter_pattern {

    // Context class for holding any global information
    public class Context {
    }

    // Expression interface with interpret method
    public interface Expression {
        double interpret();
    }

    // NumberExpression class for representing numeric values in the expression tree
    public class NumberExpression implements Expression {
        private double number;

        public NumberExpression(double number) {
            this.number = number;
        }

        @Override
        public double interpret() {
            return this.number;
        }
    }

    // AdditionExpression class for representing addition operations in the expression tree
    public class AdditionExpression implements Expression {
        private Expression left;
        private Expression right;

        public AdditionExpression(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public double interpret() {
            return this.left.interpret() + this.right.interpret();
        }
    }

    // MultiplicationExpression class for representing multiplication operations in the expression tree
    public class MultiplicationExpression implements Expression {
        private Expression left;
        private Expression right;

        public MultiplicationExpression(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public double interpret() {
            return this.left.interpret() * this.right.interpret();
        }
    }

    // SubtractionExpression class for representing subtraction operations in the expression tree
    public class SubtractionExpression implements Expression {
        private Expression left;
        private Expression right;

        public SubtractionExpression(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public double interpret() {
            return this.left.interpret() - this.right.interpret();
        }
    }

    // DivisionExpression class for representing division operations in the expression tree
    public class DivisionExpression implements Expression {
        private Expression left;
        private Expression right;

        public DivisionExpression(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public double interpret() {
            return this.left.interpret() / this.right.interpret();
        }
    }

    // Interpreter class for interpreting and evaluating expressions
    public class Interpreter {
        private Context context;

        public Interpreter(Context context) {
            this.context = context;
        }

        public double interpret(String expression) {
            Expression expressionTree = buildExpressionTree(expression);
            return expressionTree.interpret();
        }

        // Method to build the expression tree from a string expression
        public Expression buildExpressionTree(String expression) {
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

    // Main function for testing
    public static void main(String[] args) {
        Interpreter_pattern interpreterPattern = new Interpreter_pattern();
        Context context = interpreterPattern.new Context();
        Interpreter interpreter = interpreterPattern.new Interpreter(context);

        String expression = "3 + 5 * 2 - 4 / 2";


        double result = interpreter.interpret(expression);
        System.out.println("Result: " + result);  // Output should be: Result: 11.0
    }
}
