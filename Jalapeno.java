class Jalapeno extends Toppings
{
Pizza c;
Jalapeno(Pizza c)
{
this.c=c;
}
public String getDescription()
{
return (c.getDescription()+"with Jalapeno");
}
double cost()
{
double PizzaCost=c.cost();
return(PizzaCost+80);
}
}