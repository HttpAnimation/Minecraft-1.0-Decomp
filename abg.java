public class abg {
    public static final abg[] a = new abg[32];
    
    public static final abg b = null;
    
    public static final abg c = (new abg(1, false, 8171462)).a("potion.moveSpeed").b(0, 0);
    
    public static final abg d = (new abg(2, true, 5926017)).a("potion.moveSlowdown").b(1, 0);
    
    public static final abg e = (new abg(3, false, 14270531)).a("potion.digSpeed").b(2, 0).a(1.5D);
    
    public static final abg f = (new abg(4, true, 4866583)).a("potion.digSlowDown").b(3, 0);
    
    public static final abg g = (new abg(5, false, 9643043)).a("potion.damageBoost").b(4, 0);
    
    public static final abg h = (new py(6, false, 16262179)).a("potion.heal");
    
    public static final abg i = (new py(7, true, 4393481)).a("potion.harm");
    
    public static final abg j = (new abg(8, false, 7889559)).a("potion.jump").b(2, 1);
    
    public static final abg k = (new abg(9, true, 5578058)).a("potion.confusion").b(3, 1).a(0.25D);
    
    public static final abg l = (new abg(10, false, 13458603)).a("potion.regeneration").b(7, 0).a(0.25D);
    
    public static final abg m = (new abg(11, false, 10044730)).a("potion.resistance").b(6, 1);
    
    public static final abg n = (new abg(12, false, 14981690)).a("potion.fireResistance").b(7, 1);
    
    public static final abg o = (new abg(13, false, 3035801)).a("potion.waterBreathing").b(0, 2);
    
    public static final abg p = (new abg(14, false, 8356754)).a("potion.invisibility").b(0, 1).h();
    
    public static final abg q = (new abg(15, true, 2039587)).a("potion.blindness").b(5, 1).a(0.25D);
    
    public static final abg r = (new abg(16, false, 2039713)).a("potion.nightVision").b(4, 1).h();
    
    public static final abg s = (new abg(17, true, 5797459)).a("potion.hunger").b(1, 1);
    
    public static final abg t = (new abg(18, true, 4738376)).a("potion.weakness").b(5, 0);
    
    public static final abg u = (new abg(19, true, 5149489)).a("potion.poison").b(6, 0).a(0.25D);
    
    public static final abg v = null;
    
    public static final abg w = null;
    
    public static final abg x = null;
    
    public static final abg y = null;
    
    public static final abg z = null;
    
    public static final abg A = null;
    
    public static final abg B = null;
    
    public static final abg C = null;
    
    public static final abg D = null;
    
    public static final abg E = null;
    
    public static final abg F = null;
    
    public static final abg G = null;
    
    public final int H;
    
    private String I = "";
    
    private int J = -1;
    
    private final boolean K;
    
    private double L;
    
    private boolean M;
    
    private final int N;
    
    protected abg(int paramInt1, boolean paramBoolean, int paramInt2) {
      this.H = paramInt1;
      a[paramInt1] = this;
      this.K = paramBoolean;
      if (paramBoolean) {
        this.L = 0.5D;
      } else {
        this.L = 1.0D;
      } 
      this.N = paramInt2;
    }
    
    protected abg b(int paramInt1, int paramInt2) {
      this.J = paramInt1 + paramInt2 * 8;
      return this;
    }
    
    public int b() {
      return this.H;
    }
    
    public void a(nq paramnq, int paramInt) {
      if (this.H == l.H) {
        if (paramnq.ag() < paramnq.f_())
          paramnq.a_(1); 
      } else if (this.H == u.H) {
        if (paramnq.ag() > 1)
          paramnq.a(pm.l, 1); 
      } else if (this.H == s.H && paramnq instanceof vi) {
        ((vi)paramnq).g(0.025F * (paramInt + 1));
      } else if ((this.H == h.H && !paramnq.av()) || (this.H == i.H && paramnq.av())) {
        paramnq.a_(6 << paramInt);
      } else if ((this.H == i.H && !paramnq.av()) || (this.H == h.H && paramnq.av())) {
        paramnq.a(pm.l, 6 << paramInt);
      } 
    }
    
    public void a(nq paramnq1, nq paramnq2, int paramInt, double paramDouble) {
      if ((this.H == h.H && !paramnq2.av()) || (this.H == i.H && paramnq2.av())) {
        int i = (int)(paramDouble * (6 << paramInt) + 0.5D);
        paramnq2.a_(i);
      } else if ((this.H == i.H && !paramnq2.av()) || (this.H == h.H && paramnq2.av())) {
        int i = (int)(paramDouble * (6 << paramInt) + 0.5D);
        if (paramnq1 == null) {
          paramnq2.a(pm.l, i);
        } else {
          paramnq2.a(pm.b(paramnq2, paramnq1), i);
        } 
      } 
    }
    
    public boolean a() {
      return false;
    }
    
    public boolean a(int paramInt1, int paramInt2) {
      if (this.H == l.H || this.H == u.H) {
        int i = 25 >> paramInt2;
        if (i > 0)
          return (paramInt1 % i == 0); 
        return true;
      } 
      if (this.H == s.H)
        return true; 
      return false;
    }
    
    public abg a(String paramString) {
      this.I = paramString;
      return this;
    }
    
    public String c() {
      return this.I;
    }
    
    public boolean d() {
      return (this.J >= 0);
    }
    
    public int e() {
      return this.J;
    }
    
    public boolean f() {
      return this.K;
    }
    
    public static String a(s params) {
      int i = params.b();
      int j = i / 20;
      int k = j / 60;
      j %= 60;
      if (j < 10)
        return k + ":0" + j; 
      return k + ":" + j;
    }
    
    protected abg a(double paramDouble) {
      this.L = paramDouble;
      return this;
    }
    
    public double g() {
      return this.L;
    }
    
    public abg h() {
      this.M = true;
      return this;
    }
    
    public boolean i() {
      return this.M;
    }
    
    public int j() {
      return this.N;
    }
  }
  