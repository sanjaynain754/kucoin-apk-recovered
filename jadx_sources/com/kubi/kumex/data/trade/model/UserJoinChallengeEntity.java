package com.kubi.kumex.data.trade.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PositionEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003Jn\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020'HÖ\u0001J\t\u0010-\u001a\u00020\u0004HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020'R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00063"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/UserJoinChallengeEntity;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "campaignTemplateCode", "", "campaignCode", "startTime", "", "endTime", "status", "code", FirebaseAnalytics.Param.CURRENCY, "faceValue", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getCampaignTemplateCode", "()Ljava/lang/String;", "getCampaignCode", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTime", "getStatus", "getCode", "getCurrency", "getFaceValue", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/kubi/kumex/data/trade/model/UserJoinChallengeEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UserJoinChallengeEntity implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<UserJoinChallengeEntity> CREATOR = new C15841a();

    @Nullable
    private final String campaignCode;

    @Nullable
    private final String campaignTemplateCode;

    @Nullable
    private final String code;

    @Nullable
    private final String currency;

    @Nullable
    private final Long endTime;

    @Nullable
    private final BigDecimal faceValue;

    @Nullable
    private final Long startTime;

    @Nullable
    private final String status;

    /* JADX INFO: renamed from: com.kubi.kumex.data.trade.model.UserJoinChallengeEntity$a */
    /* JADX INFO: compiled from: PositionEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15841a implements Parcelable.Creator<UserJoinChallengeEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserJoinChallengeEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserJoinChallengeEntity(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UserJoinChallengeEntity[] newArray(int i11) {
            return new UserJoinChallengeEntity[i11];
        }
    }

    public UserJoinChallengeEntity() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserJoinChallengeEntity)) {
            return false;
        }
        UserJoinChallengeEntity userJoinChallengeEntity = (UserJoinChallengeEntity) other;
        return Intrinsics.areEqual(this.campaignTemplateCode, userJoinChallengeEntity.campaignTemplateCode) && Intrinsics.areEqual(this.campaignCode, userJoinChallengeEntity.campaignCode) && Intrinsics.areEqual(this.startTime, userJoinChallengeEntity.startTime) && Intrinsics.areEqual(this.endTime, userJoinChallengeEntity.endTime) && Intrinsics.areEqual(this.status, userJoinChallengeEntity.status) && Intrinsics.areEqual(this.code, userJoinChallengeEntity.code) && Intrinsics.areEqual(this.currency, userJoinChallengeEntity.currency) && Intrinsics.areEqual(this.faceValue, userJoinChallengeEntity.faceValue);
    }

    public UserJoinChallengeEntity(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable Long l12, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal) {
        this.campaignTemplateCode = str;
        this.campaignCode = str2;
        this.startTime = l11;
        this.endTime = l12;
        this.status = str3;
        this.code = str4;
        this.currency = str5;
        this.faceValue = bigDecimal;
    }

    public static /* synthetic */ UserJoinChallengeEntity copy$default(UserJoinChallengeEntity userJoinChallengeEntity, String str, String str2, Long l11, Long l12, String str3, String str4, String str5, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userJoinChallengeEntity.campaignTemplateCode;
        }
        if ((i11 & 2) != 0) {
            str2 = userJoinChallengeEntity.campaignCode;
        }
        if ((i11 & 4) != 0) {
            l11 = userJoinChallengeEntity.startTime;
        }
        if ((i11 & 8) != 0) {
            l12 = userJoinChallengeEntity.endTime;
        }
        if ((i11 & 16) != 0) {
            str3 = userJoinChallengeEntity.status;
        }
        if ((i11 & 32) != 0) {
            str4 = userJoinChallengeEntity.code;
        }
        if ((i11 & 64) != 0) {
            str5 = userJoinChallengeEntity.currency;
        }
        if ((i11 & 128) != 0) {
            bigDecimal = userJoinChallengeEntity.faceValue;
        }
        String str6 = str5;
        BigDecimal bigDecimal2 = bigDecimal;
        String str7 = str3;
        String str8 = str4;
        return userJoinChallengeEntity.copy(str, str2, l11, l12, str7, str8, str6, bigDecimal2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCampaignTemplateCode() {
        return this.campaignTemplateCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getFaceValue() {
        return this.faceValue;
    }

    @NotNull
    public final UserJoinChallengeEntity copy(@Nullable String campaignTemplateCode, @Nullable String campaignCode, @Nullable Long startTime, @Nullable Long endTime, @Nullable String status, @Nullable String code, @Nullable String currency, @Nullable BigDecimal faceValue) {
        return new UserJoinChallengeEntity(campaignTemplateCode, campaignCode, startTime, endTime, status, code, currency, faceValue);
    }

    @Nullable
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @Nullable
    public final String getCampaignTemplateCode() {
        return this.campaignTemplateCode;
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
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final BigDecimal getFaceValue() {
        return this.faceValue;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.campaignTemplateCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.campaignCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.startTime;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.endTime;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.code;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currency;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.faceValue;
        return iHashCode7 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserJoinChallengeEntity(campaignTemplateCode=" + this.campaignTemplateCode + ", campaignCode=" + this.campaignCode + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", status=" + this.status + ", code=" + this.code + ", currency=" + this.currency + ", faceValue=" + this.faceValue + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.campaignTemplateCode);
        dest.writeString(this.campaignCode);
        Long l11 = this.startTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.endTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.status);
        dest.writeString(this.code);
        dest.writeString(this.currency);
        dest.writeSerializable(this.faceValue);
    }

    public /* synthetic */ UserJoinChallengeEntity(String str, String str2, Long l11, Long l12, String str3, String str4, String str5, BigDecimal bigDecimal, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : l12, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : bigDecimal);
    }
}
