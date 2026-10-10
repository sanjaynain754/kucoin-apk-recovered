package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.webkit.ServiceWorkerClientCompat;
import androidx.webkit.ServiceWorkerControllerCompat;
import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayInputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class ServiceWorkerManager implements Disposable {
    protected static final String LOG_TAG = "ServiceWorkerManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_serviceworkercontroller";
    public static ServiceWorkerControllerCompat serviceWorkerController;
    public ServiceWorkerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;

    /* JADX INFO: loaded from: classes59.dex */
    public static final class DummyServiceWorkerClientCompat extends ServiceWorkerClientCompat {
        static final ServiceWorkerClientCompat INSTANCE = new DummyServiceWorkerClientCompat();

        @Override // androidx.webkit.ServiceWorkerClientCompat
        public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
            return null;
        }

        private DummyServiceWorkerClientCompat() {
        }
    }

    private ServiceWorkerClientCompat dummyServiceWorkerClientCompat() {
        return DummyServiceWorkerClientCompat.INSTANCE;
    }

    public static void init() {
        if (serviceWorkerController == null && WebViewFeature.isFeatureSupported(WebViewFeature.SERVICE_WORKER_BASIC_USAGE)) {
            serviceWorkerController = ServiceWorkerControllerCompat.getInstance();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        ServiceWorkerChannelDelegate serviceWorkerChannelDelegate = this.channelDelegate;
        if (serviceWorkerChannelDelegate != null) {
            serviceWorkerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }

    public void setServiceWorkerClient(Boolean bool) {
        ServiceWorkerControllerCompat serviceWorkerControllerCompat = serviceWorkerController;
        if (serviceWorkerControllerCompat != null) {
            serviceWorkerControllerCompat.setServiceWorkerClient(bool.booleanValue() ? dummyServiceWorkerClientCompat() : new ServiceWorkerClientCompat() { // from class: com.pichillilorenzo.flutter_inappwebview_android.service_worker.ServiceWorkerManager.1
                @Override // androidx.webkit.ServiceWorkerClientCompat
                public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
                    WebResourceResponseExt webResourceResponseExtShouldInterceptRequest;
                    WebResourceRequestExt webResourceRequestExtFromWebResourceRequest = WebResourceRequestExt.fromWebResourceRequest(webResourceRequest);
                    ServiceWorkerChannelDelegate serviceWorkerChannelDelegate = ServiceWorkerManager.this.channelDelegate;
                    ByteArrayInputStream byteArrayInputStream = null;
                    if (serviceWorkerChannelDelegate != null) {
                        try {
                            webResourceResponseExtShouldInterceptRequest = serviceWorkerChannelDelegate.shouldInterceptRequest(webResourceRequestExtFromWebResourceRequest);
                        } catch (InterruptedException e11) {
                            Log.e(ServiceWorkerManager.LOG_TAG, "", e11);
                            return null;
                        }
                    } else {
                        webResourceResponseExtShouldInterceptRequest = null;
                    }
                    if (webResourceResponseExtShouldInterceptRequest == null) {
                        return null;
                    }
                    String contentType = webResourceResponseExtShouldInterceptRequest.getContentType();
                    String contentEncoding = webResourceResponseExtShouldInterceptRequest.getContentEncoding();
                    byte[] data = webResourceResponseExtShouldInterceptRequest.getData();
                    Map<String, String> headers = webResourceResponseExtShouldInterceptRequest.getHeaders();
                    Integer statusCode = webResourceResponseExtShouldInterceptRequest.getStatusCode();
                    String reasonPhrase = webResourceResponseExtShouldInterceptRequest.getReasonPhrase();
                    if (data != null) {
                        byteArrayInputStream = new ByteArrayInputStream(data);
                    }
                    ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                    if (statusCode != null && reasonPhrase != null) {
                        return new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream2);
                    }
                    return new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream2);
                }
            });
        }
    }

    public ServiceWorkerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channelDelegate = new ServiceWorkerChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
    }
}
