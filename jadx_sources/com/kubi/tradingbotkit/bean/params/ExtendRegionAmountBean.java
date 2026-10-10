package com.kubi.tradingbotkit.bean.params;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExtendRegionAmountBean.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010¨\u0006."}, m90084d2 = {"Lcom/kubi/tradingbotkit/bean/params/ExtendRegionAmountBean;", "", "depth", "Ljava/math/BigDecimal;", "down", "symbol", "", "taskId", "", "up", "addAmount", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getDepth", "()Ljava/math/BigDecimal;", "setDepth", "(Ljava/math/BigDecimal;)V", "getDown", "setDown", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getTaskId", "()Ljava/lang/Long;", "setTaskId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getUp", "setUp", "getAddAmount", "setAddAmount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/tradingbotkit/bean/params/ExtendRegionAmountBean;", "equals", "", "other", "hashCode", "", "toString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ExtendRegionAmountBean {

    @Nullable
    private BigDecimal addAmount;

    @Nullable
    private BigDecimal depth;

    @Nullable
    private BigDecimal down;

    @Nullable
    private String symbol;

    @Nullable
    private Long taskId;

    @Nullable
    private BigDecimal up;

    public ExtendRegionAmountBean() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendRegionAmountBean)) {
            return false;
        }
        ExtendRegionAmountBean extendRegionAmountBean = (ExtendRegionAmountBean) other;
        return Intrinsics.areEqual(this.depth, extendRegionAmountBean.depth) && Intrinsics.areEqual(this.down, extendRegionAmountBean.down) && Intrinsics.areEqual(this.symbol, extendRegionAmountBean.symbol) && Intrinsics.areEqual(this.taskId, extendRegionAmountBean.taskId) && Intrinsics.areEqual(this.up, extendRegionAmountBean.up) && Intrinsics.areEqual(this.addAmount, extendRegionAmountBean.addAmount);
    }

    public ExtendRegionAmountBean(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str, @Nullable Long l11, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4) {
        this.depth = bigDecimal;
        this.down = bigDecimal2;
        this.symbol = str;
        this.taskId = l11;
        this.up = bigDecimal3;
        this.addAmount = bigDecimal4;
    }

    public static /* synthetic */ ExtendRegionAmountBean copy$default(ExtendRegionAmountBean extendRegionAmountBean, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, Long l11, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = extendRegionAmountBean.depth;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = extendRegionAmountBean.down;
        }
        if ((i11 & 4) != 0) {
            str = extendRegionAmountBean.symbol;
        }
        if ((i11 & 8) != 0) {
            l11 = extendRegionAmountBean.taskId;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = extendRegionAmountBean.up;
        }
        if ((i11 & 32) != 0) {
            bigDecimal4 = extendRegionAmountBean.addAmount;
        }
        BigDecimal bigDecimal5 = bigDecimal3;
        BigDecimal bigDecimal6 = bigDecimal4;
        return extendRegionAmountBean.copy(bigDecimal, bigDecimal2, str, l11, bigDecimal5, bigDecimal6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getDepth() {
        return this.depth;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getDown() {
        return this.down;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTaskId() {
        return this.taskId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getUp() {
        return this.up;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getAddAmount() {
        return this.addAmount;
    }

    @NotNull
    public final ExtendRegionAmountBean copy(@Nullable BigDecimal depth, @Nullable BigDecimal down, @Nullable String symbol, @Nullable Long taskId, @Nullable BigDecimal up2, @Nullable BigDecimal addAmount) {
        return new ExtendRegionAmountBean(depth, down, symbol, taskId, up2, addAmount);
    }

    @Nullable
    public final BigDecimal getAddAmount() {
        return this.addAmount;
    }

    @Nullable
    public final BigDecimal getDepth() {
        return this.depth;
    }

    @Nullable
    public final BigDecimal getDown() {
        return this.down;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Long getTaskId() {
        return this.taskId;
    }

    @Nullable
    public final BigDecimal getUp() {
        return this.up;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.depth;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.down;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.symbol;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.taskId;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.up;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.addAmount;
        return iHashCode5 + (bigDecimal4 != null ? bigDecimal4.hashCode() : 0);
    }

    public final void setAddAmount(@Nullable BigDecimal bigDecimal) {
        this.addAmount = bigDecimal;
    }

    public final void setDepth(@Nullable BigDecimal bigDecimal) {
        this.depth = bigDecimal;
    }

    public final void setDown(@Nullable BigDecimal bigDecimal) {
        this.down = bigDecimal;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTaskId(@Nullable Long l11) {
        this.taskId = l11;
    }

    public final void setUp(@Nullable BigDecimal bigDecimal) {
        this.up = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "ExtendRegionAmountBean(depth=" + this.depth + ", down=" + this.down + ", symbol=" + this.symbol + ", taskId=" + this.taskId + ", up=" + this.up + ", addAmount=" + this.addAmount + ')';
    }

    public /* synthetic */ ExtendRegionAmountBean(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, Long l11, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : bigDecimal3, (i11 & 32) != 0 ? null : bigDecimal4);
    }
}
