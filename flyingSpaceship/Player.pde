
class Player {
  PVector position;
  PVector velocity;
  PVector thrust;
  float angle;
  Bullets b;
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

    for (Bullets b : magazine) {
      b.display();
      b.update();
    }
  }

  void update() {
    position.add(velocity);
    velocity.mult(0.99);
    velocity.limit(20);
    if (position.x > width + 50) {
      position.x = -50;
    }
    if (position.x < -50) {
      position.x = width + 50;
    }
    if (position.y > height + 50) {
      position.y = -50;
    }
    if (position.y < -50) {
      position.y = height + 50;
    }
  }

  void shootBullet() {
    magazine.add(new Bullets(position, velocity, angle));
  }

  void forward() {
    velocity.add(thrust);
  }
  void backward() {
    velocity.sub(thrust);
  }
}
