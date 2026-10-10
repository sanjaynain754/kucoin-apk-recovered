package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.core.widget.AbstractC28250a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.E2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28998E2 extends AbstractC28978A2 {

    @NotNull
    public static final Parcelable.Creator<C28998E2> CREATOR = new C28993D2();

    /* JADX INFO: renamed from: a */
    public final Document f58923a;

    /* JADX INFO: renamed from: b */
    public final String f58924b;

    /* JADX INFO: renamed from: c */
    public final String f58925c;

    /* JADX INFO: renamed from: d */
    public final String f58926d;

    /* JADX INFO: renamed from: e */
    public final boolean f58927e;

    /* JADX INFO: renamed from: f */
    public final int f58928f;

    /* JADX INFO: renamed from: g */
    public final int f58929g;

    /* JADX INFO: renamed from: h */
    public final MRTDInstructionType f58930h;

    /* JADX INFO: renamed from: i */
    public final AbstractC28978A2 f58931i;

    /* JADX INFO: renamed from: j */
    public final int f58932j;

    /* JADX INFO: renamed from: k */
    public final String f58933k;

    /* JADX INFO: renamed from: l */
    public final String f58934l;

    /* JADX INFO: renamed from: m */
    public final String f58935m;

    /* JADX INFO: renamed from: n */
    public final String f58936n;

    /* JADX INFO: renamed from: o */
    public final String f58937o;

    /* JADX INFO: renamed from: p */
    public final String f58938p;

    /* JADX INFO: renamed from: q */
    public final String f58939q;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28998E2)) {
            return false;
        }
        C28998E2 c28998e2 = (C28998E2) obj;
        return Intrinsics.areEqual(this.f58923a, c28998e2.f58923a) && Intrinsics.areEqual(this.f58924b, c28998e2.f58924b) && Intrinsics.areEqual(this.f58925c, c28998e2.f58925c) && Intrinsics.areEqual(this.f58926d, c28998e2.f58926d) && this.f58927e == c28998e2.f58927e && this.f58928f == c28998e2.f58928f && this.f58929g == c28998e2.f58929g && this.f58930h == c28998e2.f58930h && Intrinsics.areEqual(this.f58931i, c28998e2.f58931i) && this.f58932j == c28998e2.f58932j && Intrinsics.areEqual(this.f58933k, c28998e2.f58933k) && Intrinsics.areEqual(this.f58934l, c28998e2.f58934l) && Intrinsics.areEqual(this.f58935m, c28998e2.f58935m) && Intrinsics.areEqual(this.f58936n, c28998e2.f58936n) && Intrinsics.areEqual(this.f58937o, c28998e2.f58937o) && Intrinsics.areEqual(this.f58938p, c28998e2.f58938p) && Intrinsics.areEqual(this.f58939q, c28998e2.f58939q);
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: a */
    public final AbstractC28978A2 mo69716a(AbstractC28978A2 abstractC28978A2, int i11) {
        return new C28998E2(this.f58923a, this.f58924b, this.f58925c, this.f58926d, this.f58927e, this.f58928f, this.f58929g, this.f58930h, abstractC28978A2, i11, this.f58933k, this.f58934l, this.f58935m, this.f58936n, this.f58937o, this.f58938p, this.f58939q);
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: b */
    public final int mo69717b() {
        return this.f58932j;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: c */
    public final String mo69718c() {
        return this.f58925c;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: d */
    public final Document mo69719d() {
        return this.f58923a;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: e */
    public final AbstractC28978A2 mo69720e() {
        return this.f58931i;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: f */
    public final String mo69721f() {
        return this.f58924b;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: g */
    public final String mo69722g() {
        return this.f58926d;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: h */
    public final MRTDInstructionType mo69723h() {
        return this.f58930h;
    }

    public final int hashCode() {
        int iM69223a = AbstractC28250a.m69223a(this.f58929g, AbstractC28250a.m69223a(this.f58928f, AbstractC27920h.m69001a(this.f58927e, AbstractC27897U.m68983a(this.f58926d, AbstractC27897U.m68983a(this.f58925c, AbstractC27897U.m68983a(this.f58924b, this.f58923a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        MRTDInstructionType mRTDInstructionType = this.f58930h;
        int iHashCode = (iM69223a + (mRTDInstructionType == null ? 0 : mRTDInstructionType.hashCode())) * 31;
        AbstractC28978A2 abstractC28978A2 = this.f58931i;
        int iM68983a = AbstractC27897U.m68983a(this.f58934l, AbstractC27897U.m68983a(this.f58933k, AbstractC28250a.m69223a(this.f58932j, (iHashCode + (abstractC28978A2 == null ? 0 : abstractC28978A2.hashCode())) * 31, 31), 31), 31);
        String str = this.f58935m;
        return this.f58939q.hashCode() + AbstractC27897U.m68983a(this.f58938p, AbstractC27897U.m68983a(this.f58937o, AbstractC27897U.m68983a(this.f58936n, (iM68983a + (str != null ? str.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: i */
    public final int mo69724i() {
        return this.f58929g;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: j */
    public final int mo69725j() {
        return this.f58928f;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2
    /* JADX INFO: renamed from: k */
    public final boolean mo69726k() {
        return this.f58927e;
    }

    public final String toString() {
        return "MRTDDocumentKinegram(document=" + this.f58923a + ", idDocType=" + this.f58924b + ", country=" + this.f58925c + ", imageId=" + this.f58926d + ", isNfcOptional=" + this.f58927e + ", nfcSkipTries=" + this.f58928f + ", nfcFallbackTries=" + this.f58929g + ", instructionType=" + this.f58930h + ", fallbackDocument=" + this.f58931i + ", carryoverAttempts=" + this.f58932j + ", kinegramClientUrl=" + this.f58933k + ", kinegramClientId=" + this.f58934l + ", kinegramAccessToken=" + this.f58935m + ", kinegramSessionId=" + this.f58936n + ", documentNumber=" + this.f58937o + ", birthDate=" + this.f58938p + ", expirationDate=" + this.f58939q + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f58923a.writeToParcel(parcel, i11);
        parcel.writeString(this.f58924b);
        parcel.writeString(this.f58925c);
        parcel.writeString(this.f58926d);
        parcel.writeInt(this.f58927e ? 1 : 0);
        parcel.writeInt(this.f58928f);
        parcel.writeInt(this.f58929g);
        MRTDInstructionType mRTDInstructionType = this.f58930h;
        if (mRTDInstructionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(mRTDInstructionType.name());
        }
        parcel.writeParcelable(this.f58931i, i11);
        parcel.writeInt(this.f58932j);
        parcel.writeString(this.f58933k);
        parcel.writeString(this.f58934l);
        parcel.writeString(this.f58935m);
        parcel.writeString(this.f58936n);
        parcel.writeString(this.f58937o);
        parcel.writeString(this.f58938p);
        parcel.writeString(this.f58939q);
    }

    public C28998E2(Document document, String str, String str2, String str3, boolean z11, int i11, int i12, MRTDInstructionType mRTDInstructionType, AbstractC28978A2 abstractC28978A2, int i13, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f58923a = document;
        this.f58924b = str;
        this.f58925c = str2;
        this.f58926d = str3;
        this.f58927e = z11;
        this.f58928f = i11;
        this.f58929g = i12;
        this.f58930h = mRTDInstructionType;
        this.f58931i = abstractC28978A2;
        this.f58932j = i13;
        this.f58933k = str4;
        this.f58934l = str5;
        this.f58935m = str6;
        this.f58936n = str7;
        this.f58937o = str8;
        this.f58938p = str9;
        this.f58939q = str10;
    }
}
