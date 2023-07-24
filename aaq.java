public class aaq extends al {
  private acf[] g;
  
  private acf[] h;
  
  private float[] i = new float[7];
  
  private static final int[][] j = new int[][] { { 3, 2, 2 }, { 4, 3, 2 }, { 6, 4, 3 }, { 3, 3, 3 }, { 2, 2, 3 }, { 2, 1, 2 }, { 1, 1, 2 } };
  
  private static final int[][] k = new int[][] { { 0, 0 }, { 0, 4 }, { 0, 9 }, { 0, 16 }, { 0, 22 }, { 11, 0 }, { 13, 4 } };
  
  public aaq() {
    this.g = new acf[7];
    float f = -3.5F;
    for (byte b = 0; b < this.g.length; b++) {
      this.g[b] = new acf(this, k[b][0], k[b][1]);
      this.g[b].a(j[b][0] * -0.5F, 0.0F, j[b][2] * -0.5F, j[b][0], j[b][1], j[b][2]);
      this.g[b].a(0.0F, (24 - j[b][1]), f);
      this.i[b] = f;
      if (b < this.g.length - 1)
        f += (j[b][2] + j[b + 1][2]) * 0.5F; 
    } 
    this.h = new acf[3];
    this.h[0] = new acf(this, 20, 0);
    this.h[0].a(-5.0F, 0.0F, j[2][2] * -0.5F, 10, 8, j[2][2]);
    this.h[0].a(0.0F, 16.0F, this.i[2]);
    this.h[1] = new acf(this, 20, 11);
    this.h[1].a(-3.0F, 0.0F, j[4][2] * -0.5F, 6, 4, j[4][2]);
    this.h[1].a(0.0F, 20.0F, this.i[4]);
    this.h[2] = new acf(this, 20, 18);
    this.h[2].a(-3.0F, 0.0F, j[4][2] * -0.5F, 6, 5, j[1][2]);
    this.h[2].a(0.0F, 19.0F, this.i[1]);
  }
  
  public int a() {
    return 38;
  }
  
  public void a(ia paramia, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
    byte b;
    for (b = 0; b < this.g.length; b++)
      this.g[b].a(paramFloat6); 
    for (b = 0; b < this.h.length; b++)
      this.h[b].a(paramFloat6); 
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    for (byte b = 0; b < this.g.length; b++) {
      (this.g[b]).g = me.b(paramFloat3 * 0.9F + b * 0.15F * 3.1415927F) * 3.1415927F * 0.05F * (1 + Math.abs(b - 2));
      (this.g[b]).c = me.a(paramFloat3 * 0.9F + b * 0.15F * 3.1415927F) * 3.1415927F * 0.2F * Math.abs(b - 2);
    } 
    (this.h[0]).g = (this.g[2]).g;
    (this.h[1]).g = (this.g[4]).g;
    (this.h[1]).c = (this.g[4]).c;
    (this.h[2]).g = (this.g[1]).g;
    (this.h[2]).c = (this.g[1]).c;
  }
}
