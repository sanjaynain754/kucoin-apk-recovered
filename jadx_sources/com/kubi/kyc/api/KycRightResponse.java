package com.kubi.kyc.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycEntity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/kyc/api/KycRightResponse;", "Landroid/os/Parcelable;", "companyPrivilege", "Lcom/kubi/kyc/api/KycRight;", "primaryPrivilege", "verifiedPrivilege", "<init>", "(Lcom/kubi/kyc/api/KycRight;Lcom/kubi/kyc/api/KycRight;Lcom/kubi/kyc/api/KycRight;)V", "getCompanyPrivilege", "()Lcom/kubi/kyc/api/KycRight;", "getPrimaryPrivilege", "getVerifiedPrivilege", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KycApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KycRightResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KycRightResponse> CREATOR = new C17095a();

    @Nullable
    private final KycRight companyPrivilege;

    @Nullable
    private final KycRight primaryPrivilege;

    @Nullable
    private final KycRight verifiedPrivilege;

    /* JADX INFO: renamed from: com.kubi.kyc.api.KycRightResponse$a */
    /* JADX INFO: compiled from: KycEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17095a implements Parcelable.Creator<KycRightResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KycRightResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KycRightResponse(parcel.readInt() == 0 ? null : KycRight.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : KycRight.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? KycRight.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KycRightResponse[] newArray(int i11) {
            return new KycRightResponse[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycRightResponse)) {
            return false;
        }
        KycRightResponse kycRightResponse = (KycRightResponse) other;
        return Intrinsics.areEqual(this.companyPrivilege, kycRightResponse.companyPrivilege) && Intrinsics.areEqual(this.primaryPrivilege, kycRightResponse.primaryPrivilege) && Intrinsics.areEqual(this.verifiedPrivilege, kycRightResponse.verifiedPrivilege);
    }

    public static /* synthetic */ KycRightResponse copy$default(KycRightResponse kycRightResponse, KycRight kycRight, KycRight kycRight2, KycRight kycRight3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kycRight = kycRightResponse.companyPrivilege;
        }
        if ((i11 & 2) != 0) {
            kycRight2 = kycRightResponse.primaryPrivilege;
        }
        if ((i11 & 4) != 0) {
            kycRight3 = kycRightResponse.verifiedPrivilege;
        }
        return kycRightResponse.copy(kycRight, kycRight2, kycRight3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final KycRight getCompanyPrivilege() {
        return this.companyPrivilege;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final KycRight getPrimaryPrivilege() {
        return this.primaryPrivilege;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final KycRight getVerifiedPrivilege() {
        return this.verifiedPrivilege;
    }

    @NotNull
    public final KycRightResponse copy(@Nullable KycRight companyPrivilege, @Nullable KycRight primaryPrivilege, @Nullable KycRight verifiedPrivilege) {
        return new KycRightResponse(companyPrivilege, primaryPrivilege, verifiedPrivilege);
    }

    @Nullable
    public final KycRight getCompanyPrivilege() {
        return this.companyPrivilege;
    }

    @Nullable
    public final KycRight getPrimaryPrivilege() {
        return this.primaryPrivilege;
    }

    @Nullable
    public final KycRight getVerifiedPrivilege() {
        return this.verifiedPrivilege;
    }

    public int hashCode() {
        KycRight kycRight = this.companyPrivilege;
        int iHashCode = (kycRight == null ? 0 : kycRight.hashCode()) * 31;
        KycRight kycRight2 = this.primaryPrivilege;
        int iHashCode2 = (iHashCode + (kycRight2 == null ? 0 : kycRight2.hashCode())) * 31;
        KycRight kycRight3 = this.verifiedPrivilege;
        return iHashCode2 + (kycRight3 != null ? kycRight3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KycRightResponse(companyPrivilege=" + this.companyPrivilege + ", primaryPrivilege=" + this.primaryPrivilege + ", verifiedPrivilege=" + this.verifiedPrivilege + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        KycRight kycRight = this.companyPrivilege;
        if (kycRight == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycRight.writeToParcel(dest, flags);
        }
        KycRight kycRight2 = this.primaryPrivilege;
        if (kycRight2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycRight2.writeToParcel(dest, flags);
        }
        KycRight kycRight3 = this.verifiedPrivilege;
        if (kycRight3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycRight3.writeToParcel(dest, flags);
        }
    }

    public KycRightResponse(@Nullable KycRight kycRight, @Nullable KycRight kycRight2, @Nullable KycRight kycRight3) {
        this.companyPrivilege = kycRight;
        this.primaryPrivilege = kycRight2;
        this.verifiedPrivilege = kycRight3;
    }
}
