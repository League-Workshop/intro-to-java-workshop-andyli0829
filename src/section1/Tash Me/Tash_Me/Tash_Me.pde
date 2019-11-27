PImage mustache;PImage face;
void setup() {
  
  face=loadImage("face.jpeg");
size(400,600);
face.resize(400,600);
}


void draw() {
  background(face);


mustache=loadImage("mustachejpg.jpg");
mustache.resize(150,45);
if (mousePressed){
  

image(mustache,mouseX,mouseY);
}
}
