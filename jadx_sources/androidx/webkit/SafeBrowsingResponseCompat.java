package androidx.webkit;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes34.dex */
public abstract class SafeBrowsingResponseCompat {
    public abstract void backToSafety(boolean z11);

    public abstract void proceed(boolean z11);

    public abstract void showInterstitial(boolean z11);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public SafeBrowsingResponseCompat() {
    }
}
