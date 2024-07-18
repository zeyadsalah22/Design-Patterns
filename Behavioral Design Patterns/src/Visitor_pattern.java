public class Visitor_pattern {

    // Visitable interface: Department
    public interface Department {
        void accept(Visitor visitor);
    }

    // Visitor interface: Visitor
    public interface Visitor {
        void visitMarketing(Department department);
        void visitTechnical(Department department);
        void visitPR(Department department);
    }

    // Concrete Department: Marketing
    public class Marketing implements Department {
        @Override
        public void accept(Visitor visitor) {
            visitor.visitMarketing(this);
        }
    }

    // Concrete Department: PR
    public class PR implements Department {
        @Override
        public void accept(Visitor visitor) {
            visitor.visitPR(this);
        }
    }

    // Concrete Department: Technical
    public class Technical implements Department {
        @Override
        public void accept(Visitor visitor) {
            visitor.visitTechnical(this);
        }
    }

    // Concrete Visitor: HR
    public class HR implements Visitor {
        @Override
        public void visitMarketing(Department department) {
            System.out.println("Sending performance email to Marketing department");
        }

        @Override
        public void visitTechnical(Department department) {
            System.out.println("Sending performance email to Technical department");
        }

        @Override
        public void visitPR(Department department) {
            System.out.println("Sending performance email to PR department");
        }
    }

    // Main function for testing
    public static void main(String[] args) {
        Visitor_pattern vp = new Visitor_pattern();

        // Create departments
        Department marketing = vp.new Marketing();
        Department pr = vp.new PR();
        Department technical = vp.new Technical();

        // Create HR visitor
        Visitor hr = vp.new HR();

        // HR visits each department
        System.out.println("HR visits Marketing:");
        marketing.accept(hr);

        System.out.println("HR visits PR:");
        pr.accept(hr);

        System.out.println("HR visits Technical:");
        technical.accept(hr);
    }
}
