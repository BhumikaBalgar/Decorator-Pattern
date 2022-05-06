class PizzaStore
{
public static void main(String args[])
{
Pizza FarmHouse=new FarmHouse();
Toppings Paneer=new Paneer(FarmHouse);

System.out.println("Total cost of Pizza is "+Paneer.cost());

}
}