package 实验5;
 class Fan {
     final static int SLOW=1;
     final static int MEDIUM=2;
     final static int FAST=3;
     int speed=SLOW;
     boolean on=false;
     double radius=5;
     String color="blue";

     public Fan()
     {
     }

     public double getRadius() {
         return radius;
     }

     public int getSpeed() {
         return speed;
     }

     public boolean isOn() {
         return on;
     }

     public String getColor() {
         return color;
     }

     public boolean getOn(){
         return on;
     }

     public void setOn(boolean on) {
         this.on = on;
     }

     public void setSpeed(int speed) {
         this.speed = speed;
     }

     public void setRadius(double radius) {
         this.radius = radius;
     }

     public void setColor(String color) {
         this.color = color;
     }
     public String toString()
     {
         String a;
         if(on==false)
         {
            a="fan is off"+"  颜色为"+this.color+"半径为"+this.radius;
         }
         else
         {
             String b="SLOW";
             switch(this.speed)
             {
                 case 1:b="SLOW";break;
                 case 2:b="MEDIUM";break;
                 case 3:b="FAST";break;
             }
             a="速度为"+b+"  颜色为"+color+"半径为"+this.radius;
         }
         return a;
     }
 }
