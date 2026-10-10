package com.facebook.drawee.drawable;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.d */
/* JADX INFO: compiled from: DrawableProperties.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5580d {

    /* JADX INFO: renamed from: a */
    public int f8261a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f8262b = false;

    /* JADX INFO: renamed from: c */
    public ColorFilter f8263c = null;

    /* JADX INFO: renamed from: d */
    public int f8264d = -1;

    /* JADX INFO: renamed from: e */
    public int f8265e = -1;

    @SuppressLint({"Range"})
    /* JADX INFO: renamed from: a */
    public void m8659a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i11 = this.f8261a;
        if (i11 != -1) {
            drawable.setAlpha(i11);
        }
        if (this.f8262b) {
            drawable.setColorFilter(this.f8263c);
        }
        int i12 = this.f8264d;
        if (i12 != -1) {
            drawable.setDither(i12 != 0);
        }
        int i13 = this.f8265e;
        if (i13 != -1) {
            drawable.setFilterBitmap(i13 != 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m8660b(int i11) {
        this.f8261a = i11;
    }

    /* JADX INFO: renamed from: c */
    public void m8661c(ColorFilter colorFilter) {
        this.f8263c = colorFilter;
        this.f8262b = colorFilter != null;
    }

    /* JADX INFO: renamed from: d */
    public void m8662d(boolean z11) {
        this.f8264d = z11 ? 1 : 0;
    }

    /* JADX INFO: renamed from: e */
    public void m8663e(boolean z11) {
        this.f8265e = z11 ? 1 : 0;
    }
}
