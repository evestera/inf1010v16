int bigdivider = 25;
int translation = 300;
int divider = bigdivider;
int arrows = 11 * bigdivider;
int ysign = -1;

boolean showRulers = false;
boolean mathStyle = true;

void setup() {
  size(800, 600);
  stroke(0);
  fill(0);
  textSize(20);
}

void draw() {
  if (!mathStyle) {
    if (translation > 0) {
      translation -= 4;
    }
    if (divider != 1) divider = 1;
  } else {
    if (translation < 300) {
      translation += 4;
    } else {
      if (divider != bigdivider) divider = bigdivider;
    }
  }
  
  background(255);
  translate(translation, translation);
  
  line(-1 * arrows, 0, arrows, 0);
  line(0, -1 * arrows, 0, arrows);
  
  line(-1 * arrows,    0, -1 * arrows + 5,    0 + 5);
  line(-1 * arrows,    0, -1 * arrows + 5,    0 - 5);
  line(arrows,    0,  arrows - 5,    0 + 5);
  line(arrows,    0,  arrows - 5,    0 - 5);
  line(   0, -1 * arrows,    0 - 5, -1 * arrows + 5);
  line(   0, -1 * arrows,    0 + 5, -1 * arrows + 5);
  line(   0,  arrows,    0 - 5,  arrows - 5);
  line(   0,  arrows,    0 + 5,  arrows - 5);
  
  for(int i = -10; i <= 10; i++) {
    line(bigdivider*i, 2, bigdivider*i, -2);
    line(2, bigdivider*i, -2, bigdivider*i);
  }
  
  int tmx = (mouseX - translation) / divider * divider;
  int tmy = (mouseY - translation) / divider * divider;
  int dispx = tmx / divider;
  int dispy = tmy / divider * ysign;
  
  if (showRulers) {
    line(0, tmy, tmx, tmy);
    line(0, tmy - 5, 0, tmy + 5);
    line(tmx, tmy - 5, tmx, tmy + 5);
    textAlign(CENTER, TOP);
    text("" + dispx, tmx / 2, tmy + 15);
    
    line(tmx, 0, tmx, tmy);
    line(tmx - 5, 0, tmx + 5, 0);
    line(tmx - 5, tmy, tmx + 5, tmy);
    textAlign(tmx < 0 ? RIGHT : LEFT, CENTER);
    text("  " + dispy + "  ", tmx, tmy / 2);
  }
  
  ellipse(tmx, tmy, 5, 5);
  
  textAlign(CENTER, BOTTOM);
  text("(" + dispx + ", " + dispy + ")",
      tmx + sign(tmx) * 50,
      tmy + sign(tmy) * 30);
  textAlign(CENTER, TOP);
  text("x  y",
      tmx + sign(tmx) * 50,
      tmy + sign(tmy) * 30);
}

void keyPressed() {
  if (key == 'r') {
    showRulers = !showRulers;
  }
  if (key == 'm' || key == 't') {
    mathStyle = !mathStyle;
  }
  if (key == 'y') {
    ysign *= -1;
  }
}

int sign(int n) {
  return n < 0 ? -1 : 1;
}