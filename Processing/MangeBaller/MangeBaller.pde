ArrayList<Ball> baller = new ArrayList<Ball>();

void setup() {
  size(600, 600);
  for (int i = 0; i < 100; i++) {
    baller.add(new Ball());
  }
}

void draw() {
  background(0);
  for (Ball b : baller) {
    b.process();
  }
}

class Ball {
  float x, y;
  float xSpeed, ySpeed;
  float w;

  Ball() {
    x = 300;
    y = 300;
    xSpeed = random(10);
    ySpeed = random(10);
    w = 50;
  }

  void process() {
    x = x + xSpeed;
    y = y + ySpeed;
    if (x + w/2 > width || x - w/2 < 0) {
      xSpeed = -xSpeed;
    }
    if (y + w/2 > height || y - w/2 < 0) {
      ySpeed = -ySpeed;
    }
    ellipse(x, y, w, w);
  }
}