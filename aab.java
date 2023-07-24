import java.util.Random;

public class aab extends yy {
  public static final int[][] a = new int[][] { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 0 } };
  
  public aab(int paramInt) {
    super(paramInt, 134, p.m);
    s();
  }
  
  public boolean a(ry paramry, int paramInt1, int paramInt2, int paramInt3, vi paramvi) {
    if (paramry.I)
      return true; 
    int i = paramry.d(paramInt1, paramInt2, paramInt3);
    if (!f(i)) {
      int j = e(i);
      paramInt1 += a[j][0];
      paramInt3 += a[j][1];
      if (paramry.a(paramInt1, paramInt2, paramInt3) != this.bM)
        return true; 
      i = paramry.d(paramInt1, paramInt2, paramInt3);
    } 
    if (!paramry.y.d()) {
      double d1 = paramInt1 + 0.5D;
      double d2 = paramInt2 + 0.5D;
      double d3 = paramInt3 + 0.5D;
      paramry.g(paramInt1, paramInt2, paramInt3, 0);
      int j = e(i);
      paramInt1 += a[j][0];
      paramInt3 += a[j][1];
      if (paramry.a(paramInt1, paramInt2, paramInt3) == this.bM) {
        paramry.g(paramInt1, paramInt2, paramInt3, 0);
        d1 = (d1 + paramInt1 + 0.5D) / 2.0D;
        d2 = (d2 + paramInt2 + 0.5D) / 2.0D;
        d3 = (d3 + paramInt3 + 0.5D) / 2.0D;
      } 
      paramry.a((ia)null, (paramInt1 + 0.5F), (paramInt2 + 0.5F), (paramInt3 + 0.5F), 5.0F, true);
      return true;
    } 
    if (g(i)) {
      vi vi1 = null;
      for (vi vi2 : paramry.i) {
        if (vi2.ar()) {
          dh dh = vi2.bU;
          if (dh.a == paramInt1 && dh.b == paramInt2 && dh.c == paramInt3)
            vi1 = vi2; 
        } 
      } 
      if (vi1 == null) {
        a(paramry, paramInt1, paramInt2, paramInt3, false);
      } else {
        paramvi.b("tile.bed.occupied");
        return true;
      } 
    } 
    qy qy = paramvi.d(paramInt1, paramInt2, paramInt3);
    if (qy == qy.a) {
      a(paramry, paramInt1, paramInt2, paramInt3, true);
      return true;
    } 
    if (qy == qy.c) {
      paramvi.b("tile.bed.noSleep");
    } else if (qy == qy.f) {
      paramvi.b("tile.bed.notSafe");
    } 
    return true;
  }
  
  public int a(int paramInt1, int paramInt2) {
    if (paramInt1 == 0)
      return yy.x.bL; 
    int i = e(paramInt2);
    int j = lz.h[i][paramInt1];
    if (f(paramInt2)) {
      if (j == 2)
        return this.bL + 2 + 16; 
      if (j == 5 || j == 4)
        return this.bL + 1 + 16; 
      return this.bL + 1;
    } 
    if (j == 3)
      return this.bL - 1 + 16; 
    if (j == 5 || j == 4)
      return this.bL + 16; 
    return this.bL;
  }
  
  public int c() {
    return 14;
  }
  
  public boolean b() {
    return false;
  }
  
  public boolean a() {
    return false;
  }
  
  public void b(kq paramkq, int paramInt1, int paramInt2, int paramInt3) {
    s();
  }
  
  public void a(ry paramry, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramry.d(paramInt1, paramInt2, paramInt3);
    int j = e(i);
    if (f(i)) {
      if (paramry.a(paramInt1 - a[j][0], paramInt2, paramInt3 - a[j][1]) != this.bM)
        paramry.g(paramInt1, paramInt2, paramInt3, 0); 
    } else if (paramry.a(paramInt1 + a[j][0], paramInt2, paramInt3 + a[j][1]) != this.bM) {
      paramry.g(paramInt1, paramInt2, paramInt3, 0);
      if (!paramry.I)
        b(paramry, paramInt1, paramInt2, paramInt3, i, 0); 
    } 
  }
  
  public int a(int paramInt1, Random paramRandom, int paramInt2) {
    if (f(paramInt1))
      return 0; 
    return acy.aZ.bM;
  }
  
  private void s() {
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
  }
  
  public static int e(int paramInt) {
    return paramInt & 0x3;
  }
  
  public static boolean f(int paramInt) {
    return ((paramInt & 0x8) != 0);
  }
  
  public static boolean g(int paramInt) {
    return ((paramInt & 0x4) != 0);
  }
  
  public static void a(ry paramry, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    int i = paramry.d(paramInt1, paramInt2, paramInt3);
    if (paramBoolean) {
      i |= 0x4;
    } else {
      i &= 0xFFFFFFFB;
    } 
    paramry.f(paramInt1, paramInt2, paramInt3, i);
  }
  
  public static dh f(ry paramry, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramry.d(paramInt1, paramInt2, paramInt3);
    int j = e(i);
    for (byte b = 0; b <= 1; b++) {
      int k = paramInt1 - a[j][0] * b - 1;
      int m = paramInt3 - a[j][1] * b - 1;
      int n = k + 2;
      int i1 = m + 2;
      for (int i2 = k; i2 <= n; i2++) {
        for (int i3 = m; i3 <= i1; i3++) {
          if (paramry.g(i2, paramInt2 - 1, i3) && paramry.h(i2, paramInt2, i3) && paramry.h(i2, paramInt2 + 1, i3))
            if (paramInt4 > 0) {
              paramInt4--;
            } else {
              return new dh(i2, paramInt2, i3);
            }  
        } 
      } 
    } 
    return null;
  }
  
  public void a(ry paramry, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    if (!f(paramInt4))
      super.a(paramry, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, 0); 
  }
  
  public int i() {
    return 1;
  }
}
