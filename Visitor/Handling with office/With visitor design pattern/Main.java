// Client code
public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager();
        Employee developer = new Developer();
        
        EmployeeVisitor vacationDaysCalculator = new VacationDaysCalculator();
        
        manager.accept(vacationDaysCalculator);
        developer.accept(vacationDaysCalculator);
    }
}