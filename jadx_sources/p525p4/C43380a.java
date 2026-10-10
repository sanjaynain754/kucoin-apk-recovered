package p525p4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.facebook.drawee.drawable.InterfaceC5597q;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p548q4.InterfaceC43610b;

/* JADX INFO: renamed from: p4.a */
/* JADX INFO: compiled from: DebugControllerOverlayDrawable.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43380a extends Drawable implements InterfaceC43610b {

    /* JADX INFO: renamed from: b */
    public String f95789b;

    /* JADX INFO: renamed from: c */
    public String f95790c;

    /* JADX INFO: renamed from: d */
    public int f95791d;

    /* JADX INFO: renamed from: e */
    public int f95792e;

    /* JADX INFO: renamed from: f */
    public int f95793f;

    /* JADX INFO: renamed from: g */
    public String f95794g;

    /* JADX INFO: renamed from: h */
    public InterfaceC5597q f95795h;

    /* JADX INFO: renamed from: j */
    public int f95797j;

    /* JADX INFO: renamed from: k */
    public int f95798k;

    /* JADX INFO: renamed from: q */
    public int f95804q;

    /* JADX INFO: renamed from: r */
    public int f95805r;

    /* JADX INFO: renamed from: s */
    public int f95806s;

    /* JADX INFO: renamed from: t */
    public int f95807t;

    /* JADX INFO: renamed from: u */
    public int f95808u;

    /* JADX INFO: renamed from: v */
    public long f95809v;

    /* JADX INFO: renamed from: w */
    public String f95810w;

    /* JADX INFO: renamed from: i */
    public HashMap<String, String> f95796i = new HashMap<>();

    /* JADX INFO: renamed from: l */
    public int f95799l = 80;

    /* JADX INFO: renamed from: m */
    public final Paint f95800m = new Paint(1);

    /* JADX INFO: renamed from: n */
    public final Matrix f95801n = new Matrix();

    /* JADX INFO: renamed from: o */
    public final Rect f95802o = new Rect();

    /* JADX INFO: renamed from: p */
    public final RectF f95803p = new RectF();

    /* JADX INFO: renamed from: x */
    public int f95811x = -1;

    /* JADX INFO: renamed from: y */
    public int f95812y = 0;

    /* JADX INFO: renamed from: d */
    public final void m95546d(Canvas canvas, String str, String str2) {
        m95547e(canvas, str, str2, -1);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: i */
    public void m95550i() {
        this.f95791d = -1;
        this.f95792e = -1;
        this.f95793f = -1;
        this.f95796i = new HashMap<>();
        this.f95797j = -1;
        this.f95798k = -1;
        this.f95794g = null;
        m95551j(null);
        this.f95809v = -1L;
        this.f95810w = null;
        this.f95811x = -1;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public static String m95542g(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    @Override // p548q4.InterfaceC43610b
    /* JADX INFO: renamed from: a */
    public void mo95543a(long j11) {
        this.f95809v = j11;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: b */
    public void m95544b(String str, String str2) {
        this.f95796i.put(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public final void m95547e(Canvas canvas, String str, String str2, int i11) {
        String str3 = str + ": ";
        float fMeasureText = this.f95800m.measureText(str3);
        float fMeasureText2 = this.f95800m.measureText(str2);
        this.f95800m.setColor(1711276032);
        int i12 = this.f95807t;
        int i13 = this.f95808u;
        canvas.drawRect(i12 - 4, i13 + 8, i12 + fMeasureText + fMeasureText2 + 4.0f, i13 + this.f95806s + 8, this.f95800m);
        this.f95800m.setColor(-1);
        canvas.drawText(str3, this.f95807t, this.f95808u, this.f95800m);
        this.f95800m.setColor(i11);
        canvas.drawText(str2, this.f95807t + fMeasureText, this.f95808u, this.f95800m);
        this.f95808u += this.f95806s;
    }

    /* JADX INFO: renamed from: j */
    public void m95551j(String str) {
        if (str == null) {
            str = "none";
        }
        this.f95789b = str;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: k */
    public void m95552k(int i11, int i12) {
        this.f95791d = i11;
        this.f95792e = i12;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: l */
    public void m95553l(int i11) {
        this.f95793f = i11;
    }

    /* JADX INFO: renamed from: m */
    public void m95554m(InterfaceC5597q interfaceC5597q) {
        this.f95795h = interfaceC5597q;
    }

    public C43380a() {
        m95550i();
    }

    /* JADX INFO: renamed from: c */
    public final void m95545c(Canvas canvas, String str, Object obj) {
        m95547e(canvas, str, String.valueOf(obj), -1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f95800m.setStyle(Paint.Style.STROKE);
        this.f95800m.setStrokeWidth(2.0f);
        this.f95800m.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f95800m);
        Paint paint = this.f95800m;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f95800m.setColor(this.f95812y);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f95800m);
        this.f95800m.setStyle(style);
        this.f95800m.setStrokeWidth(0.0f);
        this.f95800m.setColor(-1);
        this.f95807t = this.f95804q;
        this.f95808u = this.f95805r;
        String str = this.f95790c;
        if (str != null) {
            m95546d(canvas, "IDs", m95542g("%s, %s", this.f95789b, str));
        } else {
            m95546d(canvas, "ID", this.f95789b);
        }
        m95546d(canvas, "D", m95542g("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        if (bounds.height() > 0) {
            m95545c(canvas, "DAR", Float.valueOf(bounds.width() / bounds.height()));
        }
        m95547e(canvas, "I", m95542g("%dx%d", Integer.valueOf(this.f95791d), Integer.valueOf(this.f95792e)), m95548f(this.f95791d, this.f95792e, this.f95795h));
        int i11 = this.f95792e;
        if (i11 > 0) {
            m95545c(canvas, "IAR", Float.valueOf(this.f95791d / i11));
        }
        m95546d(canvas, "I", m95542g("%d KiB", Integer.valueOf(this.f95793f / 1024)));
        String str2 = this.f95794g;
        if (str2 != null) {
            m95546d(canvas, "i format", str2);
        }
        int i12 = this.f95797j;
        if (i12 > 0) {
            m95546d(canvas, "anim", m95542g("f %d, l %d", Integer.valueOf(i12), Integer.valueOf(this.f95798k)));
        }
        InterfaceC5597q interfaceC5597q = this.f95795h;
        if (interfaceC5597q != null) {
            m95545c(canvas, "scale", interfaceC5597q);
        }
        long j11 = this.f95809v;
        if (j11 >= 0) {
            m95546d(canvas, "t", m95542g("%d ms", Long.valueOf(j11)));
        }
        String str3 = this.f95810w;
        if (str3 != null) {
            m95547e(canvas, "origin", str3, this.f95811x);
        }
        for (Map.Entry<String, String> entry : this.f95796i.entrySet()) {
            m95546d(canvas, entry.getKey(), entry.getValue());
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public int m95548f(int i11, int i12, InterfaceC5597q interfaceC5597q) {
        int i13;
        int i14;
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0 && i11 > 0 && i12 > 0) {
            if (interfaceC5597q != null) {
                Rect rect = this.f95802o;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth;
                rect.bottom = iHeight;
                this.f95801n.reset();
                i13 = i11;
                i14 = i12;
                interfaceC5597q.getTransform(this.f95801n, this.f95802o, i13, i14, 0.0f, 0.0f);
                RectF rectF = this.f95803p;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i13;
                rectF.bottom = i14;
                this.f95801n.mapRect(rectF);
                int iWidth2 = (int) this.f95803p.width();
                int iHeight2 = (int) this.f95803p.height();
                iWidth = Math.min(iWidth, iWidth2);
                iHeight = Math.min(iHeight, iHeight2);
            } else {
                i13 = i11;
                i14 = i12;
            }
            float f11 = iWidth;
            float f12 = f11 * 0.1f;
            float f13 = f11 * 0.5f;
            float f14 = iHeight;
            float f15 = 0.1f * f14;
            float f16 = f14 * 0.5f;
            int iAbs = Math.abs(i13 - iWidth);
            int iAbs2 = Math.abs(i14 - iHeight);
            float f17 = iAbs;
            if (f17 < f12 && iAbs2 < f15) {
                return -16711936;
            }
            if (f17 < f13 && iAbs2 < f16) {
                return InputDeviceCompat.SOURCE_ANY;
            }
        }
        return SupportMenu.CATEGORY_MASK;
    }

    /* JADX INFO: renamed from: h */
    public final void m95549h(Rect rect, int i11, int i12) {
        int i13;
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / i12, rect.height() / i11)));
        this.f95800m.setTextSize(iMin);
        int i14 = iMin + 8;
        this.f95806s = i14;
        int i15 = this.f95799l;
        if (i15 == 80) {
            this.f95806s = i14 * (-1);
        }
        this.f95804q = rect.left + 10;
        if (i15 == 80) {
            i13 = rect.bottom - 10;
        } else {
            i13 = rect.top + 20;
        }
        this.f95805r = i13;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m95549h(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
