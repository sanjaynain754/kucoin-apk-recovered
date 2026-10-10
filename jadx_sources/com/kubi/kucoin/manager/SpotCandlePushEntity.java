package com.kubi.kucoin.manager;

import androidx.annotation.Keep;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotMarketPbWsApi.kt */
/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kucoin/manager/SpotCandlePushEntity;", "", "symbol", "", KlineFlutterMiniConstants.PROP_CANDLES, "", "time", "", "<init>", "(Ljava/lang/String;Ljava/util/List;J)V", "getSymbol", "()Ljava/lang/String;", "getCandles", "()Ljava/util/List;", "getTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SpotCandlePushEntity {

    @NotNull
    private final List<String> candles;

    @NotNull
    private final String symbol;
    private final long time;

    public SpotCandlePushEntity() {
        this(null, null, 0L, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotCandlePushEntity)) {
            return false;
        }
        SpotCandlePushEntity spotCandlePushEntity = (SpotCandlePushEntity) other;
        return Intrinsics.areEqual(this.symbol, spotCandlePushEntity.symbol) && Intrinsics.areEqual(this.candles, spotCandlePushEntity.candles) && this.time == spotCandlePushEntity.time;
    }

    public SpotCandlePushEntity(@NotNull String symbol, @NotNull List<String> candles, long j11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(candles, "candles");
        this.symbol = symbol;
        this.candles = candles;
        this.time = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpotCandlePushEntity copy$default(SpotCandlePushEntity spotCandlePushEntity, String str, List list, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = spotCandlePushEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            list = spotCandlePushEntity.candles;
        }
        if ((i11 & 4) != 0) {
            j11 = spotCandlePushEntity.time;
        }
        return spotCandlePushEntity.copy(str, list, j11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final List<String> component2() {
        return this.candles;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final SpotCandlePushEntity copy(@NotNull String symbol, @NotNull List<String> candles, long time) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(candles, "candles");
        return new SpotCandlePushEntity(symbol, candles, time);
    }

    @NotNull
    public final List<String> getCandles() {
        return this.candles;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((this.symbol.hashCode() * 31) + this.candles.hashCode()) * 31) + Long.hashCode(this.time);
    }

    @NotNull
    public String toString() {
        return "SpotCandlePushEntity(symbol=" + this.symbol + ", candles=" + this.candles + ", time=" + this.time + ')';
    }

    public /* synthetic */ SpotCandlePushEntity(String str, List list, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list, (i11 & 4) != 0 ? 0L : j11);
    }
}
