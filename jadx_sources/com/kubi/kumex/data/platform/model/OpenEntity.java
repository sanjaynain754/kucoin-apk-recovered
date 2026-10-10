package com.kubi.kumex.data.platform.model;

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

/* JADX INFO: compiled from: OpenEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003JV\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014¨\u0006."}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/OpenEntity;", "Landroid/os/Parcelable;", "hasRewards", "", FirebaseAnalytics.Param.CURRENCY, "", "rewards", "Ljava/math/BigDecimal;", "rewardsEffectiveDays", "", "rewardType", "deductionRatio", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getHasRewards", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCurrency", "()Ljava/lang/String;", "getRewards", "()Ljava/math/BigDecimal;", "getRewardsEffectiveDays", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRewardType", "getDeductionRatio", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/kubi/kumex/data/platform/model/OpenEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OpenEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OpenEntity> CREATOR = new C15818a();

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal deductionRatio;

    @Nullable
    private final Boolean hasRewards;

    @Nullable
    private final String rewardType;

    @Nullable
    private final BigDecimal rewards;

    @Nullable
    private final Long rewardsEffectiveDays;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.OpenEntity$a */
    /* JADX INFO: compiled from: OpenEntity.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15818a implements Parcelable.Creator<OpenEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OpenEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OpenEntity(boolValueOf, parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OpenEntity[] newArray(int i11) {
            return new OpenEntity[i11];
        }
    }

    public OpenEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenEntity)) {
            return false;
        }
        OpenEntity openEntity = (OpenEntity) other;
        return Intrinsics.areEqual(this.hasRewards, openEntity.hasRewards) && Intrinsics.areEqual(this.currency, openEntity.currency) && Intrinsics.areEqual(this.rewards, openEntity.rewards) && Intrinsics.areEqual(this.rewardsEffectiveDays, openEntity.rewardsEffectiveDays) && Intrinsics.areEqual(this.rewardType, openEntity.rewardType) && Intrinsics.areEqual(this.deductionRatio, openEntity.deductionRatio);
    }

    public OpenEntity(@Nullable Boolean bool, @Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable Long l11, @Nullable String str2, @Nullable BigDecimal bigDecimal2) {
        this.hasRewards = bool;
        this.currency = str;
        this.rewards = bigDecimal;
        this.rewardsEffectiveDays = l11;
        this.rewardType = str2;
        this.deductionRatio = bigDecimal2;
    }

    public static /* synthetic */ OpenEntity copy$default(OpenEntity openEntity, Boolean bool, String str, BigDecimal bigDecimal, Long l11, String str2, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = openEntity.hasRewards;
        }
        if ((i11 & 2) != 0) {
            str = openEntity.currency;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = openEntity.rewards;
        }
        if ((i11 & 8) != 0) {
            l11 = openEntity.rewardsEffectiveDays;
        }
        if ((i11 & 16) != 0) {
            str2 = openEntity.rewardType;
        }
        if ((i11 & 32) != 0) {
            bigDecimal2 = openEntity.deductionRatio;
        }
        String str3 = str2;
        BigDecimal bigDecimal3 = bigDecimal2;
        return openEntity.copy(bool, str, bigDecimal, l11, str3, bigDecimal3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getHasRewards() {
        return this.hasRewards;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getRewards() {
        return this.rewards;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getRewardsEffectiveDays() {
        return this.rewardsEffectiveDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRewardType() {
        return this.rewardType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getDeductionRatio() {
        return this.deductionRatio;
    }

    @NotNull
    public final OpenEntity copy(@Nullable Boolean hasRewards, @Nullable String currency, @Nullable BigDecimal rewards, @Nullable Long rewardsEffectiveDays, @Nullable String rewardType, @Nullable BigDecimal deductionRatio) {
        return new OpenEntity(hasRewards, currency, rewards, rewardsEffectiveDays, rewardType, deductionRatio);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getDeductionRatio() {
        return this.deductionRatio;
    }

    @Nullable
    public final Boolean getHasRewards() {
        return this.hasRewards;
    }

    @Nullable
    public final String getRewardType() {
        return this.rewardType;
    }

    @Nullable
    public final BigDecimal getRewards() {
        return this.rewards;
    }

    @Nullable
    public final Long getRewardsEffectiveDays() {
        return this.rewardsEffectiveDays;
    }

    public int hashCode() {
        Boolean bool = this.hasRewards;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.rewards;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Long l11 = this.rewardsEffectiveDays;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.rewardType;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.deductionRatio;
        return iHashCode5 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OpenEntity(hasRewards=" + this.hasRewards + ", currency=" + this.currency + ", rewards=" + this.rewards + ", rewardsEffectiveDays=" + this.rewardsEffectiveDays + ", rewardType=" + this.rewardType + ", deductionRatio=" + this.deductionRatio + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.hasRewards;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.currency);
        dest.writeSerializable(this.rewards);
        Long l11 = this.rewardsEffectiveDays;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.rewardType);
        dest.writeSerializable(this.deductionRatio);
    }

    public /* synthetic */ OpenEntity(Boolean bool, String str, BigDecimal bigDecimal, Long l11, String str2, BigDecimal bigDecimal2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : bigDecimal, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : bigDecimal2);
    }
}
