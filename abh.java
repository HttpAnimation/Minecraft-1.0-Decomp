public class abh extends zo {
  int b;
  
  int c;
  
  public abh(ry paramry) {
    super(paramry);
    this.aA = "/mob/creeper.png";
  }
  
  public int f_() {
    return 20;
  }
  
  protected void b() {
    super.b();
    this.ag.a(16, Byte.valueOf((byte)-1));
    this.ag.a(17, Byte.valueOf((byte)0));
  }
  
  public void a(ik paramik) {
    super.a(paramik);
    if (this.ag.a(17) == 1)
      paramik.a("powered", true); 
  }
  
  public void b(ik paramik) {
    super.b(paramik);
    this.ag.b(17, Byte.valueOf((byte)(paramik.m("powered") ? 1 : 0)));
  }
  
  protected void b(ia paramia, float paramFloat) {
    if (this.o.I)
      return; 
    if (this.b > 0) {
      b(-1);
      this.b--;
      if (this.b < 0)
        this.b = 0; 
    } 
  }
  
  public void a() {
    this.c = this.b;
    if (this.o.I) {
      int i = ay();
      if (i > 0 && this.b == 0)
        this.o.a(this, "random.fuse", 1.0F, 0.5F); 
      this.b += i;
      if (this.b < 0)
        this.b = 0; 
      if (this.b >= 30)
        this.b = 30; 
    } 
    super.a();
    if (this.h == null && 
      this.b > 0) {
      b(-1);
      this.b--;
      if (this.b < 0)
        this.b = 0; 
    } 
  }
  
  protected String f() {
    return "mob.creeper";
  }
  
  protected String g() {
    return "mob.creeperdeath";
  }
  
  public void a(pm parampm) {
    super.a(parampm);
    if (parampm.a() instanceof it)
      b(acy.bB.bM + this.Y.nextInt(2), 1); 
  }
  
  protected void a(ia paramia, float paramFloat) {
    if (this.o.I)
      return; 
    int i = ay();
    if ((i <= 0 && paramFloat < 3.0F) || (i > 0 && paramFloat < 7.0F)) {
      if (this.b == 0)
        this.o.a(this, "random.fuse", 1.0F, 0.5F); 
      b(1);
      this.b++;
      if (this.b >= 30) {
        if (ax()) {
          this.o.a(this, this.s, this.t, this.u, 6.0F);
        } else {
          this.o.a(this, this.s, this.t, this.u, 3.0F);
        } 
        v();
      } 
      this.i = true;
    } else {
      b(-1);
      this.b--;
      if (this.b < 0)
        this.b = 0; 
    } 
  }
  
  public boolean ax() {
    return (this.ag.a(17) == 1);
  }
  
  public float g(float paramFloat) {
    return (this.c + (this.b - this.c) * paramFloat) / 28.0F;
  }
  
  protected int k() {
    return acy.L.bM;
  }
  
  private int ay() {
    return this.ag.a(16);
  }
  
  private void b(int paramInt) {
    this.ag.b(16, Byte.valueOf((byte)paramInt));
  }
  
  public void a(su paramsu) {
    super.a(paramsu);
    this.ag.b(17, Byte.valueOf((byte)1));
  }
}
