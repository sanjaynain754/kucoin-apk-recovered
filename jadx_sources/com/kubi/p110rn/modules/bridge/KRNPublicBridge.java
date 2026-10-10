package com.kubi.p110rn.modules.bridge;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.kubi.host.HostManager;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.p110rn.modules.command.impl.AppInfoCommand;
import com.kubi.p110rn.modules.command.impl.AppNavigateCommand;
import com.kubi.p110rn.modules.command.impl.AppSessionGetCommand;
import com.kubi.p110rn.modules.command.impl.AppSessionRefreshCommand;
import com.kubi.p110rn.modules.command.impl.CheckIsFavorCommand;
import com.kubi.p110rn.modules.command.impl.FavCoinCommand;
import com.kubi.p110rn.modules.command.impl.NotifyH5Command;
import com.kubi.p110rn.modules.command.impl.SensorsTrackCommand;
import com.kubi.p110rn.modules.command.impl.ToastCommand;
import com.kubi.p110rn.service.ReactDepend;
import com.kubi.sdk.util.C24267r0;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: KRNPublicBridge.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/rn/modules/bridge/KRNPublicBridge;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "navigatePage", "", "url", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getAppInfo", "getAppSession", "getNavBarHeight", "refreshAppSession", "showToast", "content", "notifyH5", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/ReadableMap;", "favCoin", "symbol", "checkIsFavor", "sensorsTrack", "eventId", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KRNPublicBridge extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KRNPublicBridge(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @ReactMethod
    public final void checkIsFavor(@NotNull String symbol, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(promise, "promise");
        C24267r0.m58521e("checkIsFavor");
        new CheckIsFavorCommand(symbol, promise).execute();
    }

    @ReactMethod
    public final void favCoin(@NotNull String symbol, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(promise, "promise");
        C24267r0.m58521e("favCoin");
        new FavCoinCommand(symbol, promise).execute();
    }

    @ReactMethod
    public final void getAppInfo(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        new AppInfoCommand(promise).execute();
    }

    @ReactMethod
    public final void getAppSession(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        String strMo36740c = ReactDepend.INSTANCE.webService().mo36740c(HostManager.a.m());
        if (strMo36740c == null || strMo36740c.length() == 0) {
            new AppSessionRefreshCommand(promise).execute();
        } else {
            new AppSessionGetCommand(promise).execute();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "KRNPublicBridge";
    }

    @ReactMethod
    public final void getNavBarHeight(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(Integer.valueOf(EdgeToEdgeCompat.f48106a.m58271i()));
    }

    @ReactMethod
    public final void navigatePage(@NotNull String url, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(promise, "promise");
        new AppNavigateCommand(promise, url).execute();
    }

    @ReactMethod
    public final void notifyH5(@NotNull ReadableMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        new NotifyH5Command(params).execute();
    }

    @ReactMethod
    public final void refreshAppSession(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        new AppSessionRefreshCommand(promise).execute();
    }

    @ReactMethod
    public final void sensorsTrack(@NotNull String eventId, @NotNull ReadableMap params) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(params, "params");
        new SensorsTrackCommand(eventId, params).execute();
    }

    @ReactMethod
    public final void showToast(@Nullable String content) {
        if (content == null) {
            C44128b.m97270n(RNConstantKt.LOG_TAG, "showToast: content is null！Please check your parameters.");
        } else {
            new ToastCommand(content).execute();
        }
    }
}
