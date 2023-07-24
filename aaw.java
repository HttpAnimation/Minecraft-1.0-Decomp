import org.lwjgl.opengl.GL11;

public class aaw extends mg {
  private oe g;
  
  public aaw(x paramx, oe paramoe) {
    super(new eg(paramx, paramoe));
    this.g = paramoe;
  }
  
  protected void c() {
    this.q.b("Furnace", 60, 6, 4210752);
    this.q.b("Inventory", 8, this.c - 96 + 2, 4210752);
  }
  
  protected void a(float paramFloat, int paramInt1, int paramInt2) {
    int i = this.l.p.b("/gui/furnace.png");
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    this.l.p.b(i);
    int j = (this.m - this.b) / 2;
    int k = (this.n - this.c) / 2;
    b(j, k, 0, 0, this.b, this.c);
    if (this.g.a()) {
      int n = this.g.b(12);
      b(j + 56, k + 36 + 12 - n, 176, 12 - n, 14, n + 2);
    } 
    int m = this.g.a(24);
    b(j + 79, k + 34, 176, 14, m + 1, 16);
  }
}
