package com.kubi.kumex.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TransferRecordEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0092\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020-HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00069"}, m90084d2 = {"Lcom/kubi/kumex/entity/TransferRecordEntity;", "Landroid/os/Parcelable;", "amount", "", "applyId", "createdAt", "", FirebaseAnalytics.Param.CURRENCY, "displayName", TypedValues.CycleType.S_WAVE_OFFSET, "payAccountType", "reason", "recAccountType", "status", "tag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getApplyId", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "getDisplayName", "getOffset", "getPayAccountType", "getReason", "getRecAccountType", "getStatus", "getTag", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kumex/entity/TransferRecordEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TransferRecordEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferRecordEntity> CREATOR = new Creator();

    @Nullable
    private final String amount;

    @Nullable
    private final String applyId;

    @Nullable
    private final Long createdAt;

    @Nullable
    private final String currency;

    @Nullable
    private final String displayName;

    @Nullable
    private final Long offset;

    @Nullable
    private final String payAccountType;

    @Nullable
    private final String reason;

    @Nullable
    private final String recAccountType;

    @Nullable
    private final String status;

    @Nullable
    private final String tag;

    /* JADX INFO: compiled from: TransferRecordEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferRecordEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferRecordEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferRecordEntity(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferRecordEntity[] newArray(int i11) {
            return new TransferRecordEntity[i11];
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
        if (!(other instanceof TransferRecordEntity)) {
            return false;
        }
        TransferRecordEntity transferRecordEntity = (TransferRecordEntity) other;
        return Intrinsics.areEqual(this.amount, transferRecordEntity.amount) && Intrinsics.areEqual(this.applyId, transferRecordEntity.applyId) && Intrinsics.areEqual(this.createdAt, transferRecordEntity.createdAt) && Intrinsics.areEqual(this.currency, transferRecordEntity.currency) && Intrinsics.areEqual(this.displayName, transferRecordEntity.displayName) && Intrinsics.areEqual(this.offset, transferRecordEntity.offset) && Intrinsics.areEqual(this.payAccountType, transferRecordEntity.payAccountType) && Intrinsics.areEqual(this.reason, transferRecordEntity.reason) && Intrinsics.areEqual(this.recAccountType, transferRecordEntity.recAccountType) && Intrinsics.areEqual(this.status, transferRecordEntity.status) && Intrinsics.areEqual(this.tag, transferRecordEntity.tag);
    }

    public static /* synthetic */ TransferRecordEntity copy$default(TransferRecordEntity transferRecordEntity, String str, String str2, Long l11, String str3, String str4, Long l12, String str5, String str6, String str7, String str8, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = transferRecordEntity.amount;
        }
        if ((i11 & 2) != 0) {
            str2 = transferRecordEntity.applyId;
        }
        if ((i11 & 4) != 0) {
            l11 = transferRecordEntity.createdAt;
        }
        if ((i11 & 8) != 0) {
            str3 = transferRecordEntity.currency;
        }
        if ((i11 & 16) != 0) {
            str4 = transferRecordEntity.displayName;
        }
        if ((i11 & 32) != 0) {
            l12 = transferRecordEntity.offset;
        }
        if ((i11 & 64) != 0) {
            str5 = transferRecordEntity.payAccountType;
        }
        if ((i11 & 128) != 0) {
            str6 = transferRecordEntity.reason;
        }
        if ((i11 & 256) != 0) {
            str7 = transferRecordEntity.recAccountType;
        }
        if ((i11 & 512) != 0) {
            str8 = transferRecordEntity.status;
        }
        if ((i11 & 1024) != 0) {
            str9 = transferRecordEntity.tag;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        Long l13 = l12;
        String str14 = str5;
        String str15 = str4;
        Long l14 = l11;
        return transferRecordEntity.copy(str, str2, l14, str3, str15, l13, str14, str12, str13, str10, str11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApplyId() {
        return this.applyId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getOffset() {
        return this.offset;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPayAccountType() {
        return this.payAccountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRecAccountType() {
        return this.recAccountType;
    }

    @NotNull
    public final TransferRecordEntity copy(@Nullable String amount, @Nullable String applyId, @Nullable Long createdAt, @Nullable String currency, @Nullable String displayName, @Nullable Long offset, @Nullable String payAccountType, @Nullable String reason, @Nullable String recAccountType, @Nullable String status, @Nullable String tag) {
        return new TransferRecordEntity(amount, applyId, createdAt, currency, displayName, offset, payAccountType, reason, recAccountType, status, tag);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getApplyId() {
        return this.applyId;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final Long getOffset() {
        return this.offset;
    }

    @Nullable
    public final String getPayAccountType() {
        return this.payAccountType;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    public final String getRecAccountType() {
        return this.recAccountType;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applyId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l12 = this.offset;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str5 = this.payAccountType;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.reason;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.recAccountType;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.status;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tag;
        return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TransferRecordEntity(amount=" + this.amount + ", applyId=" + this.applyId + ", createdAt=" + this.createdAt + ", currency=" + this.currency + ", displayName=" + this.displayName + ", offset=" + this.offset + ", payAccountType=" + this.payAccountType + ", reason=" + this.reason + ", recAccountType=" + this.recAccountType + ", status=" + this.status + ", tag=" + this.tag + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.amount);
        dest.writeString(this.applyId);
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.currency);
        dest.writeString(this.displayName);
        Long l12 = this.offset;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.payAccountType);
        dest.writeString(this.reason);
        dest.writeString(this.recAccountType);
        dest.writeString(this.status);
        dest.writeString(this.tag);
    }

    public TransferRecordEntity(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable String str3, @Nullable String str4, @Nullable Long l12, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.amount = str;
        this.applyId = str2;
        this.createdAt = l11;
        this.currency = str3;
        this.displayName = str4;
        this.offset = l12;
        this.payAccountType = str5;
        this.reason = str6;
        this.recAccountType = str7;
        this.status = str8;
        this.tag = str9;
    }
}
