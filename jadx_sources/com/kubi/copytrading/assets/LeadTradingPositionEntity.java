package com.kubi.copytrading.assets;

import androidx.annotation.Keep;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTdEntity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020\bJ\b\u0010-\u001a\u0004\u0018\u00010\bJ\b\u0010.\u001a\u0004\u0018\u00010/J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003J¶\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u0005HÖ\u0001J\t\u0010D\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001d¨\u0006E"}, m90084d2 = {"Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;", "", "avgEntryPrice", "Ljava/math/BigDecimal;", "closeStatus", "", "leverage", "marginMode", "", "markPrice", "orderSize", "pnl", "pnlRatio", "posMargin", ViewProps.POSITION, "positionSide", "startTime", "", "symbol", "fundsType", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getAvgEntryPrice", "()Ljava/math/BigDecimal;", "getCloseStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLeverage", "getMarginMode", "()Ljava/lang/String;", "getMarkPrice", "getOrderSize", "getPnl", "getPnlRatio", "getPosMargin", "getPosition", "getPositionSide", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSymbol", "getFundsType", "displaySymbol", "Lcom/kubi/utils/StyledText;", "displaySymbolPlain", "getBaseCurrencyAvatar", "getFundsTypeEnum", "Lcom/kubi/copytrading/assets/LeadTradingPositionFundsType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;", "equals", "", "other", "hashCode", "toString", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeadTradingPositionEntity {

    @Nullable
    private final BigDecimal avgEntryPrice;

    @Nullable
    private final Integer closeStatus;

    @Nullable
    private final String fundsType;

    @Nullable
    private final BigDecimal leverage;

    @Nullable
    private final String marginMode;

    @Nullable
    private final BigDecimal markPrice;

    @Nullable
    private final BigDecimal orderSize;

    @Nullable
    private final BigDecimal pnl;

    @Nullable
    private final BigDecimal pnlRatio;

    @Nullable
    private final BigDecimal posMargin;

    @Nullable
    private final BigDecimal position;

    @Nullable
    private final String positionSide;

    @Nullable
    private final Long startTime;

    @Nullable
    private final String symbol;

    public LeadTradingPositionEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeadTradingPositionEntity)) {
            return false;
        }
        LeadTradingPositionEntity leadTradingPositionEntity = (LeadTradingPositionEntity) other;
        return Intrinsics.areEqual(this.avgEntryPrice, leadTradingPositionEntity.avgEntryPrice) && Intrinsics.areEqual(this.closeStatus, leadTradingPositionEntity.closeStatus) && Intrinsics.areEqual(this.leverage, leadTradingPositionEntity.leverage) && Intrinsics.areEqual(this.marginMode, leadTradingPositionEntity.marginMode) && Intrinsics.areEqual(this.markPrice, leadTradingPositionEntity.markPrice) && Intrinsics.areEqual(this.orderSize, leadTradingPositionEntity.orderSize) && Intrinsics.areEqual(this.pnl, leadTradingPositionEntity.pnl) && Intrinsics.areEqual(this.pnlRatio, leadTradingPositionEntity.pnlRatio) && Intrinsics.areEqual(this.posMargin, leadTradingPositionEntity.posMargin) && Intrinsics.areEqual(this.position, leadTradingPositionEntity.position) && Intrinsics.areEqual(this.positionSide, leadTradingPositionEntity.positionSide) && Intrinsics.areEqual(this.startTime, leadTradingPositionEntity.startTime) && Intrinsics.areEqual(this.symbol, leadTradingPositionEntity.symbol) && Intrinsics.areEqual(this.fundsType, leadTradingPositionEntity.fundsType);
    }

    public LeadTradingPositionEntity(@Nullable BigDecimal bigDecimal, @Nullable Integer num, @Nullable BigDecimal bigDecimal2, @Nullable String str, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable String str2, @Nullable Long l11, @Nullable String str3, @Nullable String str4) {
        this.avgEntryPrice = bigDecimal;
        this.closeStatus = num;
        this.leverage = bigDecimal2;
        this.marginMode = str;
        this.markPrice = bigDecimal3;
        this.orderSize = bigDecimal4;
        this.pnl = bigDecimal5;
        this.pnlRatio = bigDecimal6;
        this.posMargin = bigDecimal7;
        this.position = bigDecimal8;
        this.positionSide = str2;
        this.startTime = l11;
        this.symbol = str3;
        this.fundsType = str4;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAvgEntryPrice() {
        return this.avgEntryPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getPosition() {
        return this.position;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getFundsType() {
        return this.fundsType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCloseStatus() {
        return this.closeStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getOrderSize() {
        return this.orderSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getPnl() {
        return this.pnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getPnlRatio() {
        return this.pnlRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getPosMargin() {
        return this.posMargin;
    }

    @NotNull
    public final LeadTradingPositionEntity copy(@Nullable BigDecimal avgEntryPrice, @Nullable Integer closeStatus, @Nullable BigDecimal leverage, @Nullable String marginMode, @Nullable BigDecimal markPrice, @Nullable BigDecimal orderSize, @Nullable BigDecimal pnl, @Nullable BigDecimal pnlRatio, @Nullable BigDecimal posMargin, @Nullable BigDecimal position, @Nullable String positionSide, @Nullable Long startTime, @Nullable String symbol, @Nullable String fundsType) {
        return new LeadTradingPositionEntity(avgEntryPrice, closeStatus, leverage, marginMode, markPrice, orderSize, pnl, pnlRatio, posMargin, position, positionSide, startTime, symbol, fundsType);
    }

    @NotNull
    public final C27096v0 displaySymbol() {
        IKuMexService iKuMexService = IKuMexService.f28731a.get();
        String str = this.symbol;
        if (str == null) {
            str = "";
        }
        return IKuMexService.m33249T(iKuMexService, str, false, 2, null);
    }

    @NotNull
    public final String displaySymbolPlain() {
        String str = this.symbol;
        if (str == null) {
            str = "";
        }
        return C11483d.m20758a(str);
    }

    @Nullable
    public final BigDecimal getAvgEntryPrice() {
        return this.avgEntryPrice;
    }

    @Nullable
    public final String getBaseCurrencyAvatar() {
        IKuMexService iKuMexService = IKuMexService.f28731a.get();
        String str = this.symbol;
        if (str == null) {
            str = "";
        }
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66669i(C27041f.m66677q(String.valueOf(iKuMexService.mo33286o(str).get("baseCurrency"))), "BTC"));
        if (coinInfoEntityM85613u != null) {
            return coinInfoEntityM85613u.getIconUrl();
        }
        return null;
    }

    @Nullable
    public final Integer getCloseStatus() {
        return this.closeStatus;
    }

    @Nullable
    public final String getFundsType() {
        return this.fundsType;
    }

    @Nullable
    public final LeadTradingPositionFundsType getFundsTypeEnum() {
        return LeadTradingPositionFundsType.INSTANCE.fromCode(this.fundsType);
    }

    @Nullable
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    public final BigDecimal getOrderSize() {
        return this.orderSize;
    }

    @Nullable
    public final BigDecimal getPnl() {
        return this.pnl;
    }

    @Nullable
    public final BigDecimal getPnlRatio() {
        return this.pnlRatio;
    }

    @Nullable
    public final BigDecimal getPosMargin() {
        return this.posMargin;
    }

    @Nullable
    public final BigDecimal getPosition() {
        return this.position;
    }

    @Nullable
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.avgEntryPrice;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        Integer num = this.closeStatus;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.leverage;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.marginMode;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.markPrice;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.orderSize;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.pnl;
        int iHashCode7 = (iHashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.pnlRatio;
        int iHashCode8 = (iHashCode7 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.posMargin;
        int iHashCode9 = (iHashCode8 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.position;
        int iHashCode10 = (iHashCode9 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        String str2 = this.positionSide;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.startTime;
        int iHashCode12 = (iHashCode11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode13 = (iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fundsType;
        return iHashCode13 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LeadTradingPositionEntity(avgEntryPrice=" + this.avgEntryPrice + ", closeStatus=" + this.closeStatus + ", leverage=" + this.leverage + ", marginMode=" + this.marginMode + ", markPrice=" + this.markPrice + ", orderSize=" + this.orderSize + ", pnl=" + this.pnl + ", pnlRatio=" + this.pnlRatio + ", posMargin=" + this.posMargin + ", position=" + this.position + ", positionSide=" + this.positionSide + ", startTime=" + this.startTime + ", symbol=" + this.symbol + ", fundsType=" + this.fundsType + ')';
    }

    public /* synthetic */ LeadTradingPositionEntity(BigDecimal bigDecimal, Integer num, BigDecimal bigDecimal2, String str, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, String str2, Long l11, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : bigDecimal3, (i11 & 32) != 0 ? null : bigDecimal4, (i11 & 64) != 0 ? null : bigDecimal5, (i11 & 128) != 0 ? null : bigDecimal6, (i11 & 256) != 0 ? null : bigDecimal7, (i11 & 512) != 0 ? null : bigDecimal8, (i11 & 1024) != 0 ? null : str2, (i11 & 2048) != 0 ? null : l11, (i11 & 4096) != 0 ? null : str3, (i11 & 8192) != 0 ? null : str4);
    }
}
