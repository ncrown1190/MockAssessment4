public class App {
    public static void main(String[] args) throws Exception {
        //Create a new instance of Sales Person
        SalesPerson fred = new SalesPerson("Fred", "Grand Circus Auto Sales");

        //Create a new instance of customer and add call
        Customer jane = new Customer("Jane Vasquez", "555-5678");
        jane.addCall(20240601, "A schedule visit for tomorrow.");
        fred.addCustomer(jane);

        Customer jamal = new Customer("Jamal Smith", "555-1234");
        jamal.addCall(20240701, "Left phone message.");
        fred.addCustomer(jamal);

        Customer bob = new Customer("Bob Johnson", "555-9012");
        bob.addCall(20240709, "Might be intrested soon.");
        fred.addCustomer(bob);

        Customer alice = new Customer("Alice Williams", "555-3456");
        alice.addCall(20240501, "Intrested in purchasing.");
        fred.addCustomer(alice);

        Customer tom = new Customer("Tom Davis", "555-7890");
        tom.addCall(20240106, "Purchased a vehicle");
        fred.addCustomer(tom);

        Customer emily = new Customer("Emily Wilson", "555-2345");
        emily.addCall(20240312, "Scheduled product demo.");
        fred.addCustomer(emily);

        Customer next = fred.getNextCustomerToCall(); 
        if (next != null) { 
            printCustomerInfo(fred, next);
            next.addCall(20240801, "Interested in an extended warranty");
         } 
         
         next = fred.getNextCustomerToCall(); 
         if (next != null) {              
            printCustomerInfo(fred, next);            
            next.addCall(20240802, "Needs repair work");
        } 
        
        next = fred.getNextCustomerToCall(); 
        if (next != null) {
            printCustomerInfo(fred, next);
        } 

        // jane.printCallDetails();
        // jamal.printCallDetails();
    }

    private static void printCustomerInfo(SalesPerson salesPerson, Customer customer){
        if(customer != null){
            System.out.println("Hello " + salesPerson.getName() + " of " + salesPerson.getCompany() + ". Here is your next call.");
            System.out.println("Customer Name: " + customer.getName());
            System.out.println("Customer Phone: " + customer.getTelephone());
        }
    }
}
