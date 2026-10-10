package com.facebook.react.devsupport;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.react.C5771R;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.DevSplitBundleCallback;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.packagerconnection.RequestHandler;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p300h4.C38107c;
import p302h6.C38115a;
import p331i4.C38438a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public final class BridgeDevSupportManager extends DevSupportManagerBase {
    private boolean mIsSamplingProfilerEnabled;

    /* JADX INFO: Access modifiers changed from: private */
    public WebsocketJavaScriptExecutor.JSExecutorConnectCallback getExecutorConnectCallback(final SimpleSettableFuture<Boolean> simpleSettableFuture) {
        return new WebsocketJavaScriptExecutor.JSExecutorConnectCallback() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.2
            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onFailure(Throwable th2) {
                BridgeDevSupportManager.this.hideDevLoadingView();
                C45999a.m101508n(ReactConstants.TAG, "Failed to connect to debugger!", th2);
                simpleSettableFuture.setException(new IOException(BridgeDevSupportManager.this.getApplicationContext().getString(C5771R.string.catalyst_debug_error), th2));
            }

            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onSuccess() {
                simpleSettableFuture.set(Boolean.TRUE);
                BridgeDevSupportManager.this.hideDevLoadingView();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleReloadJS$1() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f9708b.lambda$handleReloadJS$0();
            }
        });
    }

    @Override // com.facebook.react.devsupport.DevSupportManagerBase
    public String getUniqueTag() {
        return "Bridge";
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void loadSplitBundleFromServer(final String str, final DevSplitBundleCallback devSplitBundleCallback) {
        fetchSplitBundleAndCreateBundleLoader(str, new DevSupportManagerBase.CallbackWithBundleLoader() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.1
            @Override // com.facebook.react.devsupport.DevSupportManagerBase.CallbackWithBundleLoader
            public void onError(String str2, Throwable th2) {
                devSplitBundleCallback.onError(str2, th2);
            }

            @Override // com.facebook.react.devsupport.DevSupportManagerBase.CallbackWithBundleLoader
            public void onSuccess(JSBundleLoader jSBundleLoader) {
                jSBundleLoader.loadScript(BridgeDevSupportManager.this.getCurrentReactContext().getCatalystInstance());
                ((HMRClient) BridgeDevSupportManager.this.getCurrentReactContext().getJSModule(HMRClient.class)).registerBundle(BridgeDevSupportManager.this.getDevServerHelper().getDevServerSplitBundleURL(str));
                devSplitBundleCallback.onSuccess();
            }
        });
    }

    public BridgeDevSupportManager(Context context, ReactInstanceDevHelper reactInstanceDevHelper, @Nullable String str, boolean z11, @Nullable RedBoxHandler redBoxHandler, @Nullable DevBundleDownloadListener devBundleDownloadListener, int i11, @Nullable Map<String, RequestHandler> map, @Nullable SurfaceDelegateFactory surfaceDelegateFactory, @Nullable DevLoadingViewManager devLoadingViewManager, @Nullable PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager) {
        super(context, reactInstanceDevHelper, str, z11, redBoxHandler, devBundleDownloadListener, i11, map, surfaceDelegateFactory, devLoadingViewManager, pausedInDebuggerOverlayManager);
        this.mIsSamplingProfilerEnabled = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleReloadJS$0() {
        getReactInstanceDevHelper().onJSBundleLoadedFromServer();
    }

    private void reloadJSInProxyMode() {
        getDevServerHelper().launchJSDevtools();
        getReactInstanceDevHelper().onReloadWithJSDebugger(new JavaJSExecutor.Factory() { // from class: com.facebook.react.devsupport.BridgeDevSupportManager.3
            @Override // com.facebook.react.bridge.JavaJSExecutor.Factory
            public JavaJSExecutor create() throws Exception {
                WebsocketJavaScriptExecutor websocketJavaScriptExecutor = new WebsocketJavaScriptExecutor();
                SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
                websocketJavaScriptExecutor.connect(BridgeDevSupportManager.this.getDevServerHelper().getWebsocketProxyURL(), BridgeDevSupportManager.this.getExecutorConnectCallback(simpleSettableFuture));
                try {
                    simpleSettableFuture.get(90L, TimeUnit.SECONDS);
                    return websocketJavaScriptExecutor;
                } catch (InterruptedException e11) {
                    e = e11;
                    throw new RuntimeException(e);
                } catch (ExecutionException e12) {
                    throw ((Exception) e12.getCause());
                } catch (TimeoutException e13) {
                    e = e13;
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void handleReloadJS() {
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.RELOAD, getDevSettings().getPackagerConnectionSettings().getDebugServerHost());
        hideRedboxDialog();
        if (getDevSettings().isRemoteJSDebugEnabled()) {
            C38107c.m86037a().mo86034a(C38438a.RN_CORE, "RNCore: load from Proxy");
            showDevLoadingViewForRemoteJSEnabled();
            reloadJSInProxyMode();
        } else {
            C38107c.m86037a().mo86034a(C38438a.RN_CORE, "RNCore: load from Server");
            reloadJSFromServer(getDevServerHelper().getDevServerBundleURL((String) C38115a.m86047c(getJSAppBundleName())), new BundleLoadCallback() { // from class: com.facebook.react.devsupport.b
                @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
                public final void onSuccess() {
                    this.f9710a.lambda$handleReloadJS$1();
                }
            });
        }
    }
}
