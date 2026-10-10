package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: com.airbnb.lottie.i0 */
/* JADX INFO: compiled from: LottieImageAsset.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5083i0 {

    /* JADX INFO: renamed from: a */
    public final int f5976a;

    /* JADX INFO: renamed from: b */
    public final int f5977b;

    /* JADX INFO: renamed from: c */
    public final String f5978c;

    /* JADX INFO: renamed from: d */
    public final String f5979d;

    /* JADX INFO: renamed from: e */
    public final String f5980e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Bitmap f5981f;

    /* JADX INFO: renamed from: a */
    public C5083i0 m5672a(float f11) {
        C5083i0 c5083i0 = new C5083i0((int) (this.f5976a * f11), (int) (this.f5977b * f11), this.f5978c, this.f5979d, this.f5980e);
        Bitmap bitmap = this.f5981f;
        if (bitmap != null) {
            c5083i0.m5678g(Bitmap.createScaledBitmap(bitmap, c5083i0.f5976a, c5083i0.f5977b, true));
        }
        return c5083i0;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public Bitmap m5673b() {
        return this.f5981f;
    }

    /* JADX INFO: renamed from: c */
    public String m5674c() {
        return this.f5979d;
    }

    /* JADX INFO: renamed from: d */
    public int m5675d() {
        return this.f5977b;
    }

    /* JADX INFO: renamed from: e */
    public String m5676e() {
        return this.f5978c;
    }

    /* JADX INFO: renamed from: f */
    public int m5677f() {
        return this.f5976a;
    }

    /* JADX INFO: renamed from: g */
    public void m5678g(@Nullable Bitmap bitmap) {
        this.f5981f = bitmap;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C5083i0(int i11, int i12, String str, String str2, String str3) {
        this.f5976a = i11;
        this.f5977b = i12;
        this.f5978c = str;
        this.f5979d = str2;
        this.f5980e = str3;
    }
}
