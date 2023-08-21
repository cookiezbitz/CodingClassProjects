class Bullets {
  PVector position;
  PVector velocity;

  float angle;

  Bullets(PVector sp, PVector sv, float sa) {
    position = new PVector(sp.x,sp.y);
    velocity = new PVector(sv.x,sv.y);
    PVector startvel = new PVector(0,-5);
    angle = sa;
    startvel.rotate(radians(angle));
    velocity.add(startvel);

  }

  void display() {
    pushMatrix();
    translate(position.x, position.y);
    rotate(radians(angle));
    image(bullet, 0, 0);
    popMatrix();
    
    
    
  }

  void update() {
    position.add(velocity);

  }
}
