 class Paneer extends Toppings
{
    Pizza c;
Paneer(Pizza c)
{
this.c=c;
}
 public String getDescription()
{
return (c.getDescription()+"with Paneer");
}
double cost()
{
double PizzaCost=c.cost();
return(PizzaCost+60);
}
}