package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.f2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31263f2 implements InterfaceC28147s {

    /* JADX INFO: renamed from: a */
    public final boolean f63321a;

    /* JADX INFO: renamed from: b */
    public final Boolean f63322b;

    /* JADX INFO: renamed from: c */
    public final boolean f63323c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f63324d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f63325e;

    public /* synthetic */ C31263f2() {
        this(false, null, false, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31263f2)) {
            return false;
        }
        C31263f2 c31263f2 = (C31263f2) obj;
        return this.f63321a == c31263f2.f63321a && Intrinsics.areEqual(this.f63322b, c31263f2.f63322b) && this.f63323c == c31263f2.f63323c && Intrinsics.areEqual(this.f63324d, c31263f2.f63324d) && Intrinsics.areEqual(this.f63325e, c31263f2.f63325e);
    }

    public C31263f2(boolean z11, Boolean bool, boolean z12, CharSequence charSequence, CharSequence charSequence2) {
        this.f63321a = z11;
        this.f63322b = bool;
        this.f63323c = z12;
        this.f63324d = charSequence;
        this.f63325e = charSequence2;
    }

    /* JADX INFO: renamed from: a */
    public static C31263f2 m70662a(C31263f2 c31263f2, Boolean bool, boolean z11, CharSequence charSequence, CharSequence charSequence2, int i11) {
        boolean z12 = (i11 & 1) != 0 ? c31263f2.f63321a : true;
        if ((i11 & 2) != 0) {
            bool = c31263f2.f63322b;
        }
        if ((i11 & 4) != 0) {
            z11 = c31263f2.f63323c;
        }
        if ((i11 & 8) != 0) {
            charSequence = c31263f2.f63324d;
        }
        if ((i11 & 16) != 0) {
            charSequence2 = c31263f2.f63325e;
        }
        CharSequence charSequence3 = charSequence2;
        c31263f2.getClass();
        CharSequence charSequence4 = charSequence;
        return new C31263f2(z12, bool, z11, charSequence4, charSequence3);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f63321a) * 31;
        Boolean bool = this.f63322b;
        int iM69001a = AbstractC27920h.m69001a(this.f63323c, (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        CharSequence charSequence = this.f63324d;
        int iHashCode2 = (iM69001a + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f63325e;
        return iHashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "SNSAppViewState(isSdkPrepared=" + this.f63321a + ", isLoading=" + this.f63322b + ", loadingIsTooLong=" + this.f63323c + ", preparedText=" + ((Object) this.f63324d) + ", loadingTooLongText=" + ((Object) this.f63325e) + ")";
    }
}
