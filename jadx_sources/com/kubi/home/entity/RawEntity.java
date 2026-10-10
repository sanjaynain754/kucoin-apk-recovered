package com.kubi.home.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MoodInfoEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003JV\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\u0005J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006+"}, m90084d2 = {"Lcom/kubi/home/entity/RawEntity;", "Landroid/os/Parcelable;", "averageRate", "", "advancedNum", "", "unchangedNum", "declinedNum", "advancedTop1", "Lcom/kubi/home/entity/TopCoinEntity;", "declinedTop1", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/kubi/home/entity/TopCoinEntity;Lcom/kubi/home/entity/TopCoinEntity;)V", "getAverageRate", "()Ljava/lang/String;", "getAdvancedNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnchangedNum", "getDeclinedNum", "getAdvancedTop1", "()Lcom/kubi/home/entity/TopCoinEntity;", "getDeclinedTop1", "equals", "", "other", "", "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/kubi/home/entity/TopCoinEntity;Lcom/kubi/home/entity/TopCoinEntity;)Lcom/kubi/home/entity/RawEntity;", "describeContents", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RawEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RawEntity> CREATOR = new C14554a();

    @Nullable
    private final Integer advancedNum;

    @Nullable
    private final TopCoinEntity advancedTop1;

    @Nullable
    private final String averageRate;

    @Nullable
    private final Integer declinedNum;

    @Nullable
    private final TopCoinEntity declinedTop1;

    @Nullable
    private final Integer unchangedNum;

    /* JADX INFO: renamed from: com.kubi.home.entity.RawEntity$a */
    /* JADX INFO: compiled from: MoodInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14554a implements Parcelable.Creator<RawEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RawEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RawEntity(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : TopCoinEntity.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TopCoinEntity.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RawEntity[] newArray(int i11) {
            return new RawEntity[i11];
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
        if (!Intrinsics.areEqual(RawEntity.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.kubi.home.entity.RawEntity");
        RawEntity rawEntity = (RawEntity) other;
        return Intrinsics.areEqual(this.averageRate, rawEntity.averageRate) && Intrinsics.areEqual(this.advancedNum, rawEntity.advancedNum) && Intrinsics.areEqual(this.unchangedNum, rawEntity.unchangedNum) && Intrinsics.areEqual(this.declinedNum, rawEntity.declinedNum) && Intrinsics.areEqual(this.advancedTop1, rawEntity.advancedTop1) && Intrinsics.areEqual(this.declinedTop1, rawEntity.declinedTop1);
    }

    public static /* synthetic */ RawEntity copy$default(RawEntity rawEntity, String str, Integer num, Integer num2, Integer num3, TopCoinEntity topCoinEntity, TopCoinEntity topCoinEntity2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rawEntity.averageRate;
        }
        if ((i11 & 2) != 0) {
            num = rawEntity.advancedNum;
        }
        if ((i11 & 4) != 0) {
            num2 = rawEntity.unchangedNum;
        }
        if ((i11 & 8) != 0) {
            num3 = rawEntity.declinedNum;
        }
        if ((i11 & 16) != 0) {
            topCoinEntity = rawEntity.advancedTop1;
        }
        if ((i11 & 32) != 0) {
            topCoinEntity2 = rawEntity.declinedTop1;
        }
        TopCoinEntity topCoinEntity3 = topCoinEntity;
        TopCoinEntity topCoinEntity4 = topCoinEntity2;
        return rawEntity.copy(str, num, num2, num3, topCoinEntity3, topCoinEntity4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAverageRate() {
        return this.averageRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAdvancedNum() {
        return this.advancedNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getUnchangedNum() {
        return this.unchangedNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getDeclinedNum() {
        return this.declinedNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TopCoinEntity getAdvancedTop1() {
        return this.advancedTop1;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TopCoinEntity getDeclinedTop1() {
        return this.declinedTop1;
    }

    @NotNull
    public final RawEntity copy(@Nullable String averageRate, @Nullable Integer advancedNum, @Nullable Integer unchangedNum, @Nullable Integer declinedNum, @Nullable TopCoinEntity advancedTop1, @Nullable TopCoinEntity declinedTop1) {
        return new RawEntity(averageRate, advancedNum, unchangedNum, declinedNum, advancedTop1, declinedTop1);
    }

    @Nullable
    public final Integer getAdvancedNum() {
        return this.advancedNum;
    }

    @Nullable
    public final TopCoinEntity getAdvancedTop1() {
        return this.advancedTop1;
    }

    @Nullable
    public final String getAverageRate() {
        return this.averageRate;
    }

    @Nullable
    public final Integer getDeclinedNum() {
        return this.declinedNum;
    }

    @Nullable
    public final TopCoinEntity getDeclinedTop1() {
        return this.declinedTop1;
    }

    @Nullable
    public final Integer getUnchangedNum() {
        return this.unchangedNum;
    }

    public int hashCode() {
        String str = this.averageRate;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.advancedNum;
        int iIntValue = (iHashCode + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.unchangedNum;
        int iIntValue2 = (iIntValue + (num2 != null ? num2.intValue() : 0)) * 31;
        Integer num3 = this.declinedNum;
        int iIntValue3 = (iIntValue2 + (num3 != null ? num3.intValue() : 0)) * 31;
        TopCoinEntity topCoinEntity = this.advancedTop1;
        int iHashCode2 = (iIntValue3 + (topCoinEntity != null ? topCoinEntity.hashCode() : 0)) * 31;
        TopCoinEntity topCoinEntity2 = this.declinedTop1;
        return iHashCode2 + (topCoinEntity2 != null ? topCoinEntity2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RawEntity(averageRate=" + this.averageRate + ", advancedNum=" + this.advancedNum + ", unchangedNum=" + this.unchangedNum + ", declinedNum=" + this.declinedNum + ", advancedTop1=" + this.advancedTop1 + ", declinedTop1=" + this.declinedTop1 + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.averageRate);
        Integer num = this.advancedNum;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.unchangedNum;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.declinedNum;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        TopCoinEntity topCoinEntity = this.advancedTop1;
        if (topCoinEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            topCoinEntity.writeToParcel(dest, flags);
        }
        TopCoinEntity topCoinEntity2 = this.declinedTop1;
        if (topCoinEntity2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            topCoinEntity2.writeToParcel(dest, flags);
        }
    }

    public RawEntity(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable TopCoinEntity topCoinEntity, @Nullable TopCoinEntity topCoinEntity2) {
        this.averageRate = str;
        this.advancedNum = num;
        this.unchangedNum = num2;
        this.declinedNum = num3;
        this.advancedTop1 = topCoinEntity;
        this.declinedTop1 = topCoinEntity2;
    }
}
