package com.kubi.redpackage.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RedpacketInfoEntity.kt */
/* JADX INFO: loaded from: classes38.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010,\u001a\u00020\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0090\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00101J\u0006\u00102\u001a\u00020\u000bJ\u0013\u00103\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u000bHÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b#\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014¨\u0006="}, m90084d2 = {"Lcom/kubi/redpackage/entity/RedpacketInfoEntity;", "Landroid/os/Parcelable;", "sendRecordId", "", FirebaseAnalytics.Param.CURRENCY, "receive", "", "nickName", "receiveAmount", "Ljava/math/BigDecimal;", "welfareStatus", "", "welfareType", "newBee", "bestWishes", "receiveStatus", "extendUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getSendRecordId", "()Ljava/lang/String;", "getCurrency", "getReceive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNickName", "getReceiveAmount", "()Ljava/math/BigDecimal;", "getWelfareStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWelfareType", "getNewBee", "()Z", "getBestWishes", "getReceiveStatus", "getExtendUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/redpackage/entity/RedpacketInfoEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RedpacketInfoEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RedpacketInfoEntity> CREATOR = new Creator();

    @Nullable
    private final String bestWishes;

    @Nullable
    private final String currency;

    @Nullable
    private final String extendUrl;

    @SerializedName("isNewBee")
    private final boolean newBee;

    @Nullable
    private final String nickName;

    @SerializedName("isReceive")
    @Nullable
    private final Boolean receive;

    @Nullable
    private final BigDecimal receiveAmount;

    @Nullable
    private final Integer receiveStatus;

    @Nullable
    private final String sendRecordId;

    @Nullable
    private final Integer welfareStatus;

    @Nullable
    private final Integer welfareType;

    /* JADX INFO: compiled from: RedpacketInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<RedpacketInfoEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedpacketInfoEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z11 = parcel.readInt() != 0;
            Integer numValueOf3 = null;
            Integer num = numValueOf2;
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new RedpacketInfoEntity(string, string2, boolValueOf, string3, bigDecimal, numValueOf, num, z11, string4, numValueOf3, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedpacketInfoEntity[] newArray(int i11) {
            return new RedpacketInfoEntity[i11];
        }
    }

    public RedpacketInfoEntity(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable Integer num, @Nullable Integer num2, boolean z11, @Nullable String str4, @Nullable Integer num3, @Nullable String str5) {
        this.sendRecordId = str;
        this.currency = str2;
        this.receive = bool;
        this.nickName = str3;
        this.receiveAmount = bigDecimal;
        this.welfareStatus = num;
        this.welfareType = num2;
        this.newBee = z11;
        this.bestWishes = str4;
        this.receiveStatus = num3;
        this.extendUrl = str5;
    }

    public static /* synthetic */ RedpacketInfoEntity copy$default(RedpacketInfoEntity redpacketInfoEntity, String str, String str2, Boolean bool, String str3, BigDecimal bigDecimal, Integer num, Integer num2, boolean z11, String str4, Integer num3, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = redpacketInfoEntity.sendRecordId;
        }
        if ((i11 & 2) != 0) {
            str2 = redpacketInfoEntity.currency;
        }
        if ((i11 & 4) != 0) {
            bool = redpacketInfoEntity.receive;
        }
        if ((i11 & 8) != 0) {
            str3 = redpacketInfoEntity.nickName;
        }
        if ((i11 & 16) != 0) {
            bigDecimal = redpacketInfoEntity.receiveAmount;
        }
        if ((i11 & 32) != 0) {
            num = redpacketInfoEntity.welfareStatus;
        }
        if ((i11 & 64) != 0) {
            num2 = redpacketInfoEntity.welfareType;
        }
        if ((i11 & 128) != 0) {
            z11 = redpacketInfoEntity.newBee;
        }
        if ((i11 & 256) != 0) {
            str4 = redpacketInfoEntity.bestWishes;
        }
        if ((i11 & 512) != 0) {
            num3 = redpacketInfoEntity.receiveStatus;
        }
        if ((i11 & 1024) != 0) {
            str5 = redpacketInfoEntity.extendUrl;
        }
        Integer num4 = num3;
        String str6 = str5;
        boolean z12 = z11;
        String str7 = str4;
        Integer num5 = num;
        Integer num6 = num2;
        BigDecimal bigDecimal2 = bigDecimal;
        Boolean bool2 = bool;
        return redpacketInfoEntity.copy(str, str2, bool2, str3, bigDecimal2, num5, num6, z12, str7, num4, str6);
    }

    @NotNull
    public final RedpacketInfoEntity copy(@Nullable String sendRecordId, @Nullable String currency, @Nullable Boolean receive, @Nullable String nickName, @Nullable BigDecimal receiveAmount, @Nullable Integer welfareStatus, @Nullable Integer welfareType, boolean newBee, @Nullable String bestWishes, @Nullable Integer receiveStatus, @Nullable String extendUrl) {
        return new RedpacketInfoEntity(sendRecordId, currency, receive, nickName, receiveAmount, welfareStatus, welfareType, newBee, bestWishes, receiveStatus, extendUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedpacketInfoEntity)) {
            return false;
        }
        RedpacketInfoEntity redpacketInfoEntity = (RedpacketInfoEntity) other;
        return Intrinsics.areEqual(this.sendRecordId, redpacketInfoEntity.sendRecordId) && Intrinsics.areEqual(this.currency, redpacketInfoEntity.currency) && Intrinsics.areEqual(this.receive, redpacketInfoEntity.receive) && Intrinsics.areEqual(this.nickName, redpacketInfoEntity.nickName) && Intrinsics.areEqual(this.receiveAmount, redpacketInfoEntity.receiveAmount) && Intrinsics.areEqual(this.welfareStatus, redpacketInfoEntity.welfareStatus) && Intrinsics.areEqual(this.welfareType, redpacketInfoEntity.welfareType) && this.newBee == redpacketInfoEntity.newBee && Intrinsics.areEqual(this.bestWishes, redpacketInfoEntity.bestWishes) && Intrinsics.areEqual(this.receiveStatus, redpacketInfoEntity.receiveStatus) && Intrinsics.areEqual(this.extendUrl, redpacketInfoEntity.extendUrl);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSendRecordId() {
        return this.sendRecordId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getReceiveStatus() {
        return this.receiveStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getExtendUrl() {
        return this.extendUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getReceive() {
        return this.receive;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getReceiveAmount() {
        return this.receiveAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getWelfareStatus() {
        return this.welfareStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getWelfareType() {
        return this.welfareType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getNewBee() {
        return this.newBee;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBestWishes() {
        return this.bestWishes;
    }

    @Nullable
    public final String getBestWishes() {
        return this.bestWishes;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getExtendUrl() {
        return this.extendUrl;
    }

    public final boolean getNewBee() {
        return this.newBee;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final Boolean getReceive() {
        return this.receive;
    }

    @Nullable
    public final BigDecimal getReceiveAmount() {
        return this.receiveAmount;
    }

    @Nullable
    public final Integer getReceiveStatus() {
        return this.receiveStatus;
    }

    @Nullable
    public final String getSendRecordId() {
        return this.sendRecordId;
    }

    @Nullable
    public final Integer getWelfareStatus() {
        return this.welfareStatus;
    }

    @Nullable
    public final Integer getWelfareType() {
        return this.welfareType;
    }

    public int hashCode() {
        String str = this.sendRecordId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.receive;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.nickName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.receiveAmount;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num = this.welfareStatus;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.welfareType;
        int iHashCode7 = (((iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31) + Boolean.hashCode(this.newBee)) * 31;
        String str4 = this.bestWishes;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.receiveStatus;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.extendUrl;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RedpacketInfoEntity(sendRecordId=" + this.sendRecordId + ", currency=" + this.currency + ", receive=" + this.receive + ", nickName=" + this.nickName + ", receiveAmount=" + this.receiveAmount + ", welfareStatus=" + this.welfareStatus + ", welfareType=" + this.welfareType + ", newBee=" + this.newBee + ", bestWishes=" + this.bestWishes + ", receiveStatus=" + this.receiveStatus + ", extendUrl=" + this.extendUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.sendRecordId);
        dest.writeString(this.currency);
        Boolean bool = this.receive;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.nickName);
        dest.writeSerializable(this.receiveAmount);
        Integer num = this.welfareStatus;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.welfareType;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeInt(this.newBee ? 1 : 0);
        dest.writeString(this.bestWishes);
        Integer num3 = this.receiveStatus;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.extendUrl);
    }

    public /* synthetic */ RedpacketInfoEntity(String str, String str2, Boolean bool, String str3, BigDecimal bigDecimal, Integer num, Integer num2, boolean z11, String str4, Integer num3, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bool, str3, bigDecimal, num, num2, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? null : str4, num3, str5);
    }
}
