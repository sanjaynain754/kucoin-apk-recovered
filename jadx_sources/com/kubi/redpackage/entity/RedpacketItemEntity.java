package com.kubi.redpackage.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RedpacketItemEntity.kt */
/* JADX INFO: loaded from: classes38.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014Jz\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020*J\u0013\u0010+\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u000e\u0010\u0014¨\u00065"}, m90084d2 = {"Lcom/kubi/redpackage/entity/RedpacketItemEntity;", "Landroid/os/Parcelable;", "id", "", FirebaseAnalytics.Param.CURRENCY, "isSelf", "", "nickName", "sendNickName", "receiveAt", "", "receiveAmount", "Ljava/math/BigDecimal;", "currencyName", "isLucky", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getCurrency", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNickName", "getSendNickName", "getReceiveAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReceiveAmount", "()Ljava/math/BigDecimal;", "getCurrencyName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/redpackage/entity/RedpacketItemEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RedpacketItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RedpacketItemEntity> CREATOR = new Creator();

    @Nullable
    private final String currency;

    @Nullable
    private final String currencyName;

    @Nullable
    private final String id;

    @Nullable
    private final Boolean isLucky;

    @Nullable
    private final Boolean isSelf;

    @Nullable
    private final String nickName;

    @Nullable
    private final BigDecimal receiveAmount;

    @Nullable
    private final Long receiveAt;

    @Nullable
    private final String sendNickName;

    /* JADX INFO: compiled from: RedpacketItemEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<RedpacketItemEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedpacketItemEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            BigDecimal bigDecimal;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            Long l11 = lValueOf;
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
                bigDecimal = bigDecimal2;
            } else {
                bigDecimal = bigDecimal2;
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RedpacketItemEntity(string, string2, boolValueOf, string3, string4, l11, bigDecimal, string5, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedpacketItemEntity[] newArray(int i11) {
            return new RedpacketItemEntity[i11];
        }
    }

    public static /* synthetic */ RedpacketItemEntity copy$default(RedpacketItemEntity redpacketItemEntity, String str, String str2, Boolean bool, String str3, String str4, Long l11, BigDecimal bigDecimal, String str5, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = redpacketItemEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = redpacketItemEntity.currency;
        }
        if ((i11 & 4) != 0) {
            bool = redpacketItemEntity.isSelf;
        }
        if ((i11 & 8) != 0) {
            str3 = redpacketItemEntity.nickName;
        }
        if ((i11 & 16) != 0) {
            str4 = redpacketItemEntity.sendNickName;
        }
        if ((i11 & 32) != 0) {
            l11 = redpacketItemEntity.receiveAt;
        }
        if ((i11 & 64) != 0) {
            bigDecimal = redpacketItemEntity.receiveAmount;
        }
        if ((i11 & 128) != 0) {
            str5 = redpacketItemEntity.currencyName;
        }
        if ((i11 & 256) != 0) {
            bool2 = redpacketItemEntity.isLucky;
        }
        String str6 = str5;
        Boolean bool3 = bool2;
        Long l12 = l11;
        BigDecimal bigDecimal2 = bigDecimal;
        String str7 = str4;
        Boolean bool4 = bool;
        return redpacketItemEntity.copy(str, str2, bool4, str3, str7, l12, bigDecimal2, str6, bool3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedpacketItemEntity)) {
            return false;
        }
        RedpacketItemEntity redpacketItemEntity = (RedpacketItemEntity) other;
        return Intrinsics.areEqual(this.id, redpacketItemEntity.id) && Intrinsics.areEqual(this.currency, redpacketItemEntity.currency) && Intrinsics.areEqual(this.isSelf, redpacketItemEntity.isSelf) && Intrinsics.areEqual(this.nickName, redpacketItemEntity.nickName) && Intrinsics.areEqual(this.sendNickName, redpacketItemEntity.sendNickName) && Intrinsics.areEqual(this.receiveAt, redpacketItemEntity.receiveAt) && Intrinsics.areEqual(this.receiveAmount, redpacketItemEntity.receiveAmount) && Intrinsics.areEqual(this.currencyName, redpacketItemEntity.currencyName) && Intrinsics.areEqual(this.isLucky, redpacketItemEntity.isLucky);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsSelf() {
        return this.isSelf;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSendNickName() {
        return this.sendNickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getReceiveAt() {
        return this.receiveAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getReceiveAmount() {
        return this.receiveAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsLucky() {
        return this.isLucky;
    }

    @NotNull
    public final RedpacketItemEntity copy(@Nullable String id2, @Nullable String currency, @Nullable Boolean isSelf, @Nullable String nickName, @Nullable String sendNickName, @Nullable Long receiveAt, @Nullable BigDecimal receiveAmount, @Nullable String currencyName, @Nullable Boolean isLucky) {
        return new RedpacketItemEntity(id2, currency, isSelf, nickName, sendNickName, receiveAt, receiveAmount, currencyName, isLucky);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final BigDecimal getReceiveAmount() {
        return this.receiveAmount;
    }

    @Nullable
    public final Long getReceiveAt() {
        return this.receiveAt;
    }

    @Nullable
    public final String getSendNickName() {
        return this.sendNickName;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isSelf;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.nickName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sendNickName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.receiveAt;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal = this.receiveAmount;
        int iHashCode7 = (iHashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str5 = this.currencyName;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.isLucky;
        return iHashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isLucky() {
        return this.isLucky;
    }

    @Nullable
    public final Boolean isSelf() {
        return this.isSelf;
    }

    @NotNull
    public String toString() {
        return "RedpacketItemEntity(id=" + this.id + ", currency=" + this.currency + ", isSelf=" + this.isSelf + ", nickName=" + this.nickName + ", sendNickName=" + this.sendNickName + ", receiveAt=" + this.receiveAt + ", receiveAmount=" + this.receiveAmount + ", currencyName=" + this.currencyName + ", isLucky=" + this.isLucky + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.currency);
        Boolean bool = this.isSelf;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.nickName);
        dest.writeString(this.sendNickName);
        Long l11 = this.receiveAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.receiveAmount);
        dest.writeString(this.currencyName);
        Boolean bool2 = this.isLucky;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public RedpacketItemEntity(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable Long l11, @Nullable BigDecimal bigDecimal, @Nullable String str5, @Nullable Boolean bool2) {
        this.id = str;
        this.currency = str2;
        this.isSelf = bool;
        this.nickName = str3;
        this.sendNickName = str4;
        this.receiveAt = l11;
        this.receiveAmount = bigDecimal;
        this.currencyName = str5;
        this.isLucky = bool2;
    }
}
