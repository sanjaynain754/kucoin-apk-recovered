package com.kubi.quotefacade.kline;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.sdk.flutter.delegate.IChannelRegister;
import com.kubi.search.searchresult.SearchCategory$Companion;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44127a;

/* JADX INFO: compiled from: KlineLowLiquidityStateChannel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\"\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/quotefacade/kline/KlineLowLiquidityStateChannel;", "Lcom/kubi/sdk/flutter/delegate/IChannelRegister;", "<init>", "()V", AppsFlyerProperties.CHANNEL, "Lio/flutter/plugin/common/MethodChannel;", "registerWith", "", "context", "Landroid/content/Context;", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "unregister", "notifyLowLiquidityState", "symbol", "", "isLowLiquidityPeriod", "", "marketSession", "warnIfUnregistered", "name", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KlineLowLiquidityStateChannel implements IChannelRegister {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f42139b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public MethodChannel f42140a;

    /* JADX INFO: compiled from: KlineLowLiquidityStateChannel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/kline/KlineLowLiquidityStateChannel$Companion;", "", "<init>", "()V", "TAG", "", "CHANNEL_NAME", "METHOD_LOW_LIQUIDITY_STATE", "PARAM_SYMBOL", "PARAM_IS_LOW_LIQUIDITY_PERIOD", "PARAM_MARKET_SESSION", "PARAM_BIZ_TYPE", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m52174a(@NotNull String symbol, boolean z11, @Nullable String str) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        MethodChannel methodChannel = this.f42140a;
        if (methodChannel != null) {
            methodChannel.invokeMethod("onLowLiquidityState", MapsKt.mapOf(TuplesKt.m90091to("symbol", symbol), TuplesKt.m90091to("isLowLiquidityPeriod", Boolean.valueOf(z11)), TuplesKt.m90091to("marketSession", str), TuplesKt.m90091to("bizType", SearchCategory$Companion.FUTURES)));
        }
        m52175b("notifyLowLiquidityState");
    }

    /* JADX INFO: renamed from: b */
    public final void m52175b(String str) {
        if (this.f42140a == null) {
            C44127a.m97245e("KlineLowLiquidityStateChannel", str + " called before register!");
        }
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void registerWith(@NotNull Context context, @NotNull FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flutterEngine, "flutterEngine");
        this.f42140a = new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "kc.kline.low_liquidity_state", StandardMethodCodec.INSTANCE);
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void unregister() {
        MethodChannel methodChannel = this.f42140a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f42140a = null;
    }
}
