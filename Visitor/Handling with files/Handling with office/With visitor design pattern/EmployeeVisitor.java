// Visitor interface
interface EmployeeVisitor {
    void visit(Manager manager);
    void visit(Developer developer);
}