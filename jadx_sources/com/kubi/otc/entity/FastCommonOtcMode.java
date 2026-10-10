package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006)"}, m90084d2 = {"Lcom/kubi/otc/entity/FastCommonOtcMode;", "Landroid/os/Parcelable;", "adId", "", "kycMatching", "", TUIConstants.TUIContact.LIMIT, "available", "payTypeCode", "kycLevel", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getAdId", "()Ljava/lang/String;", "getKycMatching", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLimit", "getAvailable", "getPayTypeCode", "getKycLevel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/otc/entity/FastCommonOtcMode;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FastCommonOtcMode implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FastCommonOtcMode> CREATOR = new Creator();

    @Nullable
    private final String adId;

    @Nullable
    private final Boolean available;

    @Nullable
    private final String kycLevel;

    @Nullable
    private final Boolean kycMatching;

    @Nullable
    private final Boolean limit;

    @Nullable
    private final String payTypeCode;

    /* JADX INFO: compiled from: FastBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FastCommonOtcMode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastCommonOtcMode createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FastCommonOtcMode(string, boolValueOf, boolValueOf2, boolValueOf3, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastCommonOtcMode[] newArray(int i11) {
            return new FastCommonOtcMode[i11];
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
        if (!(other instanceof FastCommonOtcMode)) {
            return false;
        }
        FastCommonOtcMode fastCommonOtcMode = (FastCommonOtcMode) other;
        return Intrinsics.areEqual(this.adId, fastCommonOtcMode.adId) && Intrinsics.areEqual(this.kycMatching, fastCommonOtcMode.kycMatching) && Intrinsics.areEqual(this.limit, fastCommonOtcMode.limit) && Intrinsics.areEqual(this.available, fastCommonOtcMode.available) && Intrinsics.areEqual(this.payTypeCode, fastCommonOtcMode.payTypeCode) && Intrinsics.areEqual(this.kycLevel, fastCommonOtcMode.kycLevel);
    }

    public static /* synthetic */ FastCommonOtcMode copy$default(FastCommonOtcMode fastCommonOtcMode, String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fastCommonOtcMode.adId;
        }
        if ((i11 & 2) != 0) {
            bool = fastCommonOtcMode.kycMatching;
        }
        if ((i11 & 4) != 0) {
            bool2 = fastCommonOtcMode.limit;
        }
        if ((i11 & 8) != 0) {
            bool3 = fastCommonOtcMode.available;
        }
        if ((i11 & 16) != 0) {
            str2 = fastCommonOtcMode.payTypeCode;
        }
        if ((i11 & 32) != 0) {
            str3 = fastCommonOtcMode.kycLevel;
        }
        String str4 = str2;
        String str5 = str3;
        return fastCommonOtcMode.copy(str, bool, bool2, bool3, str4, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getKycMatching() {
        return this.kycMatching;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getLimit() {
        return this.limit;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getAvailable() {
        return this.available;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPayTypeCode() {
        return this.payTypeCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getKycLevel() {
        return this.kycLevel;
    }

    @NotNull
    public final FastCommonOtcMode copy(@Nullable String adId, @Nullable Boolean kycMatching, @Nullable Boolean limit, @Nullable Boolean available, @Nullable String payTypeCode, @Nullable String kycLevel) {
        return new FastCommonOtcMode(adId, kycMatching, limit, available, payTypeCode, kycLevel);
    }

    @Nullable
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    public final Boolean getAvailable() {
        return this.available;
    }

    @Nullable
    public final String getKycLevel() {
        return this.kycLevel;
    }

    @Nullable
    public final Boolean getKycMatching() {
        return this.kycMatching;
    }

    @Nullable
    public final Boolean getLimit() {
        return this.limit;
    }

    @Nullable
    public final String getPayTypeCode() {
        return this.payTypeCode;
    }

    public int hashCode() {
        String str = this.adId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.kycMatching;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.limit;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.available;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.payTypeCode;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.kycLevel;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FastCommonOtcMode(adId=" + this.adId + ", kycMatching=" + this.kycMatching + ", limit=" + this.limit + ", available=" + this.available + ", payTypeCode=" + this.payTypeCode + ", kycLevel=" + this.kycLevel + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.adId);
        Boolean bool = this.kycMatching;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.limit;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.available;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.payTypeCode);
        dest.writeString(this.kycLevel);
    }

    public FastCommonOtcMode(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str2, @Nullable String str3) {
        this.adId = str;
        this.kycMatching = bool;
        this.limit = bool2;
        this.available = bool3;
        this.payTypeCode = str2;
        this.kycLevel = str3;
    }
}
