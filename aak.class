import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;

public class aak {
  private int a;
  
  private int b;
  
  private int c;
  
  private double d;
  
  private double e;
  
  private double f;
  
  private IntBuffer g = bt.d(65536);
  
  private boolean h = false;
  
  private boolean i = false;
  
  public void a(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, double paramDouble3) {
    this.h = true;
    this.g.clear();
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramDouble1;
    this.e = paramDouble2;
    this.f = paramDouble3;
  }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3) {
    if (!this.h)
      return false; 
    return (paramInt1 == this.a && paramInt2 == this.b && paramInt3 == this.c);
  }
  
  public void a(int paramInt) {
    this.g.put(paramInt);
    if (this.g.remaining() == 0)
      a(); 
  }
  
  public void a() {
    if (!this.h)
      return; 
    if (!this.i) {
      this.g.flip();
      this.i = true;
    } 
    if (this.g.remaining() > 0) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.a - this.d), (float)(this.b - this.e), (float)(this.c - this.f));
      GL11.glCallLists(this.g);
      GL11.glPopMatrix();
    } 
  }
  
  public void b() {
    this.h = false;
    this.i = false;
  }
}
