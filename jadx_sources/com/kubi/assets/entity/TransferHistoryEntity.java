package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TransferHistoryEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, m90084d2 = {"Lcom/kubi/assets/entity/TransferHistoryEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "amount", "payAccountType", "recAccountType", "subAccountDirection", "createdTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getAmount", "getPayAccountType", "getRecAccountType", "getSubAccountDirection", "getCreatedTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TransferHistoryEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferHistoryEntity> CREATOR = new Creator();

    @Nullable
    private final String amount;

    @Nullable
    private final String createdTime;

    @Nullable
    private final String currency;

    @Nullable
    private final String payAccountType;

    @Nullable
    private final String recAccountType;

    @Nullable
    private final String subAccountDirection;

    /* JADX INFO: compiled from: TransferHistoryEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferHistoryEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferHistoryEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferHistoryEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferHistoryEntity[] newArray(int i11) {
            return new TransferHistoryEntity[i11];
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
        if (!(other instanceof TransferHistoryEntity)) {
            return false;
        }
        TransferHistoryEntity transferHistoryEntity = (TransferHistoryEntity) other;
        return Intrinsics.areEqual(this.currency, transferHistoryEntity.currency) && Intrinsics.areEqual(this.amount, transferHistoryEntity.amount) && Intrinsics.areEqual(this.payAccountType, transferHistoryEntity.payAccountType) && Intrinsics.areEqual(this.recAccountType, transferHistoryEntity.recAccountType) && Intrinsics.areEqual(this.subAccountDirection, transferHistoryEntity.subAccountDirection) && Intrinsics.areEqual(this.createdTime, transferHistoryEntity.createdTime);
    }

    public static /* synthetic */ TransferHistoryEntity copy$default(TransferHistoryEntity transferHistoryEntity, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = transferHistoryEntity.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = transferHistoryEntity.amount;
        }
        if ((i11 & 4) != 0) {
            str3 = transferHistoryEntity.payAccountType;
        }
        if ((i11 & 8) != 0) {
            str4 = transferHistoryEntity.recAccountType;
        }
        if ((i11 & 16) != 0) {
            str5 = transferHistoryEntity.subAccountDirection;
        }
        if ((i11 & 32) != 0) {
            str6 = transferHistoryEntity.createdTime;
        }
        String str7 = str5;
        String str8 = str6;
        return transferHistoryEntity.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPayAccountType() {
        return this.payAccountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRecAccountType() {
        return this.recAccountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubAccountDirection() {
        return this.subAccountDirection;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCreatedTime() {
        return this.createdTime;
    }

    @NotNull
    public final TransferHistoryEntity copy(@Nullable String currency, @Nullable String amount, @Nullable String payAccountType, @Nullable String recAccountType, @Nullable String subAccountDirection, @Nullable String createdTime) {
        return new TransferHistoryEntity(currency, amount, payAccountType, recAccountType, subAccountDirection, createdTime);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCreatedTime() {
        return this.createdTime;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getPayAccountType() {
        return this.payAccountType;
    }

    @Nullable
    public final String getRecAccountType() {
        return this.recAccountType;
    }

    @Nullable
    public final String getSubAccountDirection() {
        return this.subAccountDirection;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payAccountType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.recAccountType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subAccountDirection;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.createdTime;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TransferHistoryEntity(currency=" + this.currency + ", amount=" + this.amount + ", payAccountType=" + this.payAccountType + ", recAccountType=" + this.recAccountType + ", subAccountDirection=" + this.subAccountDirection + ", createdTime=" + this.createdTime + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeString(this.amount);
        dest.writeString(this.payAccountType);
        dest.writeString(this.recAccountType);
        dest.writeString(this.subAccountDirection);
        dest.writeString(this.createdTime);
    }

    public TransferHistoryEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.currency = str;
        this.amount = str2;
        this.payAccountType = str3;
        this.recAccountType = str4;
        this.subAccountDirection = str5;
        this.createdTime = str6;
    }
}
