PImage pic;
int bw = 10;
int boxes;


void setup() {
  //fullScreen();
  size(1000, 1000);
  pic = loadImage("amongus.jpg");
  pic.resize(1000, 1000);
  pic.loadPixels();
  //image(pic, 0, 0);
  boxes = pic.width / bw;
  println(boxes);
  ellipseMode(CORNER);
  noStroke();
  background(0);
  for(int j = 0; j < boxes; j++){
   for(int i = 0; i < boxes; i++){
     int startnum = (i*bw)+(bw*bw*boxes*j);
     float circleb = avgb(startnum);
     fill(circleb);
     int y = startnum / (bw*boxes);
     int x = startnum % (bw*boxes);
     println(x + " " + y);
     float angle = map(circleb, 0, 255, 0, 180);
     PVector p = new PVector(0, -1);
     p.rotate(radians(angle));
     float l = map(circleb, 0, 255, 10, 50);
     p.setMag(l);
     color newc = avgc(startnum);
     stroke(newc);
     strokeWeight(3);
     line(x, y, x+p.x, y+p.y);
     //ellipse(x, y, bw, bw);
   }
  }
  print();
}

void draw() {
  //background(50); 

  //println();
}

float avgb(int startIndex) {
  float sum = 0;
  for (int j = 0; j < bw; j++) {
    for (int i = 0; i < bw; i++) {
      int index = (j*bw*boxes)+i+startIndex;
      //print(index + " ");
      color c = pic.pixels[index];
      float r = red(c);
      float g = green(c);
      float b = blue(c);
      float avg = (0.375*r) + (0.5*g) + (0.125*b);
      sum += avg;
    }
  }
  float totalavg = sum / (bw*bw);
  println(totalavg);
  return totalavg;
  
  
}

color avgc(int startIndex) {
  float sum = 0;
  for (int j = 0; j < bw; j++) {
    for (int i = 0; i < bw; i++) {
      int index = (j*bw*boxes)+i+startIndex;
      //print(index + " ");
      color c = pic.pixels[index];
      float r = red(c);
      float g = green(c);
      float b = blue(c);
      float avg = (0.375*r) + (0.5*g) + (0.125*b);
      sum += avg;
      
    }
  }
  
 // color avgc = 
  float totalavg = sum / (bw*bw);
  println(totalavg);
 // return avgc;
  
  
}
