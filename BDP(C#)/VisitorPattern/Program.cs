namespace VisitorPattern
{

    // Visitable interface
    public interface Department {
        public void Accept(Visitor visitor);
    }

    // Visitor interface
    public interface Visitor
    {
        public void VisitMarketing(Department department);
        public void VisitTechnical(Department department);
        public void VisitPR(Department department);
    }

    // Concrete department: Marketing
    public class Marketing : Department
    {
        public void Accept(Visitor visitor)
        {
            visitor.VisitMarketing(this);
        }
    }

    // Concrete department: Technical
    public class Technical : Department {
        public void Accept(Visitor visitor)
        {
            visitor.VisitTechnical(this);
        }
    }

    // Concrete department: PR
    public class PR : Department {
        public void Accept(Visitor visitor)
        {
            visitor.VisitPR(this);
        }
    }

    // Concrete visitor: HR
    public class HR : Visitor
    {
        public void VisitMarketing(Department department)
        {
            Console.WriteLine("Sending performance email to Marketing department");
        }
        public void VisitTechnical(Department department)
        {
            Console.WriteLine("Sending performance email to Technical department");
        }
        public void VisitPR(Department department)
        {
            Console.WriteLine("Sending performance email to PR department");
        }
    }
    internal class Program
    {
        // Main function for testing
        static void Main(string[] args)
        {
            // Create departments
            Department marketing = new Marketing();
            Department pr = new PR();
            Department technical = new Technical();

            // Create HR visitor
            Visitor hr = new HR();

            // HR visits each department
            Console.WriteLine("HR visits Marketing:");
            marketing.Accept(hr);

            Console.WriteLine("HR visits PR:");
            pr.Accept(hr);

            Console.WriteLine("HR visits Technical:");
            technical.Accept(hr);
        }
    }
}
