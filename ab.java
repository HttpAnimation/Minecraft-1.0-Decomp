import java.util.List;

public class ab extends fm {
  private int d;
  
  public ab(ry paramry) {
    super(paramry);
  }
  
  public ab(ry paramry, nq paramnq, int paramInt) {
    super(paramry, paramnq);
    this.d = paramInt;
  }
  
  public ab(ry paramry, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
    super(paramry, paramDouble1, paramDouble2, paramDouble3);
    this.d = paramInt;
  }
  
  protected float b_() {
    return 0.05F;
  }
  
  protected float c_() {
    return 0.5F;
  }
  
  protected float d() {
    return -20.0F;
  }
  
  public int e() {
    return this.d;
  }
  
  protected void a(gv paramgv) {
    if (!this.o.I) {
      List list = acy.br.d(this.d);
      if (list != null && !list.isEmpty()) {
        c c = this.C.b(4.0D, 2.0D, 4.0D);
        List list1 = this.o.a(nq.class, c);
        if (list1 != null && !list1.isEmpty())
          for (ia ia : list1) {
            double d = d(ia);
            if (d < 16.0D) {
              double d1 = 1.0D - Math.sqrt(d) / 4.0D;
              if (ia == paramgv.g)
                d1 = 1.0D; 
              for (s s : list) {
                int i = s.a();
                if (abg.a[i].a()) {
                  abg.a[i].a(this.c, (nq)ia, s.c(), d1);
                  continue;
                } 
                int j = (int)(d1 * s.b() + 0.5D);
                if (j > 20)
                  ((nq)ia).a(new s(i, j, s.c())); 
              } 
            } 
          }  
      } 
      this.o.g(2002, (int)Math.round(this.s), (int)Math.round(this.t), (int)Math.round(this.u), this.d);
      v();
    } 
  }
}
