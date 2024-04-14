class Developer implements Employee {
    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}