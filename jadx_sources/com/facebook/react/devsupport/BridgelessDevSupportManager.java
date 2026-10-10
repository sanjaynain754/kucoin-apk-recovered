package com.facebook.react.devsupport;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.DevSplitBundleCallback;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.packagerconnection.RequestHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
class BridgelessDevSupportManager extends DevSupportManagerBase {
    public BridgelessDevSupportManager(Context context, ReactInstanceDevHelper reactInstanceDevHelper, @Nullable String str) {
        this(context.getApplicationContext(), reactInstanceDevHelper, str, true, null, null, 2, null, null, null, null);
    }

    @Override // com.facebook.react.devsupport.DevSupportManagerBase
    public String getUniqueTag() {
        return "Bridgeless";
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void loadSplitBundleFromServer(final String str, final DevSplitBundleCallback devSplitBundleCallback) {
        fetchSplitBundleAndCreateBundleLoader(str, new DevSupportManagerBase.CallbackWithBundleLoader() { // from class: com.facebook.react.devsupport.BridgelessDevSupportManager.1
            @Override // com.facebook.react.devsupport.DevSupportManagerBase.CallbackWithBundleLoader
            public void onError(String str2, Throwable th2) {
                devSplitBundleCallback.onError(str2, th2);
            }

            @Override // com.facebook.react.devsupport.DevSupportManagerBase.CallbackWithBundleLoader
            public void onSuccess(JSBundleLoader jSBundleLoader) {
                try {
                    BridgelessDevSupportManager.this.mReactInstanceDevHelper.loadBundle(jSBundleLoader).waitForCompletion();
                    String devServerSplitBundleURL = BridgelessDevSupportManager.this.getDevServerHelper().getDevServerSplitBundleURL(str);
                    ReactContext currentReactContext = BridgelessDevSupportManager.this.mReactInstanceDevHelper.getCurrentReactContext();
                    if (currentReactContext != null) {
                        ((HMRClient) currentReactContext.getJSModule(HMRClient.class)).registerBundle(devServerSplitBundleURL);
                    }
                    devSplitBundleCallback.onSuccess();
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException("[BridgelessDevSupportManager]: Got interrupted while loading bundle", e11);
                }
            }
        });
    }

    public BridgelessDevSupportManager(Context context, ReactInstanceDevHelper reactInstanceDevHelper, @Nullable String str, boolean z11, @Nullable RedBoxHandler redBoxHandler, @Nullable DevBundleDownloadListener devBundleDownloadListener, int i11, @Nullable Map<String, RequestHandler> map, @Nullable SurfaceDelegateFactory surfaceDelegateFactory, @Nullable DevLoadingViewManager devLoadingViewManager, @Nullable PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager) {
        super(context, reactInstanceDevHelper, str, z11, redBoxHandler, devBundleDownloadListener, i11, map, surfaceDelegateFactory, devLoadingViewManager, pausedInDebuggerOverlayManager);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void handleReloadJS() {
        UiThreadUtil.assertOnUiThread();
        hideRedboxDialog();
        this.mReactInstanceDevHelper.reload("BridgelessDevSupportManager.handleReloadJS()");
    }
}
