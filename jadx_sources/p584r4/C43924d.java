package p584r4;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import com.facebook.drawee.drawable.C5586g;
import com.facebook.drawee.drawable.InterfaceC5585f0;
import com.facebook.drawee.drawable.InterfaceC5587g0;

/* JADX INFO: renamed from: r4.d */
/* JADX INFO: compiled from: RootDrawable.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43924d extends C5586g implements InterfaceC5585f0 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f97115d = 0;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public Drawable f97116b;

    /* JADX INFO: renamed from: c */
    public InterfaceC5587g0 f97117c;

    @Override // com.facebook.drawee.drawable.C5586g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // com.facebook.drawee.drawable.C5586g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5585f0
    /* JADX INFO: renamed from: g */
    public void mo8683g(InterfaceC5587g0 interfaceC5587g0) {
        this.f97117c = interfaceC5587g0;
    }

    /* JADX INFO: renamed from: i */
    public void m96826i(Drawable drawable) {
        this.f97116b = drawable;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.C5586g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        InterfaceC5587g0 interfaceC5587g0 = this.f97117c;
        if (interfaceC5587g0 != null) {
            interfaceC5587g0.mo8684b(z11);
        }
        return super.setVisible(z11, z12);
    }

    public C43924d(Drawable drawable) {
        super(drawable);
        this.f97116b = null;
    }

    @Override // com.facebook.drawee.drawable.C5586g, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            InterfaceC5587g0 interfaceC5587g0 = this.f97117c;
            if (interfaceC5587g0 != null) {
                interfaceC5587g0.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f97116b;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f97116b.draw(canvas);
            }
        }
    }
}
