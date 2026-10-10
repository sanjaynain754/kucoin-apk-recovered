package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeTradeTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u000f\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\nJ>\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\r0\u0013H\u0016JF\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\r0\u0013H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\tH\u0016J$\u0010 \u001a\u00020\r2\u001a\u0010\u0012\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010!\u0012\u0004\u0012\u00020\r0\u0013H\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J$\u0010$\u001a\u00020\r2\u001a\u0010\u0012\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010!\u0012\u0004\u0012\u00020\r0\u0013H\u0016J$\u0010%\u001a\u00020\r2\u001a\u0010\u0012\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010!\u0012\u0004\u0012\u00020\r0\u0013H\u0016J\u001e\u0010'\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\r0\u0013H\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010*\u001a\u00020\u0007H\u0016J&\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00072\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\r0\u0013H\u0016J$\u0010,\u001a\u00020\r2\u001a\u0010\u0012\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020-\u0018\u00010!\u0012\u0004\u0012\u00020\r0\u0013H\u0016J\u0012\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u001f\u0010/\u001a\u000200\"\b\b\u0000\u00101*\u0002022\b\u0010\u0018\u001a\u0004\u0018\u0001H1¢\u0006\u0002\u00103¨\u00065"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeTradeTurboModuleAbs;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "isUtaGray", "", "()Ljava/lang/Boolean;", "isUtaHasOpend", "openOrderDetail", "", "orderId", "symbol", "bussinesType", "content", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "openNativeMarketsSymbolDialog", "level1", "level2", "level3", "data", "Lcom/facebook/react/bridge/ReadableMap;", "getContractTradeUnit", "getAlphaCurrencyInfo", "Lcom/kubi/rn/core/turbo/AlphaCurrencyInfo;", "currencySeq", "", "quoteCurrency", "getAlphaCurrencyInfoBatch", "", "getIsolatedMarginConfig", "Lcom/kubi/rn/core/turbo/IsolatedMarginConfig;", "getIsolatedMarginConfigBatch", "getMarginCurrencyList", "Lcom/kubi/rn/core/turbo/MarginCurrency;", "getMarginConfig", "Lcom/kubi/rn/core/turbo/MarginConfig;", "getMarginCurrency", FirebaseAnalytics.Param.CURRENCY, "fetchMarginCurrency", "fetchSymbolOfflineInfoList", "Lcom/kubi/rn/core/turbo/SymbolOfflineInfo;", "getSymbolOfflineInfo", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Companion", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class NativeTradeTurboModuleAbs extends ReactContextBaseJavaModule {

    @NotNull
    public static final String NAME = "Trade";

    @Nullable
    public AlphaCurrencyInfo getAlphaCurrencyInfo(double currencySeq, boolean quoteCurrency) {
        return null;
    }

    @Nullable
    public String getContractTradeUnit() {
        return null;
    }

    @Nullable
    public Boolean isUtaGray() {
        return null;
    }

    @Nullable
    public Boolean isUtaHasOpend() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeTradeTurboModuleAbs(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    public void fetchMarginCurrency(@NotNull String currency, @NotNull Function1<? super MarginCurrency, Unit> callback) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void fetchSymbolOfflineInfoList(@NotNull Function1<? super List<SymbolOfflineInfo>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void getAlphaCurrencyInfoBatch(@NotNull Function1<? super List<AlphaCurrencyInfo>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Nullable
    public IsolatedMarginConfig getIsolatedMarginConfig(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return null;
    }

    public void getIsolatedMarginConfigBatch(@NotNull Function1<? super List<IsolatedMarginConfig>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void getMarginConfig(@NotNull Function1<? super MarginConfig, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Nullable
    public MarginCurrency getMarginCurrency(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return null;
    }

    public void getMarginCurrencyList(@NotNull Function1<? super List<MarginCurrency>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Trade";
    }

    @Nullable
    public SymbolOfflineInfo getSymbolOfflineInfo(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return null;
    }

    public void openNativeMarketsSymbolDialog(@Nullable String level1, @Nullable String level2, @Nullable String level3, @Nullable ReadableMap data, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void openOrderDetail(@NotNull String orderId, @NotNull String symbol, @NotNull String bussinesType, @NotNull String content, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(bussinesType, "bussinesType");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        return KNBTurboUtils.INSTANCE.wrapResult(data);
    }
}
