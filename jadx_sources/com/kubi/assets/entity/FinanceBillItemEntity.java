package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinanceBillItemEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0006\u0010,\u001a\u00020\u000bJ\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u000bHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012¨\u00068"}, m90084d2 = {"Lcom/kubi/assets/entity/FinanceBillItemEntity;", "Landroid/os/Parcelable;", "productCategory", "", "categoryText", "bizType", "bizTypeText", FirebaseAnalytics.Param.CURRENCY, "amount", "fee", "side", "", "createdAt", "", "remark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)V", "getProductCategory", "()Ljava/lang/String;", "getCategoryText", "getBizType", "getBizTypeText", "getCurrency", "getAmount", "getFee", "getSide", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRemark", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/assets/entity/FinanceBillItemEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FinanceBillItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FinanceBillItemEntity> CREATOR = new Creator();

    @Nullable
    private final String amount;

    @Nullable
    private final String bizType;

    @Nullable
    private final String bizTypeText;

    @Nullable
    private final String categoryText;

    @Nullable
    private final Long createdAt;

    @Nullable
    private final String currency;

    @Nullable
    private final String fee;

    @Nullable
    private final String productCategory;

    @Nullable
    private final String remark;

    @Nullable
    private final Integer side;

    /* JADX INFO: compiled from: FinanceBillItemEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FinanceBillItemEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinanceBillItemEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FinanceBillItemEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinanceBillItemEntity[] newArray(int i11) {
            return new FinanceBillItemEntity[i11];
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
        if (!(other instanceof FinanceBillItemEntity)) {
            return false;
        }
        FinanceBillItemEntity financeBillItemEntity = (FinanceBillItemEntity) other;
        return Intrinsics.areEqual(this.productCategory, financeBillItemEntity.productCategory) && Intrinsics.areEqual(this.categoryText, financeBillItemEntity.categoryText) && Intrinsics.areEqual(this.bizType, financeBillItemEntity.bizType) && Intrinsics.areEqual(this.bizTypeText, financeBillItemEntity.bizTypeText) && Intrinsics.areEqual(this.currency, financeBillItemEntity.currency) && Intrinsics.areEqual(this.amount, financeBillItemEntity.amount) && Intrinsics.areEqual(this.fee, financeBillItemEntity.fee) && Intrinsics.areEqual(this.side, financeBillItemEntity.side) && Intrinsics.areEqual(this.createdAt, financeBillItemEntity.createdAt) && Intrinsics.areEqual(this.remark, financeBillItemEntity.remark);
    }

    public static /* synthetic */ FinanceBillItemEntity copy$default(FinanceBillItemEntity financeBillItemEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Long l11, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = financeBillItemEntity.productCategory;
        }
        if ((i11 & 2) != 0) {
            str2 = financeBillItemEntity.categoryText;
        }
        if ((i11 & 4) != 0) {
            str3 = financeBillItemEntity.bizType;
        }
        if ((i11 & 8) != 0) {
            str4 = financeBillItemEntity.bizTypeText;
        }
        if ((i11 & 16) != 0) {
            str5 = financeBillItemEntity.currency;
        }
        if ((i11 & 32) != 0) {
            str6 = financeBillItemEntity.amount;
        }
        if ((i11 & 64) != 0) {
            str7 = financeBillItemEntity.fee;
        }
        if ((i11 & 128) != 0) {
            num = financeBillItemEntity.side;
        }
        if ((i11 & 256) != 0) {
            l11 = financeBillItemEntity.createdAt;
        }
        if ((i11 & 512) != 0) {
            str8 = financeBillItemEntity.remark;
        }
        Long l12 = l11;
        String str9 = str8;
        String str10 = str7;
        Integer num2 = num;
        String str11 = str5;
        String str12 = str6;
        return financeBillItemEntity.copy(str, str2, str3, str4, str11, str12, str10, num2, l12, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProductCategory() {
        return this.productCategory;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategoryText() {
        return this.categoryText;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBizTypeText() {
        return this.bizTypeText;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final FinanceBillItemEntity copy(@Nullable String productCategory, @Nullable String categoryText, @Nullable String bizType, @Nullable String bizTypeText, @Nullable String currency, @Nullable String amount, @Nullable String fee, @Nullable Integer side, @Nullable Long createdAt, @Nullable String remark) {
        return new FinanceBillItemEntity(productCategory, categoryText, bizType, bizTypeText, currency, amount, fee, side, createdAt, remark);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    public final String getBizTypeText() {
        return this.bizTypeText;
    }

    @Nullable
    public final String getCategoryText() {
        return this.categoryText;
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
    public final String getFee() {
        return this.fee;
    }

    @Nullable
    public final String getProductCategory() {
        return this.productCategory;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final Integer getSide() {
        return this.side;
    }

    public int hashCode() {
        String str = this.productCategory;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.categoryText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bizType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bizTypeText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.amount;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fee;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.side;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode9 = (iHashCode8 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str8 = this.remark;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FinanceBillItemEntity(productCategory=" + this.productCategory + ", categoryText=" + this.categoryText + ", bizType=" + this.bizType + ", bizTypeText=" + this.bizTypeText + ", currency=" + this.currency + ", amount=" + this.amount + ", fee=" + this.fee + ", side=" + this.side + ", createdAt=" + this.createdAt + ", remark=" + this.remark + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.productCategory);
        dest.writeString(this.categoryText);
        dest.writeString(this.bizType);
        dest.writeString(this.bizTypeText);
        dest.writeString(this.currency);
        dest.writeString(this.amount);
        dest.writeString(this.fee);
        Integer num = this.side;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.remark);
    }

    public FinanceBillItemEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num, @Nullable Long l11, @Nullable String str8) {
        this.productCategory = str;
        this.categoryText = str2;
        this.bizType = str3;
        this.bizTypeText = str4;
        this.currency = str5;
        this.amount = str6;
        this.fee = str7;
        this.side = num;
        this.createdAt = l11;
        this.remark = str8;
    }
}
