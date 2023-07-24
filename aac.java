public class aac extends al {
  public acf g;
  
  public acf h;
  
  public acf i;
  
  public acf j;
  
  public acf k;
  
  public acf l;
  
  public acf m;
  
  public aac() {
    this(0.0F);
  }
  
  public aac(float paramFloat) {
    byte b = 4;
    this.g = new acf(this, 0, 0);
    this.g.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, paramFloat);
    this.g.a(0.0F, b, 0.0F);
    this.h = new acf(this, 32, 0);
    this.h.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, paramFloat + 0.5F);
    this.h.a(0.0F, b, 0.0F);
    this.i = new acf(this, 16, 16);
    this.i.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, paramFloat);
    this.i.a(0.0F, b, 0.0F);
    this.j = new acf(this, 0, 16);
    this.j.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
    this.j.a(-2.0F, (12 + b), 4.0F);
    this.k = new acf(this, 0, 16);
    this.k.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
    this.k.a(2.0F, (12 + b), 4.0F);
    this.l = new acf(this, 0, 16);
    this.l.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
    this.l.a(-2.0F, (12 + b), -4.0F);
    this.m = new acf(this, 0, 16);
    this.m.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
    this.m.a(2.0F, (12 + b), -4.0F);
  }
  
  public void a(ia paramia, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
    this.g.a(paramFloat6);
    this.i.a(paramFloat6);
    this.j.a(paramFloat6);
    this.k.a(paramFloat6);
    this.l.a(paramFloat6);
    this.m.a(paramFloat6);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    this.g.g = paramFloat4 / 57.295776F;
    this.g.f = paramFloat5 / 57.295776F;
    this.j.f = me.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
    this.k.f = me.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2;
    this.l.f = me.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2;
    this.m.f = me.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2;
  }
}
