package com.kubi.profit.loss.analysis.api;

import androidx.annotation.Keep;
import com.kubi.user.config.UserInfo;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetsProfitLossAnalysisManager.kt */
/* JADX INFO: loaded from: classes35.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/api/Asset;", "", "totalAssets", "Ljava/math/BigDecimal;", "baseCurrency", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;)V", "getTotalAssets", "()Ljava/math/BigDecimal;", "getBaseCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ProfitLossAnalysisApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Asset {

    @NotNull
    private final String baseCurrency;

    @Nullable
    private final BigDecimal totalAssets;

    /* JADX WARN: Multi-variable type inference failed */
    public Asset() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) other;
        return Intrinsics.areEqual(this.totalAssets, asset.totalAssets) && Intrinsics.areEqual(this.baseCurrency, asset.baseCurrency);
    }

    public Asset(@Nullable BigDecimal bigDecimal, @NotNull String baseCurrency) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.totalAssets = bigDecimal;
        this.baseCurrency = baseCurrency;
    }

    public static /* synthetic */ Asset copy$default(Asset asset, BigDecimal bigDecimal, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = asset.totalAssets;
        }
        if ((i11 & 2) != 0) {
            str = asset.baseCurrency;
        }
        return asset.copy(bigDecimal, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getTotalAssets() {
        return this.totalAssets;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @NotNull
    public final Asset copy(@Nullable BigDecimal totalAssets, @NotNull String baseCurrency) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        return new Asset(totalAssets, baseCurrency);
    }

    @NotNull
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final BigDecimal getTotalAssets() {
        return this.totalAssets;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.totalAssets;
        return ((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + this.baseCurrency.hashCode();
    }

    @NotNull
    public String toString() {
        return "Asset(totalAssets=" + this.totalAssets + ", baseCurrency=" + this.baseCurrency + ')';
    }

    public /* synthetic */ Asset(BigDecimal bigDecimal, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? UserInfo.c().getBalanceCurrency() : str);
    }
}
