import java.io.DataInputStream;
import java.io.DataOutputStream;

public class abb extends gt {
  public String a;
  
  public abb() {}
  
  public abb(String paramString) {
    if (paramString.length() > 119)
      paramString = paramString.substring(0, 119); 
    this.a = paramString;
  }
  
  public void a(DataInputStream paramDataInputStream) {
    this.a = a(paramDataInputStream, 119);
  }
  
  public void a(DataOutputStream paramDataOutputStream) {
    a(this.a, paramDataOutputStream);
  }
  
  public void a(fe paramfe) {
    paramfe.a(this);
  }
  
  public int a() {
    return this.a.length();
  }
}
