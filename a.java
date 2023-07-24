import java.util.List;
import java.util.Random;

public class a implements ej {
  private Random i;
  
  private eb j;
  
  private eb k;
  
  private eb l;
  
  public eb a;
  
  public eb b;
  
  private ry m;
  
  private double[] n;
  
  private sr[] o;
  
  double[] c;
  
  double[] d;
  
  double[] e;
  
  double[] f;
  
  double[] g;
  
  int[][] h;
  
  public a(ry paramry, long paramLong) {
    this.h = new int[32][32];
    this.m = paramry;
    this.i = new Random(paramLong);
    this.j = new eb(this.i, 16);
    this.k = new eb(this.i, 16);
    this.l = new eb(this.i, 8);
    this.a = new eb(this.i, 10);
    this.b = new eb(this.i, 16);
  }
  
  public void a(int paramInt1, int paramInt2, byte[] paramArrayOfbyte, sr[] paramArrayOfsr) {
    byte b1 = 2;
    int i = b1 + 1;
    int j = this.m.c / 4 + 1;
    int k = b1 + 1;
    this.n = a(this.n, paramInt1 * b1, 0, paramInt2 * b1, i, j, k);
    for (byte b2 = 0; b2 < b1; b2++) {
      for (byte b = 0; b < b1; b++) {
        for (byte b3 = 0; b3 < this.m.c / 4; b3++) {
          double d1 = 0.25D;
          double d2 = this.n[((b2 + 0) * k + b + 0) * j + b3 + 0];
          double d3 = this.n[((b2 + 0) * k + b + 1) * j + b3 + 0];
          double d4 = this.n[((b2 + 1) * k + b + 0) * j + b3 + 0];
          double d5 = this.n[((b2 + 1) * k + b + 1) * j + b3 + 0];
          double d6 = (this.n[((b2 + 0) * k + b + 0) * j + b3 + 1] - d2) * d1;
          double d7 = (this.n[((b2 + 0) * k + b + 1) * j + b3 + 1] - d3) * d1;
          double d8 = (this.n[((b2 + 1) * k + b + 0) * j + b3 + 1] - d4) * d1;
          double d9 = (this.n[((b2 + 1) * k + b + 1) * j + b3 + 1] - d5) * d1;
          for (byte b4 = 0; b4 < 4; b4++) {
            double d10 = 0.125D;
            double d11 = d2;
            double d12 = d3;
            double d13 = (d4 - d2) * d10;
            double d14 = (d5 - d3) * d10;
            for (byte b5 = 0; b5 < 8; b5++) {
              int m = b5 + b2 * 8 << this.m.b | 0 + b * 8 << this.m.a | b3 * 4 + b4;
              int n = 1 << this.m.a;
              double d15 = 0.125D;
              double d16 = d11;
              double d17 = (d12 - d11) * d15;
              for (byte b6 = 0; b6 < 8; b6++) {
                int i1 = 0;
                if (d16 > 0.0D)
                  i1 = yy.bJ.bM; 
                paramArrayOfbyte[m] = (byte)i1;
                m += n;
                d16 += d17;
              } 
              d11 += d13;
              d12 += d14;
            } 
            d2 += d6;
            d3 += d7;
            d4 += d8;
            d5 += d9;
          } 
        } 
      } 
    } 
  }
  
  public void b(int paramInt1, int paramInt2, byte[] paramArrayOfbyte, sr[] paramArrayOfsr) {
    for (byte b = 0; b < 16; b++) {
      for (byte b1 = 0; b1 < 16; b1++) {
        boolean bool = true;
        byte b2 = -1;
        byte b3 = (byte)yy.bJ.bM;
        byte b4 = (byte)yy.bJ.bM;
        for (int i = this.m.d; i >= 0; i--) {
          int j = (b1 * 16 + b) * this.m.c + i;
          byte b5 = paramArrayOfbyte[j];
          if (b5 == 0) {
            b2 = -1;
          } else if (b5 == yy.t.bM) {
            if (b2 == -1) {
              if (bool) {
                b3 = 0;
                b4 = (byte)yy.bJ.bM;
              } 
              b2 = bool;
              if (i >= 0) {
                paramArrayOfbyte[j] = b3;
              } else {
                paramArrayOfbyte[j] = b4;
              } 
            } else if (b2 > 0) {
              b2--;
              paramArrayOfbyte[j] = b4;
            } 
          } 
        } 
      } 
    } 
  }
  
  public zx a(int paramInt1, int paramInt2) {
    return b(paramInt1, paramInt2);
  }
  
