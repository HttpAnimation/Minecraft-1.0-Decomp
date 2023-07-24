import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aa extends gt {
  public int a;
  
  public int b;
  
  public int c;
  
  public short d;
  
  public dk e;
  
  public boolean f;
  
  public aa() {}
  
  public aa(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, dk paramdk, short paramShort) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.e = paramdk;
    this.d = paramShort;
    this.f = paramBoolean;
  }
  
  public void a(fe paramfe) {
    paramfe.a(this);
  }
  
  public void a(DataInputStream paramDataInputStream) {
    this.a = paramDataInputStream.readByte();
    this.b = paramDataInputStream.readShort();
    this.c = paramDataInputStream.readByte();
    this.d = paramDataInputStream.readShort();
    this.f = paramDataInputStream.readBoolean();
    this.e = b(paramDataInputStream);
  }
  
  public void a(DataOutputStream paramDataOutputStream) {
    paramDataOutputStream.writeByte(this.a);
    paramDataOutputStream.writeShort(this.b);
    paramDataOutputStream.writeByte(this.c);
    paramDataOutputStream.writeShort(this.d);
    paramDataOutputStream.writeBoolean(this.f);
    a(this.e, paramDataOutputStream);
  }
  
  public int a() {
    return 11;
  }
}
