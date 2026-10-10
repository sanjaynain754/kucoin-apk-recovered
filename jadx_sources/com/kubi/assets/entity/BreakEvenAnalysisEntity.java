package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J>\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020!HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006."}, m90084d2 = {"Lcom/kubi/assets/entity/BreakEvenAnalysisEntity;", "Landroid/os/Parcelable;", "accumulativeBreakEven", "Lcom/kubi/assets/entity/BreakEvenEntity;", "currentBreakEven", "marketableAssets", "Ljava/math/BigDecimal;", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "<init>", "(Lcom/kubi/assets/entity/BreakEvenEntity;Lcom/kubi/assets/entity/BreakEvenEntity;Ljava/math/BigDecimal;Ljava/lang/Boolean;)V", "getAccumulativeBreakEven", "()Lcom/kubi/assets/entity/BreakEvenEntity;", "setAccumulativeBreakEven", "(Lcom/kubi/assets/entity/BreakEvenEntity;)V", "getCurrentBreakEven", "setCurrentBreakEven", "getMarketableAssets", "()Ljava/math/BigDecimal;", "setMarketableAssets", "(Ljava/math/BigDecimal;)V", "getEnable", "()Ljava/lang/Boolean;", "setEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Lcom/kubi/assets/entity/BreakEvenEntity;Lcom/kubi/assets/entity/BreakEvenEntity;Ljava/math/BigDecimal;Ljava/lang/Boolean;)Lcom/kubi/assets/entity/BreakEvenAnalysisEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BreakEvenAnalysisEntity implements Parcelable {

    @NotNull
    public static final String TOTAL = "TOTAL";

    @Nullable
    private BreakEvenEntity accumulativeBreakEven;

    @Nullable
    private BreakEvenEntity currentBreakEven;

    @Nullable
    private Boolean enable;

    @Nullable
    private BigDecimal marketableAssets;

    @NotNull
    public static final Parcelable.Creator<BreakEvenAnalysisEntity> CREATOR = new Creator();

    /* JADX INFO: compiled from: AssetEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<BreakEvenAnalysisEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BreakEvenAnalysisEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf = null;
            BreakEvenEntity breakEvenEntityCreateFromParcel = parcel.readInt() == 0 ? null : BreakEvenEntity.CREATOR.createFromParcel(parcel);
            BreakEvenEntity breakEvenEntityCreateFromParcel2 = parcel.readInt() == 0 ? null : BreakEvenEntity.CREATOR.createFromParcel(parcel);
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BreakEvenAnalysisEntity(breakEvenEntityCreateFromParcel, breakEvenEntityCreateFromParcel2, bigDecimal, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BreakEvenAnalysisEntity[] newArray(int i11) {
            return new BreakEvenAnalysisEntity[i11];
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
        if (!(other instanceof BreakEvenAnalysisEntity)) {
            return false;
        }
        BreakEvenAnalysisEntity breakEvenAnalysisEntity = (BreakEvenAnalysisEntity) other;
        return Intrinsics.areEqual(this.accumulativeBreakEven, breakEvenAnalysisEntity.accumulativeBreakEven) && Intrinsics.areEqual(this.currentBreakEven, breakEvenAnalysisEntity.currentBreakEven) && Intrinsics.areEqual(this.marketableAssets, breakEvenAnalysisEntity.marketableAssets) && Intrinsics.areEqual(this.enable, breakEvenAnalysisEntity.enable);
    }

    public static /* synthetic */ BreakEvenAnalysisEntity copy$default(BreakEvenAnalysisEntity breakEvenAnalysisEntity, BreakEvenEntity breakEvenEntity, BreakEvenEntity breakEvenEntity2, BigDecimal bigDecimal, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            breakEvenEntity = breakEvenAnalysisEntity.accumulativeBreakEven;
        }
        if ((i11 & 2) != 0) {
            breakEvenEntity2 = breakEvenAnalysisEntity.currentBreakEven;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = breakEvenAnalysisEntity.marketableAssets;
        }
        if ((i11 & 8) != 0) {
            bool = breakEvenAnalysisEntity.enable;
        }
        return breakEvenAnalysisEntity.copy(breakEvenEntity, breakEvenEntity2, bigDecimal, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BreakEvenEntity getAccumulativeBreakEven() {
        return this.accumulativeBreakEven;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BreakEvenEntity getCurrentBreakEven() {
        return this.currentBreakEven;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getMarketableAssets() {
        return this.marketableAssets;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final BreakEvenAnalysisEntity copy(@Nullable BreakEvenEntity accumulativeBreakEven, @Nullable BreakEvenEntity currentBreakEven, @Nullable BigDecimal marketableAssets, @Nullable Boolean enable) {
        return new BreakEvenAnalysisEntity(accumulativeBreakEven, currentBreakEven, marketableAssets, enable);
    }

    @Nullable
    public final BreakEvenEntity getAccumulativeBreakEven() {
        return this.accumulativeBreakEven;
    }

    @Nullable
    public final BreakEvenEntity getCurrentBreakEven() {
        return this.currentBreakEven;
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final BigDecimal getMarketableAssets() {
        return this.marketableAssets;
    }

    public int hashCode() {
        BreakEvenEntity breakEvenEntity = this.accumulativeBreakEven;
        int iHashCode = (breakEvenEntity == null ? 0 : breakEvenEntity.hashCode()) * 31;
        BreakEvenEntity breakEvenEntity2 = this.currentBreakEven;
        int iHashCode2 = (iHashCode + (breakEvenEntity2 == null ? 0 : breakEvenEntity2.hashCode())) * 31;
        BigDecimal bigDecimal = this.marketableAssets;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Boolean bool = this.enable;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setAccumulativeBreakEven(@Nullable BreakEvenEntity breakEvenEntity) {
        this.accumulativeBreakEven = breakEvenEntity;
    }

    public final void setCurrentBreakEven(@Nullable BreakEvenEntity breakEvenEntity) {
        this.currentBreakEven = breakEvenEntity;
    }

    public final void setEnable(@Nullable Boolean bool) {
        this.enable = bool;
    }

    public final void setMarketableAssets(@Nullable BigDecimal bigDecimal) {
        this.marketableAssets = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "BreakEvenAnalysisEntity(accumulativeBreakEven=" + this.accumulativeBreakEven + ", currentBreakEven=" + this.currentBreakEven + ", marketableAssets=" + this.marketableAssets + ", enable=" + this.enable + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        BreakEvenEntity breakEvenEntity = this.accumulativeBreakEven;
        if (breakEvenEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            breakEvenEntity.writeToParcel(dest, flags);
        }
        BreakEvenEntity breakEvenEntity2 = this.currentBreakEven;
        if (breakEvenEntity2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            breakEvenEntity2.writeToParcel(dest, flags);
        }
        dest.writeSerializable(this.marketableAssets);
        Boolean bool = this.enable;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public BreakEvenAnalysisEntity(@Nullable BreakEvenEntity breakEvenEntity, @Nullable BreakEvenEntity breakEvenEntity2, @Nullable BigDecimal bigDecimal, @Nullable Boolean bool) {
        this.accumulativeBreakEven = breakEvenEntity;
        this.currentBreakEven = breakEvenEntity2;
        this.marketableAssets = bigDecimal;
        this.enable = bool;
    }
}
