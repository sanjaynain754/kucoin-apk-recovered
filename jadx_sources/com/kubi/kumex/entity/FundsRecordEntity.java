package com.kubi.kumex.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.otc.entity.OtcAd;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FundsRecordEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b2\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\b\u00100\u001a\u0004\u0018\u00010\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010<J\u0006\u0010=\u001a\u00020\bJ\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020\bHÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001J\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\"\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010\u0015¨\u0006I"}, m90084d2 = {"Lcom/kubi/kumex/entity/FundsRecordEntity;", "Landroid/os/Parcelable;", "id", "", FirebaseAnalytics.Param.CURRENCY, "amount", "Ljava/math/BigDecimal;", TypedValues.CycleType.S_WAVE_OFFSET, "", "side", "remark", "timestamp", "", "type", "typeName", "prizeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getCurrency", "setCurrency", "getAmount", "()Ljava/math/BigDecimal;", "setAmount", "(Ljava/math/BigDecimal;)V", "getOffset", "()Ljava/lang/Integer;", "setOffset", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSide", "setSide", "getRemark", "setRemark", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getType", "setType", "getTypeName", "setTypeName", "getPrizeType", "setPrizeType", "getFormatAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kumex/entity/FundsRecordEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FundsRecordEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FundsRecordEntity> CREATOR = new Creator();

    @Nullable
    private BigDecimal amount;

    @Nullable
    private String currency;

    @Nullable
    private String id;

    @Nullable
    private Integer offset;

    @Nullable
    private String prizeType;

    @Nullable
    private String remark;

    @Nullable
    private String side;

    @SerializedName("time")
    @Nullable
    private Long timestamp;

    @Nullable
    private String type;

    @Nullable
    private String typeName;

    /* JADX INFO: compiled from: FundsRecordEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FundsRecordEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundsRecordEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FundsRecordEntity(parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundsRecordEntity[] newArray(int i11) {
            return new FundsRecordEntity[i11];
        }
    }

    public FundsRecordEntity(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable Long l11, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.id = str;
        this.currency = str2;
        this.amount = bigDecimal;
        this.offset = num;
        this.side = str3;
        this.remark = str4;
        this.timestamp = l11;
        this.type = str5;
        this.typeName = str6;
        this.prizeType = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundsRecordEntity)) {
            return false;
        }
        FundsRecordEntity fundsRecordEntity = (FundsRecordEntity) other;
        return Intrinsics.areEqual(this.id, fundsRecordEntity.id) && Intrinsics.areEqual(this.currency, fundsRecordEntity.currency) && Intrinsics.areEqual(this.amount, fundsRecordEntity.amount) && Intrinsics.areEqual(this.offset, fundsRecordEntity.offset) && Intrinsics.areEqual(this.side, fundsRecordEntity.side) && Intrinsics.areEqual(this.remark, fundsRecordEntity.remark) && Intrinsics.areEqual(this.timestamp, fundsRecordEntity.timestamp) && Intrinsics.areEqual(this.type, fundsRecordEntity.type) && Intrinsics.areEqual(this.typeName, fundsRecordEntity.typeName) && Intrinsics.areEqual(this.prizeType, fundsRecordEntity.prizeType);
    }

    public static /* synthetic */ FundsRecordEntity copy$default(FundsRecordEntity fundsRecordEntity, String str, String str2, BigDecimal bigDecimal, Integer num, String str3, String str4, Long l11, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fundsRecordEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = fundsRecordEntity.currency;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = fundsRecordEntity.amount;
        }
        if ((i11 & 8) != 0) {
            num = fundsRecordEntity.offset;
        }
        if ((i11 & 16) != 0) {
            str3 = fundsRecordEntity.side;
        }
        if ((i11 & 32) != 0) {
            str4 = fundsRecordEntity.remark;
        }
        if ((i11 & 64) != 0) {
            l11 = fundsRecordEntity.timestamp;
        }
        if ((i11 & 128) != 0) {
            str5 = fundsRecordEntity.type;
        }
        if ((i11 & 256) != 0) {
            str6 = fundsRecordEntity.typeName;
        }
        if ((i11 & 512) != 0) {
            str7 = fundsRecordEntity.prizeType;
        }
        String str8 = str6;
        String str9 = str7;
        Long l12 = l11;
        String str10 = str5;
        String str11 = str3;
        String str12 = str4;
        return fundsRecordEntity.copy(str, str2, bigDecimal, num, str11, str12, l12, str10, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTypeName() {
        return this.typeName;
    }

    @NotNull
    public final FundsRecordEntity copy(@Nullable String id2, @Nullable String currency, @Nullable BigDecimal amount, @Nullable Integer offset, @Nullable String side, @Nullable String remark, @Nullable Long timestamp, @Nullable String type, @Nullable String typeName, @Nullable String prizeType) {
        return new FundsRecordEntity(id2, currency, amount, offset, side, remark, timestamp, type, typeName, prizeType);
    }

    @Nullable
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getFormatAmount() {
        String str = this.side;
        String strM92640e = null;
        if (str == null) {
            return null;
        }
        String str2 = Intrinsics.areEqual(str, "IN") ? "+" : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        BigDecimal bigDecimalMultiply = this.amount;
        if (bigDecimalMultiply != null) {
            if (Intrinsics.areEqual(this.side, "OUT") && bigDecimalMultiply.compareTo(BigDecimal.ZERO) > 0) {
                bigDecimalMultiply = bigDecimalMultiply.multiply(new BigDecimal(OtcAd.KYC_NOT_PASS));
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            }
            BigDecimal bigDecimal = bigDecimalMultiply;
            if (bigDecimal != null) {
                strM92640e = C42180b.m92640e(bigDecimal, null, IKuMexService.f28731a.get().mo33293w(C27041f.m66677q(this.currency)), true, true, true, 0, null, 97, null);
            }
        }
        sb2.append(strM92640e);
        return sb2.toString();
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Integer getOffset() {
        return this.offset;
    }

    @Nullable
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.amount;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num = this.offset;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.side;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.remark;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.timestamp;
        int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str5 = this.type;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.typeName;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.prizeType;
        return iHashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setAmount(@Nullable BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setOffset(@Nullable Integer num) {
        this.offset = num;
    }

    public final void setPrizeType(@Nullable String str) {
        this.prizeType = str;
    }

    public final void setRemark(@Nullable String str) {
        this.remark = str;
    }

    public final void setSide(@Nullable String str) {
        this.side = str;
    }

    public final void setTimestamp(@Nullable Long l11) {
        this.timestamp = l11;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setTypeName(@Nullable String str) {
        this.typeName = str;
    }

    @NotNull
    public String toString() {
        return "FundsRecordEntity(id=" + this.id + ", currency=" + this.currency + ", amount=" + this.amount + ", offset=" + this.offset + ", side=" + this.side + ", remark=" + this.remark + ", timestamp=" + this.timestamp + ", type=" + this.type + ", typeName=" + this.typeName + ", prizeType=" + this.prizeType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.currency);
        dest.writeSerializable(this.amount);
        Integer num = this.offset;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.side);
        dest.writeString(this.remark);
        Long l11 = this.timestamp;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.type);
        dest.writeString(this.typeName);
        dest.writeString(this.prizeType);
    }

    public /* synthetic */ FundsRecordEntity(String str, String str2, BigDecimal bigDecimal, Integer num, String str3, String str4, Long l11, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bigDecimal, num, str3, str4, l11, str5, str6, (i11 & 512) != 0 ? null : str7);
    }
}
