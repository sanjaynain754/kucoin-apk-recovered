package com.airbnb.lottie;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.airbnb.lottie.t0 */
/* JADX INFO: compiled from: TextDelegate.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5112t0 {

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f6225a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final LottieAnimationView f6226b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final LottieDrawable f6227c;

    /* JADX INFO: renamed from: d */
    public boolean f6228d;

    @VisibleForTesting
    public C5112t0() {
        this.f6225a = new HashMap();
        this.f6228d = true;
        this.f6226b = null;
        this.f6227c = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: c */
    public final String m5905c(String str, String str2) {
        if (this.f6228d && this.f6225a.containsKey(str2)) {
            return this.f6225a.get(str2);
        }
        String strM5904b = m5904b(str, str2);
        if (this.f6228d) {
            this.f6225a.put(str2, strM5904b);
        }
        return strM5904b;
    }

    /* JADX INFO: renamed from: d */
    public final void m5906d() {
        LottieAnimationView lottieAnimationView = this.f6226b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        LottieDrawable lottieDrawable = this.f6227c;
        if (lottieDrawable != null) {
            lottieDrawable.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m5907e(String str, String str2) {
        this.f6225a.put(str, str2);
        m5906d();
    }

    /* JADX INFO: renamed from: b */
    public String m5904b(String str, String str2) {
        return m5903a(str2);
    }

    public C5112t0(LottieAnimationView lottieAnimationView) {
        this.f6225a = new HashMap();
        this.f6228d = true;
        this.f6226b = lottieAnimationView;
        this.f6227c = null;
    }

    /* JADX INFO: renamed from: a */
    public String m5903a(String str) {
        return str;
    }
}
