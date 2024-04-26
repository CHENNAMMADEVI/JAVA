class Animal{
void makesound(){
System.out.println("Animal making a sound");
}}
 class dog extends Animal{
void makesound(){
System.out.println("Animal making a sound");
}}
 class cat extends Animal{
void makesound(){
System.out.println("Animal making a sound");
}}
 class elephant extends Animal{
void makesound(){
System.out.println("Animal making a sound");
}}

class poly{
public static void main(String args[]){
Animal animal;

animal=new dog();
animal.makesound();

animal=new cat();
animal.makesound();

animal=new elephant();
animal.makesound();
}}
