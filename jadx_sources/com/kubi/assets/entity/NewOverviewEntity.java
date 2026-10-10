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
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m90084d2 = {"Lcom/kubi/assets/entity/NewOverviewEntity;", "", "enabled", "", "preTotal", "Ljava/math/BigDecimal;", "includeSub", "hasGetPreTotalAsset", "rangeName", "", "<init>", "(ZLjava/math/BigDecimal;ZZLjava/lang/String;)V", "getEnabled", "()Z", "getPreTotal", "()Ljava/math/BigDecimal;", "setPreTotal", "(Ljava/math/BigDecimal;)V", "getIncludeSub", "getHasGetPreTotalAsset", "getRangeName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NewOverviewEntity {
    private final boolean enabled;
    private final boolean hasGetPreTotalAsset;
    private final boolean includeSub;

    @Nullable
    private BigDecimal preTotal;

    @NotNull
    private final String rangeName;

    public NewOverviewEntity() {
        this(false, null, false, false, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewOverviewEntity)) {
            return false;
        }
        NewOverviewEntity newOverviewEntity = (NewOverviewEntity) other;
        return this.enabled == newOverviewEntity.enabled && Intrinsics.areEqual(this.preTotal, newOverviewEntity.preTotal) && this.includeSub == newOverviewEntity.includeSub && this.hasGetPreTotalAsset == newOverviewEntity.hasGetPreTotalAsset && Intrinsics.areEqual(this.rangeName, newOverviewEntity.rangeName);
    }

    public NewOverviewEntity(boolean z11, @Nullable BigDecimal bigDecimal, boolean z12, boolean z13, @NotNull String rangeName) {
        Intrinsics.checkNotNullParameter(rangeName, "rangeName");
        this.enabled = z11;
        this.preTotal = bigDecimal;
        this.includeSub = z12;
        this.hasGetPreTotalAsset = z13;
        this.rangeName = rangeName;
    }

    public static /* synthetic */ NewOverviewEntity copy$default(NewOverviewEntity newOverviewEntity, boolean z11, BigDecimal bigDecimal, boolean z12, boolean z13, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = newOverviewEntity.enabled;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = newOverviewEntity.preTotal;
        }
        if ((i11 & 4) != 0) {
            z12 = newOverviewEntity.includeSub;
        }
        if ((i11 & 8) != 0) {
            z13 = newOverviewEntity.hasGetPreTotalAsset;
        }
        if ((i11 & 16) != 0) {
            str = newOverviewEntity.rangeName;
        }
        String str2 = str;
        boolean z14 = z12;
        return newOverviewEntity.copy(z11, bigDecimal, z14, z13, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getPreTotal() {
        return this.preTotal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIncludeSub() {
        return this.includeSub;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHasGetPreTotalAsset() {
        return this.hasGetPreTotalAsset;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRangeName() {
        return this.rangeName;
    }

    @NotNull
    public final NewOverviewEntity copy(boolean enabled, @Nullable BigDecimal preTotal, boolean includeSub, boolean hasGetPreTotalAsset, @NotNull String rangeName) {
        Intrinsics.checkNotNullParameter(rangeName, "rangeName");
        return new NewOverviewEntity(enabled, preTotal, includeSub, hasGetPreTotalAsset, rangeName);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getHasGetPreTotalAsset() {
        return this.hasGetPreTotalAsset;
    }

    public final boolean getIncludeSub() {
        return this.includeSub;
    }

    @Nullable
    public final BigDecimal getPreTotal() {
        return this.preTotal;
    }

    @NotNull
    public final String getRangeName() {
        return this.rangeName;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        BigDecimal bigDecimal = this.preTotal;
        return ((((((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + Boolean.hashCode(this.includeSub)) * 31) + Boolean.hashCode(this.hasGetPreTotalAsset)) * 31) + this.rangeName.hashCode();
    }

    public final void setPreTotal(@Nullable BigDecimal bigDecimal) {
        this.preTotal = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "NewOverviewEntity(enabled=" + this.enabled + ", preTotal=" + this.preTotal + ", includeSub=" + this.includeSub + ", hasGetPreTotalAsset=" + this.hasGetPreTotalAsset + ", rangeName=" + this.rangeName + ')';
    }

    public /* synthetic */ NewOverviewEntity(boolean z11, BigDecimal bigDecimal, boolean z12, boolean z13, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? BigDecimal.ZERO : bigDecimal, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? false : z13, (i11 & 16) != 0 ? "" : str);
    }
}
