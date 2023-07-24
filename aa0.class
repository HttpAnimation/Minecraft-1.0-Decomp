public class aao extends wc {
  float a;
  
  public aao(ry paramry, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3) {
    this(paramry, paramDouble1, paramDouble2, paramDouble3, 1.0F, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public aao(ry paramry, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    super(paramry, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
    this.v *= 0.10000000149011612D;
    this.w *= 0.10000000149011612D;
    this.x *= 0.10000000149011612D;
    if (paramFloat2 == 0.0F)
      paramFloat2 = 1.0F; 
    float f = (float)Math.random() * 0.4F + 0.6F;
    this.h = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * paramFloat2 * f;
    this.i = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * paramFloat3 * f;
    this.aq = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * paramFloat4 * f;
    this.f *= 0.75F;
    this.f *= paramFloat1;
    this.a = this.f;
    this.e = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
    this.e = (int)(this.e * paramFloat1);
    this.W = false;
  }
  
  public void a(cv paramcv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    float f = (this.d + paramFloat1) / this.e * 32.0F;
    if (f < 0.0F)
      f = 0.0F; 
    if (f > 1.0F)
      f = 1.0F; 
    this.f = this.a * f;
    super.a(paramcv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }
  
  public void a() {
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    if (this.d++ >= this.e)
      v(); 
    c(7 - this.d * 8 / this.e);
    b(this.v, this.w, this.x);
    if (this.t == this.q) {
      this.v *= 1.1D;
      this.x *= 1.1D;
    } 
    this.v *= 0.9599999785423279D;
    this.w *= 0.9599999785423279D;
    this.x *= 0.9599999785423279D;
    if (this.D) {
      this.v *= 0.699999988079071D;
      this.x *= 0.699999988079071D;
    } 
  }
}
