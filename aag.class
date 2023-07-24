public class aag extends acy {
  public aag(int paramInt) {
    super(paramInt);
  }
  
  public boolean a(dk paramdk, vi paramvi, ry paramry, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramry.a(paramInt1, paramInt2, paramInt3);
    int j = paramry.d(paramInt1, paramInt2, paramInt3);
    if (paramvi.e(paramInt1, paramInt2, paramInt3) && i == yy.bI.bM && !rl.e(j)) {
      if (paramry.I)
        return true; 
      paramry.f(paramInt1, paramInt2, paramInt3, j + 4);
      paramdk.a--;
      int k;
      for (k = 0; k < 16; k++) {
        double d1 = (paramInt1 + (5.0F + c.nextFloat() * 6.0F) / 16.0F);
        double d2 = (paramInt2 + 0.8125F);
        double d3 = (paramInt3 + (5.0F + c.nextFloat() * 6.0F) / 16.0F);
        double d4 = 0.0D;
        double d5 = 0.0D;
        double d6 = 0.0D;
        paramry.a("smoke", d1, d2, d3, d4, d5, d6);
      } 
      k = j & 0x3;
      int m = 0;
      int n = 0;
      boolean bool1 = false;
      boolean bool2 = true;
      int i1 = lz.f[k];
      int i2;
      for (i2 = -2; i2 <= 2; i2++) {
        int i3 = paramInt1 + lz.a[i1] * i2;
        int i4 = paramInt3 + lz.b[i1] * i2;
        int i5 = paramry.a(i3, paramInt2, i4);
        if (i5 == yy.bI.bM) {
          int i6 = paramry.d(i3, paramInt2, i4);
          if (!rl.e(i6)) {
            bool2 = false;
            break;
          } 
          if (!bool1) {
            m = i2;
            n = i2;
            bool1 = true;
          } else {
            n = i2;
          } 
        } 
      } 
      if (bool2 && n == m + 2) {
        for (i2 = m; i2 <= n; i2++) {
          int i3 = paramInt1 + lz.a[i1] * i2;
          int i4 = paramInt3 + lz.b[i1] * i2;
          i3 += lz.a[k] * 4;
          i4 += lz.b[k] * 4;
          int i5 = paramry.a(i3, paramInt2, i4);
          int i6 = paramry.d(i3, paramInt2, i4);
          if (i5 != yy.bI.bM || !rl.e(i6)) {
            bool2 = false;
            break;
          } 
        } 
        for (i2 = m - 1; i2 <= n + 1; i2 += 4) {
          for (byte b = 1; b <= 3; b++) {
            int i3 = paramInt1 + lz.a[i1] * i2;
            int i4 = paramInt3 + lz.b[i1] * i2;
            i3 += lz.a[k] * b;
            i4 += lz.b[k] * b;
            int i5 = paramry.a(i3, paramInt2, i4);
            int i6 = paramry.d(i3, paramInt2, i4);
            if (i5 != yy.bI.bM || !rl.e(i6)) {
              bool2 = false;
              break;
            } 
          } 
        } 
        if (bool2)
          for (i2 = m; i2 <= n; i2++) {
            for (byte b = 1; b <= 3; b++) {
              int i3 = paramInt1 + lz.a[i1] * i2;
              int i4 = paramInt3 + lz.b[i1] * i2;
              i3 += lz.a[k] * b;
              i4 += lz.b[k] * b;
              paramry.g(i3, paramInt2, i4, yy.bH.bM);
            } 
          }  
      } 
      return true;
    } 
    return false;
  }
  
  public dk c(dk paramdk, ry paramry, vi paramvi) {
    gv gv = a(paramry, paramvi, false);
    if (gv != null && gv.a == bo.a) {
      int i = paramry.a(gv.b, gv.c, gv.d);
      if (i == yy.bI.bM)
        return paramdk; 
    } 
    if (!paramry.I) {
      am am = paramry.b("Stronghold", (int)paramvi.s, (int)paramvi.t, (int)paramvi.u);
      if (am != null) {
        bs bs = new bs(paramry, paramvi.s, paramvi.t + 1.62D - paramvi.L, paramvi.u);
        bs.a(am.a, am.b, am.c);
        paramry.a(bs);
        paramry.a(paramvi, "random.bow", 0.5F, 0.4F / (c.nextFloat() * 0.4F + 0.8F));
        paramry.a((vi)null, 1002, (int)paramvi.s, (int)paramvi.t, (int)paramvi.u, 0);
        if (!paramvi.cc.d)
          paramdk.a--; 
      } 
    } 
    return paramdk;
  }
}
