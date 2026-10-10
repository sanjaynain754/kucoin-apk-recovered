package com.sumsub.sns.internal.features.data.model.common.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.A0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29456A0 implements Parcelable {

    /* JADX INFO: renamed from: h */
    public static final Lazy[] f59441h;

    /* JADX INFO: renamed from: a */
    public final EKycFlowStatus f59442a;

    /* JADX INFO: renamed from: b */
    public final ConfirmationType f59443b;

    /* JADX INFO: renamed from: c */
    public final String f59444c;

    /* JADX INFO: renamed from: d */
    public final ConfirmationStatus f59445d;

    /* JADX INFO: renamed from: e */
    public final C29503S f59446e;

    /* JADX INFO: renamed from: f */
    public final C29482J f59447f;

    /* JADX INFO: renamed from: g */
    public final C29458B f59448g;

    @NotNull
    public static final C29626y0 Companion = new C29626y0();

    @NotNull
    public static final Parcelable.Creator<C29456A0> CREATOR = new C29630z0();

    public /* synthetic */ C29456A0(int i11, EKycFlowStatus eKycFlowStatus, ConfirmationType confirmationType, String str, ConfirmationStatus confirmationStatus, C29503S c29503s, C29482J c29482j, C29458B c29458b) {
        if ((i11 & 1) == 0) {
            this.f59442a = null;
        } else {
            this.f59442a = eKycFlowStatus;
        }
        if ((i11 & 2) == 0) {
            this.f59443b = null;
        } else {
            this.f59443b = confirmationType;
        }
        if ((i11 & 4) == 0) {
            this.f59444c = null;
        } else {
            this.f59444c = str;
        }
        if ((i11 & 8) == 0) {
            this.f59445d = null;
        } else {
            this.f59445d = confirmationStatus;
        }
        if ((i11 & 16) == 0) {
            this.f59446e = null;
        } else {
            this.f59446e = c29503s;
        }
        if ((i11 & 32) == 0) {
            this.f59447f = null;
        } else {
            this.f59447f = c29482j;
        }
        if ((i11 & 64) == 0) {
            this.f59448g = null;
        } else {
            this.f59448g = c29458b;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29456A0)) {
            return false;
        }
        C29456A0 c29456a0 = (C29456A0) obj;
        return this.f59442a == c29456a0.f59442a && this.f59443b == c29456a0.f59443b && Intrinsics.areEqual(this.f59444c, c29456a0.f59444c) && this.f59445d == c29456a0.f59445d && Intrinsics.areEqual(this.f59446e, c29456a0.f59446e) && Intrinsics.areEqual(this.f59447f, c29456a0.f59447f) && Intrinsics.areEqual(this.f59448g, c29456a0.f59448g);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59441h = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.a2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EKycFlowStatus.Companion.serializer();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.b2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConfirmationType.Companion.serializer();
            }
        }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.c2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConfirmationStatus.Companion.serializer();
            }
        }), null, null, null};
    }

    public C29456A0(EKycFlowStatus eKycFlowStatus, ConfirmationType confirmationType, String str, ConfirmationStatus confirmationStatus, C29503S c29503s, C29482J c29482j, C29458B c29458b) {
        this.f59442a = eKycFlowStatus;
        this.f59443b = confirmationType;
        this.f59444c = str;
        this.f59445d = confirmationStatus;
        this.f59446e = c29503s;
        this.f59447f = c29482j;
        this.f59448g = c29458b;
    }

    public final int hashCode() {
        EKycFlowStatus eKycFlowStatus = this.f59442a;
        int iHashCode = (eKycFlowStatus == null ? 0 : eKycFlowStatus.hashCode()) * 31;
        ConfirmationType confirmationType = this.f59443b;
        int iHashCode2 = (iHashCode + (confirmationType == null ? 0 : confirmationType.hashCode())) * 31;
        String str = this.f59444c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ConfirmationStatus confirmationStatus = this.f59445d;
        int iHashCode4 = (iHashCode3 + (confirmationStatus == null ? 0 : confirmationStatus.hashCode())) * 31;
        C29503S c29503s = this.f59446e;
        int iHashCode5 = (iHashCode4 + (c29503s == null ? 0 : c29503s.hashCode())) * 31;
        C29482J c29482j = this.f59447f;
        int iHashCode6 = (iHashCode5 + (c29482j == null ? 0 : c29482j.hashCode())) * 31;
        C29458B c29458b = this.f59448g;
        return iHashCode6 + (c29458b != null ? c29458b.hashCode() : 0);
    }

    public final String toString() {
        return "SubmitApplicantDataResponse(status=" + this.f59442a + ", confirmationType=" + this.f59443b + ", confirmationId=" + this.f59444c + ", confirmationStatus=" + this.f59445d + ", otpConfirmation=" + this.f59446e + ", oAuthConfirmation=" + this.f59447f + ", eidConfirmation=" + this.f59448g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        EKycFlowStatus eKycFlowStatus = this.f59442a;
        if (eKycFlowStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(eKycFlowStatus.name());
        }
        ConfirmationType confirmationType = this.f59443b;
        if (confirmationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(confirmationType.name());
        }
        parcel.writeString(this.f59444c);
        ConfirmationStatus confirmationStatus = this.f59445d;
        if (confirmationStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(confirmationStatus.name());
        }
        C29503S c29503s = this.f59446e;
        if (c29503s == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c29503s.writeToParcel(parcel, i11);
        }
        C29482J c29482j = this.f59447f;
        if (c29482j == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c29482j.writeToParcel(parcel, i11);
        }
        C29458B c29458b = this.f59448g;
        if (c29458b == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(c29458b.f59455a);
        parcel.writeString(c29458b.f59456b);
        parcel.writeString(c29458b.f59457c);
    }
}
