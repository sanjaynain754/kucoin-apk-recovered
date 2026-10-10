package com.kubi.redpackage.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RedPackageEntity.kt */
/* JADX INFO: loaded from: classes38.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b4\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00109\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010;\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010<\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÎ\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010AJ\u0006\u0010B\u001a\u00020\u000bJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u000bHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b$\u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010'\u001a\u0004\b(\u0010&R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b)\u0010!R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b*\u0010!R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010-R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0019¨\u0006N"}, m90084d2 = {"Lcom/kubi/redpackage/entity/RedPackageRecord;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "id", "sendRecordId", "nickName", "sendNickName", "receiveAmount", "Ljava/math/BigDecimal;", "receiveNum", "", "sendAmount", "sendNum", "startAt", "", "receiveAt", "status", "welfareType", "code", "currencyName", "resourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getId", "getSendRecordId", "getNickName", "getSendNickName", "getReceiveAmount", "()Ljava/math/BigDecimal;", "getReceiveNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSendAmount", "getSendNum", "getStartAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReceiveAt", "getStatus", "getWelfareType", "getCode", "setCode", "(Ljava/lang/String;)V", "getCurrencyName", "getResourceId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/redpackage/entity/RedPackageRecord;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RedPackageRecord implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RedPackageRecord> CREATOR = new Creator();

    @Nullable
    private String code;

    @Nullable
    private final String currency;

    @Nullable
    private final String currencyName;

    @Nullable
    private final String id;

    @Nullable
    private final String nickName;

    @Nullable
    private final BigDecimal receiveAmount;

    @Nullable
    private final Long receiveAt;

    @Nullable
    private final Integer receiveNum;

    @Nullable
    private final String resourceId;

    @Nullable
    private final BigDecimal sendAmount;

    @Nullable
    private final String sendNickName;

    @Nullable
    private final Integer sendNum;

    @Nullable
    private final String sendRecordId;

    @Nullable
    private final Long startAt;

    @Nullable
    private final Integer status;

    @Nullable
    private final Integer welfareType;

    /* JADX INFO: compiled from: RedPackageEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<RedPackageRecord> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedPackageRecord createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RedPackageRecord(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedPackageRecord[] newArray(int i11) {
            return new RedPackageRecord[i11];
        }
    }

    public RedPackageRecord(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal, @Nullable Integer num, @Nullable BigDecimal bigDecimal2, @Nullable Integer num2, @Nullable Long l11, @Nullable Long l12, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.currency = str;
        this.id = str2;
        this.sendRecordId = str3;
        this.nickName = str4;
        this.sendNickName = str5;
        this.receiveAmount = bigDecimal;
        this.receiveNum = num;
        this.sendAmount = bigDecimal2;
        this.sendNum = num2;
        this.startAt = l11;
        this.receiveAt = l12;
        this.status = num3;
        this.welfareType = num4;
        this.code = str6;
        this.currencyName = str7;
        this.resourceId = str8;
    }

    @NotNull
    public final RedPackageRecord copy(@Nullable String currency, @Nullable String id2, @Nullable String sendRecordId, @Nullable String nickName, @Nullable String sendNickName, @Nullable BigDecimal receiveAmount, @Nullable Integer receiveNum, @Nullable BigDecimal sendAmount, @Nullable Integer sendNum, @Nullable Long startAt, @Nullable Long receiveAt, @Nullable Integer status, @Nullable Integer welfareType, @Nullable String code, @Nullable String currencyName, @Nullable String resourceId) {
        return new RedPackageRecord(currency, id2, sendRecordId, nickName, sendNickName, receiveAmount, receiveNum, sendAmount, sendNum, startAt, receiveAt, status, welfareType, code, currencyName, resourceId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedPackageRecord)) {
            return false;
        }
        RedPackageRecord redPackageRecord = (RedPackageRecord) other;
        return Intrinsics.areEqual(this.currency, redPackageRecord.currency) && Intrinsics.areEqual(this.id, redPackageRecord.id) && Intrinsics.areEqual(this.sendRecordId, redPackageRecord.sendRecordId) && Intrinsics.areEqual(this.nickName, redPackageRecord.nickName) && Intrinsics.areEqual(this.sendNickName, redPackageRecord.sendNickName) && Intrinsics.areEqual(this.receiveAmount, redPackageRecord.receiveAmount) && Intrinsics.areEqual(this.receiveNum, redPackageRecord.receiveNum) && Intrinsics.areEqual(this.sendAmount, redPackageRecord.sendAmount) && Intrinsics.areEqual(this.sendNum, redPackageRecord.sendNum) && Intrinsics.areEqual(this.startAt, redPackageRecord.startAt) && Intrinsics.areEqual(this.receiveAt, redPackageRecord.receiveAt) && Intrinsics.areEqual(this.status, redPackageRecord.status) && Intrinsics.areEqual(this.welfareType, redPackageRecord.welfareType) && Intrinsics.areEqual(this.code, redPackageRecord.code) && Intrinsics.areEqual(this.currencyName, redPackageRecord.currencyName) && Intrinsics.areEqual(this.resourceId, redPackageRecord.resourceId);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getStartAt() {
        return this.startAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getReceiveAt() {
        return this.receiveAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getWelfareType() {
        return this.welfareType;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getResourceId() {
        return this.resourceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSendRecordId() {
        return this.sendRecordId;
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
    public final BigDecimal getReceiveAmount() {
        return this.receiveAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getReceiveNum() {
        return this.receiveNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getSendAmount() {
        return this.sendAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getSendNum() {
        return this.sendNum;
    }

    @Nullable
    public final String getCode() {
        return this.code;
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
    public final Integer getReceiveNum() {
        return this.receiveNum;
    }

    @Nullable
    public final String getResourceId() {
        return this.resourceId;
    }

    @Nullable
    public final BigDecimal getSendAmount() {
        return this.sendAmount;
    }

    @Nullable
    public final String getSendNickName() {
        return this.sendNickName;
    }

    @Nullable
    public final Integer getSendNum() {
        return this.sendNum;
    }

    @Nullable
    public final String getSendRecordId() {
        return this.sendRecordId;
    }

    @Nullable
    public final Long getStartAt() {
        return this.startAt;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final Integer getWelfareType() {
        return this.welfareType;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sendRecordId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nickName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sendNickName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.receiveAmount;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num = this.receiveNum;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.sendAmount;
        int iHashCode8 = (iHashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Integer num2 = this.sendNum;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l11 = this.startAt;
        int iHashCode10 = (iHashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.receiveAt;
        int iHashCode11 = (iHashCode10 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num3 = this.status;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.welfareType;
        int iHashCode13 = (iHashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.code;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.currencyName;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.resourceId;
        return iHashCode15 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    @NotNull
    public String toString() {
        return "RedPackageRecord(currency=" + this.currency + ", id=" + this.id + ", sendRecordId=" + this.sendRecordId + ", nickName=" + this.nickName + ", sendNickName=" + this.sendNickName + ", receiveAmount=" + this.receiveAmount + ", receiveNum=" + this.receiveNum + ", sendAmount=" + this.sendAmount + ", sendNum=" + this.sendNum + ", startAt=" + this.startAt + ", receiveAt=" + this.receiveAt + ", status=" + this.status + ", welfareType=" + this.welfareType + ", code=" + this.code + ", currencyName=" + this.currencyName + ", resourceId=" + this.resourceId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeString(this.id);
        dest.writeString(this.sendRecordId);
        dest.writeString(this.nickName);
        dest.writeString(this.sendNickName);
        dest.writeSerializable(this.receiveAmount);
        Integer num = this.receiveNum;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeSerializable(this.sendAmount);
        Integer num2 = this.sendNum;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Long l11 = this.startAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.receiveAt;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        Integer num3 = this.status;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Integer num4 = this.welfareType;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        dest.writeString(this.code);
        dest.writeString(this.currencyName);
        dest.writeString(this.resourceId);
    }

    public /* synthetic */ RedPackageRecord(String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, Integer num, BigDecimal bigDecimal2, Integer num2, Long l11, Long l12, Integer num3, Integer num4, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? BigDecimal.ZERO : bigDecimal, (i11 & 64) != 0 ? 0 : num, (i11 & 128) != 0 ? BigDecimal.ZERO : bigDecimal2, (i11 & 256) != 0 ? 0 : num2, (i11 & 512) != 0 ? 0L : l11, (i11 & 1024) != 0 ? 0L : l12, (i11 & 2048) != 0 ? 0 : num3, (i11 & 4096) != 0 ? 0 : num4, str6, str7, str8);
    }
}
