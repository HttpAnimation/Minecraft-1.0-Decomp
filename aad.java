import java.util.List;

public class aad extends ia {
  private int e = -1;
  
  private int f = -1;
  
  private int g = -1;
  
  private int h = 0;
  
  private boolean i = false;
  
  public nq a;
  
  private int aq;
  
  private int ar = 0;
  
  public double b;
  
  public double c;
  
  public double d;
  
  public aad(ry paramry) {
    super(paramry);
    a(1.0F, 1.0F);
  }
  
  protected void b() {}
  
  public boolean a(double paramDouble) {
    double d = this.C.c() * 4.0D;
    d *= 64.0D;
    return (paramDouble < d * d);
  }
  
  public aad(ry paramry, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    super(paramry);
    a(1.0F, 1.0F);
    c(paramDouble1, paramDouble2, paramDouble3, this.y, this.z);
    d(paramDouble1, paramDouble2, paramDouble3);
    double d = me.a(paramDouble4 * paramDouble4 + paramDouble5 * paramDouble5 + paramDouble6 * paramDouble6);
    this.b = paramDouble4 / d * 0.1D;
    this.c = paramDouble5 / d * 0.1D;
    this.d = paramDouble6 / d * 0.1D;
  }
  
  public aad(ry paramry, nq paramnq, double paramDouble1, double paramDouble2, double paramDouble3) {
    super(paramry);
    this.a = paramnq;
    a(1.0F, 1.0F);
    c(paramnq.s, paramnq.t, paramnq.u, paramnq.y, paramnq.z);
    d(this.s, this.t, this.u);
    this.L = 0.0F;
    this.v = this.w = this.x = 0.0D;
    paramDouble1 += this.Y.nextGaussian() * 0.4D;
    paramDouble2 += this.Y.nextGaussian() * 0.4D;
    paramDouble3 += this.Y.nextGaussian() * 0.4D;
    double d = me.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
    this.b = paramDouble1 / d * 0.1D;
    this.c = paramDouble2 / d * 0.1D;
    this.d = paramDouble3 / d * 0.1D;
  }
  
  public void a() {
    super.a();
    e(1);
    if (!this.o.I && (this.a == null || this.a.K))
      v(); 
    if (this.i) {
      int i = this.o.a(this.e, this.f, this.g);
      if (i != this.h) {
        this.i = false;
        this.v *= (this.Y.nextFloat() * 0.2F);
        this.w *= (this.Y.nextFloat() * 0.2F);
        this.x *= (this.Y.nextFloat() * 0.2F);
        this.aq = 0;
        this.ar = 0;
      } else {
        this.aq++;
        if (this.aq == 1200)
          v(); 
        return;
      } 
    } else {
      this.ar++;
    } 
    fb fb1 = fb.b(this.s, this.t, this.u);
    fb fb2 = fb.b(this.s + this.v, this.t + this.w, this.u + this.x);
    gv gv = this.o.a(fb1, fb2);
    fb1 = fb.b(this.s, this.t, this.u);
    fb2 = fb.b(this.s + this.v, this.t + this.w, this.u + this.x);
    if (gv != null)
      fb2 = fb.b(gv.f.a, gv.f.b, gv.f.c); 
    ia ia1 = null;
    List<ia> list = this.o.b(this, this.C.a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
    double d = 0.0D;
    for (byte b = 0; b < list.size(); b++) {
      ia ia2 = list.get(b);
      if (ia2.e_() && (!ia2.h(this.a) || this.ar >= 25)) {
        float f = 0.3F;
        c c = ia2.C.b(f, f, f);
        gv gv1 = c.a(fb1, fb2);
        if (gv1 != null) {
          double d1 = fb1.d(gv1.f);
          if (d1 < d || d == 0.0D) {
            ia1 = ia2;
            d = d1;
          } 
        } 
      } 
    } 
    if (ia1 != null)
      gv = new gv(ia1); 
    if (gv != null)
      a(gv); 
    this.s += this.v;
    this.t += this.w;
    this.u += this.x;
    float f1 = me.a(this.v * this.v + this.x * this.x);
    this.y = (float)(Math.atan2(this.v, this.x) * 180.0D / 3.1415927410125732D);
    this.z = (float)(Math.atan2(this.w, f1) * 180.0D / 3.1415927410125732D);
    while (this.z - this.B < -180.0F)
      this.B -= 360.0F; 
    while (this.z - this.B >= 180.0F)
      this.B += 360.0F; 
    while (this.y - this.A < -180.0F)
      this.A -= 360.0F; 
    while (this.y - this.A >= 180.0F)
      this.A += 360.0F; 
    this.z = this.B + (this.z - this.B) * 0.2F;
    this.y = this.A + (this.y - this.A) * 0.2F;
    float f2 = 0.95F;
    if (D()) {
      for (byte b1 = 0; b1 < 4; b1++) {
        float f = 0.25F;
        this.o.a("bubble", this.s - this.v * f, this.t - this.w * f, this.u - this.x * f, this.v, this.w, this.x);
      } 
      f2 = 0.8F;
    } 
    this.v += this.b;
    this.w += this.c;
    this.x += this.d;
    this.v *= f2;
    this.w *= f2;
    this.x *= f2;
    this.o.a("smoke", this.s, this.t + 0.5D, this.u, 0.0D, 0.0D, 0.0D);
    d(this.s, this.t, this.u);
  }
  
  protected void a(gv paramgv) {
    if (!this.o.I) {
      if (paramgv.g == null || 
        paramgv.g.a(pm.a(this, this.a), 4));
      this.o.a((ia)null, this.s, this.t, this.u, 1.0F, true);
      v();
    } 
  }
  
  public void a(ik paramik) {
    paramik.a("xTile", (short)this.e);
    paramik.a("yTile", (short)this.f);
    paramik.a("zTile", (short)this.g);
    paramik.a("inTile", (byte)this.h);
    paramik.a("inGround", (byte)(this.i ? 1 : 0));
  }
  
  public void b(ik paramik) {
    this.e = paramik.d("xTile");
    this.f = paramik.d("yTile");
    this.g = paramik.d("zTile");
    this.h = paramik.c("inTile") & 0xFF;
    this.i = (paramik.c("inGround") == 1);
  }
  
  public boolean e_() {
    return true;
  }
  
  public float Q() {
    return 1.0F;
  }
  
  public boolean a(pm parampm, int paramInt) {
    G();
    if (parampm.a() != null) {
      fb fb = parampm.a().R();
      if (fb != null) {
        this.v = fb.a;
        this.w = fb.b;
        this.x = fb.c;
        this.b = this.v * 0.1D;
        this.c = this.w * 0.1D;
        this.d = this.x * 0.1D;
      } 
      if (parampm.a() instanceof nq)
        this.a = (nq)parampm.a(); 
      return true;
    } 
    return false;
  }
  
  public float i_() {
    return 0.0F;
  }
  
  public float b(float paramFloat) {
    return 1.0F;
  }
  
  public int a(float paramFloat) {
    return 15728880;
  }
}
