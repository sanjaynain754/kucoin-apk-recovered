package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u001a\u001a\u00020\u000bJ\u0006\u0010\u001b\u001a\u00020\u000bJ\u0006\u0010\u001c\u001a\u00020\u000bJ\u0006\u0010\u001d\u001a\u00020\u000bJ\u0006\u0010\u001e\u001a\u00020\u000bJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018JV\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020\bJ\u0013\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\bHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u00063"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatUserInfo;", "Landroid/os/Parcelable;", "kycName", "", "bindPayChannel", "supportFiatResponse", "Lcom/kubi/otc/entity/SupportFiatResponse;", "kycLevel", "", "verifyStatus", "kycExpired", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/SupportFiatResponse;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getKycName", "()Ljava/lang/String;", "getBindPayChannel", "getSupportFiatResponse", "()Lcom/kubi/otc/entity/SupportFiatResponse;", "getKycLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVerifyStatus", "getKycExpired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isHighKyc", "isUnverified", "isVerifying", "isFailed", "isSanctionKyc", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/SupportFiatResponse;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/kubi/otc/entity/FiatUserInfo;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatUserInfo implements Parcelable {
    private static final int IN_AML_REVIEW_STATUS = 3;
    private static final int IN_REVIEW_STATUS = 0;
    private static final int KYC_LEVER_HIGH = 2;
    private static final int SUCCESS_REVIEW = 1;
    private static final int UN_COMMIT = -1;
    private static final int UN_PASS_AML_REVIEW_STATUS = 4;
    private static final int UN_PASS_REVIEW_STATUS = 2;
    private static final int UN_SUPPORT_STATUS = 5;

    @Nullable
    private final String bindPayChannel;

    @SerializedName("isExpired")
    @Nullable
    private final Boolean kycExpired;

    @Nullable
    private final Integer kycLevel;

    @Nullable
    private final String kycName;

    @Nullable
    private final SupportFiatResponse supportFiatResponse;

    @Nullable
    private final Integer verifyStatus;

    @NotNull
    public static final Parcelable.Creator<FiatUserInfo> CREATOR = new Creator();

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatUserInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatUserInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf = null;
            SupportFiatResponse supportFiatResponseCreateFromParcel = parcel.readInt() == 0 ? null : SupportFiatResponse.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FiatUserInfo(string, string2, supportFiatResponseCreateFromParcel, numValueOf, numValueOf2, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatUserInfo[] newArray(int i11) {
            return new FiatUserInfo[i11];
        }
    }

    public FiatUserInfo(@Nullable String str, @Nullable String str2, @Nullable SupportFiatResponse supportFiatResponse, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool) {
        this.kycName = str;
        this.bindPayChannel = str2;
        this.supportFiatResponse = supportFiatResponse;
        this.kycLevel = num;
        this.verifyStatus = num2;
        this.kycExpired = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiatUserInfo)) {
            return false;
        }
        FiatUserInfo fiatUserInfo = (FiatUserInfo) other;
        return Intrinsics.areEqual(this.kycName, fiatUserInfo.kycName) && Intrinsics.areEqual(this.bindPayChannel, fiatUserInfo.bindPayChannel) && Intrinsics.areEqual(this.supportFiatResponse, fiatUserInfo.supportFiatResponse) && Intrinsics.areEqual(this.kycLevel, fiatUserInfo.kycLevel) && Intrinsics.areEqual(this.verifyStatus, fiatUserInfo.verifyStatus) && Intrinsics.areEqual(this.kycExpired, fiatUserInfo.kycExpired);
    }

    public static /* synthetic */ FiatUserInfo copy$default(FiatUserInfo fiatUserInfo, String str, String str2, SupportFiatResponse supportFiatResponse, Integer num, Integer num2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatUserInfo.kycName;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatUserInfo.bindPayChannel;
        }
        if ((i11 & 4) != 0) {
            supportFiatResponse = fiatUserInfo.supportFiatResponse;
        }
        if ((i11 & 8) != 0) {
            num = fiatUserInfo.kycLevel;
        }
        if ((i11 & 16) != 0) {
            num2 = fiatUserInfo.verifyStatus;
        }
        if ((i11 & 32) != 0) {
            bool = fiatUserInfo.kycExpired;
        }
        Integer num3 = num2;
        Boolean bool2 = bool;
        return fiatUserInfo.copy(str, str2, supportFiatResponse, num, num3, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKycName() {
        return this.kycName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBindPayChannel() {
        return this.bindPayChannel;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SupportFiatResponse getSupportFiatResponse() {
        return this.supportFiatResponse;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getKycLevel() {
        return this.kycLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getKycExpired() {
        return this.kycExpired;
    }

    @NotNull
    public final FiatUserInfo copy(@Nullable String kycName, @Nullable String bindPayChannel, @Nullable SupportFiatResponse supportFiatResponse, @Nullable Integer kycLevel, @Nullable Integer verifyStatus, @Nullable Boolean kycExpired) {
        return new FiatUserInfo(kycName, bindPayChannel, supportFiatResponse, kycLevel, verifyStatus, kycExpired);
    }

    @Nullable
    public final String getBindPayChannel() {
        return this.bindPayChannel;
    }

    @Nullable
    public final Boolean getKycExpired() {
        return this.kycExpired;
    }

    @Nullable
    public final Integer getKycLevel() {
        return this.kycLevel;
    }

    @Nullable
    public final String getKycName() {
        return this.kycName;
    }

    @Nullable
    public final SupportFiatResponse getSupportFiatResponse() {
        return this.supportFiatResponse;
    }

    @Nullable
    public final Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    public int hashCode() {
        String str = this.kycName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bindPayChannel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SupportFiatResponse supportFiatResponse = this.supportFiatResponse;
        int iHashCode3 = (iHashCode2 + (supportFiatResponse == null ? 0 : supportFiatResponse.hashCode())) * 31;
        Integer num = this.kycLevel;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.verifyStatus;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.kycExpired;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isFailed() {
        Integer num = this.verifyStatus;
        if (num != null && num.intValue() == 2) {
            return true;
        }
        Integer num2 = this.verifyStatus;
        if (num2 != null && num2.intValue() == 4) {
            return true;
        }
        Integer num3 = this.verifyStatus;
        return num3 != null && num3.intValue() == 5;
    }

    public final boolean isHighKyc() {
        Integer num;
        Integer num2 = this.kycLevel;
        return (num2 != null && num2.intValue() == 2) || ((num = this.verifyStatus) != null && num.intValue() == 1);
    }

    public final boolean isSanctionKyc() {
        Integer num;
        Integer num2 = this.kycLevel;
        return num2 != null && num2.intValue() == 2 && (num = this.verifyStatus) != null && num.intValue() == 5;
    }

    public final boolean isUnverified() {
        Integer num = this.verifyStatus;
        return num != null && num.intValue() == -1;
    }

    public final boolean isVerifying() {
        Integer num = this.verifyStatus;
        if (num != null && num.intValue() == 0) {
            return true;
        }
        Integer num2 = this.verifyStatus;
        return num2 != null && num2.intValue() == 3;
    }

    @NotNull
    public String toString() {
        return "FiatUserInfo(kycName=" + this.kycName + ", bindPayChannel=" + this.bindPayChannel + ", supportFiatResponse=" + this.supportFiatResponse + ", kycLevel=" + this.kycLevel + ", verifyStatus=" + this.verifyStatus + ", kycExpired=" + this.kycExpired + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.kycName);
        dest.writeString(this.bindPayChannel);
        SupportFiatResponse supportFiatResponse = this.supportFiatResponse;
        if (supportFiatResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            supportFiatResponse.writeToParcel(dest, flags);
        }
        Integer num = this.kycLevel;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.verifyStatus;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Boolean bool = this.kycExpired;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ FiatUserInfo(String str, String str2, SupportFiatResponse supportFiatResponse, Integer num, Integer num2, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, supportFiatResponse, num, (i11 & 16) != 0 ? -1 : num2, (i11 & 32) != 0 ? Boolean.FALSE : bool);
    }
}
