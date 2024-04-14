public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager();
        Employee developer = new Developer();
        
        System.out.println("Manager vacation days: " + manager.getVacationDays());
        System.out.println("Developer vacation days: " + developer.getVacationDays());
    }
}