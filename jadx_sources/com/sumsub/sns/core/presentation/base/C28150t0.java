package com.sumsub.sns.core.presentation.base;

import com.sumsub.sentry.android.AbstractC27920h;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.t0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28150t0 extends C28143q {

    /* JADX INFO: renamed from: d */
    public final boolean f57389d;

    /* JADX INFO: renamed from: e */
    public final boolean f57390e;

    /* JADX INFO: renamed from: f */
    public final boolean f57391f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f57392g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f57393h;

    /* JADX INFO: renamed from: a */
    public static C28150t0 m69088a(C28150t0 c28150t0, boolean z11, String str, String str2, int i11) {
        if ((i11 & 1) != 0) {
            z11 = c28150t0.f57389d;
        }
        boolean z12 = z11;
        boolean z13 = (i11 & 2) != 0 ? c28150t0.f57390e : true;
        boolean z14 = (i11 & 4) != 0 ? c28150t0.f57391f : true;
        CharSequence charSequence = str;
        if ((i11 & 8) != 0) {
            charSequence = c28150t0.f57392g;
        }
        CharSequence charSequence2 = charSequence;
        CharSequence charSequence3 = str2;
        if ((i11 & 16) != 0) {
            charSequence3 = c28150t0.f57393h;
        }
        c28150t0.getClass();
        return new C28150t0(z12, z13, z14, charSequence2, charSequence3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28150t0)) {
            return false;
        }
        C28150t0 c28150t0 = (C28150t0) obj;
        return this.f57389d == c28150t0.f57389d && this.f57390e == c28150t0.f57390e && this.f57391f == c28150t0.f57391f && Intrinsics.areEqual(this.f57392g, c28150t0.f57392g) && Intrinsics.areEqual(this.f57393h, c28150t0.f57393h);
    }

    @Override // com.sumsub.sns.core.presentation.base.C28143q
    /* JADX INFO: renamed from: a */
    public final boolean mo69085a() {
        return this.f57389d;
    }

    @Override // com.sumsub.sns.core.presentation.base.C28143q
    /* JADX INFO: renamed from: b */
    public final CharSequence mo69086b() {
        return this.f57392g;
    }

    @Override // com.sumsub.sns.core.presentation.base.C28143q
    /* JADX INFO: renamed from: c */
    public final CharSequence mo69087c() {
        return this.f57393h;
    }

    public final int hashCode() {
        int iM69001a = AbstractC27920h.m69001a(this.f57391f, AbstractC27920h.m69001a(this.f57390e, Boolean.hashCode(this.f57389d) * 31, 31), 31);
        CharSequence charSequence = this.f57392g;
        int iHashCode = (iM69001a + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f57393h;
        return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "SNSOldViewModelInternalState(hideLogo=" + this.f57389d + ", areStringsReady=" + this.f57390e + ", isViewModelPrepared=" + this.f57391f + ", poweredByText=" + ((Object) this.f57392g) + ", progressText=" + ((Object) this.f57393h) + ")";
    }

    public C28150t0(boolean z11, boolean z12, boolean z13, CharSequence charSequence, CharSequence charSequence2) {
        super(charSequence, charSequence2, z11);
        this.f57389d = z11;
        this.f57390e = z12;
        this.f57391f = z13;
        this.f57392g = charSequence;
        this.f57393h = charSequence2;
    }
}
