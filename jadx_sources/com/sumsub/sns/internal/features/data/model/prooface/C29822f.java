package com.sumsub.sns.internal.features.data.model.prooface;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.prooface.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29822f {

    @NotNull
    public static final C29821e Companion = new C29821e();

    /* JADX INFO: renamed from: a */
    public final float f59901a;

    /* JADX INFO: renamed from: b */
    public final float f59902b;

    /* JADX INFO: renamed from: c */
    public final String f59903c;

    public /* synthetic */ C29822f(int i11, float f11, float f12, String str) {
        if (3 != (i11 & 3)) {
            C41801c2.m91514a(i11, 3, C29820d.f59900a.getDescriptor());
        }
        this.f59901a = f11;
        this.f59902b = f12;
        if ((i11 & 4) == 0) {
            this.f59903c = null;
        } else {
            this.f59903c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29822f)) {
            return false;
        }
        C29822f c29822f = (C29822f) obj;
        return Float.compare(this.f59901a, c29822f.f59901a) == 0 && Float.compare(this.f59902b, c29822f.f59902b) == 0 && Intrinsics.areEqual(this.f59903c, c29822f.f59903c);
    }

    public C29822f(float f11, float f12, String str) {
        this.f59901a = f11;
        this.f59902b = f12;
        this.f59903c = str;
    }

    public final int hashCode() {
        int iHashCode = (Float.hashCode(this.f59902b) + (Float.hashCode(this.f59901a) * 31)) * 31;
        String str = this.f59903c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CalibrationValue(expositionBias=" + this.f59901a + ", brightness=" + this.f59902b + ", color=" + this.f59903c + ")";
    }
}
