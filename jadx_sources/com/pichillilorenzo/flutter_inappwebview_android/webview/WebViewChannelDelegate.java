package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserSettings;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.CreateWindowAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomSchemeResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.GeolocationPermissionShowPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthenticationChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsAlertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsBeforeUnloadResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsConfirmResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview_android.types.PermissionResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.SslCertificateExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceErrorExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class WebViewChannelDelegate extends ChannelDelegateImpl {
    static final String LOG_TAG = "WebViewChannelDelegate";
    private InAppWebView webView;

    public static class CreateWindowCallback extends BaseCallbackResultImpl<Boolean> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public Boolean decodeResult(Object obj) {
            return Boolean.valueOf((obj instanceof Boolean) && ((Boolean) obj).booleanValue());
        }
    }

    public static class FormResubmissionCallback extends BaseCallbackResultImpl<Integer> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public Integer decodeResult(Object obj) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            return null;
        }
    }

    public static class GeolocationPermissionsShowPromptCallback extends BaseCallbackResultImpl<GeolocationPermissionShowPromptResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public GeolocationPermissionShowPromptResponse decodeResult(Object obj) {
            return GeolocationPermissionShowPromptResponse.fromMap((Map) obj);
        }
    }

    public static class JsAlertCallback extends BaseCallbackResultImpl<JsAlertResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public JsAlertResponse decodeResult(Object obj) {
            return JsAlertResponse.fromMap((Map) obj);
        }
    }

    public static class JsBeforeUnloadCallback extends BaseCallbackResultImpl<JsBeforeUnloadResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public JsBeforeUnloadResponse decodeResult(Object obj) {
            return JsBeforeUnloadResponse.fromMap((Map) obj);
        }
    }

    public static class JsConfirmCallback extends BaseCallbackResultImpl<JsConfirmResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public JsConfirmResponse decodeResult(Object obj) {
            return JsConfirmResponse.fromMap((Map) obj);
        }
    }

    public static class JsPromptCallback extends BaseCallbackResultImpl<JsPromptResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public JsPromptResponse decodeResult(Object obj) {
            return JsPromptResponse.fromMap((Map) obj);
        }
    }

    public static class LoadResourceWithCustomSchemeCallback extends BaseCallbackResultImpl<CustomSchemeResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public CustomSchemeResponse decodeResult(Object obj) {
            return CustomSchemeResponse.fromMap((Map) obj);
        }
    }

    public static class PermissionRequestCallback extends BaseCallbackResultImpl<PermissionResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public PermissionResponse decodeResult(Object obj) {
            return PermissionResponse.fromMap((Map) obj);
        }
    }

    public static class PrintRequestCallback extends BaseCallbackResultImpl<Boolean> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public Boolean decodeResult(Object obj) {
            return Boolean.valueOf((obj instanceof Boolean) && ((Boolean) obj).booleanValue());
        }
    }

    public static class ReceivedClientCertRequestCallback extends BaseCallbackResultImpl<ClientCertResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public ClientCertResponse decodeResult(Object obj) {
            return ClientCertResponse.fromMap((Map) obj);
        }
    }

    public static class ReceivedHttpAuthRequestCallback extends BaseCallbackResultImpl<HttpAuthResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public HttpAuthResponse decodeResult(Object obj) {
            return HttpAuthResponse.fromMap((Map) obj);
        }
    }

    public static class ReceivedServerTrustAuthRequestCallback extends BaseCallbackResultImpl<ServerTrustAuthResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public ServerTrustAuthResponse decodeResult(Object obj) {
            return ServerTrustAuthResponse.fromMap((Map) obj);
        }
    }

    public static class RenderProcessResponsiveCallback extends BaseCallbackResultImpl<Integer> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public Integer decodeResult(Object obj) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            return null;
        }
    }

    public static class RenderProcessUnresponsiveCallback extends BaseCallbackResultImpl<Integer> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public Integer decodeResult(Object obj) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            return null;
        }
    }

    public static class SafeBrowsingHitCallback extends BaseCallbackResultImpl<SafeBrowsingResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public SafeBrowsingResponse decodeResult(Object obj) {
            return SafeBrowsingResponse.fromMap((Map) obj);
        }
    }

    public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return WebResourceResponseExt.fromMap((Map) obj);
        }
    }

    public static class ShouldOverrideUrlLoadingCallback extends BaseCallbackResultImpl<NavigationActionPolicy> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public NavigationActionPolicy decodeResult(Object obj) {
            return NavigationActionPolicy.fromValue(obj instanceof Integer ? ((Integer) obj).intValue() : NavigationActionPolicy.CANCEL.rawValue());
        }
    }

    public static class SyncLoadResourceWithCustomSchemeCallback extends SyncBaseCallbackResultImpl<CustomSchemeResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public CustomSchemeResponse decodeResult(Object obj) {
            return new LoadResourceWithCustomSchemeCallback().decodeResult(obj);
        }
    }

    public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return new ShouldInterceptRequestCallback().decodeResult(obj);
        }
    }

    public void onLoadResourceWithCustomScheme(WebResourceRequestExt webResourceRequestExt, LoadResourceWithCustomSchemeCallback loadResourceWithCustomSchemeCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            loadResourceWithCustomSchemeCallback.defaultBehaviour(null);
            return;
        }
        HashMap map = new HashMap();
        map.put("request", webResourceRequestExt.toMap());
        channel.invokeMethod("onLoadResourceWithCustomScheme", map, loadResourceWithCustomSchemeCallback);
    }

    public void shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt, ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            shouldInterceptRequestCallback.defaultBehaviour(null);
        } else {
            channel.invokeMethod("shouldInterceptRequest", webResourceRequestExt.toMap(), shouldInterceptRequestCallback);
        }
    }

    /* JADX INFO: renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate$8 */
    public static /* synthetic */ class C274178 {

        /* JADX INFO: renamed from: $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods */
        static final /* synthetic */ int[] f55838x95709e3c;

        static {
            int[] iArr = new int[WebViewChannelDelegateMethods.values().length];
            f55838x95709e3c = iArr;
            try {
                iArr[WebViewChannelDelegateMethods.getUrl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.getTitle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.getProgress.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.loadUrl.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.postUrl.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.loadData.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.loadFile.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.evaluateJavascript.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.injectJavascriptFileFromUrl.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.injectCSSCode.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.injectCSSFileFromUrl.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.reload.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.goBack.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.canGoBack.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.goForward.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.canGoForward.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.goBackOrForward.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.canGoBackOrForward.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.stopLoading.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.isLoading.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.takeScreenshot.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.setSettings.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.getSettings.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.close.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.show.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.hide.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.isHidden.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.getCopyBackForwardList.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.startSafeBrowsing.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.clearCache.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.clearSslPreferences.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.findAll.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.findNext.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.clearMatches.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.scrollTo.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.scrollBy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.pause.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.resume.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.pauseTimers.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.resumeTimers.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.printCurrentPage.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.getContentHeight.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.getContentWidth.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.zoomBy.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.getOriginalUrl.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.getZoomScale.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.getSelectedText.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.getHitTestResult.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.pageDown.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.pageUp.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.saveWebArchive.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.zoomIn.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.zoomOut.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.clearFocus.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.setContextMenu.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.requestFocusNodeHref.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.requestImageRef.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.getScrollX.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.getScrollY.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.getCertificate.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.clearHistory.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.addUserScript.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.removeUserScript.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.removeUserScriptsByGroupName.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.removeAllUserScripts.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.callAsyncJavaScript.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.isSecureContext.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.createWebMessageChannel.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.postWebMessage.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.addWebMessageListener.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.canScrollVertically.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.canScrollHorizontally.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.isInFullscreen.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f55838x95709e3c[WebViewChannelDelegateMethods.clearFormData.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
        try {
            switch (C274178.f55838x95709e3c[WebViewChannelDelegateMethods.valueOf(methodCall.method).ordinal()]) {
                case 1:
                    InAppWebView inAppWebView = this.webView;
                    result.success(inAppWebView != null ? inAppWebView.getUrl() : null);
                    break;
                case 2:
                    InAppWebView inAppWebView2 = this.webView;
                    result.success(inAppWebView2 != null ? inAppWebView2.getTitle() : null);
                    break;
                case 3:
                    InAppWebView inAppWebView3 = this.webView;
                    result.success(inAppWebView3 != null ? Integer.valueOf(inAppWebView3.getProgress()) : null);
                    break;
                case 4:
                    if (this.webView != null) {
                        this.webView.loadUrl(URLRequest.fromMap((Map) methodCall.argument("urlRequest")));
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 5:
                    if (this.webView != null) {
                        this.webView.postUrl((String) methodCall.argument("url"), (byte[]) methodCall.argument("postData"));
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 6:
                    if (this.webView != null) {
                        this.webView.loadDataWithBaseURL((String) methodCall.argument("baseUrl"), (String) methodCall.argument("data"), (String) methodCall.argument("mimeType"), (String) methodCall.argument("encoding"), (String) methodCall.argument("historyUrl"));
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 7:
                    if (this.webView != null) {
                        try {
                            this.webView.loadFile((String) methodCall.argument("assetFilePath"));
                        } catch (IOException e11) {
                            e11.printStackTrace();
                            result.error(LOG_TAG, e11.getMessage(), null);
                            return;
                        }
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 8:
                    if (this.webView != null) {
                        this.webView.evaluateJavascript((String) methodCall.argument("source"), ContentWorld.fromMap((Map) methodCall.argument("contentWorld")), new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.1
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(String str) {
                                result.success(str);
                            }
                        });
                    } else {
                        result.success(null);
                    }
                    break;
                case 9:
                    if (this.webView != null) {
                        this.webView.injectJavascriptFileFromUrl((String) methodCall.argument("urlFile"), (Map) methodCall.argument("scriptHtmlTagAttributes"));
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 10:
                    if (this.webView != null) {
                        this.webView.injectCSSCode((String) methodCall.argument("source"));
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 11:
                    if (this.webView != null) {
                        this.webView.injectCSSFileFromUrl((String) methodCall.argument("urlFile"), (Map) methodCall.argument("cssLinkHtmlTagAttributes"));
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 12:
                    InAppWebView inAppWebView4 = this.webView;
                    if (inAppWebView4 != null) {
                        inAppWebView4.reload();
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 13:
                    InAppWebView inAppWebView5 = this.webView;
                    if (inAppWebView5 != null) {
                        inAppWebView5.goBack();
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 14:
                    InAppWebView inAppWebView6 = this.webView;
                    result.success(Boolean.valueOf(inAppWebView6 != null && inAppWebView6.canGoBack()));
                    break;
                case 15:
                    InAppWebView inAppWebView7 = this.webView;
                    if (inAppWebView7 != null) {
                        inAppWebView7.goForward();
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 16:
                    InAppWebView inAppWebView8 = this.webView;
                    result.success(Boolean.valueOf(inAppWebView8 != null && inAppWebView8.canGoForward()));
                    break;
                case 17:
                    InAppWebView inAppWebView9 = this.webView;
                    if (inAppWebView9 != null) {
                        inAppWebView9.goBackOrForward(((Integer) methodCall.argument("steps")).intValue());
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 18:
                    InAppWebView inAppWebView10 = this.webView;
                    result.success(Boolean.valueOf(inAppWebView10 != null && inAppWebView10.canGoBackOrForward(((Integer) methodCall.argument("steps")).intValue())));
                    break;
                case 19:
                    InAppWebView inAppWebView11 = this.webView;
                    if (inAppWebView11 != null) {
                        inAppWebView11.stopLoading();
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 20:
                    InAppWebView inAppWebView12 = this.webView;
                    result.success(Boolean.valueOf(inAppWebView12 != null && inAppWebView12.isLoading()));
                    break;
                case 21:
                    if (this.webView != null) {
                        this.webView.takeScreenshot((Map) methodCall.argument("screenshotConfiguration"), result);
                    } else {
                        result.success(null);
                    }
                    break;
                case 22:
                    InAppWebView inAppWebView13 = this.webView;
                    if (inAppWebView13 != null && (inAppWebView13.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        InAppBrowserActivity inAppBrowserActivity = (InAppBrowserActivity) this.webView.getInAppBrowserDelegate();
                        InAppBrowserSettings inAppBrowserSettings = new InAppBrowserSettings();
                        HashMap<String, Object> map = (HashMap) methodCall.argument("settings");
                        inAppBrowserSettings.parse2((Map<String, Object>) map);
                        inAppBrowserActivity.setSettings(inAppBrowserSettings, map);
                    } else if (this.webView != null) {
                        InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
                        HashMap<String, Object> map2 = (HashMap) methodCall.argument("settings");
                        inAppWebViewSettings.parse2((Map<String, Object>) map2);
                        this.webView.setSettings(inAppWebViewSettings, map2);
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 23:
                    InAppWebView inAppWebView14 = this.webView;
                    if (inAppWebView14 == null || !(inAppWebView14.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        InAppWebView inAppWebView15 = this.webView;
                        result.success(inAppWebView15 != null ? inAppWebView15.getCustomSettings() : null);
                    } else {
                        result.success(((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).getCustomSettings());
                    }
                    break;
                case 24:
                    InAppWebView inAppWebView16 = this.webView;
                    if (inAppWebView16 == null || !(inAppWebView16.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        result.notImplemented();
                    } else {
                        ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).close(result);
                    }
                    break;
                case 25:
                    InAppWebView inAppWebView17 = this.webView;
                    if (inAppWebView17 == null || !(inAppWebView17.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        result.notImplemented();
                    } else {
                        ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).show();
                        result.success(Boolean.TRUE);
                    }
                    break;
                case 26:
                    InAppWebView inAppWebView18 = this.webView;
                    if (inAppWebView18 == null || !(inAppWebView18.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        result.notImplemented();
                    } else {
                        ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).hide();
                        result.success(Boolean.TRUE);
                    }
                    break;
                case 27:
                    InAppWebView inAppWebView19 = this.webView;
                    if (inAppWebView19 == null || !(inAppWebView19.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        result.notImplemented();
                    } else {
                        result.success(Boolean.valueOf(((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).isHidden));
                    }
                    break;
                case 28:
                    InAppWebView inAppWebView20 = this.webView;
                    result.success(inAppWebView20 != null ? inAppWebView20.getCopyBackForwardList() : null);
                    break;
                case 29:
                    if (this.webView == null || !WebViewFeature.isFeatureSupported(WebViewFeature.START_SAFE_BROWSING)) {
                        result.success(Boolean.FALSE);
                    } else {
                        WebViewCompat.startSafeBrowsing(this.webView.getContext(), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.2
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(Boolean bool) {
                                result.success(bool);
                            }
                        });
                    }
                    break;
                case 30:
                    InAppWebView inAppWebView21 = this.webView;
                    if (inAppWebView21 != null) {
                        inAppWebView21.clearAllCache();
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 31:
                    InAppWebView inAppWebView22 = this.webView;
                    if (inAppWebView22 != null) {
                        inAppWebView22.clearSslPreferences();
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 32:
                    if (this.webView != null) {
                        this.webView.findAllAsync((String) methodCall.argument("find"));
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 33:
                    if (this.webView != null) {
                        this.webView.findNext(((Boolean) methodCall.argument("forward")).booleanValue());
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 34:
                    InAppWebView inAppWebView23 = this.webView;
                    if (inAppWebView23 != null) {
                        inAppWebView23.clearMatches();
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 35:
                    if (this.webView != null) {
                        this.webView.scrollTo((Integer) methodCall.argument("x"), (Integer) methodCall.argument("y"), (Boolean) methodCall.argument("animated"));
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 36:
                    if (this.webView != null) {
                        this.webView.scrollBy((Integer) methodCall.argument("x"), (Integer) methodCall.argument("y"), (Boolean) methodCall.argument("animated"));
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 37:
                    InAppWebView inAppWebView24 = this.webView;
                    if (inAppWebView24 != null) {
                        inAppWebView24.onPause();
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 38:
                    InAppWebView inAppWebView25 = this.webView;
                    if (inAppWebView25 != null) {
                        inAppWebView25.onResume();
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 39:
                    InAppWebView inAppWebView26 = this.webView;
                    if (inAppWebView26 != null) {
                        inAppWebView26.pauseTimers();
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 40:
                    InAppWebView inAppWebView27 = this.webView;
                    if (inAppWebView27 != null) {
                        inAppWebView27.resumeTimers();
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 41:
                    if (this.webView != null) {
                        PrintJobSettings printJobSettings = new PrintJobSettings();
                        Map<String, Object> map3 = (Map) methodCall.argument("settings");
                        if (map3 != null) {
                            printJobSettings.parse2(map3);
                        }
                        result.success(this.webView.printCurrentPage(printJobSettings));
                    } else {
                        result.success(null);
                    }
                    break;
                case 42:
                    InAppWebView inAppWebView28 = this.webView;
                    if (inAppWebView28 != null) {
                        result.success(Integer.valueOf(inAppWebView28.getContentHeight()));
                    } else {
                        result.success(null);
                    }
                    break;
                case 43:
                    InAppWebView inAppWebView29 = this.webView;
                    if (inAppWebView29 != null) {
                        inAppWebView29.getContentWidth(new ValueCallback<Integer>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.3
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(Integer num) {
                                result.success(num);
                            }
                        });
                    } else {
                        result.success(null);
                    }
                    break;
                case 44:
                    if (this.webView != null) {
                        this.webView.zoomBy((float) ((Double) methodCall.argument("zoomFactor")).doubleValue());
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 45:
                    InAppWebView inAppWebView30 = this.webView;
                    result.success(inAppWebView30 != null ? inAppWebView30.getOriginalUrl() : null);
                    break;
                case 46:
                    InAppWebView inAppWebView31 = this.webView;
                    if (inAppWebView31 != null) {
                        result.success(Float.valueOf(inAppWebView31.getZoomScale()));
                    } else {
                        result.success(null);
                    }
                    break;
                case 47:
                    InAppWebView inAppWebView32 = this.webView;
                    if (inAppWebView32 != null) {
                        inAppWebView32.getSelectedText(new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.4
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(String str) {
                                result.success(str);
                            }
                        });
                    } else {
                        result.success(null);
                    }
                    break;
                case 48:
                    InAppWebView inAppWebView33 = this.webView;
                    if (inAppWebView33 != null) {
                        result.success(HitTestResult.fromWebViewHitTestResult(inAppWebView33.getHitTestResult()).toMap());
                    } else {
                        result.success(null);
                    }
                    break;
                case 49:
                    if (this.webView != null) {
                        result.success(Boolean.valueOf(this.webView.pageDown(((Boolean) methodCall.argument(ViewProps.BOTTOM)).booleanValue())));
                    } else {
                        result.success(Boolean.FALSE);
                    }
                    break;
                case 50:
                    if (this.webView != null) {
                        result.success(Boolean.valueOf(this.webView.pageUp(((Boolean) methodCall.argument(ViewProps.TOP)).booleanValue())));
                    } else {
                        result.success(Boolean.FALSE);
                    }
                    break;
                case 51:
                    if (this.webView != null) {
                        this.webView.saveWebArchive((String) methodCall.argument("filePath"), ((Boolean) methodCall.argument("autoname")).booleanValue(), new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.5
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(String str) {
                                result.success(str);
                            }
                        });
                    } else {
                        result.success(null);
                    }
                    break;
                case 52:
                    InAppWebView inAppWebView34 = this.webView;
                    if (inAppWebView34 != null) {
                        result.success(Boolean.valueOf(inAppWebView34.zoomIn()));
                    } else {
                        result.success(Boolean.FALSE);
                    }
                    break;
                case 53:
                    InAppWebView inAppWebView35 = this.webView;
                    if (inAppWebView35 != null) {
                        result.success(Boolean.valueOf(inAppWebView35.zoomOut()));
                    } else {
                        result.success(Boolean.FALSE);
                    }
                    break;
                case 54:
                    InAppWebView inAppWebView36 = this.webView;
                    if (inAppWebView36 != null) {
                        inAppWebView36.clearFocus();
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 55:
                    if (this.webView != null) {
                        this.webView.setContextMenu((Map) methodCall.argument("contextMenu"));
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 56:
                    InAppWebView inAppWebView37 = this.webView;
                    if (inAppWebView37 != null) {
                        result.success(inAppWebView37.requestFocusNodeHref());
                    } else {
                        result.success(null);
                    }
                    break;
                case 57:
                    InAppWebView inAppWebView38 = this.webView;
                    if (inAppWebView38 != null) {
                        result.success(inAppWebView38.requestImageRef());
                    } else {
                        result.success(null);
                    }
                    break;
                case 58:
                    InAppWebView inAppWebView39 = this.webView;
                    if (inAppWebView39 != null) {
                        result.success(Integer.valueOf(inAppWebView39.getScrollX()));
                    } else {
                        result.success(null);
                    }
                    break;
                case 59:
                    InAppWebView inAppWebView40 = this.webView;
                    if (inAppWebView40 != null) {
                        result.success(Integer.valueOf(inAppWebView40.getScrollY()));
                    } else {
                        result.success(null);
                    }
                    break;
                case 60:
                    InAppWebView inAppWebView41 = this.webView;
                    if (inAppWebView41 != null) {
                        result.success(SslCertificateExt.toMap(inAppWebView41.getCertificate()));
                    } else {
                        result.success(null);
                    }
                    break;
                case 61:
                    InAppWebView inAppWebView42 = this.webView;
                    if (inAppWebView42 != null) {
                        inAppWebView42.clearHistory();
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 62:
                    InAppWebView inAppWebView43 = this.webView;
                    if (inAppWebView43 == null || inAppWebView43.getUserContentController() == null) {
                        result.success(Boolean.FALSE);
                    } else {
                        result.success(Boolean.valueOf(this.webView.getUserContentController().addUserOnlyScript(UserScript.fromMap((Map) methodCall.argument("userScript")))));
                    }
                    break;
                case 63:
                    InAppWebView inAppWebView44 = this.webView;
                    if (inAppWebView44 == null || inAppWebView44.getUserContentController() == null) {
                        result.success(Boolean.FALSE);
                    } else {
                        result.success(Boolean.valueOf(this.webView.getUserContentController().removeUserOnlyScriptAt(((Integer) methodCall.argument("index")).intValue(), UserScript.fromMap((Map) methodCall.argument("userScript")).getInjectionTime())));
                    }
                    break;
                case 64:
                    InAppWebView inAppWebView45 = this.webView;
                    if (inAppWebView45 != null && inAppWebView45.getUserContentController() != null) {
                        this.webView.getUserContentController().removeUserOnlyScriptsByGroupName((String) methodCall.argument("groupName"));
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 65:
                    InAppWebView inAppWebView46 = this.webView;
                    if (inAppWebView46 != null && inAppWebView46.getUserContentController() != null) {
                        this.webView.getUserContentController().removeAllUserOnlyScripts();
                    }
                    result.success(Boolean.TRUE);
                    break;
                case 66:
                    if (this.webView != null) {
                        this.webView.callAsyncJavaScript((String) methodCall.argument("functionBody"), (Map) methodCall.argument("arguments"), ContentWorld.fromMap((Map) methodCall.argument("contentWorld")), new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.6
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(String str) {
                                result.success(str);
                            }
                        });
                    } else {
                        result.success(null);
                    }
                    break;
                case 67:
                    InAppWebView inAppWebView47 = this.webView;
                    if (inAppWebView47 != null) {
                        inAppWebView47.isSecureContext(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.7
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(Boolean bool) {
                                result.success(bool);
                            }
                        });
                    } else {
                        result.success(Boolean.FALSE);
                    }
                    break;
                case 68:
                    if (this.webView == null) {
                        result.success(null);
                    } else if (WebViewFeature.isFeatureSupported(WebViewFeature.CREATE_WEB_MESSAGE_CHANNEL)) {
                        result.success(this.webView.createCompatWebMessageChannel().toMap());
                    } else {
                        result.success(null);
                    }
                    break;
                case 69:
                    if (this.webView == null || !WebViewFeature.isFeatureSupported(WebViewFeature.POST_WEB_MESSAGE)) {
                        result.success(Boolean.TRUE);
                    } else {
                        WebMessageCompatExt webMessageCompatExtFromMap = WebMessageCompatExt.fromMap((Map) methodCall.argument("message"));
                        String str = (String) methodCall.argument("targetOrigin");
                        ArrayList arrayList = new ArrayList();
                        List<WebMessagePortCompatExt> ports = webMessageCompatExtFromMap.getPorts();
                        if (ports != null) {
                            for (WebMessagePortCompatExt webMessagePortCompatExt : ports) {
                                WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get(webMessagePortCompatExt.getWebMessageChannelId());
                                if (webMessageChannel != null && this.webView != null) {
                                    arrayList.add(webMessageChannel.compatPorts.get(webMessagePortCompatExt.getIndex()));
                                }
                            }
                        }
                        Object data = webMessageCompatExtFromMap.getData();
                        if (this.webView != null) {
                            try {
                                if (WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_ARRAY_BUFFER) && data != null && webMessageCompatExtFromMap.getType() == 1) {
                                    WebViewCompat.postWebMessage(this.webView, new WebMessageCompat((byte[]) data, (WebMessagePortCompat[]) arrayList.toArray(new WebMessagePortCompat[0])), Uri.parse(str));
                                } else {
                                    WebViewCompat.postWebMessage(this.webView, new WebMessageCompat(data != null ? data.toString() : null, (WebMessagePortCompat[]) arrayList.toArray(new WebMessagePortCompat[0])), Uri.parse(str));
                                }
                                result.success(Boolean.TRUE);
                            } catch (Exception e12) {
                                result.error(LOG_TAG, e12.getMessage(), null);
                                return;
                            }
                        }
                    }
                    break;
                case 70:
                    if (this.webView == null) {
                        result.success(Boolean.TRUE);
                    } else {
                        Map map4 = (Map) methodCall.argument("webMessageListener");
                        InAppWebView inAppWebView48 = this.webView;
                        WebMessageListener webMessageListenerFromMap = WebMessageListener.fromMap(inAppWebView48, inAppWebView48.getPlugin().messenger, map4);
                        if (this.webView == null || !WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_LISTENER)) {
                            result.success(Boolean.TRUE);
                        } else {
                            try {
                                this.webView.addWebMessageListener(webMessageListenerFromMap);
                                result.success(Boolean.TRUE);
                            } catch (Exception e13) {
                                result.error(LOG_TAG, e13.getMessage(), null);
                                return;
                            }
                        }
                    }
                    break;
                case 71:
                    InAppWebView inAppWebView49 = this.webView;
                    if (inAppWebView49 != null) {
                        result.success(Boolean.valueOf(inAppWebView49.canScrollVertically()));
                    } else {
                        result.success(Boolean.FALSE);
                    }
                    break;
                case 72:
                    InAppWebView inAppWebView50 = this.webView;
                    if (inAppWebView50 != null) {
                        result.success(Boolean.valueOf(inAppWebView50.canScrollHorizontally()));
                    } else {
                        result.success(Boolean.FALSE);
                    }
                    break;
                case 73:
                    InAppWebView inAppWebView51 = this.webView;
                    if (inAppWebView51 != null) {
                        result.success(Boolean.valueOf(inAppWebView51.isInFullscreen()));
                    } else {
                        result.success(Boolean.FALSE);
                    }
                    break;
                case 74:
                    InAppWebView inAppWebView52 = this.webView;
                    if (inAppWebView52 != null) {
                        inAppWebView52.clearFormData();
                    }
                    result.success(Boolean.TRUE);
                    break;
            }
        } catch (IllegalArgumentException unused) {
            result.notImplemented();
        }
    }

    public WebViewChannelDelegate(InAppWebView inAppWebView, MethodChannel methodChannel) {
        super(methodChannel);
        this.webView = inAppWebView;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.webView = null;
    }

    public void onCallJsHandler(String str, String str2, CallJsHandlerCallback callJsHandlerCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            callJsHandlerCallback.defaultBehaviour(null);
            return;
        }
        HashMap map = new HashMap();
        map.put("handlerName", str);
        map.put("args", str2);
        channel.invokeMethod("onCallJsHandler", map, callJsHandlerCallback);
    }

    public void onCloseWindow() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onCloseWindow", new HashMap());
    }

    public void onConsoleMessage(String str, int i11) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("message", str);
        map.put("messageLevel", Integer.valueOf(i11));
        channel.invokeMethod("onConsoleMessage", map);
    }

    public void onContextMenuActionItemClicked(int i11, String str) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i11));
        map.put("androidId", Integer.valueOf(i11));
        map.put("iosId", null);
        map.put("title", str);
        channel.invokeMethod("onContextMenuActionItemClicked", map);
    }

    public void onCreateContextMenu(HitTestResult hitTestResult) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onCreateContextMenu", hitTestResult.toMap());
    }

    public void onCreateWindow(CreateWindowAction createWindowAction, CreateWindowCallback createWindowCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            createWindowCallback.defaultBehaviour(null);
        } else {
            channel.invokeMethod("onCreateWindow", createWindowAction.toMap(), createWindowCallback);
        }
    }

    public void onDownloadStartRequest(DownloadStartRequest downloadStartRequest) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onDownloadStartRequest", downloadStartRequest.toMap());
    }

    public void onEnterFullscreen() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onEnterFullscreen", new HashMap());
    }

    public void onExitFullscreen() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onExitFullscreen", new HashMap());
    }

    @Deprecated
    public void onFindResultReceived(int i11, int i12, boolean z11) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("activeMatchOrdinal", Integer.valueOf(i11));
        map.put("numberOfMatches", Integer.valueOf(i12));
        map.put("isDoneCounting", Boolean.valueOf(z11));
        channel.invokeMethod("onFindResultReceived", map);
    }

    public void onFormResubmission(String str, FormResubmissionCallback formResubmissionCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            formResubmissionCallback.defaultBehaviour(null);
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        channel.invokeMethod("onFormResubmission", map, formResubmissionCallback);
    }

    public void onGeolocationPermissionsHidePrompt() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onGeolocationPermissionsHidePrompt", new HashMap());
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissionsShowPromptCallback geolocationPermissionsShowPromptCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            geolocationPermissionsShowPromptCallback.defaultBehaviour(null);
            return;
        }
        HashMap map = new HashMap();
        map.put("origin", str);
        channel.invokeMethod("onGeolocationPermissionsShowPrompt", map, geolocationPermissionsShowPromptCallback);
    }

    public void onHideContextMenu() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onHideContextMenu", new HashMap());
    }

    public void onJsAlert(String str, String str2, Boolean bool, JsAlertCallback jsAlertCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            jsAlertCallback.defaultBehaviour(null);
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("message", str2);
        map.put("isMainFrame", bool);
        channel.invokeMethod("onJsAlert", map, jsAlertCallback);
    }

    public void onJsBeforeUnload(String str, String str2, JsBeforeUnloadCallback jsBeforeUnloadCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            jsBeforeUnloadCallback.defaultBehaviour(null);
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("message", str2);
        channel.invokeMethod("onJsBeforeUnload", map, jsBeforeUnloadCallback);
    }

    public void onJsConfirm(String str, String str2, Boolean bool, JsConfirmCallback jsConfirmCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            jsConfirmCallback.defaultBehaviour(null);
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("message", str2);
        map.put("isMainFrame", bool);
        channel.invokeMethod("onJsConfirm", map, jsConfirmCallback);
    }

    public void onJsPrompt(String str, String str2, String str3, Boolean bool, JsPromptCallback jsPromptCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            jsPromptCallback.defaultBehaviour(null);
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("message", str2);
        map.put("defaultValue", str3);
        map.put("isMainFrame", bool);
        channel.invokeMethod("onJsPrompt", map, jsPromptCallback);
    }

    public void onLoadStart(String str) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        channel.invokeMethod("onLoadStart", map);
    }

    public void onLoadStop(String str) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        channel.invokeMethod("onLoadStop", map);
    }

    public void onLongPressHitTestResult(HitTestResult hitTestResult) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onLongPressHitTestResult", hitTestResult.toMap());
    }

    public void onOverScrolled(int i11, int i12, boolean z11, boolean z12) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("x", Integer.valueOf(i11));
        map.put("y", Integer.valueOf(i12));
        map.put("clampedX", Boolean.valueOf(z11));
        map.put("clampedY", Boolean.valueOf(z12));
        channel.invokeMethod("onOverScrolled", map);
    }

    public void onPageCommitVisible(String str) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        channel.invokeMethod("onPageCommitVisible", map);
    }

    public void onPermissionRequest(String str, List<String> list, Object obj, PermissionRequestCallback permissionRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            permissionRequestCallback.defaultBehaviour(null);
            return;
        }
        HashMap map = new HashMap();
        map.put("origin", str);
        map.put("resources", list);
        map.put(TypedValues.AttributesType.S_FRAME, obj);
        channel.invokeMethod("onPermissionRequest", map, permissionRequestCallback);
    }

    public void onPermissionRequestCanceled(String str, List<String> list) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("origin", str);
        map.put("resources", list);
        channel.invokeMethod("onPermissionRequestCanceled", map);
    }

    public void onPrintRequest(String str, String str2, PrintRequestCallback printRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            printRequestCallback.defaultBehaviour(null);
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("printJobId", str2);
        channel.invokeMethod("onPrintRequest", map, printRequestCallback);
    }

    public void onProgressChanged(int i11) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("progress", Integer.valueOf(i11));
        channel.invokeMethod("onProgressChanged", map);
    }

    public void onReceivedClientCertRequest(ClientCertChallenge clientCertChallenge, ReceivedClientCertRequestCallback receivedClientCertRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            receivedClientCertRequestCallback.defaultBehaviour(null);
        } else {
            channel.invokeMethod("onReceivedClientCertRequest", clientCertChallenge.toMap(), receivedClientCertRequestCallback);
        }
    }

    public void onReceivedError(WebResourceRequestExt webResourceRequestExt, WebResourceErrorExt webResourceErrorExt) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("request", webResourceRequestExt.toMap());
        map.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, webResourceErrorExt.toMap());
        channel.invokeMethod("onReceivedError", map);
    }

    public void onReceivedHttpAuthRequest(HttpAuthenticationChallenge httpAuthenticationChallenge, ReceivedHttpAuthRequestCallback receivedHttpAuthRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            receivedHttpAuthRequestCallback.defaultBehaviour(null);
        } else {
            channel.invokeMethod("onReceivedHttpAuthRequest", httpAuthenticationChallenge.toMap(), receivedHttpAuthRequestCallback);
        }
    }

    public void onReceivedHttpError(WebResourceRequestExt webResourceRequestExt, WebResourceResponseExt webResourceResponseExt) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("request", webResourceRequestExt.toMap());
        map.put("errorResponse", webResourceResponseExt.toMap());
        channel.invokeMethod("onReceivedHttpError", map);
    }

    public void onReceivedIcon(byte[] bArr) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(TUIConstants.TUIChat.INPUT_MORE_ICON, bArr);
        channel.invokeMethod("onReceivedIcon", map);
    }

    public void onReceivedLoginRequest(String str, String str2, String str3) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, str);
        map.put(JAnalysisConstants.Account.KEY_ACCOUNT, str2);
        map.put("args", str3);
        channel.invokeMethod("onReceivedLoginRequest", map);
    }

    public void onReceivedServerTrustAuthRequest(ServerTrustChallenge serverTrustChallenge, ReceivedServerTrustAuthRequestCallback receivedServerTrustAuthRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            receivedServerTrustAuthRequestCallback.defaultBehaviour(null);
        } else {
            channel.invokeMethod("onReceivedServerTrustAuthRequest", serverTrustChallenge.toMap(), receivedServerTrustAuthRequestCallback);
        }
    }

    public void onReceivedTouchIconUrl(String str, boolean z11) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("precomposed", Boolean.valueOf(z11));
        channel.invokeMethod("onReceivedTouchIconUrl", map);
    }

    public void onRenderProcessGone(boolean z11, int i11) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("didCrash", Boolean.valueOf(z11));
        map.put("rendererPriorityAtExit", Integer.valueOf(i11));
        channel.invokeMethod("onRenderProcessGone", map);
    }

    public void onRenderProcessResponsive(String str, RenderProcessResponsiveCallback renderProcessResponsiveCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            renderProcessResponsiveCallback.defaultBehaviour(null);
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        channel.invokeMethod("onRenderProcessResponsive", map, renderProcessResponsiveCallback);
    }

    public void onRenderProcessUnresponsive(String str, RenderProcessUnresponsiveCallback renderProcessUnresponsiveCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            renderProcessUnresponsiveCallback.defaultBehaviour(null);
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        channel.invokeMethod("onRenderProcessUnresponsive", map, renderProcessUnresponsiveCallback);
    }

    public void onRequestFocus() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onRequestFocus", new HashMap());
    }

    public void onSafeBrowsingHit(String str, int i11, SafeBrowsingHitCallback safeBrowsingHitCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            safeBrowsingHitCallback.defaultBehaviour(null);
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("threatType", Integer.valueOf(i11));
        channel.invokeMethod("onSafeBrowsingHit", map, safeBrowsingHitCallback);
    }

    public void onScrollChanged(int i11, int i12) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("x", Integer.valueOf(i11));
        map.put("y", Integer.valueOf(i12));
        channel.invokeMethod("onScrollChanged", map);
    }

    public void onTitleChanged(String str) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("title", str);
        channel.invokeMethod("onTitleChanged", map);
    }

    public void onUpdateVisitedHistory(String str, boolean z11) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("isReload", Boolean.valueOf(z11));
        channel.invokeMethod("onUpdateVisitedHistory", map);
    }

    public void onZoomScaleChanged(float f11, float f12) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("oldScale", Float.valueOf(f11));
        map.put("newScale", Float.valueOf(f12));
        channel.invokeMethod("onZoomScaleChanged", map);
    }

    public void shouldOverrideUrlLoading(NavigationAction navigationAction, ShouldOverrideUrlLoadingCallback shouldOverrideUrlLoadingCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            shouldOverrideUrlLoadingCallback.defaultBehaviour(null);
        } else {
            channel.invokeMethod("shouldOverrideUrlLoading", navigationAction.toMap(), shouldOverrideUrlLoadingCallback);
        }
    }

    public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return null;
        }
        return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), new SyncShouldInterceptRequestCallback());
    }

    public CustomSchemeResponse onLoadResourceWithCustomScheme(WebResourceRequestExt webResourceRequestExt) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("request", webResourceRequestExt.toMap());
        return (CustomSchemeResponse) Util.invokeMethodAndWaitResult(channel, "onLoadResourceWithCustomScheme", map, new SyncLoadResourceWithCustomSchemeCallback());
    }

    public static class CallJsHandlerCallback extends BaseCallbackResultImpl<Object> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public Object decodeResult(Object obj) {
            return obj;
        }
    }
}
