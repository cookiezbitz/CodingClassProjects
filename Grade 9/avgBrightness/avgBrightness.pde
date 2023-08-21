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
  for (int j = 0; j < boxes; j++) {
    for (int i = 0; i < boxes; i++) {
      int startnum = (i*bw)+(bw*bw*boxes*j);
      float circleb = avgb(startnum);
      fill(circleb);
      int y = startnum / (bw*boxes);
      int x = startnum % (bw*boxes);
      println(x + " " + y);
      ellipse(x, y, bw, bw);
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

float avgc(int startIndex) {
  float rsum = 0;
  float gsum = 0;
  float bsum = 0;
  for (int j = 0; j < bw; j++) {
    for (int i = 0; i < bw; i++) {
      int index = (j*bw*boxes)+i+startIndex;
      //print(index + " ");
      color c = pic.pixels[index];
      float r = red(c);
      float g = green(c);
      float b = blue(c);

      rsum += r;
      gsum += g;
      bsum += b;
    }
  }
  float totalavg = sum / (bw*bw);
  println(totalavg);
  return totalavg;
}
