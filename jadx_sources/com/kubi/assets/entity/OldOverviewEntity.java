package com.kubi.assets.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LineChartEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/entity/OldOverviewEntity;", "", "rangeName", "", "preTotalAssets", "Ljava/math/BigDecimal;", "enabled", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Z)V", "getRangeName", "()Ljava/lang/String;", "getPreTotalAssets", "()Ljava/math/BigDecimal;", "getEnabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OldOverviewEntity {
    private final boolean enabled;

    @Nullable
    private final BigDecimal preTotalAssets;

    @NotNull
    private final String rangeName;

    public OldOverviewEntity() {
        this(null, null, false, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OldOverviewEntity)) {
            return false;
        }
        OldOverviewEntity oldOverviewEntity = (OldOverviewEntity) other;
        return Intrinsics.areEqual(this.rangeName, oldOverviewEntity.rangeName) && Intrinsics.areEqual(this.preTotalAssets, oldOverviewEntity.preTotalAssets) && this.enabled == oldOverviewEntity.enabled;
    }

    public OldOverviewEntity(@NotNull String rangeName, @Nullable BigDecimal bigDecimal, boolean z11) {
        Intrinsics.checkNotNullParameter(rangeName, "rangeName");
        this.rangeName = rangeName;
        this.preTotalAssets = bigDecimal;
        this.enabled = z11;
    }

    public static /* synthetic */ OldOverviewEntity copy$default(OldOverviewEntity oldOverviewEntity, String str, BigDecimal bigDecimal, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = oldOverviewEntity.rangeName;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = oldOverviewEntity.preTotalAssets;
        }
        if ((i11 & 4) != 0) {
            z11 = oldOverviewEntity.enabled;
        }
        return oldOverviewEntity.copy(str, bigDecimal, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRangeName() {
        return this.rangeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getPreTotalAssets() {
        return this.preTotalAssets;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final OldOverviewEntity copy(@NotNull String rangeName, @Nullable BigDecimal preTotalAssets, boolean enabled) {
        Intrinsics.checkNotNullParameter(rangeName, "rangeName");
        return new OldOverviewEntity(rangeName, preTotalAssets, enabled);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final BigDecimal getPreTotalAssets() {
        return this.preTotalAssets;
    }

    @NotNull
    public final String getRangeName() {
        return this.rangeName;
    }

    public int hashCode() {
        int iHashCode = this.rangeName.hashCode() * 31;
        BigDecimal bigDecimal = this.preTotalAssets;
        return ((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + Boolean.hashCode(this.enabled);
    }

    @NotNull
    public String toString() {
        return "OldOverviewEntity(rangeName=" + this.rangeName + ", preTotalAssets=" + this.preTotalAssets + ", enabled=" + this.enabled + ')';
    }

    public /* synthetic */ OldOverviewEntity(String str, BigDecimal bigDecimal, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? BigDecimal.ZERO : bigDecimal, (i11 & 4) != 0 ? false : z11);
    }
}
