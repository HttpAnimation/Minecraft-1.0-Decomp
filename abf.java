import java.io.DataInputStream;
import java.io.DataOutputStream;

public class abf extends gt {
  public int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public abf() {}
  
  public abf(ia paramia) {
    this.a = paramia.j;
    this.b = me.c(paramia.s * 32.0D);
    this.c = me.c(paramia.t * 32.0D);
    this.d = me.c(paramia.u * 32.0D);
    if (paramia instanceof su)
      this.e = 1; 
  }
  
  public void a(DataInputStream paramDataInputStream) {
    this.a = paramDataInputStream.readInt();
    this.e = paramDataInputStream.readByte();
    this.b = paramDataInputStream.readInt();
    this.c = paramDataInputStream.readInt();
    this.d = paramDataInputStream.readInt();
  }
  
  public void a(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeInt(this.a);
    paramDataOutputStream.writeByte(this.e);
    paramDataOutputStream.writeInt(this.b);
    paramDataOutputStream.writeInt(this.c);
    paramDataOutputStream.writeInt(this.d);
  }
  
  public void a(fe paramfe) {
    paramfe.a(this);
  }
  
  public int a() {
    return 17;
  }
}
