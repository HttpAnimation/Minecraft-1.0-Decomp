import java.util.Random;
import org.lwjgl.opengl.GL11;

public class aae extends acq {
  private ta a;
  
  private Random b = new Random();
  
  public aae() {
    super(new ta(), 0.5F);
    this.a = (ta)this.g;
    a(this.a);
  }
  
  public void a(aii paramaii, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    this.a.t = (paramaii.ay() > 0);
    this.a.u = paramaii.b;
    if (paramaii.b) {
      double d = 0.02D;
      paramDouble1 += this.b.nextGaussian() * d;
      paramDouble3 += this.b.nextGaussian() * d;
    } 
    super.a(paramaii, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void a(aii paramaii, float paramFloat) {
    super.b(paramaii, paramFloat);
    if (paramaii.ay() > 0) {
      GL11.glEnable(32826);
      GL11.glPushMatrix();
      float f = 0.5F;
      GL11.glTranslatef(0.0F, 0.6875F, -0.75F);
      f *= 1.0F;
      GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
      GL11.glScalef(f, -f, f);
      int i = paramaii.a(paramFloat);
      int j = i % 65536;
      int k = i / 65536;
      adx.a(adx.b, j / 1.0F, k / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      a("/terrain.png");
      this.d.a(yy.k[paramaii.ay()], paramaii.aD(), 1.0F);
      GL11.glPopMatrix();
      GL11.glDisable(32826);
    } 
  }
  
  protected int a(aii paramaii, int paramInt, float paramFloat) {
    if (paramInt != 0)
      return -1; 
    a("/mob/enderman_eyes.png");
    float f = 1.0F;
    GL11.glEnable(3042);
    GL11.glDisable(3008);
    GL11.glBlendFunc(1, 1);
    GL11.glDisable(2896);
    char c = ';
    int i = c % 65536;
    int j = c / 65536;
    adx.a(adx.b, i / 1.0F, j / 1.0F);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glEnable(2896);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, f);
    return 1;
  }
}
