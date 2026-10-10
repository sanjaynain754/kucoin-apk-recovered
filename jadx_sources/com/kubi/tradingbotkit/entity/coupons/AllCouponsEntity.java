package com.kubi.tradingbotkit.entity.coupons;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: AllCouponsEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsEntity;", "", "<init>", "()V", "maxRewardPercent", "Ljava/math/BigDecimal;", "getMaxRewardPercent", "()Ljava/math/BigDecimal;", "setMaxRewardPercent", "(Ljava/math/BigDecimal;)V", "inBlackList", "", "getInBlackList", "()Ljava/lang/Boolean;", "setInBlackList", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "unusable", "", "Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;", "getUnusable", "()Ljava/util/List;", "setUnusable", "(Ljava/util/List;)V", "usable", "getUsable", "setUsable", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AllCouponsEntity {

    @Nullable
    private Boolean inBlackList;

    @Nullable
    private BigDecimal maxRewardPercent;

    @Nullable
    private List<AllCouponsItemEntity> unusable;

    @Nullable
    private List<AllCouponsItemEntity> usable;

    @Nullable
    public final Boolean getInBlackList() {
        return this.inBlackList;
    }

    @Nullable
    public final BigDecimal getMaxRewardPercent() {
        return this.maxRewardPercent;
    }

    @Nullable
    public final List<AllCouponsItemEntity> getUnusable() {
        return this.unusable;
    }

    @Nullable
    public final List<AllCouponsItemEntity> getUsable() {
        return this.usable;
    }

    public final void setInBlackList(@Nullable Boolean bool) {
        this.inBlackList = bool;
    }

    public final void setMaxRewardPercent(@Nullable BigDecimal bigDecimal) {
        this.maxRewardPercent = bigDecimal;
    }

    public final void setUnusable(@Nullable List<AllCouponsItemEntity> list) {
        this.unusable = list;
    }

    public final void setUsable(@Nullable List<AllCouponsItemEntity> list) {
        this.usable = list;
    }
}
