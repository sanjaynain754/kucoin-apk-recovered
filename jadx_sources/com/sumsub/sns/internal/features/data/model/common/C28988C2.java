package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.core.widget.AbstractC28250a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.C2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28988C2 extends AbstractC28978A2 {

    @NotNull
    public static final Parcelable.Creator<C28988C2> CREATOR = new C28983B2();

    /* JADX INFO: renamed from: a */
    public final Document f58907a;

    /* JADX INFO: renamed from: b */
    public final String f58908b;

    /* JADX INFO: renamed from: c */
    public final String f58909c;

    /* JADX INFO: renamed from: d */
    public final String f58910d;

    /* JADX INFO: renamed from: e */
    public final boolean f58911e;

    /* JADX INFO: renamed from: f */
    public final int f58912f;

    /* JADX INFO: renamed from: g */
    public final int f58913g;

    /* JADX INFO: renamed from: h */
    public final MRTDInstructionType f58914h;

    /* JADX INFO: renamed from: i */
    public final AbstractC28978A2 f58915i;

    /* JADX INFO: renamed from: j */
    public final int f58916j;

    /* JADX INFO: renamed from: k */
    public final String f58917k;

    /* JADX INFO: renamed from: l */
    public final String f58918l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28988C2)) {
            return false;
        }
        C28988C2 c28988c2 = (C28988C2) obj;
        return Intrinsics.areEqual(this.f58907a, c28988c2.f58907a) && Intrinsics.areEqual(this.f58908b, c28988c2.f58908b) && Intrinsics.areEqual(this.f58909c, c28988c2.f58909c) && Intrinsics.areEqual(this.f58910d, c28988c2.f58910d) && this.f58911e == c28988c2.f58911e && this.f58912f == c28988c2.f58912f && this.f58913g == c28988c2.f58913g && this.f58914h == c28988c2.f58914h && Intrinsics.areEqual(this.f58915i, c28988c2.f58915i) && this.f58916j == c28988c2.f58916j && Intrinsics.areEqual(this.f58917k, c28988c2.f58917k) && Intrinsics.areEqual(this.f58918l, c28988c2.f58918l);
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: a */
    public final AbstractC28978A2 mo69716a(AbstractC28978A2 abstractC28978A2, int i11) {
        return new C28988C2(this.f58907a, this.f58908b, this.f58909c, this.f58910d, this.f58911e, this.f58912f, this.f58913g, this.f58914h, abstractC28978A2, i11, this.f58917k, this.f58918l);
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: b */
    public final int mo69717b() {
        return this.f58916j;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: c */
    public final String mo69718c() {
        return this.f58909c;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: d */
    public final Document mo69719d() {
        return this.f58907a;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: e */
    public final AbstractC28978A2 mo69720e() {
        return this.f58915i;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: f */
    public final String mo69721f() {
        return this.f58908b;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: g */
    public final String mo69722g() {
        return this.f58910d;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: h */
    public final MRTDInstructionType mo69723h() {
        return this.f58914h;
    }

    public final int hashCode() {
        int iM69223a = AbstractC28250a.m69223a(this.f58913g, AbstractC28250a.m69223a(this.f58912f, AbstractC27920h.m69001a(this.f58911e, AbstractC27897U.m68983a(this.f58910d, AbstractC27897U.m68983a(this.f58909c, AbstractC27897U.m68983a(this.f58908b, this.f58907a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        MRTDInstructionType mRTDInstructionType = this.f58914h;
        int iHashCode = (iM69223a + (mRTDInstructionType == null ? 0 : mRTDInstructionType.hashCode())) * 31;
        AbstractC28978A2 abstractC28978A2 = this.f58915i;
        int iM68983a = AbstractC27897U.m68983a(this.f58917k, AbstractC28250a.m69223a(this.f58916j, (iHashCode + (abstractC28978A2 == null ? 0 : abstractC28978A2.hashCode())) * 31, 31), 31);
        String str = this.f58918l;
        return iM68983a + (str != null ? str.hashCode() : 0);
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: i */
    public final int mo69724i() {
        return this.f58913g;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: j */
    public final int mo69725j() {
        return this.f58912f;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: k */
    public final boolean mo69726k() {
        return this.f58911e;
    }

    public final String toString() {
        return "MRTDDocumentBasic(document=" + this.f58907a + ", idDocType=" + this.f58908b + ", country=" + this.f58909c + ", imageId=" + this.f58910d + ", isNfcOptional=" + this.f58911e + ", nfcSkipTries=" + this.f58912f + ", nfcFallbackTries=" + this.f58913g + ", instructionType=" + this.f58914h + ", fallbackDocument=" + this.f58915i + ", carryoverAttempts=" + this.f58916j + ", mrtdSeed=" + this.f58917k + ", mrtdDataFilesToRead=" + this.f58918l + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f58907a.writeToParcel(parcel, i11);
        parcel.writeString(this.f58908b);
        parcel.writeString(this.f58909c);
        parcel.writeString(this.f58910d);
        parcel.writeInt(this.f58911e ? 1 : 0);
        parcel.writeInt(this.f58912f);
        parcel.writeInt(this.f58913g);
        MRTDInstructionType mRTDInstructionType = this.f58914h;
        if (mRTDInstructionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(mRTDInstructionType.name());
        }
        parcel.writeParcelable(this.f58915i, i11);
        parcel.writeInt(this.f58916j);
        parcel.writeString(this.f58917k);
        parcel.writeString(this.f58918l);
    }

    public C28988C2(Document document, String str, String str2, String str3, boolean z11, int i11, int i12, MRTDInstructionType mRTDInstructionType, AbstractC28978A2 abstractC28978A2, int i13, String str4, String str5) {
        this.f58907a = document;
        this.f58908b = str;
        this.f58909c = str2;
        this.f58910d = str3;
        this.f58911e = z11;
        this.f58912f = i11;
        this.f58913g = i12;
        this.f58914h = mRTDInstructionType;
        this.f58915i = abstractC28978A2;
        this.f58916j = i13;
        this.f58917k = str4;
        this.f58918l = str5;
    }
}
