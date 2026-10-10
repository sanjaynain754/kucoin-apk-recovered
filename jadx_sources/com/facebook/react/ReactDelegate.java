package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.DoubleTapReloadRecognizer;
import com.facebook.react.devsupport.ReleaseDevSupportManager;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import p302h6.C38115a;

/* JADX INFO: loaded from: classes45.dex */
public class ReactDelegate {
    private final Activity mActivity;

    @Nullable
    private DoubleTapReloadRecognizer mDoubleTapReloadRecognizer;
    private boolean mFabricEnabled;

    @Nullable
    private Bundle mLaunchOptions;

    @Nullable
    private final String mMainComponentName;

    @Nullable
    private ReactHost mReactHost;

    @Nullable
    private ReactNativeHost mReactNativeHost;

    @Nullable
    private ReactRootView mReactRootView;

    @Nullable
    private ReactSurface mReactSurface;

    @Deprecated
    public ReactDelegate(Activity activity, ReactNativeHost reactNativeHost, @Nullable String str, @Nullable Bundle bundle) {
        this.mFabricEnabled = ReactNativeFeatureFlags.enableFabricRenderer();
        this.mActivity = activity;
        this.mMainComponentName = str;
        this.mLaunchOptions = bundle;
        this.mDoubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
        this.mReactNativeHost = reactNativeHost;
    }

    public void loadApp() {
        loadApp(this.mMainComponentName);
    }

    private ReactNativeHost getReactNativeHost() {
        return this.mReactNativeHost;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reload$0() {
        if (!this.mReactNativeHost.hasInstance() || this.mReactNativeHost.getReactInstanceManager() == null) {
            return;
        }
        this.mReactNativeHost.getReactInstanceManager().recreateReactContextInBackground();
    }

    public ReactRootView createRootView() {
        ReactRootView reactRootView = new ReactRootView(this.mActivity);
        reactRootView.setIsFabric(isFabricEnabled());
        return reactRootView;
    }

    @Nullable
    public ReactHost getReactHost() {
        return this.mReactHost;
    }

    public boolean isFabricEnabled() {
        return this.mFabricEnabled;
    }

    public void loadApp(String str) {
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            if (this.mReactSurface == null) {
                this.mReactSurface = this.mReactHost.createSurface(this.mActivity, str, this.mLaunchOptions);
            }
            this.mReactSurface.start();
        } else {
            if (this.mReactRootView != null) {
                throw new IllegalStateException("Cannot loadApp while app is already running.");
            }
            ReactRootView reactRootViewCreateRootView = createRootView();
            this.mReactRootView = reactRootViewCreateRootView;
            reactRootViewCreateRootView.startReactApplication(getReactNativeHost().getReactInstanceManager(), str, this.mLaunchOptions);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void onHostResume() {
        if (!(this.mActivity instanceof DefaultHardwareBackBtnHandler)) {
            throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
        }
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            ReactHost reactHost = this.mReactHost;
            Activity activity = this.mActivity;
            reactHost.onHostResume(activity, (DefaultHardwareBackBtnHandler) activity);
        } else if (getReactNativeHost().hasInstance()) {
            ReactInstanceManager reactInstanceManager = getReactNativeHost().getReactInstanceManager();
            Activity activity2 = this.mActivity;
            reactInstanceManager.onHostResume(activity2, (DefaultHardwareBackBtnHandler) activity2);
        }
    }

    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        ReactHost reactHost;
        if (i11 != 90) {
            return false;
        }
        if ((!ReactNativeFeatureFlags.enableBridgelessArchitecture() || (reactHost = this.mReactHost) == null || reactHost.getDevSupportManager() == null) && !(getReactNativeHost().hasInstance() && getReactNativeHost().getUseDeveloperSupport())) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyLongPress(int i11) {
        ReactHost reactHost;
        if (i11 != 90) {
            return false;
        }
        if (!ReactNativeFeatureFlags.enableBridgelessArchitecture() || (reactHost = this.mReactHost) == null) {
            if (!getReactNativeHost().hasInstance() || !getReactNativeHost().getUseDeveloperSupport()) {
                return false;
            }
            getReactNativeHost().getReactInstanceManager().showDevOptionsDialog();
            return true;
        }
        DevSupportManager devSupportManager = reactHost.getDevSupportManager();
        if (devSupportManager == null || (devSupportManager instanceof ReleaseDevSupportManager)) {
            return false;
        }
        devSupportManager.showDevOptionsDialog();
        return true;
    }

    @Nullable
    private DevSupportManager getDevSupportManager() {
        ReactHost reactHost;
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture() && (reactHost = this.mReactHost) != null && reactHost.getDevSupportManager() != null) {
            return this.mReactHost.getDevSupportManager();
        }
        if (getReactNativeHost().hasInstance() && getReactNativeHost().getReactInstanceManager() != null) {
            return getReactNativeHost().getReactInstanceManager().getDevSupportManager();
        }
        return null;
    }

