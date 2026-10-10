package com.kubi.futures.data.compliance.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EuropeUnlockLeverageLevelEntity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017Jb\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\u0003J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017¨\u0006/"}, m90084d2 = {"Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.LEVEL, "", "levelLeverage", "Ljava/math/BigDecimal;", "nextLevel", "nextLevelLeverage", "maxLevelLeverage", "guide", "", TUIConstants.TUIChat.NOTICE, "<init>", "(Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLevelLeverage", "()Ljava/math/BigDecimal;", "getNextLevel", "getNextLevelLeverage", "getMaxLevelLeverage", "getGuide", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNotice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EuropeUnlockLeverageLevelEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EuropeUnlockLeverageLevelEntity> CREATOR = new C12939a();

    @Nullable
    private final Boolean guide;

    @Nullable
    private final Integer level;

    @Nullable
    private final BigDecimal levelLeverage;

    @Nullable
    private final BigDecimal maxLevelLeverage;

    @Nullable
    private final Integer nextLevel;

    @Nullable
    private final BigDecimal nextLevelLeverage;

    @Nullable
    private final Boolean notice;

    /* JADX INFO: renamed from: com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelEntity$a */
    /* JADX INFO: compiled from: EuropeUnlockLeverageLevelEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12939a implements Parcelable.Creator<EuropeUnlockLeverageLevelEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EuropeUnlockLeverageLevelEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf2 = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EuropeUnlockLeverageLevelEntity(numValueOf, bigDecimal, numValueOf2, bigDecimal2, bigDecimal3, boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EuropeUnlockLeverageLevelEntity[] newArray(int i11) {
            return new EuropeUnlockLeverageLevelEntity[i11];
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
        if (!(other instanceof EuropeUnlockLeverageLevelEntity)) {
            return false;
        }
        EuropeUnlockLeverageLevelEntity europeUnlockLeverageLevelEntity = (EuropeUnlockLeverageLevelEntity) other;
        return Intrinsics.areEqual(this.level, europeUnlockLeverageLevelEntity.level) && Intrinsics.areEqual(this.levelLeverage, europeUnlockLeverageLevelEntity.levelLeverage) && Intrinsics.areEqual(this.nextLevel, europeUnlockLeverageLevelEntity.nextLevel) && Intrinsics.areEqual(this.nextLevelLeverage, europeUnlockLeverageLevelEntity.nextLevelLeverage) && Intrinsics.areEqual(this.maxLevelLeverage, europeUnlockLeverageLevelEntity.maxLevelLeverage) && Intrinsics.areEqual(this.guide, europeUnlockLeverageLevelEntity.guide) && Intrinsics.areEqual(this.notice, europeUnlockLeverageLevelEntity.notice);
    }

    public static /* synthetic */ EuropeUnlockLeverageLevelEntity copy$default(EuropeUnlockLeverageLevelEntity europeUnlockLeverageLevelEntity, Integer num, BigDecimal bigDecimal, Integer num2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = europeUnlockLeverageLevelEntity.level;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = europeUnlockLeverageLevelEntity.levelLeverage;
        }
        if ((i11 & 4) != 0) {
            num2 = europeUnlockLeverageLevelEntity.nextLevel;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = europeUnlockLeverageLevelEntity.nextLevelLeverage;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = europeUnlockLeverageLevelEntity.maxLevelLeverage;
        }
        if ((i11 & 32) != 0) {
            bool = europeUnlockLeverageLevelEntity.guide;
        }
        if ((i11 & 64) != 0) {
            bool2 = europeUnlockLeverageLevelEntity.notice;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        BigDecimal bigDecimal4 = bigDecimal3;
        Integer num3 = num2;
        return europeUnlockLeverageLevelEntity.copy(num, bigDecimal, num3, bigDecimal2, bigDecimal4, bool3, bool4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getLevel() {
        return this.level;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getLevelLeverage() {
        return this.levelLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getNextLevel() {
        return this.nextLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getNextLevelLeverage() {
        return this.nextLevelLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getMaxLevelLeverage() {
        return this.maxLevelLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getGuide() {
        return this.guide;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getNotice() {
        return this.notice;
    }

    @NotNull
    public final EuropeUnlockLeverageLevelEntity copy(@Nullable Integer level, @Nullable BigDecimal levelLeverage, @Nullable Integer nextLevel, @Nullable BigDecimal nextLevelLeverage, @Nullable BigDecimal maxLevelLeverage, @Nullable Boolean guide, @Nullable Boolean notice) {
        return new EuropeUnlockLeverageLevelEntity(level, levelLeverage, nextLevel, nextLevelLeverage, maxLevelLeverage, guide, notice);
    }

    @Nullable
    public final Boolean getGuide() {
        return this.guide;
    }

    @Nullable
    public final Integer getLevel() {
        return this.level;
    }

    @Nullable
    public final BigDecimal getLevelLeverage() {
        return this.levelLeverage;
    }

    @Nullable
    public final BigDecimal getMaxLevelLeverage() {
        return this.maxLevelLeverage;
    }

    @Nullable
    public final Integer getNextLevel() {
        return this.nextLevel;
    }

    @Nullable
    public final BigDecimal getNextLevelLeverage() {
        return this.nextLevelLeverage;
    }

    @Nullable
    public final Boolean getNotice() {
        return this.notice;
    }

    public int hashCode() {
        Integer num = this.level;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        BigDecimal bigDecimal = this.levelLeverage;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num2 = this.nextLevel;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.nextLevelLeverage;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.maxLevelLeverage;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Boolean bool = this.guide;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.notice;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EuropeUnlockLeverageLevelEntity(level=" + this.level + ", levelLeverage=" + this.levelLeverage + ", nextLevel=" + this.nextLevel + ", nextLevelLeverage=" + this.nextLevelLeverage + ", maxLevelLeverage=" + this.maxLevelLeverage + ", guide=" + this.guide + ", notice=" + this.notice + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.level;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeSerializable(this.levelLeverage);
        Integer num2 = this.nextLevel;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeSerializable(this.nextLevelLeverage);
        dest.writeSerializable(this.maxLevelLeverage);
        Boolean bool = this.guide;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.notice;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public EuropeUnlockLeverageLevelEntity(@Nullable Integer num, @Nullable BigDecimal bigDecimal, @Nullable Integer num2, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.level = num;
        this.levelLeverage = bigDecimal;
        this.nextLevel = num2;
        this.nextLevelLeverage = bigDecimal2;
        this.maxLevelLeverage = bigDecimal3;
        this.guide = bool;
        this.notice = bool2;
    }
}
