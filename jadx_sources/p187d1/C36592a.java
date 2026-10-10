package p187d1;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import p484o1.C42929k;

/* JADX INFO: renamed from: d1.a */
/* JADX INFO: compiled from: LPaint.java */
/* JADX INFO: loaded from: classes.dex */
public class C36592a extends Paint {
    public C36592a() {
    }

    public C36592a(int i11) {
        super(i11);
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i11) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(C42929k.m94189c(i11, 0, 255));
        } else {
            setColor((C42929k.m94189c(i11, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    public C36592a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C36592a(int i11, PorterDuff.Mode mode) {
        super(i11);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(@NonNull LocaleList localeList) {
    }
}
