// Concrete employees
class Manager implements Employee {
    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}