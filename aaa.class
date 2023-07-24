public class aaa extends yy {
  protected aaa(int paramInt1, int paramInt2) {
    super(paramInt1, paramInt2, p.p);
  }
  
  public c b(ry paramry, int paramInt1, int paramInt2, int paramInt3) {
    return null;
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean b() {
    return false;
  }
  
  public int c() {
    return 12;
  }
  
  public boolean d(ry paramry, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt4 == 1 && paramry.g(paramInt1, paramInt2 - 1, paramInt3))
      return true; 
    if (paramInt4 == 2 && paramry.g(paramInt1, paramInt2, paramInt3 + 1))
      return true; 
    if (paramInt4 == 3 && paramry.g(paramInt1, paramInt2, paramInt3 - 1))
      return true; 
    if (paramInt4 == 4 && paramry.g(paramInt1 + 1, paramInt2, paramInt3))
      return true; 
    if (paramInt4 == 5 && paramry.g(paramInt1 - 1, paramInt2, paramInt3))
      return true; 
    return false;
  }
  
  public boolean c(ry paramry, int paramInt1, int paramInt2, int paramInt3) {
    if (paramry.g(paramInt1 - 1, paramInt2, paramInt3))
      return true; 
    if (paramry.g(paramInt1 + 1, paramInt2, paramInt3))
      return true; 
    if (paramry.g(paramInt1, paramInt2, paramInt3 - 1))
      return true; 
    if (paramry.g(paramInt1, paramInt2, paramInt3 + 1))
      return true; 
    if (paramry.g(paramInt1, paramInt2 - 1, paramInt3))
      return true; 
    return false;
  }
  
  public void b(ry paramry, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramry.d(paramInt1, paramInt2, paramInt3);
    int j = i & 0x8;
    i &= 0x7;
    i = -1;
    if (paramInt4 == 1 && paramry.g(paramInt1, paramInt2 - 1, paramInt3))
      i = 5 + paramry.w.nextInt(2); 
    if (paramInt4 == 2 && paramry.g(paramInt1, paramInt2, paramInt3 + 1))
      i = 4; 
    if (paramInt4 == 3 && paramry.g(paramInt1, paramInt2, paramInt3 - 1))
      i = 3; 
    if (paramInt4 == 4 && paramry.g(paramInt1 + 1, paramInt2, paramInt3))
      i = 2; 
    if (paramInt4 == 5 && paramry.g(paramInt1 - 1, paramInt2, paramInt3))
      i = 1; 
    if (i == -1) {
      b(paramry, paramInt1, paramInt2, paramInt3, paramry.d(paramInt1, paramInt2, paramInt3), 0);
      paramry.g(paramInt1, paramInt2, paramInt3, 0);
      return;
    } 
    paramry.f(paramInt1, paramInt2, paramInt3, i + j);
  }
  
  public void a(ry paramry, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (g(paramry, paramInt1, paramInt2, paramInt3)) {
      int i = paramry.d(paramInt1, paramInt2, paramInt3) & 0x7;
      boolean bool = false;
      if (!paramry.g(paramInt1 - 1, paramInt2, paramInt3) && i == 1)
        bool = true; 
      if (!paramry.g(paramInt1 + 1, paramInt2, paramInt3) && i == 2)
        bool = true; 
      if (!paramry.g(paramInt1, paramInt2, paramInt3 - 1) && i == 3)
        bool = true; 
      if (!paramry.g(paramInt1, paramInt2, paramInt3 + 1) && i == 4)
        bool = true; 
      if (!paramry.g(paramInt1, paramInt2 - 1, paramInt3) && i == 5)
        bool = true; 
      if (!paramry.g(paramInt1, paramInt2 - 1, paramInt3) && i == 6)
        bool = true; 
      if (bool) {
        b(paramry, paramInt1, paramInt2, paramInt3, paramry.d(paramInt1, paramInt2, paramInt3), 0);
        paramry.g(paramInt1, paramInt2, paramInt3, 0);
      } 
    } 
  }
  
  private boolean g(ry paramry, int paramInt1, int paramInt2, int paramInt3) {
    if (!c(paramry, paramInt1, paramInt2, paramInt3)) {
      b(paramry, paramInt1, paramInt2, paramInt3, paramry.d(paramInt1, paramInt2, paramInt3), 0);
      paramry.g(paramInt1, paramInt2, paramInt3, 0);
      return false;
    } 
    return true;
  }
  
  public void b(kq paramkq, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramkq.d(paramInt1, paramInt2, paramInt3) & 0x7;
    float f = 0.1875F;
    if (i == 1) {
      a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
    } else if (i == 2) {
      a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
    } else if (i == 3) {
      a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
    } else if (i == 4) {
      a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
    } else {
      f = 0.25F;
      a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
    } 
  }
  
  public void b(ry paramry, int paramInt1, int paramInt2, int paramInt3, vi paramvi) {
    a(paramry, paramInt1, paramInt2, paramInt3, paramvi);
  }
  
  public boolean a(ry paramry, int paramInt1, int paramInt2, int paramInt3, vi paramvi) {
    if (paramry.I)
      return true; 
    int i = paramry.d(paramInt1, paramInt2, paramInt3);
    int j = i & 0x7;
    int k = 8 - (i & 0x8);
    paramry.f(paramInt1, paramInt2, paramInt3, j + k);
    paramry.c(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
    paramry.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, (k > 0) ? 0.6F : 0.5F);
    paramry.j(paramInt1, paramInt2, paramInt3, this.bM);
    if (j == 1) {
      paramry.j(paramInt1 - 1, paramInt2, paramInt3, this.bM);
    } else if (j == 2) {
      paramry.j(paramInt1 + 1, paramInt2, paramInt3, this.bM);
    } else if (j == 3) {
      paramry.j(paramInt1, paramInt2, paramInt3 - 1, this.bM);
    } else if (j == 4) {
      paramry.j(paramInt1, paramInt2, paramInt3 + 1, this.bM);
    } else {
      paramry.j(paramInt1, paramInt2 - 1, paramInt3, this.bM);
    } 
    return true;
  }
  
  public void d(ry paramry, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramry.d(paramInt1, paramInt2, paramInt3);
    if ((i & 0x8) > 0) {
      paramry.j(paramInt1, paramInt2, paramInt3, this.bM);
      int j = i & 0x7;
      if (j == 1) {
        paramry.j(paramInt1 - 1, paramInt2, paramInt3, this.bM);
      } else if (j == 2) {
        paramry.j(paramInt1 + 1, paramInt2, paramInt3, this.bM);
      } else if (j == 3) {
        paramry.j(paramInt1, paramInt2, paramInt3 - 1, this.bM);
      } else if (j == 4) {
        paramry.j(paramInt1, paramInt2, paramInt3 + 1, this.bM);
      } else {
        paramry.j(paramInt1, paramInt2 - 1, paramInt3, this.bM);
      } 
    } 
    super.d(paramry, paramInt1, paramInt2, paramInt3);
  }
  
  public boolean b(kq paramkq, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return ((paramkq.d(paramInt1, paramInt2, paramInt3) & 0x8) > 0);
  }
  
  public boolean c(ry paramry, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramry.d(paramInt1, paramInt2, paramInt3);
    if ((i & 0x8) == 0)
      return false; 
    int j = i & 0x7;
    if (j == 6 && paramInt4 == 1)
      return true; 
    if (j == 5 && paramInt4 == 1)
      return true; 
    if (j == 4 && paramInt4 == 2)
      return true; 
    if (j == 3 && paramInt4 == 3)
      return true; 
    if (j == 2 && paramInt4 == 4)
      return true; 
    if (j == 1 && paramInt4 == 5)
      return true; 
    return false;
  }
  
  public boolean g() {
    return true;
  }
}
