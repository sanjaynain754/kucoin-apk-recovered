package com.sumsub.sns.internal.features.presentation.main;

import android.os.Parcelable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31260f extends AbstractC31245b0 {

    /* JADX INFO: renamed from: a */
    public final boolean f63312a;

    /* JADX INFO: renamed from: b */
    public final Parcelable f63313b;

    /* JADX INFO: renamed from: c */
    public final String f63314c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31260f)) {
            return false;
        }
        C31260f c31260f = (C31260f) obj;
        return this.f63312a == c31260f.f63312a && Intrinsics.areEqual(this.f63313b, c31260f.f63313b) && Intrinsics.areEqual(this.f63314c, c31260f.f63314c);
    }

    public final int hashCode() {
        return this.f63314c.hashCode() + ((this.f63313b.hashCode() + (Boolean.hashCode(this.f63312a) * 31)) * 31);
    }

    public final String toString() {
        return "AfterInstructionsEvent(success=" + this.f63312a + ", payload=" + this.f63313b + ", instructionsRequestKey=" + this.f63314c + ")";
    }

    public C31260f(boolean z11, Parcelable parcelable, String str) {
        this.f63312a = z11;
        this.f63313b = parcelable;
        this.f63314c = str;
    }
}
