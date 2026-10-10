package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import androidx.webkit.ServiceWorkerControllerCompat;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class ServiceWorkerChannelDelegate extends ChannelDelegateImpl {
    private ServiceWorkerManager serviceWorkerManager;

    /* JADX INFO: loaded from: classes59.dex */
    public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return WebResourceResponseExt.fromMap((Map) obj);
        }
    }

    /* JADX INFO: loaded from: classes59.dex */
    public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return new ShouldInterceptRequestCallback().decodeResult(obj);
        }
    }

    public void shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt, ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("shouldInterceptRequest", webResourceRequestExt.toMap(), shouldInterceptRequestCallback);
    }

    public ServiceWorkerChannelDelegate(ServiceWorkerManager serviceWorkerManager, MethodChannel methodChannel) {
        super(methodChannel);
        this.serviceWorkerManager = serviceWorkerManager;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.serviceWorkerManager = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        ServiceWorkerWebSettingsCompat serviceWorkerWebSettings;
        ServiceWorkerManager.init();
        ServiceWorkerControllerCompat serviceWorkerControllerCompat = ServiceWorkerManager.serviceWorkerController;
        if (serviceWorkerControllerCompat != null) {
            serviceWorkerWebSettings = serviceWorkerControllerCompat.getServiceWorkerWebSettings();
        } else {
            serviceWorkerWebSettings = null;
        }
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "getAllowContentAccess":
                if (serviceWorkerWebSettings != null && WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_CONTENT_ACCESS)) {
                    result.success(Boolean.valueOf(serviceWorkerWebSettings.getAllowContentAccess()));
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            case "setServiceWorkerClient":
                if (this.serviceWorkerManager != null) {
                    this.serviceWorkerManager.setServiceWorkerClient((Boolean) methodCall.argument("isNull"));
                    result.success(Boolean.TRUE);
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            case "getCacheMode":
                if (serviceWorkerWebSettings != null && WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_CACHE_MODE)) {
                    result.success(Integer.valueOf(serviceWorkerWebSettings.getCacheMode()));
                    break;
                } else {
                    result.success(null);
                    break;
                }
                break;
            case "getAllowFileAccess":
                if (serviceWorkerWebSettings != null && WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_FILE_ACCESS)) {
                    result.success(Boolean.valueOf(serviceWorkerWebSettings.getAllowFileAccess()));
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            case "setCacheMode":
                if (serviceWorkerWebSettings != null && WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_CACHE_MODE)) {
                    serviceWorkerWebSettings.setCacheMode(((Integer) methodCall.argument("mode")).intValue());
                }
                result.success(Boolean.TRUE);
                break;
            case "setBlockNetworkLoads":
                if (serviceWorkerWebSettings != null && WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_BLOCK_NETWORK_LOADS)) {
                    serviceWorkerWebSettings.setBlockNetworkLoads(((Boolean) methodCall.argument("flag")).booleanValue());
                }
                result.success(Boolean.TRUE);
                break;
            case "setAllowContentAccess":
                if (serviceWorkerWebSettings != null && WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_CONTENT_ACCESS)) {
                    serviceWorkerWebSettings.setAllowContentAccess(((Boolean) methodCall.argument("allow")).booleanValue());
                }
                result.success(Boolean.TRUE);
                break;
            case "setAllowFileAccess":
                if (serviceWorkerWebSettings != null && WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_FILE_ACCESS)) {
                    serviceWorkerWebSettings.setAllowFileAccess(((Boolean) methodCall.argument("allow")).booleanValue());
                }
                result.success(Boolean.TRUE);
                break;
            case "getBlockNetworkLoads":
                if (serviceWorkerWebSettings != null && WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_BLOCK_NETWORK_LOADS)) {
                    result.success(Boolean.valueOf(serviceWorkerWebSettings.getBlockNetworkLoads()));
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return null;
        }
        return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), new SyncShouldInterceptRequestCallback());
    }
}