    @Nullable
    public ReactContext getCurrentReactContext() {
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            ReactHost reactHost = this.mReactHost;
            if (reactHost != null) {
                return reactHost.getCurrentReactContext();
            }
            return null;
        }
        return getReactInstanceManager().getCurrentReactContext();
    }

    public ReactInstanceManager getReactInstanceManager() {
        return getReactNativeHost().getReactInstanceManager();
    }

    @Nullable
    public ReactRootView getReactRootView() {
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            ReactSurface reactSurface = this.mReactSurface;
            if (reactSurface != null) {
                return (ReactRootView) reactSurface.getView();
            }
            return null;
        }
        return this.mReactRootView;
    }

    public void onActivityResult(int i11, int i12, Intent intent, boolean z11) {
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            this.mReactHost.onActivityResult(this.mActivity, i11, i12, intent);
        } else if (getReactNativeHost().hasInstance() && z11) {
            getReactNativeHost().getReactInstanceManager().onActivityResult(this.mActivity, i11, i12, intent);
        }
    }

    public boolean onBackPressed() {
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            this.mReactHost.onBackPressed();
            return true;
        }
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onBackPressed();
            return true;
        }
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            this.mReactHost.onConfigurationChanged((Context) C38115a.m86047c(this.mActivity));
        } else if (getReactNativeHost().hasInstance()) {
            getReactInstanceManager().onConfigurationChanged((Context) C38115a.m86047c(this.mActivity), configuration);
        }
    }

    public void onHostDestroy() {
        unloadApp();
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            this.mReactHost.onHostDestroy(this.mActivity);
        } else if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onHostDestroy(this.mActivity);
        }
    }

    public void onHostPause() {
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            this.mReactHost.onHostPause(this.mActivity);
        } else if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onHostPause(this.mActivity);
        }
    }

    public boolean onNewIntent(Intent intent) {
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            this.mReactHost.onNewIntent(intent);
            return true;
        }
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onNewIntent(intent);
            return true;
        }
        return false;
    }

    public void onUserLeaveHint() {
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            this.mReactHost.onHostLeaveHint(this.mActivity);
        } else if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onUserLeaveHint(this.mActivity);
        }
    }

    public void onWindowFocusChanged(boolean z11) {
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            this.mReactHost.onWindowFocusChange(z11);
        } else if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().onWindowFocusChange(z11);
        }
    }

    public void reload() {
        DevSupportManager devSupportManager = getDevSupportManager();
        if (devSupportManager != null) {
            if (devSupportManager instanceof ReleaseDevSupportManager) {
                if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
                    ReactHost reactHost = this.mReactHost;
                    if (reactHost != null) {
                        reactHost.reload("ReactDelegate.reload()");
                        return;
                    }
                    return;
                }
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9778b.lambda$reload$0();
                    }
                });
                return;
            }
            devSupportManager.handleReloadJS();
        }
    }

    public boolean shouldShowDevMenuOrReload(int i11, KeyEvent keyEvent) {
        DevSupportManager devSupportManager = getDevSupportManager();
        if (devSupportManager != null && !(devSupportManager instanceof ReleaseDevSupportManager)) {
            if (i11 == 82) {
                devSupportManager.showDevOptionsDialog();
                return true;
            }
            if (((DoubleTapReloadRecognizer) C38115a.m86047c(this.mDoubleTapReloadRecognizer)).didDoubleTapR(i11, this.mActivity.getCurrentFocus())) {
                devSupportManager.handleReloadJS();
                return true;
            }
        }
        return false;
    }

    public void unloadApp() {
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            ReactSurface reactSurface = this.mReactSurface;
            if (reactSurface != null) {
                reactSurface.stop();
                this.mReactSurface = null;
                return;
            }
            return;
        }
        ReactRootView reactRootView = this.mReactRootView;
        if (reactRootView != null) {
            reactRootView.unmountReactApplication();
            this.mReactRootView = null;
        }
    }

    public ReactDelegate(Activity activity, ReactHost reactHost, @Nullable String str, @Nullable Bundle bundle) {
        this.mFabricEnabled = ReactNativeFeatureFlags.enableFabricRenderer();
        this.mActivity = activity;
        this.mMainComponentName = str;
        this.mLaunchOptions = bundle;
        this.mDoubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
        this.mReactHost = reactHost;
    }

    public ReactDelegate(Activity activity, ReactNativeHost reactNativeHost, @Nullable String str, @Nullable Bundle bundle, boolean z11) {
        ReactNativeFeatureFlags.enableFabricRenderer();
        this.mFabricEnabled = z11;
        this.mActivity = activity;
        this.mMainComponentName = str;
        this.mLaunchOptions = bundle;
        this.mDoubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
        this.mReactNativeHost = reactNativeHost;
    }
}