  public zx b(int paramInt1, int paramInt2) {
    this.i.setSeed(paramInt1 * 341873128712L + paramInt2 * 132897987541L);
    byte[] arrayOfByte = new byte[16 * this.m.c * 16];
    zx zx = new zx(this.m, arrayOfByte, paramInt1, paramInt2);
    this.o = this.m.a().a(this.o, paramInt1 * 16, paramInt2 * 16, 16, 16);
    a(paramInt1, paramInt2, arrayOfByte, this.o);
    b(paramInt1, paramInt2, arrayOfByte, this.o);
    zx.c();
    return zx;
  }
  
  private double[] a(double[] paramArrayOfdouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramArrayOfdouble == null)
      paramArrayOfdouble = new double[paramInt4 * paramInt5 * paramInt6]; 
    double d1 = 684.412D;
    double d2 = 684.412D;
    this.f = this.a.a(this.f, paramInt1, paramInt3, paramInt4, paramInt6, 1.121D, 1.121D, 0.5D);
    this.g = this.b.a(this.g, paramInt1, paramInt3, paramInt4, paramInt6, 200.0D, 200.0D, 0.5D);
    d1 *= 2.0D;
    this.c = this.l.a(this.c, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1 / 80.0D, d2 / 160.0D, d1 / 80.0D);
    this.d = this.j.a(this.d, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
    this.e = this.k.a(this.e, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
    byte b1 = 0;
    byte b2 = 0;
    for (byte b3 = 0; b3 < paramInt4; b3++) {
      for (byte b = 0; b < paramInt6; b++) {
        double d3 = (this.f[b2] + 256.0D) / 512.0D;
        if (d3 > 1.0D)
          d3 = 1.0D; 
        double d4 = this.g[b2] / 8000.0D;
        if (d4 < 0.0D)
          d4 = -d4 * 0.3D; 
        d4 = d4 * 3.0D - 2.0D;
        float f1 = (b3 + paramInt1 - 0) / 1.0F;
        float f2 = (b + paramInt3 - 0) / 1.0F;
        float f3 = 100.0F - me.c(f1 * f1 + f2 * f2) * 8.0F;
        if (f3 > 80.0F)
          f3 = 80.0F; 
        if (f3 < -100.0F)
          f3 = -100.0F; 
        if (d4 > 1.0D)
          d4 = 1.0D; 
        d4 /= 8.0D;
        d4 = 0.0D;
        if (d3 < 0.0D)
          d3 = 0.0D; 
        d3 += 0.5D;
        d4 = d4 * paramInt5 / 16.0D;
        b2++;
        double d5 = paramInt5 / 2.0D;
        for (byte b4 = 0; b4 < paramInt5; b4++) {
          double d6 = 0.0D;
          double d7 = (b4 - d5) * 8.0D / d3;
          if (d7 < 0.0D)
            d7 *= -1.0D; 
          double d8 = this.d[b1] / 512.0D;
          double d9 = this.e[b1] / 512.0D;
          double d10 = (this.c[b1] / 10.0D + 1.0D) / 2.0D;
          if (d10 < 0.0D) {
            d6 = d8;
          } else if (d10 > 1.0D) {
            d6 = d9;
          } else {
            d6 = d8 + (d9 - d8) * d10;
          } 
          d6 -= 8.0D;
          d6 += f3;
          byte b5 = 2;
          if (b4 > paramInt5 / 2 - b5) {
            double d = ((b4 - paramInt5 / 2 - b5) / 64.0F);
            if (d < 0.0D)
              d = 0.0D; 
            if (d > 1.0D)
              d = 1.0D; 
            d6 = d6 * (1.0D - d) + -3000.0D * d;
          } 
          b5 = 8;
          if (b4 < b5) {
            double d = ((b5 - b4) / (b5 - 1.0F));
            d6 = d6 * (1.0D - d) + -30.0D * d;
          } 
          paramArrayOfdouble[b1] = d6;
          b1++;
        } 
      } 
    } 
    return paramArrayOfdouble;
  }
  
  public boolean c(int paramInt1, int paramInt2) {
    return true;
  }
  
  public void a(ej paramej, int paramInt1, int paramInt2) {
    cj.a = true;
    int i = paramInt1 * 16;
    int j = paramInt2 * 16;
    sr sr1 = this.m.a().a(i + 16, j + 16);
    sr1.a(this.m, this.m.w, i, j);
    cj.a = false;
  }
  
  public boolean a(boolean paramBoolean, rz paramrz) {
    return true;
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean b() {
    return true;
  }
  
  public String c() {
    return "RandomLevelSource";
  }
  
  public List a(jf paramjf, int paramInt1, int paramInt2, int paramInt3) {
    vh vh = this.m.a();
    if (vh == null)
      return null; 
    sr sr1 = vh.a(new acm(paramInt1 >> 4, paramInt3 >> 4));
    if (sr1 == null)
      return null; 
    return sr1.a(paramjf);
  }
  
  public am a(ry paramry, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
}
