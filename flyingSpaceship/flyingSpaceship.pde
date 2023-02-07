PImage ship;
PImage bullet;
Player p;

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
  image(bullet,mouseX,mouseY);
}

class Player {
  PVector position;
  PVector velocity;
  PVector thrust;
  float angle;

  Player() {
    position = new PVector(400, 300);
    velocity = new PVector(0, 0);
    thrust = new PVector(0, -3);
    angle = 0;
  }

  void display() {
    pushMatrix();
    translate(position.x, position.y);
    rotate(radians(angle));
    image(ship, 0, 0);
    popMatrix();
  }

  void update() {
    position.add(velocity);
    velocity.mult(0.99);
    velocity.limit(20);
    if(position.x > width + 50){
      position.x = -50;
    }
    if(position.x < -50){
      position.x = width + 50;
    }
    if(position.y > height + 50){
      position.y = -50;
    }
    if(position.y < -50){
      position.y = height + 50;
    }
  }

  void forward() {
    velocity.add(thrust);
  }
  void backward() {
    velocity.sub(thrust);
  }
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
}
