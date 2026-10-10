package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModifyTradeHoldingCostBody.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/entity/ModifyTradeHoldingCostBody;", "", FirebaseAnalytics.Param.CURRENCY, "", "totalValueUsdt", "Ljava/math/BigDecimal;", "costUsdt", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/lang/String;", "getTotalValueUsdt", "()Ljava/math/BigDecimal;", "getCostUsdt", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ModifyTradeHoldingCostBody {

    @SerializedName("costUsdt")
    @Nullable
    private final BigDecimal costUsdt;

    @SerializedName(AppsFlyerProperties.CURRENCY_CODE)
    @NotNull
    private final String currency;

    @SerializedName("totalValueUsdt")
    @Nullable
    private final BigDecimal totalValueUsdt;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModifyTradeHoldingCostBody)) {
            return false;
        }
        ModifyTradeHoldingCostBody modifyTradeHoldingCostBody = (ModifyTradeHoldingCostBody) other;
        return Intrinsics.areEqual(this.currency, modifyTradeHoldingCostBody.currency) && Intrinsics.areEqual(this.totalValueUsdt, modifyTradeHoldingCostBody.totalValueUsdt) && Intrinsics.areEqual(this.costUsdt, modifyTradeHoldingCostBody.costUsdt);
    }

    public ModifyTradeHoldingCostBody(@NotNull String currency, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.currency = currency;
        this.totalValueUsdt = bigDecimal;
        this.costUsdt = bigDecimal2;
    }

    public static /* synthetic */ ModifyTradeHoldingCostBody copy$default(ModifyTradeHoldingCostBody modifyTradeHoldingCostBody, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = modifyTradeHoldingCostBody.currency;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = modifyTradeHoldingCostBody.totalValueUsdt;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = modifyTradeHoldingCostBody.costUsdt;
        }
        return modifyTradeHoldingCostBody.copy(str, bigDecimal, bigDecimal2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getTotalValueUsdt() {
        return this.totalValueUsdt;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getCostUsdt() {
        return this.costUsdt;
    }

    @NotNull
    public final ModifyTradeHoldingCostBody copy(@NotNull String currency, @Nullable BigDecimal totalValueUsdt, @Nullable BigDecimal costUsdt) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new ModifyTradeHoldingCostBody(currency, totalValueUsdt, costUsdt);
    }

    @Nullable
    public final BigDecimal getCostUsdt() {
        return this.costUsdt;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getTotalValueUsdt() {
        return this.totalValueUsdt;
    }

    public int hashCode() {
        int iHashCode = this.currency.hashCode() * 31;
        BigDecimal bigDecimal = this.totalValueUsdt;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.costUsdt;
        return iHashCode2 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ModifyTradeHoldingCostBody(currency=" + this.currency + ", totalValueUsdt=" + this.totalValueUsdt + ", costUsdt=" + this.costUsdt + ')';
    }
}
