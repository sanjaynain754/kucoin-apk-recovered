package com.kubi.p110rn.modules.command.impl;

import android.annotation.SuppressLint;
import com.blankj.utilcode.util.C5276j;
import com.blankj.utilcode.util.NetworkUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.p110rn.modules.command.ReactBridgeCallbackCommand;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.util.C24267r0;
import com.kubi.utils.C27063n;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33577c3;
import org.jetbrains.annotations.NotNull;
import p402kf.C41016c;
import p694vk.C45590s;
import p799yj.C46510b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppInfoCommand.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0015¨\u0006\b"}, m90084d2 = {"Lcom/kubi/rn/modules/command/impl/AppInfoCommand;", "Lcom/kubi/rn/modules/command/ReactBridgeCallbackCommand;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "<init>", "(Lcom/facebook/react/bridge/Promise;)V", "onExecute", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AppInfoCommand extends ReactBridgeCallbackCommand {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppInfoCommand(@NotNull Promise promise) {
        super(promise);
        Intrinsics.checkNotNullParameter(promise, "promise");
    }

    @Override // com.kubi.p110rn.modules.command.ReactBridgeCallbackCommand
    @SuppressLint({"MissingPermission"})
    public void onExecute() {
        HostManager hostManager = HostManager.a;
        boolean zAreEqual = Intrinsics.areEqual(hostManager.y(), "produce");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("darkMode", !DayNightThemeManager.f28592a.m33187l());
        writableMapCreateMap.putString("lang", MultiLanguageManager.f46811g.getLocale().toString());
        String strM89965c = C41016c.m89965c();
        if (strM89965c == null) {
            strM89965c = "USD";
        }
        writableMapCreateMap.putString("legal", strM89965c);
        C45590s c45590s = C45590s.f102687a;
        writableMapCreateMap.putString("version", c45590s.m100675Z());
        writableMapCreateMap.putBoolean("isInland", C46510b.m102600d());
        writableMapCreateMap.putString("xversion", c45590s.m100677b0());
        writableMapCreateMap.putString("webApiHost", hostManager.k());
        writableMapCreateMap.putString("apiType", zAreEqual ? "prod" : "dev");
        writableMapCreateMap.putBoolean("cstyle", C27063n.m66765c(KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN, 0, 1, null) == 0);
        writableMapCreateMap.putString(C33577c3.f69334H, C27041f.m66668h(C5276j.m6247f()));
        NetworkUtils.NetworkType networkTypeM6057e = NetworkUtils.m6057e();
        Intrinsics.checkNotNullExpressionValue(networkTypeM6057e, "getNetworkType(...)");
        writableMapCreateMap.putString("networkType", C24267r0.m58523g(networkTypeM6057e));
        writableMapCreateMap.putString("siteType", SiteType.INSTANCE.getCurrentSiteType());
        writableMapCreateMap.putString("appMode", AppMode.Companion.getCurrentMode$default(AppMode.INSTANCE, null, 1, null).getModeType());
        writableMapCreateMap.putString("futuresUrl", hostManager.o());
        C24267r0.m58520d(writableMapCreateMap);
        getPromise().resolve(writableMapCreateMap);
    }
}
