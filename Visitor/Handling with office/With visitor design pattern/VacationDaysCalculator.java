// Concrete visitor implementing vacation days calculation
class VacationDaysCalculator implements EmployeeVisitor {
    @Override
    public void visit(Manager manager) {
        System.out.println("Manager vacation days: 20");
    }
    
    @Override
    public void visit(Developer developer) {
        System.out.println("Developer vacation days: 15");
    }
}