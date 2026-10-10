package com.kubi.kucoin.manager;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.network.restful.C19321b;
import com.kucoin.discover.tickers.TickerItemApp;
import er.C37237b;
import gr.C38000b;
import gr.C38003e;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kucoin.manager.k */
/* JADX INFO: compiled from: MarketTickerPbWsApi.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0004\u001a\b\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"SPOT_TICKER_PB_PREFIX", "", "SPOT_TICKERS_PB_PREFIX", "buildMarketTickerPbWsApi", "Lcom/kubi/kucoin/manager/IMarketTickerPbWsApi;", "isMarketPbEnabled", "", "toMarketSnapshotEntity", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "Lcom/kucoin/discover/tickers/TickerItemApp;", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketTickerPbWsApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketTickerPbWsApi.kt\ncom/kubi/kucoin/manager/MarketTickerPbWsApiKt\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,83:1\n35#2,4:84\n39#2:90\n44#3,2:88\n*S KotlinDebug\n*F\n+ 1 MarketTickerPbWsApi.kt\ncom/kubi/kucoin/manager/MarketTickerPbWsApiKt\n*L\n55#1:84,4\n55#1:90\n55#1:88,2\n*E\n"})
public final class C15510k {

    /* JADX INFO: renamed from: com.kubi.kucoin.manager.k$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final IMarketTickerPbWsApi m32612a() {
        return (IMarketTickerPbWsApi) new C19321b.a().m42777b(new C38000b(C37237b.m83278a())).m42778c(new C38003e()).m42776a().m42772b(IMarketTickerPbWsApi.class);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m32613b() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("enable_socket_protobuf_market_v1", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return Intrinsics.areEqual(objM20457a, Boolean.TRUE);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final WsMarketSnapshotEntity m32614c(@NotNull TickerItemApp tickerItemApp) {
        Intrinsics.checkNotNullParameter(tickerItemApp, "<this>");
        String symbol = tickerItemApp.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        String lastPrice = tickerItemApp.getLastPrice();
        Intrinsics.checkNotNullExpressionValue(lastPrice, "getLastPrice(...)");
        Double doubleOrNull = StringsKt.toDoubleOrNull(lastPrice);
        return new WsMarketSnapshotEntity(tickerItemApp.getLast24HourPriceChange(), tickerItemApp.getLast24HourRate(), doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d, symbol, false, 0.0d, 0.0d, 0.0d, tickerItemApp.getLast24HourTradingVolume());
    }
}
