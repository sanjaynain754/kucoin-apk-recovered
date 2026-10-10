package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jz\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00103J\u0006\u00104\u001a\u000205J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u000205HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000205R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013¨\u0006A"}, m90084d2 = {"Lcom/kubi/assets/entity/ExchangeRecordEntity;", "Landroid/os/Parcelable;", "exchangeId", "", FirebaseAnalytics.Param.CURRENCY, "time", "", "estimatedExchangeAmount", "Ljava/math/BigDecimal;", "realExchangeAmount", "fee", "sourceAmount", "positionType", "positionTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getExchangeId", "()Ljava/lang/String;", "setExchangeId", "(Ljava/lang/String;)V", "getCurrency", "setCurrency", "getTime", "()Ljava/lang/Long;", "setTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getEstimatedExchangeAmount", "()Ljava/math/BigDecimal;", "setEstimatedExchangeAmount", "(Ljava/math/BigDecimal;)V", "getRealExchangeAmount", "setRealExchangeAmount", "getFee", "setFee", "getSourceAmount", "setSourceAmount", "getPositionType", "setPositionType", "getPositionTag", "setPositionTag", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/assets/entity/ExchangeRecordEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ExchangeRecordEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExchangeRecordEntity> CREATOR = new Creator();

    @Nullable
    private String currency;

    @Nullable
    private BigDecimal estimatedExchangeAmount;

    @Nullable
    private String exchangeId;

    @Nullable
    private BigDecimal fee;

    @Nullable
    private String positionTag;

    @Nullable
    private String positionType;

    @Nullable
    private BigDecimal realExchangeAmount;

    @Nullable
    private BigDecimal sourceAmount;

    @Nullable
    private Long time;

    /* JADX INFO: compiled from: AssetEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ExchangeRecordEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeRecordEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExchangeRecordEntity(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeRecordEntity[] newArray(int i11) {
            return new ExchangeRecordEntity[i11];
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
        if (!(other instanceof ExchangeRecordEntity)) {
            return false;
        }
        ExchangeRecordEntity exchangeRecordEntity = (ExchangeRecordEntity) other;
        return Intrinsics.areEqual(this.exchangeId, exchangeRecordEntity.exchangeId) && Intrinsics.areEqual(this.currency, exchangeRecordEntity.currency) && Intrinsics.areEqual(this.time, exchangeRecordEntity.time) && Intrinsics.areEqual(this.estimatedExchangeAmount, exchangeRecordEntity.estimatedExchangeAmount) && Intrinsics.areEqual(this.realExchangeAmount, exchangeRecordEntity.realExchangeAmount) && Intrinsics.areEqual(this.fee, exchangeRecordEntity.fee) && Intrinsics.areEqual(this.sourceAmount, exchangeRecordEntity.sourceAmount) && Intrinsics.areEqual(this.positionType, exchangeRecordEntity.positionType) && Intrinsics.areEqual(this.positionTag, exchangeRecordEntity.positionTag);
    }

    public static /* synthetic */ ExchangeRecordEntity copy$default(ExchangeRecordEntity exchangeRecordEntity, String str, String str2, Long l11, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = exchangeRecordEntity.exchangeId;
        }
        if ((i11 & 2) != 0) {
            str2 = exchangeRecordEntity.currency;
        }
        if ((i11 & 4) != 0) {
            l11 = exchangeRecordEntity.time;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = exchangeRecordEntity.estimatedExchangeAmount;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = exchangeRecordEntity.realExchangeAmount;
        }
        if ((i11 & 32) != 0) {
            bigDecimal3 = exchangeRecordEntity.fee;
        }
        if ((i11 & 64) != 0) {
            bigDecimal4 = exchangeRecordEntity.sourceAmount;
        }
        if ((i11 & 128) != 0) {
            str3 = exchangeRecordEntity.positionType;
        }
        if ((i11 & 256) != 0) {
            str4 = exchangeRecordEntity.positionTag;
        }
        String str5 = str3;
        String str6 = str4;
        BigDecimal bigDecimal5 = bigDecimal3;
        BigDecimal bigDecimal6 = bigDecimal4;
        BigDecimal bigDecimal7 = bigDecimal2;
        Long l12 = l11;
        return exchangeRecordEntity.copy(str, str2, l12, bigDecimal, bigDecimal7, bigDecimal5, bigDecimal6, str5, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExchangeId() {
        return this.exchangeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getEstimatedExchangeAmount() {
        return this.estimatedExchangeAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getRealExchangeAmount() {
        return this.realExchangeAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getSourceAmount() {
        return this.sourceAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPositionType() {
        return this.positionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPositionTag() {
        return this.positionTag;
    }

    @NotNull
    public final ExchangeRecordEntity copy(@Nullable String exchangeId, @Nullable String currency, @Nullable Long time, @Nullable BigDecimal estimatedExchangeAmount, @Nullable BigDecimal realExchangeAmount, @Nullable BigDecimal fee, @Nullable BigDecimal sourceAmount, @Nullable String positionType, @Nullable String positionTag) {
        return new ExchangeRecordEntity(exchangeId, currency, time, estimatedExchangeAmount, realExchangeAmount, fee, sourceAmount, positionType, positionTag);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getEstimatedExchangeAmount() {
        return this.estimatedExchangeAmount;
    }

    @Nullable
    public final String getExchangeId() {
        return this.exchangeId;
    }

    @Nullable
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    public final String getPositionTag() {
        return this.positionTag;
    }

    @Nullable
    public final String getPositionType() {
        return this.positionType;
    }

    @Nullable
    public final BigDecimal getRealExchangeAmount() {
        return this.realExchangeAmount;
    }

    @Nullable
    public final BigDecimal getSourceAmount() {
        return this.sourceAmount;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        String str = this.exchangeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.time;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal = this.estimatedExchangeAmount;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.realExchangeAmount;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.fee;
        int iHashCode6 = (iHashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.sourceAmount;
        int iHashCode7 = (iHashCode6 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str3 = this.positionType;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.positionTag;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setEstimatedExchangeAmount(@Nullable BigDecimal bigDecimal) {
        this.estimatedExchangeAmount = bigDecimal;
    }

    public final void setExchangeId(@Nullable String str) {
        this.exchangeId = str;
    }

    public final void setFee(@Nullable BigDecimal bigDecimal) {
        this.fee = bigDecimal;
    }

    public final void setPositionTag(@Nullable String str) {
        this.positionTag = str;
    }

    public final void setPositionType(@Nullable String str) {
        this.positionType = str;
    }

    public final void setRealExchangeAmount(@Nullable BigDecimal bigDecimal) {
        this.realExchangeAmount = bigDecimal;
    }

    public final void setSourceAmount(@Nullable BigDecimal bigDecimal) {
        this.sourceAmount = bigDecimal;
    }

    public final void setTime(@Nullable Long l11) {
        this.time = l11;
    }

    @NotNull
    public String toString() {
        return "ExchangeRecordEntity(exchangeId=" + this.exchangeId + ", currency=" + this.currency + ", time=" + this.time + ", estimatedExchangeAmount=" + this.estimatedExchangeAmount + ", realExchangeAmount=" + this.realExchangeAmount + ", fee=" + this.fee + ", sourceAmount=" + this.sourceAmount + ", positionType=" + this.positionType + ", positionTag=" + this.positionTag + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.exchangeId);
        dest.writeString(this.currency);
        Long l11 = this.time;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.estimatedExchangeAmount);
        dest.writeSerializable(this.realExchangeAmount);
        dest.writeSerializable(this.fee);
        dest.writeSerializable(this.sourceAmount);
        dest.writeString(this.positionType);
        dest.writeString(this.positionTag);
    }

    public ExchangeRecordEntity(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str3, @Nullable String str4) {
        this.exchangeId = str;
        this.currency = str2;
        this.time = l11;
        this.estimatedExchangeAmount = bigDecimal;
        this.realExchangeAmount = bigDecimal2;
        this.fee = bigDecimal3;
        this.sourceAmount = bigDecimal4;
        this.positionType = str3;
        this.positionTag = str4;
    }
}
