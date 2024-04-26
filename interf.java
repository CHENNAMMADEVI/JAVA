interface vehicle {
void changegear(int a);
void speedup(int a);
void applybreakes(int a);
}
class bicycle implements vehicle{
int speed;
int gear;

@Override
public void changegear(int newgear){
gear=newgear;
}

@Override
public void speedup(int increment){
speed=speed+increment;
}

@Override
public void applybreakes(int decrement){
speed=speed-decrement;
}

public void printstates(){
System.out.println("speed:"+speed+"gear:"+gear);
}}

class bike implements vehicle{
int speed;
int gear;

@Override
public void changegear(int newgear){
gear=newgear;
}

@Override
public void speedup(int increment){
speed=speed+increment;
}

@Override
public void applybreakes(int decrement){
speed=speed-decrement;
}

public void printstates(){
System.out.println("speed:"+speed+"gear:"+gear);
}}

class interf{
public static void main (String args[]){

bicycle bicycle= new bicycle();
bicycle.changegear(2);
bicycle.speedup(3);
bicycle.applybreakes(1);

System.out.println("bicycle presentstate:");
bicycle.printstates();

bike bike= new bike();
bike.changegear(2);
bike.speedup(3);
bike.applybreakes(1);

System.out.println("bike presentstate:");
bike.printstates();
}}







