package com.kubi.tradingbotkit.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ExtendRegionAmountEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/ExtendRegionAmountEntity;", "", "<init>", "()V", "addAmount", "Ljava/math/BigDecimal;", "getAddAmount", "()Ljava/math/BigDecimal;", "setAddAmount", "(Ljava/math/BigDecimal;)V", "gridProfitLowerRatio", "getGridProfitLowerRatio", "setGridProfitLowerRatio", "gridProfitUpperRatio", "getGridProfitUpperRatio", "setGridProfitUpperRatio", "sellBaseSize", "getSellBaseSize", "setSellBaseSize", "isExtraMoney", "", "()Ljava/lang/Boolean;", "setExtraMoney", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isNeedAddMoney", "setNeedAddMoney", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ExtendRegionAmountEntity {

    @Nullable
    private BigDecimal addAmount;

    @Nullable
    private BigDecimal gridProfitLowerRatio;

    @Nullable
    private BigDecimal gridProfitUpperRatio;

    @Nullable
    private Boolean isExtraMoney;

    @Nullable
    private Boolean isNeedAddMoney;

    @Nullable
    private BigDecimal sellBaseSize;

    @Nullable
    public final BigDecimal getAddAmount() {
        return this.addAmount;
    }

    @Nullable
    public final BigDecimal getGridProfitLowerRatio() {
        return this.gridProfitLowerRatio;
    }

    @Nullable
    public final BigDecimal getGridProfitUpperRatio() {
        return this.gridProfitUpperRatio;
    }

    @Nullable
    public final BigDecimal getSellBaseSize() {
        return this.sellBaseSize;
    }

    @Nullable
    /* JADX INFO: renamed from: isExtraMoney, reason: from getter */
    public final Boolean getIsExtraMoney() {
        return this.isExtraMoney;
    }

    @Nullable
    /* JADX INFO: renamed from: isNeedAddMoney, reason: from getter */
    public final Boolean getIsNeedAddMoney() {
        return this.isNeedAddMoney;
    }

    public final void setAddAmount(@Nullable BigDecimal bigDecimal) {
        this.addAmount = bigDecimal;
    }

    public final void setExtraMoney(@Nullable Boolean bool) {
        this.isExtraMoney = bool;
    }

    public final void setGridProfitLowerRatio(@Nullable BigDecimal bigDecimal) {
        this.gridProfitLowerRatio = bigDecimal;
    }

    public final void setGridProfitUpperRatio(@Nullable BigDecimal bigDecimal) {
        this.gridProfitUpperRatio = bigDecimal;
    }

    public final void setNeedAddMoney(@Nullable Boolean bool) {
        this.isNeedAddMoney = bool;
    }

    public final void setSellBaseSize(@Nullable BigDecimal bigDecimal) {
        this.sellBaseSize = bigDecimal;
    }

    public ExtendRegionAmountEntity() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.addAmount = bigDecimal;
        this.gridProfitLowerRatio = bigDecimal;
        this.gridProfitUpperRatio = bigDecimal;
        this.sellBaseSize = bigDecimal;
        Boolean bool = Boolean.FALSE;
        this.isExtraMoney = bool;
        this.isNeedAddMoney = bool;
    }
}
