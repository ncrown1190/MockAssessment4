public class Call {
    private int date;
    private String notes;
    
    public int getDate() {
        return date;
    }
    public String getNotes() {
        return notes;
    }

    //constructor
    public Call(int date, String notes) {
        this.date = date;
        this.notes = notes;
    } 
}
