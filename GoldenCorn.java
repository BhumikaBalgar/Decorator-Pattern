class GoldenCorn extends Toppings
{
Pizza c;
GoldenCorn(Pizza c)
{
this.c=c;
}
public String getDescription()
{
return (c.getDescription()+"with GoldenCorn");
}
double cost()
{
double PizzaCost=c.cost();
return(PizzaCost+50);
}
}