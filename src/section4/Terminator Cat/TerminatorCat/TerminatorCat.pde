int acceleration=5;
int x=249;
int y=248;
PImage catPic;
void setup() {
  
  size(600,600);
 catPic = loadImage("cat.jpeg");
                catPic.resize(600,600);
background(catPic);




}


void draw(){
   if(mousePressed){
println("y+=2");
}
fill(250,50,50);
noStroke();
ellipse(x,y,50,50);
ellipse(x+100,y,50,50);
}



void keyPressed() {
                 x-=2;
y-=2;
}
