import java.util.ArrayList;

public class SalesPerson {

    private String name;
    private String company;
    private ArrayList<Customer> customers;
    
    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }

    //constructor
    public SalesPerson(String name, String company) {
        this.name = name;
        this.company = company;
        this.customers = new ArrayList<>();
    }

//Methods
public void addCustomer(Customer customer){
    customers.add(customer);
}   

public Customer getNextCustomerToCall(){
    Customer nextCustomer = null;
    int oldestCallDate = Integer.MAX_VALUE;
    //int oldestCallDate = Integer.MIN_VALUE;

    for(Customer customer: customers){
        Call lastCall = customer.getLastCall();
        if(lastCall != null && lastCall.getDate() < oldestCallDate){
            oldestCallDate = lastCall.getDate();
            nextCustomer = customer;
        }
    }
        return nextCustomer;
    }
}
