PImage ship;
PImage bullet;
Player p;
ArrayList<Bullets> magazine = new ArrayList<Bullets>();


void setup() {
  size(1200, 800);
  ship = loadImage("test3.png");
  ship.resize(100, 0);
  bullet = loadImage("naner2.png");
  imageMode(CENTER);
  p = new Player();
}

void draw() {
  background(0);
  p.display();
  p.update();

}



void keyPressed() {
  if (key == 'w') {
    p.forward();
  }
  if (key == 's') {
    p.backward();
  }
  if (key == 'd') {
    p.angle += 15;
    p.thrust.rotate(radians(15));
  }
  if (key == 'a') {
    p.angle -= 15;
    p.thrust.rotate(radians(-15));
  }
  if(key == ' '){
    p.shootBullet();
    println(2);
  }
}
