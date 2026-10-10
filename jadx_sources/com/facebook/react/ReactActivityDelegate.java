package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.systrace.Systrace;
import com.tencent.bugly.proguard.C34054z6;
import dh0.C36686b;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.C43179b;
import p302h6.C38115a;
import p514ou.C43330a;

/* JADX INFO: loaded from: classes45.dex */
public class ReactActivityDelegate {
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_0;

    @Nullable
    private final Activity mActivity;

    @Nullable
    private final String mMainComponentName;

    @Nullable
    private PermissionListener mPermissionListener;

    @Nullable
    private Callback mPermissionsCallback;

    @Nullable
    private ReactDelegate mReactDelegate;

    @Deprecated
    public ReactActivityDelegate(@Nullable Activity activity, @Nullable String str) {
        this.mActivity = activity;
        this.mMainComponentName = str;
    }

    @Nullable
    public ReactRootView createRootView() {
        return null;
    }

    @Nullable
    public Bundle getLaunchOptions() {
        return null;
    }

    public boolean isWideColorGamutEnabled() {
        return false;
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("ReactActivityDelegate.java", ReactActivityDelegate.class);
        ajc$tjp_0 = c36686b.m82128h("method-call", c36686b.m82127g("11", "requestPermissions", C34054z6.f72607f, "[Ljava.lang.String;:int", "permissions:requestCode", "", "void"), 217);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRequestPermissionsResult$1(int i11, String[] strArr, int[] iArr, Object[] objArr) {
        PermissionListener permissionListener = this.mPermissionListener;
        if (permissionListener == null || !permissionListener.onRequestPermissionsResult(i11, strArr, iArr)) {
            return;
        }
        this.mPermissionListener = null;
    }

    public Context getContext() {
        return (Context) C38115a.m86047c(this.mActivity);
    }

    @Nullable
    public ReactContext getCurrentReactContext() {
        return this.mReactDelegate.getCurrentReactContext();
    }

    public String getMainComponentName() {
        return this.mMainComponentName;
    }

    @Nullable
    public ReactDelegate getReactDelegate() {
        return this.mReactDelegate;
    }

    public ReactInstanceManager getReactInstanceManager() {
        return this.mReactDelegate.getReactInstanceManager();
    }

    public void loadApp(String str) {
        this.mReactDelegate.loadApp(str);
        getPlainActivity().setContentView(this.mReactDelegate.getReactRootView());
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        this.mReactDelegate.onActivityResult(i11, i12, intent, true);
    }

    public boolean onBackPressed() {
        return this.mReactDelegate.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mReactDelegate.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        Systrace.m10673o(0L, "ReactActivityDelegate.onCreate::init", new Runnable() { // from class: com.facebook.react.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f9769b.lambda$onCreate$0();
            }
        });
    }

    public void onDestroy() {
        this.mReactDelegate.onHostDestroy();
    }

    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        return this.mReactDelegate.onKeyDown(i11, keyEvent);
    }

    public boolean onKeyLongPress(int i11, KeyEvent keyEvent) {
        return this.mReactDelegate.onKeyLongPress(i11);
    }

    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        return this.mReactDelegate.shouldShowDevMenuOrReload(i11, keyEvent);
    }

    public boolean onNewIntent(Intent intent) {
        return this.mReactDelegate.onNewIntent(intent);
    }

    public void onPause() {
        this.mReactDelegate.onHostPause();
    }

    public void onRequestPermissionsResult(final int i11, final String[] strArr, final int[] iArr) {
        this.mPermissionsCallback = new Callback() { // from class: com.facebook.react.g
            @Override // com.facebook.react.bridge.Callback
            public final void invoke(Object[] objArr) {
                this.f9774a.lambda$onRequestPermissionsResult$1(i11, strArr, iArr, objArr);
            }
        };
    }

    public void onResume() {
        this.mReactDelegate.onHostResume();
        Callback callback = this.mPermissionsCallback;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.mPermissionsCallback = null;
        }
    }

    public void onUserLeaveHint() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        if (reactDelegate != null) {
            reactDelegate.onUserLeaveHint();
        }
    }

    public void onWindowFocusChanged(boolean z11) {
        this.mReactDelegate.onWindowFocusChanged(z11);
    }

    public void requestPermissions(String[] strArr, int i11, PermissionListener permissionListener) throws Throwable {
        this.mPermissionListener = permissionListener;
        Activity plainActivity = getPlainActivity();
        C43330a.m95368b().m95371e(C36686b.m82124d(ajc$tjp_0, this, plainActivity, strArr, C43179b.m94790c(i11)));
        plainActivity.requestPermissions(strArr, i11);
    }

    static {
        ajc$preClinit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0() {
        String mainComponentName = getMainComponentName();
        Bundle bundleComposeLaunchOptions = composeLaunchOptions();
        if (Build.VERSION.SDK_INT >= 26 && isWideColorGamutEnabled()) {
            this.mActivity.getWindow().setColorMode(1);
        }
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            this.mReactDelegate = new ReactDelegate(getPlainActivity(), getReactHost(), mainComponentName, bundleComposeLaunchOptions);
        } else {
            this.mReactDelegate = new ReactDelegate(getPlainActivity(), getReactNativeHost(), mainComponentName, bundleComposeLaunchOptions, isFabricEnabled()) { // from class: com.facebook.react.ReactActivityDelegate.1
                @Override // com.facebook.react.ReactDelegate
                public ReactRootView createRootView() {
                    ReactRootView reactRootViewCreateRootView = ReactActivityDelegate.this.createRootView();
                    return reactRootViewCreateRootView == null ? super.createRootView() : reactRootViewCreateRootView;
                }
            };
        }
        if (mainComponentName != null) {
            loadApp(mainComponentName);
        }
    }

    @Nullable
    public Bundle composeLaunchOptions() {
        return getLaunchOptions();
    }

    public Activity getPlainActivity() {
        return (Activity) getContext();
    }

    public ReactActivity getReactActivity() {
        return (ReactActivity) getContext();
    }

    @Nullable
    public ReactHost getReactHost() {
        return ((ReactApplication) getPlainActivity().getApplication()).getReactHost();
    }

    public ReactNativeHost getReactNativeHost() {
        return ((ReactApplication) getPlainActivity().getApplication()).getReactNativeHost();
    }

    public boolean isFabricEnabled() {
        return ReactNativeFeatureFlags.enableFabricRenderer();
    }

    public ReactActivityDelegate(@Nullable ReactActivity reactActivity, @Nullable String str) {
        this.mActivity = reactActivity;
        this.mMainComponentName = str;
    }
}
