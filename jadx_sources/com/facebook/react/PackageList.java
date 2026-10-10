package com.facebook.react;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.airbnb.android.react.lottie.LottiePackage;
import com.facebook.react.shell.MainPackageConfig;
import com.facebook.react.shell.MainReactPackage;
import com.horcrux.svg.SvgPackage;
import com.kubi.p110rn.core.turbo.NativeAssetsTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeAuthTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeCalendarTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeCommonTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeCopyTradingTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeCountryCodeTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeExperimentTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeFileTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeFuturesTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeGestureTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeHomeFeedTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeHomeTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeKRNEventHubBridgePackage;
import com.kubi.p110rn.core.turbo.NativeKRNSocketModulePackage;
import com.kubi.p110rn.core.turbo.NativeKrnSocketTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeKycTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeLaunchTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeLifeCycleTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeLocaleTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeMarketTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeNetworkTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativePhotoTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeQrScanTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeRemoteConfigTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeRouterTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeSafeValidationTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeSecurityTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeSensorTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeShareTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeSiteConfigTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeSiteTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeSocketJsTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeStorageTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeSymbolsCoinTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeSystemSettingsTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeTrackTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeTradeTurboModulePackage;
import com.kubi.p110rn.core.turbo.NativeUserCenterTurboModulePackage;
import com.reactnativecommunity.blurview.C27495b;
import com.reactnativecommunity.imageeditor.C27499d;
import com.reactnativecommunity.webview.RNCWebViewPackage;
import com.reactnativeimageresizer.C27517c;
import com.shopify.reactnative.skia.C27770e;
import com.swmansion.reanimated.ReanimatedPackage;
import com.swmansion.rnscreens.RNScreensPackage;
import com.th3rdwave.safeareacontext.SafeAreaContextPackage;
import fa0.C37415i;
import ga0.C37852b;
import java.util.ArrayList;
import java.util.Arrays;
import p047c1.C4772a;
import qb0.C43688e;
import th0.C45025a;
import ve0.C45521c;

/* JADX INFO: loaded from: classes45.dex */
public class PackageList {
    private Application application;
    private MainPackageConfig mConfig;
    private ReactNativeHost reactNativeHost;

    public PackageList(ReactNativeHost reactNativeHost) {
        this(reactNativeHost, (MainPackageConfig) null);
    }

    public PackageList(Application application) {
        this(application, (MainPackageConfig) null);
    }

    private Application getApplication() {
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        return reactNativeHost == null ? this.application : reactNativeHost.getApplication();
    }

    private ReactNativeHost getReactNativeHost() {
        return this.reactNativeHost;
    }

    public ArrayList<ReactPackage> getPackages() {
        return new ArrayList<>(Arrays.asList(new MainReactPackage(this.mConfig), new C27517c(), new C37415i(), new C45025a(), new C27499d(), new C27770e(), new LottiePackage(), new C43688e(), new C4772a(), new C37852b(), new ReanimatedPackage(), new SafeAreaContextPackage(), new RNScreensPackage(), new SvgPackage(), new C45521c(), new RNCWebViewPackage(), new C27495b(), new NativeSensorTurboModulePackage(), new NativeCommonTurboModulePackage(), new NativeFileTurboModulePackage(), new NativeHomeTurboModulePackage(), new NativeRouterTurboModulePackage(), new NativeSymbolsCoinTurboModulePackage(), new NativePhotoTurboModulePackage(), new NativeMarketTurboModulePackage(), new NativeSecurityTurboModulePackage(), new NativeQrScanTurboModulePackage(), new NativeCalendarTurboModulePackage(), new NativeAuthTurboModulePackage(), new NativeHomeFeedTurboModulePackage(), new NativeNetworkTurboModulePackage(), new NativeSocketJsTurboModulePackage(), new NativeRemoteConfigTurboModulePackage(), new NativeShareTurboModulePackage(), new NativeKrnSocketTurboModulePackage(), new NativeSafeValidationTurboModulePackage(), new NativeCountryCodeTurboModulePackage(), new NativeLifeCycleTurboModulePackage(), new NativeLaunchTurboModulePackage(), new NativeSystemSettingsTurboModulePackage(), new NativeTrackTurboModulePackage(), new NativeAssetsTurboModulePackage(), new NativeFuturesTurboModulePackage(), new NativeLocaleTurboModulePackage(), new NativeKycTurboModulePackage(), new NativeTradeTurboModulePackage(), new NativeSiteConfigTurboModulePackage(), new NativeExperimentTurboModulePackage(), new NativeCopyTradingTurboModulePackage(), new NativeGestureTurboModulePackage(), new NativeUserCenterTurboModulePackage(), new NativeSiteTurboModulePackage(), new NativeStorageTurboModulePackage(), new NativeKRNEventHubBridgePackage(), new NativeKRNSocketModulePackage()));
    }

    public PackageList(ReactNativeHost reactNativeHost, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = reactNativeHost;
        this.mConfig = mainPackageConfig;
    }

    private Context getApplicationContext() {
        return getApplication().getApplicationContext();
    }

    private Resources getResources() {
        return getApplication().getResources();
    }

    public PackageList(Application application, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = null;
        this.application = application;
        this.mConfig = mainPackageConfig;
    }
}
