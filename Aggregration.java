public class Aggregration {
    int id;
    String name;
    Address add;
    

    public Aggregration(int id, String name, Address add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }
     
   
    public void display() {
        System.out.println(id+name+add.getCity());
    }


    public static void main(String[] args) {
        Address add=new Address("Mulugu", "TG");
        Aggregration ag=new Aggregration(1,"Vinay",add);
        ag.display();
    }
    
}
