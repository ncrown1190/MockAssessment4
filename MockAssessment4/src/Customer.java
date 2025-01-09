import java.util.ArrayList;

public class Customer {

    private String name;
    private String telephone;
    private ArrayList<Call> calls;
    
    public String getName() {
        return name;
    }
    public String getTelephone() {
        return telephone;
    }

    //constructor
    public Customer(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
        this.calls = new ArrayList<>(); //Initialize calls to a new empty ArrayList
    }

    //Methods
    public void addCall(int date, String notes){
        Call newcall = new Call(date, notes);
        calls.add(newcall);
    }

    public Call getLastCall(){
        if(calls.isEmpty()){
            return null;
        }
        return calls.get(calls.size()-1);
    }

    public void printCallDetails(){
        System.out.println("Call details for " + name + ":");
        for(Call call: calls){
            System.out.println("Date: " + call.getDate());
            System.out.println("Notes: " + call.getNotes());
        }
    }
}
