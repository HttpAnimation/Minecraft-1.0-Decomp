import java.nio.FloatBuffer;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class abi extends du {
  public void a(yg paramyg, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    float f1 = (float)this.a.j;
    float f2 = (float)this.a.k;
    float f3 = (float)this.a.l;
    GL11.glDisable(2896);
    Random random = new Random(31100L);
    float f4 = 0.75F;
    for (byte b = 0; b < 16; b++) {
      GL11.glPushMatrix();
      float f5 = (16 - b);
      float f6 = 0.0625F;
      float f7 = 1.0F / (f5 + 1.0F);
      if (b == 0) {
        a("/misc/tunnel.png");
        f7 = 0.1F;
        f5 = 65.0F;
        f6 = 0.125F;
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
      } 
      if (b == 1) {
        a("/misc/particlefield.png");
        GL11.glEnable(3042);
        GL11.glBlendFunc(1, 1);
        f6 = 0.5F;
      } 
      float f8 = (float)-(paramDouble2 + f4);
      float f9 = f8 + abz.b;
      float f10 = f8 + f5 + abz.b;
      float f11 = f9 / f10;
      f11 = (float)(paramDouble2 + f4) + f11;
      GL11.glTranslatef(f1, f11, f3);
      GL11.glTexGeni(8192, 9472, 9217);
      GL11.glTexGeni(8193, 9472, 9217);
      GL11.glTexGeni(8194, 9472, 9217);
      GL11.glTexGeni(8195, 9472, 9216);
      GL11.glTexGen(8192, 9473, a(1.0F, 0.0F, 0.0F, 0.0F));
      GL11.glTexGen(8193, 9473, a(0.0F, 0.0F, 1.0F, 0.0F));
      GL11.glTexGen(8194, 9473, a(0.0F, 0.0F, 0.0F, 1.0F));
      GL11.glTexGen(8195, 9474, a(0.0F, 1.0F, 0.0F, 0.0F));
      GL11.glEnable(3168);
      GL11.glEnable(3169);
      GL11.glEnable(3170);
      GL11.glEnable(3171);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5890);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, (float)(System.currentTimeMillis() % 700000L) / 700000.0F, 0.0F);
      GL11.glScalef(f6, f6, f6);
      GL11.glTranslatef(0.5F, 0.5F, 0.0F);
      GL11.glRotatef((b * b * 4321 + b * 9) * 2.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(-0.5F, -0.5F, 0.0F);
      GL11.glTranslatef(-f1, -f3, -f2);
      f9 = f8 + abz.b;
      GL11.glTranslatef(abz.a * f5 / f9, abz.c * f5 / f9, -f2);
      cv cv = cv.a;
      cv.b();
      f11 = random.nextFloat() * 0.5F + 0.1F;
      float f12 = random.nextFloat() * 0.5F + 0.4F;
      float f13 = random.nextFloat() * 0.5F + 0.5F;
      if (b == 0)
        f11 = f12 = f13 = 1.0F; 
      cv.a(f11 * f7, f12 * f7, f13 * f7, 1.0F);
      cv.a(paramDouble1, paramDouble2 + f4, paramDouble3);
      cv.a(paramDouble1, paramDouble2 + f4, paramDouble3 + 1.0D);
      cv.a(paramDouble1 + 1.0D, paramDouble2 + f4, paramDouble3 + 1.0D);
      cv.a(paramDouble1 + 1.0D, paramDouble2 + f4, paramDouble3);
      cv.a();
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
    } 
    GL11.glDisable(3042);
    GL11.glDisable(3168);
    GL11.glDisable(3169);
    GL11.glDisable(3170);
    GL11.glDisable(3171);
    GL11.glEnable(2896);
  }
  
  FloatBuffer b = bt.e(16);
  
  private FloatBuffer a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.b.clear();
    this.b.put(paramFloat1).put(paramFloat2).put(paramFloat3).put(paramFloat4);
    this.b.flip();
    return this.b;
  }
}
