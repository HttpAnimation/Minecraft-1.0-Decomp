import java.util.List;
import java.util.Random;

public class aba extends nk {
  private final boolean a;
  
  private final boolean b;
  
  private boolean c;
  
  private int d;
  
  public aba(int paramInt1, Random paramRandom, nl paramnl, int paramInt2) {
    super(paramInt1);
    this.f = paramInt2;
    this.e = paramnl;
    this.a = (paramRandom.nextInt(3) == 0);
    this.b = (!this.a && paramRandom.nextInt(23) == 0);
    if (this.f == 2 || this.f == 0) {
      this.d = paramnl.d() / 5;
    } else {
      this.d = paramnl.b() / 5;
    } 
  }
  
  public static nl a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    nl nl = new nl(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2 + 2, paramInt3);
    int i = paramRandom.nextInt(3) + 2;
    while (i > 0) {
      int j = i * 5;
      switch (paramInt4) {
        case 2:
          nl.d = paramInt1 + 2;
          nl.c = paramInt3 - j - 1;
          break;
        case 0:
          nl.d = paramInt1 + 2;
          nl.f = paramInt3 + j - 1;
          break;
        case 1:
          nl.a = paramInt1 - j - 1;
          nl.f = paramInt3 + 2;
          break;
        case 3:
          nl.d = paramInt1 + j - 1;
          nl.f = paramInt3 + 2;
          break;
      } 
      if (nk.a(paramList, nl) != null)
        i--; 
    } 
    if (i > 0)
      return nl; 
    return null;
  }
  
  public void a(nk paramnk, List paramList, Random paramRandom) {
    int i = b();
    int j = paramRandom.nextInt(4);
    switch (this.f) {
      case 2:
        if (j <= 1) {
          aez.a(paramnk, paramList, paramRandom, this.e.a, this.e.b - 1 + paramRandom.nextInt(3), this.e.c - 1, this.f, i);
          break;
        } 
        if (j == 2) {
          aez.a(paramnk, paramList, paramRandom, this.e.a - 1, this.e.b - 1 + paramRandom.nextInt(3), this.e.c, 1, i);
          break;
        } 
        aez.a(paramnk, paramList, paramRandom, this.e.d + 1, this.e.b - 1 + paramRandom.nextInt(3), this.e.c, 3, i);
        break;
      case 0:
        if (j <= 1) {
          aez.a(paramnk, paramList, paramRandom, this.e.a, this.e.b - 1 + paramRandom.nextInt(3), this.e.f + 1, this.f, i);
          break;
        } 
        if (j == 2) {
          aez.a(paramnk, paramList, paramRandom, this.e.a - 1, this.e.b - 1 + paramRandom.nextInt(3), this.e.f - 3, 1, i);
          break;
        } 
        aez.a(paramnk, paramList, paramRandom, this.e.d + 1, this.e.b - 1 + paramRandom.nextInt(3), this.e.f - 3, 3, i);
        break;
      case 1:
        if (j <= 1) {
          aez.a(paramnk, paramList, paramRandom, this.e.a - 1, this.e.b - 1 + paramRandom.nextInt(3), this.e.c, this.f, i);
          break;
        } 
        if (j == 2) {
          aez.a(paramnk, paramList, paramRandom, this.e.a, this.e.b - 1 + paramRandom.nextInt(3), this.e.c - 1, 2, i);
          break;
        } 
        aez.a(paramnk, paramList, paramRandom, this.e.a, this.e.b - 1 + paramRandom.nextInt(3), this.e.f + 1, 0, i);
        break;
      case 3:
        if (j <= 1) {
          aez.a(paramnk, paramList, paramRandom, this.e.d + 1, this.e.b - 1 + paramRandom.nextInt(3), this.e.c, this.f, i);
          break;
        } 
        if (j == 2) {
          aez.a(paramnk, paramList, paramRandom, this.e.d - 3, this.e.b - 1 + paramRandom.nextInt(3), this.e.c - 1, 2, i);
          break;
        } 
        aez.a(paramnk, paramList, paramRandom, this.e.d - 3, this.e.b - 1 + paramRandom.nextInt(3), this.e.f + 1, 0, i);
        break;
    } 
    if (i < 8)
      if (this.f == 2 || this.f == 0) {
        for (int k = this.e.c + 3; k + 3 <= this.e.f; k += 5) {
          int m = paramRandom.nextInt(5);
          if (m == 0) {
            aez.a(paramnk, paramList, paramRandom, this.e.a - 1, this.e.b, k, 1, i + 1);
          } else if (m == 1) {
            aez.a(paramnk, paramList, paramRandom, this.e.d + 1, this.e.b, k, 3, i + 1);
          } 
        } 
      } else {
        for (int k = this.e.a + 3; k + 3 <= this.e.d; k += 5) {
          int m = paramRandom.nextInt(5);
          if (m == 0) {
            aez.a(paramnk, paramList, paramRandom, k, this.e.b, this.e.c - 1, 2, i + 1);
          } else if (m == 1) {
            aez.a(paramnk, paramList, paramRandom, k, this.e.b, this.e.f + 1, 0, i + 1);
          } 
        } 
      }  
  }
  
  public boolean a(ry paramry, Random paramRandom, nl paramnl) {
    if (a(paramry, paramnl))
      return false; 
    int i = this.d * 5 - 1;
    a(paramry, paramnl, 0, 0, 0, 2, 1, i, 0, 0, false);
    a(paramry, paramnl, paramRandom, 0.8F, 0, 2, 0, 2, 2, i, 0, 0, false);
    if (this.b)
      a(paramry, paramnl, paramRandom, 0.6F, 0, 0, 0, 2, 1, i, yy.W.bM, 0, false); 
    byte b;
    for (b = 0; b < this.d; b++) {
      int j = 2 + b * 5;
      a(paramry, paramnl, 0, 0, j, 0, 1, j, yy.aZ.bM, 0, false);
      a(paramry, paramnl, 2, 0, j, 2, 1, j, yy.aZ.bM, 0, false);
      if (paramRandom.nextInt(4) != 0) {
        a(paramry, paramnl, 0, 2, j, 2, 2, j, yy.x.bM, 0, false);
      } else {
        a(paramry, paramnl, 0, 2, j, 0, 2, j, yy.x.bM, 0, false);
        a(paramry, paramnl, 2, 2, j, 2, 2, j, yy.x.bM, 0, false);
      } 
      a(paramry, paramnl, paramRandom, 0.1F, 0, 2, j - 1, yy.W.bM, 0);
      a(paramry, paramnl, paramRandom, 0.1F, 2, 2, j - 1, yy.W.bM, 0);
      a(paramry, paramnl, paramRandom, 0.1F, 0, 2, j + 1, yy.W.bM, 0);
      a(paramry, paramnl, paramRandom, 0.1F, 2, 2, j + 1, yy.W.bM, 0);
      a(paramry, paramnl, paramRandom, 0.05F, 0, 2, j - 2, yy.W.bM, 0);
      a(paramry, paramnl, paramRandom, 0.05F, 2, 2, j - 2, yy.W.bM, 0);
      a(paramry, paramnl, paramRandom, 0.05F, 0, 2, j + 2, yy.W.bM, 0);
      a(paramry, paramnl, paramRandom, 0.05F, 2, 2, j + 2, yy.W.bM, 0);
      a(paramry, paramnl, paramRandom, 0.05F, 1, 2, j - 1, yy.aq.bM, 0);
      a(paramry, paramnl, paramRandom, 0.05F, 1, 2, j + 1, yy.aq.bM, 0);
      if (paramRandom.nextInt(100) == 0)
        a(paramry, paramnl, paramRandom, 2, 0, j - 1, aez.a(), 3 + paramRandom.nextInt(4)); 
      if (paramRandom.nextInt(100) == 0)
        a(paramry, paramnl, paramRandom, 0, 0, j + 1, aez.a(), 3 + paramRandom.nextInt(4)); 
      if (this.b && !this.c) {
        int k = b(0), m = j - 1 + paramRandom.nextInt(3);
        int n = a(1, m);
        m = b(1, m);
        if (paramnl.b(n, k, m)) {
          this.c = true;
          paramry.g(n, k, m, yy.as.bM);
          ze ze = (ze)paramry.b(n, k, m);
          if (ze != null)
            ze.a("CaveSpider"); 
        } 
      } 
    } 
    if (this.a)
      for (b = 0; b <= i; b++) {
        int j = a(paramry, 1, -1, b, paramnl);
        if (j > 0 && yy.m[j])
          a(paramry, paramnl, paramRandom, 0.7F, 1, 0, b, yy.aG.bM, c(yy.aG.bM, 0)); 
      }  
    return true;
  }
}
