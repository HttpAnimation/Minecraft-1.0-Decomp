import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.IntBuffer;
import java.util.Random;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public class abe {
  private int[] d;
  
  public int a;
  
  public int b;
  
  private int e;
  
  private IntBuffer f;
  
  public Random c;
  
  public abe(ki paramki, String paramString, zh paramzh) {
    BufferedImage bufferedImage;
    this.d = new int[256];
    this.a = 0;
    this.b = 8;
    this.f = bt.d(1024);
    this.c = new Random();
    try {
      bufferedImage = ImageIO.read(zh.class.getResourceAsStream(paramString));
    } catch (IOException iOException) {
      throw new RuntimeException(iOException);
    } 
    int i = bufferedImage.getWidth();
    int j = bufferedImage.getHeight();
    int[] arrayOfInt = new int[i * j];
    bufferedImage.getRGB(0, 0, i, j, arrayOfInt, 0, i);
    for (byte b1 = 0; b1 < '; b1++) {
      int k = b1 % 16;
      int m = b1 / 16;
      byte b = 7;
      for (; b >= 0; b--) {
        int n = k * 8 + b;
        boolean bool = true;
        for (byte b3 = 0; b3 < 8 && bool; b3++) {
          int i1 = (m * 8 + b3) * i;
          int i2 = arrayOfInt[n + i1] & 0xFF;
          if (i2 > 0)
            bool = false; 
        } 
        if (!bool)
          break; 
      } 
      if (b1 == 32)
        b = 2; 
      this.d[b1] = b + 2;
    } 
    this.a = paramzh.a(bufferedImage);
    this.e = bt.a(288);
    cv cv = cv.a;
    byte b2;
    for (b2 = 0; b2 < '; b2++) {
      GL11.glNewList(this.e + b2, 4864);
      cv.b();
      int k = b2 % 16 * 8;
      int m = b2 / 16 * 8;
      float f1 = 7.99F;
      float f2 = 0.0F;
      float f3 = 0.0F;
      cv.a(0.0D, (0.0F + f1), 0.0D, (k / 128.0F + f2), ((m + f1) / 128.0F + f3));
      cv.a((0.0F + f1), (0.0F + f1), 0.0D, ((k + f1) / 128.0F + f2), ((m + f1) / 128.0F + f3));
      cv.a((0.0F + f1), 0.0D, 0.0D, ((k + f1) / 128.0F + f2), (m / 128.0F + f3));
      cv.a(0.0D, 0.0D, 0.0D, (k / 128.0F + f2), (m / 128.0F + f3));
      cv.a();
      GL11.glTranslatef(this.d[b2], 0.0F, 0.0F);
      GL11.glEndList();
    } 
    for (b2 = 0; b2 < 32; b2++) {
      int k = (b2 >> 3 & 0x1) * 85;
      int m = (b2 >> 2 & 0x1) * 170 + k;
      int n = (b2 >> 1 & 0x1) * 170 + k;
      int i1 = (b2 >> 0 & 0x1) * 170 + k;
      if (b2 == 6)
        m += 85; 
      boolean bool = (b2 >= 16) ? true : false;
      if (paramki.g) {
        int i2 = (m * 30 + n * 59 + i1 * 11) / 100;
        int i3 = (m * 30 + n * 70) / 100;
        int i4 = (m * 30 + i1 * 70) / 100;
        m = i2;
        n = i3;
        i1 = i4;
      } 
      if (bool) {
        m /= 4;
        n /= 4;
        i1 /= 4;
      } 
      GL11.glNewList(this.e + 256 + b2, 4864);
      GL11.glColor3f(m / 255.0F, n / 255.0F, i1 / 255.0F);
      GL11.glEndList();
    } 
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    a(paramString, paramInt1 + 1, paramInt2 + 1, paramInt3, true);
    b(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public void b(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    a(paramString, paramInt1, paramInt2, paramInt3, false);
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (paramString == null)
      return; 
    boolean bool = false;
    if (paramBoolean) {
      int i = paramInt3 & 0xFF000000;
      paramInt3 = (paramInt3 & 0xFCFCFC) >> 2;
      paramInt3 += i;
    } 
    GL11.glBindTexture(3553, this.a);
    float f1 = (paramInt3 >> 16 & 0xFF) / 255.0F;
    float f2 = (paramInt3 >> 8 & 0xFF) / 255.0F;
    float f3 = (paramInt3 & 0xFF) / 255.0F;
    float f4 = (paramInt3 >> 24 & 0xFF) / 255.0F;
    if (f4 == 0.0F)
      f4 = 1.0F; 
    GL11.glColor4f(f1, f2, f3, f4);
    this.f.clear();
    GL11.glPushMatrix();
    GL11.glTranslatef(paramInt1, paramInt2, 0.0F);
    for (byte b = 0; b < paramString.length(); b++) {
      while (paramString.length() > b + 1 && paramString.charAt(b) == ') {
        char c = paramString.toLowerCase().charAt(b + 1);
        if (c == 'k') {
          bool = true;
        } else {
          bool = false;
          int i = "0123456789abcdef".indexOf(c);
          if (i < 0 || i > 15)
            i = 15; 
          this.f.put(this.e + 256 + i + (paramBoolean ? 16 : 0));
          if (this.f.remaining() == 0) {
            this.f.flip();
            GL11.glCallLists(this.f);
            this.f.clear();
          } 
        } 
        b += 2;
      } 
      if (b < paramString.length()) {
        int i = age.a.indexOf(paramString.charAt(b));
        if (i >= 0)
          if (bool) {
            int j = 0;
            while (true) {
              j = this.c.nextInt(age.a.length());
              if (this.d[i + 32] == this.d[j + 32]) {
                this.f.put(this.e + 256 + this.c.nextInt(2) + 8 + (paramBoolean ? 16 : 0));
                this.f.put(this.e + j + 32);
                break;
              } 
            } 
          } else {
            this.f.put(this.e + i + 32);
          }  
      } 
      if (this.f.remaining() == 0) {
        this.f.flip();
        GL11.glCallLists(this.f);
        this.f.clear();
      } 
    } 
    this.f.flip();
    GL11.glCallLists(this.f);
    GL11.glPopMatrix();
  }
  
  public int a(String paramString) {
    if (paramString == null)
      return 0; 
    int i = 0;
    for (byte b = 0; b < paramString.length(); b++) {
      if (paramString.charAt(b) == ') {
        b++;
      } else {
        int j = age.a.indexOf(paramString.charAt(b));
        if (j >= 0)
          i += this.d[j + 32]; 
      } 
    } 
    return i;
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a(paramString, paramInt1, paramInt2, paramInt3, paramInt4, false);
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    String[] arrayOfString1 = paramString.split("\n");
    if (arrayOfString1.length > 1) {
      for (byte b1 = 0; b1 < arrayOfString1.length; b1++) {
        a(arrayOfString1[b1], paramInt1, paramInt2, paramInt3, paramInt4);
        paramInt2 += a(arrayOfString1[b1], paramInt3);
      } 
      return;
    } 
    String[] arrayOfString2 = paramString.split(" ");
    byte b = 0;
    String str = "";
    while (b < arrayOfString2.length) {
      String str1 = str + arrayOfString2[b++] + " ";
      while (b < arrayOfString2.length && a(str1 + arrayOfString2[b]) < paramInt3)
        str1 = str1 + arrayOfString2[b++] + " "; 
      while (a(str1) > paramInt3) {
        byte b1 = 0;
        while (a(str1.substring(0, b1 + 1)) <= paramInt3)
          b1++; 
        if (str1.substring(0, b1).trim().length() > 0) {
          String str2 = str1.substring(0, b1);
          if (str2.lastIndexOf(") >= 0)
            str = "+ str2.charAt(str2.lastIndexOf(") + 1); 
          a(str2, paramInt1, paramInt2, paramInt4, paramBoolean);
          paramInt2 += this.b;
        } 
        str1 = str + str1.substring(b1);
      } 
      if (a(str1.trim()) > 0) {
        if (str1.lastIndexOf(") >= 0)
          str = "+ str1.charAt(str1.lastIndexOf(") + 1); 
        a(str1, paramInt1, paramInt2, paramInt4, paramBoolean);
        paramInt2 += this.b;
      } 
    } 
  }
  
  public int a(String paramString, int paramInt) {
    String[] arrayOfString1 = paramString.split("\n");
    if (arrayOfString1.length > 1) {
      int j = 0;
      for (byte b1 = 0; b1 < arrayOfString1.length; b1++)
        j += a(arrayOfString1[b1], paramInt); 
      return j;
    } 
    String[] arrayOfString2 = paramString.split(" ");
    byte b = 0;
    int i = 0;
    while (b < arrayOfString2.length) {
      String str = arrayOfString2[b++] + " ";
      while (b < arrayOfString2.length && a(str + arrayOfString2[b]) < paramInt)
        str = str + arrayOfString2[b++] + " "; 
      while (a(str) > paramInt) {
        byte b1 = 0;
        while (a(str.substring(0, b1 + 1)) <= paramInt)
          b1++; 
        if (str.substring(0, b1).trim().length() > 0)
          i += this.b; 
        str = str.substring(b1);
      } 
      if (str.trim().length() > 0)
        i += this.b; 
    } 
    if (i < this.b)
      i += this.b; 
    return i;
  }
}
