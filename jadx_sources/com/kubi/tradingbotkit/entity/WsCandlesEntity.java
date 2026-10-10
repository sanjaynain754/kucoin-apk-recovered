package com.kubi.tradingbotkit.entity;

import androidx.annotation.Keep;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsCandlesEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/WsCandlesEntity;", "", "subject", "", "symbol", KlineFlutterMiniConstants.PROP_CANDLES, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "getSubject", "()Ljava/lang/String;", "setSubject", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "getCandles", "()[Ljava/lang/String;", "setCandles", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/kubi/tradingbotkit/entity/WsCandlesEntity;", "equals", "", "other", "hashCode", "", "toString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsCandlesEntity {

    @NotNull
    private String[] candles;

    @NotNull
    private String subject;

    @NotNull
    private String symbol;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsCandlesEntity)) {
            return false;
        }
        WsCandlesEntity wsCandlesEntity = (WsCandlesEntity) other;
        return Intrinsics.areEqual(this.subject, wsCandlesEntity.subject) && Intrinsics.areEqual(this.symbol, wsCandlesEntity.symbol) && Intrinsics.areEqual(this.candles, wsCandlesEntity.candles);
    }

    public WsCandlesEntity(@NotNull String subject, @NotNull String symbol, @NotNull String[] candles) {
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(candles, "candles");
        this.subject = subject;
        this.symbol = symbol;
        this.candles = candles;
    }

    public static /* synthetic */ WsCandlesEntity copy$default(WsCandlesEntity wsCandlesEntity, String str, String str2, String[] strArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsCandlesEntity.subject;
        }
        if ((i11 & 2) != 0) {
            str2 = wsCandlesEntity.symbol;
        }
        if ((i11 & 4) != 0) {
            strArr = wsCandlesEntity.candles;
        }
        return wsCandlesEntity.copy(str, str2, strArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String[] getCandles() {
        return this.candles;
    }

    @NotNull
    public final WsCandlesEntity copy(@NotNull String subject, @NotNull String symbol, @NotNull String[] candles) {
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(candles, "candles");
        return new WsCandlesEntity(subject, symbol, candles);
    }

    @NotNull
    public final String[] getCandles() {
        return this.candles;
    }

    @NotNull
    public final String getSubject() {
        return this.subject;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return (((this.subject.hashCode() * 31) + this.symbol.hashCode()) * 31) + Arrays.hashCode(this.candles);
    }

    public final void setCandles(@NotNull String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<set-?>");
        this.candles = strArr;
    }

    public final void setSubject(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subject = str;
    }

    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.symbol = str;
    }

    @NotNull
    public String toString() {
        return "WsCandlesEntity(subject=" + this.subject + ", symbol=" + this.symbol + ", candles=" + Arrays.toString(this.candles) + ')';
    }
}
