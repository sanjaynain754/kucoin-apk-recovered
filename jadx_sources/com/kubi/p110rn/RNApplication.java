package com.kubi.p110rn;

import android.content.Context;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.defaults.DefaultReactHost;
import com.facebook.react.defaults.DefaultReactNativeHost;
import com.kubi.p110rn.core.RNApplicationInitGate;
import com.kubi.p110rn.kline.KlineHybridBridgePackage;
import com.kubi.p110rn.kline.KlineMiniReactPackage;
import com.kubi.p110rn.modules.BusinessPackage;
import com.kubi.sdk.BaseApplication;
import fa0.C37417k;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RNApplication.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/rn/RNApplication;", "Lcom/kubi/sdk/BaseApplication;", "Lcom/facebook/react/ReactApplication;", "<init>", "()V", "reactNativeHost", "Lcom/facebook/react/ReactNativeHost;", "getReactNativeHost", "()Lcom/facebook/react/ReactNativeHost;", "reactHost", "Lcom/facebook/react/ReactHost;", "getReactHost", "()Lcom/facebook/react/ReactHost;", "onCreate", "", "setRNCacheSize", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class RNApplication extends BaseApplication implements ReactApplication {

    @NotNull
    private final ReactNativeHost reactNativeHost = new DefaultReactNativeHost(this) { // from class: com.kubi.rn.RNApplication$reactNativeHost$1
        private final boolean isHermesEnabled;

        @Override // com.facebook.react.ReactNativeHost
        public boolean getUseDeveloperSupport() {
            return false;
        }

        @Override // com.facebook.react.defaults.DefaultReactNativeHost
        public boolean isNewArchEnabled() {
            return true;
        }

        @Override // com.facebook.react.ReactNativeHost
        public String getJSMainModuleName() {
            return "index";
        }

        @Override // com.facebook.react.ReactNativeHost
        public List<ReactPackage> getPackages() {
            ArrayList<ReactPackage> packages = new PackageList(getApplication()).getPackages();
            packages.add(new BusinessPackage());
            packages.add(new KlineMiniReactPackage());
            packages.add(new KlineHybridBridgePackage());
            Intrinsics.checkNotNull(packages);
            return packages;
        }

        @Override // com.facebook.react.defaults.DefaultReactNativeHost
        public Boolean isHermesEnabled() {
            return Boolean.valueOf(this.isHermesEnabled);
        }

        {
            super(this);
            this.isHermesEnabled = true;
        }
    };

    @Override // com.facebook.react.ReactApplication
    @NotNull
    public ReactNativeHost getReactNativeHost() {
        return this.reactNativeHost;
    }

    private final void setRNCacheSize() {
        C37417k.m84163j(getApplicationContext()).m84169k(104857600L);
    }

    @Override // com.facebook.react.ReactApplication
    @NotNull
    public ReactHost getReactHost() {
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return DefaultReactHost.getDefaultReactHost(applicationContext, getReactNativeHost());
    }

    @Override // com.kubi.sdk.BaseApplication, android.app.Application
    public void onCreate() throws InterruptedException {
        super.onCreate();
        setRNCacheSize();
        RNApplicationInitGate.INSTANCE.onApplicationCreate(this, "RNApplication.onCreate");
    }
}
