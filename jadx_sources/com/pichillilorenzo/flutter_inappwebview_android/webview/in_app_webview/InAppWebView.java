package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.print.PrintAttributes;
import android.print.PrintJob;
import android.print.PrintManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.provider.CredentialEntry;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.react.bridge.BaseJavaModule;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.pichillilorenzo.flutter_inappwebview_android.C27376R;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlocker;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerAction;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTrigger;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptAjaxRequestJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptFetchRequestJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnLoadResourceJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowBlurEventJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowFocusEventJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PluginScriptsUtil;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PrintJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PromisePolyfillJS;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview_android.types.MediaSizeExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType;
import com.pichillilorenzo.flutter_inappwebview_android.types.ResolutionExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessage;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.ContextMenuSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.bugly.proguard.C33812n7;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public final class InAppWebView extends InputAwareWebView implements InAppWebViewInterface {
    protected static final String LOG_TAG = "InAppWebView";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_";
    static Handler mHandler = new Handler();
    public Map<String, ValueCallback<String>> callAsyncJavaScriptCallbacks;
    public WebViewChannelDelegate channelDelegate;
    public Runnable checkContextMenuShouldBeClosedTask;
    public Runnable checkScrollStoppedTask;
    public ContentBlockerHandler contentBlockerHandler;
    public Map<String, Object> contextMenu;
    private Point contextMenuPoint;
    public InAppWebViewSettings customSettings;
    public Map<String, ValueCallback<String>> evaluateJavaScriptContentWorldCallbacks;
    public FindInteractionController findInteractionController;
    public LinearLayout floatingContextMenu;
    public GestureDetector gestureDetector;

    /* JADX INFO: renamed from: id */
    public Object f55839id;
    public InAppBrowserDelegate inAppBrowserDelegate;
    public InAppWebViewChromeClient inAppWebViewChromeClient;
    public InAppWebViewClient inAppWebViewClient;
    public InAppWebViewClientCompat inAppWebViewClientCompat;
    public InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient;
    private boolean inFullscreen;
    public int initialPositionScrollStoppedTask;
    private List<UserScript> initialUserOnlyScripts;
    private PluginScript interceptOnlyAsyncAjaxRequestsPluginScript;
    public boolean isLoading;
    public JavaScriptBridgeInterface javaScriptBridgeInterface;
    private Point lastTouch;
    public Handler mainLooperHandler;
    public int newCheckContextMenuShouldBeClosedTaskTask;
    public int newCheckScrollStoppedTask;
    public InAppWebViewFlutterPlugin plugin;
    public Pattern regexToCancelSubFramesLoadingCompiled;
    public UserContentController userContentController;
    public Map<String, WebMessageChannel> webMessageChannels;
    public List<WebMessageListener> webMessageListeners;
    public WebViewAssetLoaderExt webViewAssetLoaderExt;
    public Integer windowId;
    public float zoomScale;

    public class DownloadStartListener implements DownloadListener {
        public DownloadStartListener() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
            DownloadStartRequest downloadStartRequest = new DownloadStartRequest(str, str2, str3, str4, j11, URLUtil.guessFileName(str, str3, str4), null);
            WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
            if (webViewChannelDelegate != null) {
                webViewChannelDelegate.onDownloadStartRequest(downloadStartRequest);
            }
        }
    }

    public InAppWebView(Context context) {
        super(context);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    @Deprecated
    public void clearAllCache() {
        clearCache(true);
        clearCookies();
        clearFormData();
        WebStorage.getInstance().deleteAllData();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void evaluateJavascript(String str, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        injectDeferredObject(str, contentWorld, null, valueCallback);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public float getZoomScale() {
        return this.zoomScale;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void injectCSSCode(String str) {
        injectDeferredObject(str, null, "(function(d) { var style = d.createElement('style'); style.innerHTML = %s; if (d.head != null) { d.head.appendChild(style); } })(document);", null);
    }

    public void prepare() {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            this.webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(this.customSettings.webViewAssetLoader, inAppWebViewFlutterPlugin, getContext());
        }
        JavaScriptBridgeInterface javaScriptBridgeInterface = new JavaScriptBridgeInterface(this);
        this.javaScriptBridgeInterface = javaScriptBridgeInterface;
        addJavascriptInterface(javaScriptBridgeInterface, JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
        InAppWebViewChromeClient inAppWebViewChromeClient = new InAppWebViewChromeClient(this.plugin, this, this.inAppBrowserDelegate);
        this.inAppWebViewChromeClient = inAppWebViewChromeClient;
        setWebChromeClient(inAppWebViewChromeClient);
        WebViewClient webViewClientCreateWebViewClient = createWebViewClient(this.inAppBrowserDelegate);
        if (webViewClientCreateWebViewClient instanceof InAppWebViewClientCompat) {
            InAppWebViewClientCompat inAppWebViewClientCompat = (InAppWebViewClientCompat) webViewClientCreateWebViewClient;
            this.inAppWebViewClientCompat = inAppWebViewClientCompat;
            setWebViewClient(inAppWebViewClientCompat);
        } else if (webViewClientCreateWebViewClient instanceof InAppWebViewClient) {
            InAppWebViewClient inAppWebViewClient = (InAppWebViewClient) webViewClientCreateWebViewClient;
            this.inAppWebViewClient = inAppWebViewClient;
            setWebViewClient(inAppWebViewClient);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && WebViewFeature.isFeatureSupported(WebViewFeature.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE)) {
            InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient = new InAppWebViewRenderProcessClient();
            this.inAppWebViewRenderProcessClient = inAppWebViewRenderProcessClient;
            WebViewCompat.setWebViewRenderProcessClient(this, inAppWebViewRenderProcessClient);
        }
        if (this.windowId == null || !WebViewFeature.isFeatureSupported(WebViewFeature.DOCUMENT_START_SCRIPT)) {
            prepareAndAddUserScripts();
        }
        if (this.customSettings.useOnDownloadStart.booleanValue()) {
            setDownloadListener(new DownloadStartListener());
        }
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(this.customSettings.javaScriptEnabled.booleanValue());
        settings.setJavaScriptCanOpenWindowsAutomatically(this.customSettings.javaScriptCanOpenWindowsAutomatically.booleanValue());
        settings.setBuiltInZoomControls(this.customSettings.builtInZoomControls.booleanValue());
        settings.setDisplayZoomControls(this.customSettings.displayZoomControls.booleanValue());
        settings.setSupportMultipleWindows(this.customSettings.supportMultipleWindows.booleanValue());
        if (WebViewFeature.isFeatureSupported(WebViewFeature.SAFE_BROWSING_ENABLE)) {
            WebSettingsCompat.setSafeBrowsingEnabled(settings, this.customSettings.safeBrowsingEnabled.booleanValue());
        } else if (i11 >= 26) {
            settings.setSafeBrowsingEnabled(this.customSettings.safeBrowsingEnabled.booleanValue());
        }
        settings.setMediaPlaybackRequiresUserGesture(this.customSettings.mediaPlaybackRequiresUserGesture.booleanValue());
        settings.setDatabaseEnabled(this.customSettings.databaseEnabled.booleanValue());
        settings.setDomStorageEnabled(this.customSettings.domStorageEnabled.booleanValue());
        String str = this.customSettings.userAgent;
        if (str == null || str.isEmpty()) {
            settings.setUserAgentString(WebSettings.getDefaultUserAgent(getContext()));
        } else {
            settings.setUserAgentString(this.customSettings.userAgent);
        }
        String str2 = this.customSettings.applicationNameForUserAgent;
        if (str2 != null && !str2.isEmpty()) {
            String str3 = this.customSettings.userAgent;
            settings.setUserAgentString(((str3 == null || str3.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : this.customSettings.userAgent) + C33627eb.f69716f + this.customSettings.applicationNameForUserAgent);
        }
        if (this.customSettings.clearCache.booleanValue()) {
            clearAllCache();
        } else if (this.customSettings.clearSessionCache.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, this.customSettings.thirdPartyCookiesEnabled.booleanValue());
        settings.setLoadWithOverviewMode(this.customSettings.loadWithOverviewMode.booleanValue());
        settings.setUseWideViewPort(this.customSettings.useWideViewPort.booleanValue());
        settings.setSupportZoom(this.customSettings.supportZoom.booleanValue());
        settings.setTextZoom(this.customSettings.textZoom.intValue());
        setVerticalScrollBarEnabled(!this.customSettings.disableVerticalScroll.booleanValue() && this.customSettings.verticalScrollBarEnabled.booleanValue());
        setHorizontalScrollBarEnabled(!this.customSettings.disableHorizontalScroll.booleanValue() && this.customSettings.horizontalScrollBarEnabled.booleanValue());
        if (this.customSettings.transparentBackground.booleanValue()) {
            setBackgroundColor(0);
        }
        Integer num = this.customSettings.mixedContentMode;
        if (num != null) {
            settings.setMixedContentMode(num.intValue());
        }
        settings.setAllowContentAccess(this.customSettings.allowContentAccess.booleanValue());
        settings.setAllowFileAccess(this.customSettings.allowFileAccess.booleanValue());
        settings.setAllowFileAccessFromFileURLs(this.customSettings.allowFileAccessFromFileURLs.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs(this.customSettings.allowUniversalAccessFromFileURLs.booleanValue());
        setCacheEnabled(this.customSettings.cacheEnabled.booleanValue());
        String str4 = this.customSettings.appCachePath;
        if (str4 != null && !str4.isEmpty() && this.customSettings.cacheEnabled.booleanValue()) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", this.customSettings.appCachePath);
        }
        settings.setBlockNetworkImage(this.customSettings.blockNetworkImage.booleanValue());
        settings.setBlockNetworkLoads(this.customSettings.blockNetworkLoads.booleanValue());
        Integer num2 = this.customSettings.cacheMode;
        if (num2 != null) {
            settings.setCacheMode(num2.intValue());
        }
        settings.setCursiveFontFamily(this.customSettings.cursiveFontFamily);
        settings.setDefaultFixedFontSize(this.customSettings.defaultFixedFontSize.intValue());
        settings.setDefaultFontSize(this.customSettings.defaultFontSize.intValue());
        settings.setDefaultTextEncodingName(this.customSettings.defaultTextEncodingName);
        if (this.customSettings.disabledActionModeMenuItems != null) {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.DISABLED_ACTION_MODE_MENU_ITEMS)) {
                WebSettingsCompat.setDisabledActionModeMenuItems(settings, this.customSettings.disabledActionModeMenuItems.intValue());
            } else {
                settings.setDisabledActionModeMenuItems(this.customSettings.disabledActionModeMenuItems.intValue());
            }
        }
        settings.setFantasyFontFamily(this.customSettings.fantasyFontFamily);
        settings.setFixedFontFamily(this.customSettings.fixedFontFamily);
        if (this.customSettings.forceDark != null) {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
                WebSettingsCompat.setForceDark(settings, this.customSettings.forceDark.intValue());
            } else if (i11 >= 29) {
                settings.setForceDark(this.customSettings.forceDark.intValue());
            }
        }
        if (this.customSettings.forceDarkStrategy != null && WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
            WebSettingsCompat.setForceDarkStrategy(settings, this.customSettings.forceDarkStrategy.intValue());
        }
        settings.setGeolocationEnabled(this.customSettings.geolocationEnabled.booleanValue());
        WebSettings.LayoutAlgorithm layoutAlgorithm = this.customSettings.layoutAlgorithm;
        if (layoutAlgorithm != null) {
            if (layoutAlgorithm.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING)) {
                settings.setLayoutAlgorithm(this.customSettings.layoutAlgorithm);
            } else {
                settings.setLayoutAlgorithm(this.customSettings.layoutAlgorithm);
            }
        }
        settings.setLoadsImagesAutomatically(this.customSettings.loadsImagesAutomatically.booleanValue());
        settings.setMinimumFontSize(this.customSettings.minimumFontSize.intValue());
        settings.setMinimumLogicalFontSize(this.customSettings.minimumLogicalFontSize.intValue());
        setInitialScale(this.customSettings.initialScale.intValue());
        settings.setNeedInitialFocus(this.customSettings.needInitialFocus.booleanValue());
        if (WebViewFeature.isFeatureSupported(WebViewFeature.OFF_SCREEN_PRERASTER)) {
            WebSettingsCompat.setOffscreenPreRaster(settings, this.customSettings.offscreenPreRaster.booleanValue());
        } else {
            settings.setOffscreenPreRaster(this.customSettings.offscreenPreRaster.booleanValue());
        }
        settings.setSansSerifFontFamily(this.customSettings.sansSerifFontFamily);
        settings.setSerifFontFamily(this.customSettings.serifFontFamily);
        settings.setStandardFontFamily(this.customSettings.standardFontFamily);
        Integer num3 = this.customSettings.preferredContentMode;
        if (num3 != null && num3.intValue() == PreferredContentModeOptionType.DESKTOP.toValue()) {
            setDesktopMode(true);
        }
        settings.setSaveFormData(this.customSettings.saveFormData.booleanValue());
        if (this.customSettings.incognito.booleanValue()) {
            setIncognito(true);
        }
        if (this.customSettings.useHybridComposition.booleanValue()) {
            if (this.customSettings.hardwareAcceleration.booleanValue()) {
                setLayerType(2, null);
            } else {
                setLayerType(0, null);
            }
        }
        String str5 = this.customSettings.regexToCancelSubFramesLoading;
        if (str5 != null) {
            this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(str5);
        }
        setScrollBarStyle(this.customSettings.scrollBarStyle.intValue());
        InAppWebViewSettings inAppWebViewSettings = this.customSettings;
        Integer num4 = inAppWebViewSettings.scrollBarDefaultDelayBeforeFade;
        if (num4 != null) {
            setScrollBarDefaultDelayBeforeFade(num4.intValue());
        } else {
            inAppWebViewSettings.scrollBarDefaultDelayBeforeFade = Integer.valueOf(getScrollBarDefaultDelayBeforeFade());
        }
        setScrollbarFadingEnabled(this.customSettings.scrollbarFadingEnabled.booleanValue());
        InAppWebViewSettings inAppWebViewSettings2 = this.customSettings;
        Integer num5 = inAppWebViewSettings2.scrollBarFadeDuration;
        if (num5 != null) {
            setScrollBarFadeDuration(num5.intValue());
        } else {
            inAppWebViewSettings2.scrollBarFadeDuration = Integer.valueOf(getScrollBarFadeDuration());
        }
        setVerticalScrollbarPosition(this.customSettings.verticalScrollbarPosition.intValue());
        if (i11 >= 29) {
            if (this.customSettings.verticalScrollbarThumbColor != null) {
                setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(this.customSettings.verticalScrollbarThumbColor)));
            }
            if (this.customSettings.verticalScrollbarTrackColor != null) {
                setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(this.customSettings.verticalScrollbarTrackColor)));
            }
            if (this.customSettings.horizontalScrollbarThumbColor != null) {
                setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(this.customSettings.horizontalScrollbarThumbColor)));
            }
            if (this.customSettings.horizontalScrollbarTrackColor != null) {
                setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(this.customSettings.horizontalScrollbarTrackColor)));
            }
        }
        setOverScrollMode(this.customSettings.overScrollMode.intValue());
        Boolean bool = this.customSettings.networkAvailable;
        if (bool != null) {
            setNetworkAvailable(bool.booleanValue());
        }
        Map<String, Object> map = this.customSettings.rendererPriorityPolicy;
        if (map != null && !map.isEmpty() && i11 >= 26) {
            setRendererPriorityPolicy(((Integer) this.customSettings.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) this.customSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
        }
        if (WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING) && i11 >= 29) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(settings, this.customSettings.algorithmicDarkeningAllowed.booleanValue());
        }
        if (WebViewFeature.isFeatureSupported(WebViewFeature.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY)) {
            WebSettingsCompat.setEnterpriseAuthenticationAppLinkPolicyEnabled(settings, this.customSettings.enterpriseAuthenticationAppLinkPolicyEnabled.booleanValue());
        }
        if (this.customSettings.requestedWithHeaderOriginAllowList != null && WebViewFeature.isFeatureSupported(WebViewFeature.REQUESTED_WITH_HEADER_ALLOW_LIST)) {
            WebSettingsCompat.setRequestedWithHeaderOriginAllowList(settings, this.customSettings.requestedWithHeaderOriginAllowList);
        }
        this.contentBlockerHandler.getRuleList().clear();
        for (Map<String, Map<String, Object>> map2 : this.customSettings.contentBlockers) {
            this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap(map2.get("trigger")), ContentBlockerAction.fromMap(map2.get(TUIConstants.TIMPush.NOTIFICATION.ACTION))));
        }
        setFindListener(new WebView.FindListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.1
            @Override // android.webkit.WebView.FindListener
            public void onFindResultReceived(int i12, int i13, boolean z11) {
                FindInteractionChannelDelegate findInteractionChannelDelegate;
                FindInteractionController findInteractionController = InAppWebView.this.findInteractionController;
                if (findInteractionController != null && (findInteractionChannelDelegate = findInteractionController.channelDelegate) != null) {
                    findInteractionChannelDelegate.onFindResultReceived(i12, i13, z11);
                }
                WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                if (webViewChannelDelegate != null) {
                    webViewChannelDelegate.onFindResultReceived(i12, i13, z11);
                }
            }
        });
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                InAppWebView inAppWebView = InAppWebView.this;
                if (inAppWebView.floatingContextMenu != null) {
                    inAppWebView.hideContextMenu();
                }
                return super.onSingleTapUp(motionEvent);
            }
        });
        this.checkScrollStoppedTask = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.3
            @Override // java.lang.Runnable
            public void run() {
                int scrollY = InAppWebView.this.getScrollY();
                InAppWebView inAppWebView = InAppWebView.this;
                if (inAppWebView.initialPositionScrollStoppedTask - scrollY == 0) {
                    inAppWebView.onScrollStopped();
                    return;
                }
                inAppWebView.initialPositionScrollStoppedTask = inAppWebView.getScrollY();
                InAppWebView inAppWebView2 = InAppWebView.this;
                inAppWebView2.mainLooperHandler.postDelayed(inAppWebView2.checkScrollStoppedTask, inAppWebView2.newCheckScrollStoppedTask);
            }
        };
        if (!this.customSettings.useHybridComposition.booleanValue()) {
            this.checkContextMenuShouldBeClosedTask = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.4
                @Override // java.lang.Runnable
                public void run() {
                    InAppWebView inAppWebView = InAppWebView.this;
                    if (inAppWebView.floatingContextMenu != null) {
                        inAppWebView.evaluateJavascript(PluginScriptsUtil.CHECK_CONTEXT_MENU_SHOULD_BE_HIDDEN_JS_SOURCE, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.4.1
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(String str6) {
                                if (str6 != null && !str6.equals(CredentialEntry.TRUE_STRING)) {
                                    InAppWebView inAppWebView2 = InAppWebView.this;
                                    inAppWebView2.mainLooperHandler.postDelayed(inAppWebView2.checkContextMenuShouldBeClosedTask, inAppWebView2.newCheckContextMenuShouldBeClosedTaskTask);
                                } else {
                                    InAppWebView inAppWebView3 = InAppWebView.this;
                                    if (inAppWebView3.floatingContextMenu != null) {
                                        inAppWebView3.hideContextMenu();
                                    }
                                }
                            }
                        });
                    }
                }
            };
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.5
            float m_downX;
            float m_downY;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                InAppWebView.this.gestureDetector.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1) {
                    InAppWebView.this.checkScrollStoppedTask.run();
                }
                if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue() && InAppWebView.this.customSettings.disableVerticalScroll.booleanValue()) {
                    return motionEvent.getAction() == 2;
                }
                if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue() || InAppWebView.this.customSettings.disableVerticalScroll.booleanValue()) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        this.m_downX = motionEvent.getX();
                        this.m_downY = motionEvent.getY();
                    } else if (action == 1 || action == 2 || action == 3) {
                        if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue()) {
                            motionEvent.setLocation(this.m_downX, motionEvent.getY());
                        } else {
                            motionEvent.setLocation(motionEvent.getX(), this.m_downY);
                        }
                    }
                }
                return false;
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.6
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                HitTestResult hitTestResultFromWebViewHitTestResult = HitTestResult.fromWebViewHitTestResult(InAppWebView.this.getHitTestResult());
                WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                if (webViewChannelDelegate == null) {
                    return false;
                }
                webViewChannelDelegate.onLongPressHitTestResult(hitTestResultFromWebViewHitTestResult);
                return false;
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setSettings(InAppWebViewSettings inAppWebViewSettings, HashMap<String, Object> map) {
        Map<String, Object> map2;
        Integer num;
        Integer num2;
        String str;
        Integer num3;
        String str2;
        Integer num4;
        WebSettings settings = getSettings();
        if (map.get("javaScriptEnabled") != null) {
            Boolean bool = this.customSettings.javaScriptEnabled;
            Boolean bool2 = inAppWebViewSettings.javaScriptEnabled;
            if (bool != bool2) {
                settings.setJavaScriptEnabled(bool2.booleanValue());
            }
        }
        if (map.get("useShouldInterceptAjaxRequest") != null) {
            Boolean bool3 = this.customSettings.useShouldInterceptAjaxRequest;
            Boolean bool4 = inAppWebViewSettings.useShouldInterceptAjaxRequest;
            if (bool3 != bool4) {
                enablePluginScriptAtRuntime(InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_AJAX_REQUEST_JS_SOURCE, bool4.booleanValue(), InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
            }
        }
        if (map.get("interceptOnlyAsyncAjaxRequests") != null) {
            Boolean bool5 = this.customSettings.interceptOnlyAsyncAjaxRequests;
            Boolean bool6 = inAppWebViewSettings.interceptOnlyAsyncAjaxRequests;
            if (bool5 != bool6) {
                enablePluginScriptAtRuntime(InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_INTERCEPT_ONLY_ASYNC_AJAX_REQUESTS_JS_SOURCE, bool6.booleanValue(), this.interceptOnlyAsyncAjaxRequestsPluginScript);
            }
        }
        if (map.get("useShouldInterceptFetchRequest") != null) {
            Boolean bool7 = this.customSettings.useShouldInterceptFetchRequest;
            Boolean bool8 = inAppWebViewSettings.useShouldInterceptFetchRequest;
            if (bool7 != bool8) {
                enablePluginScriptAtRuntime(InterceptFetchRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_FETCH_REQUEST_JS_SOURCE, bool8.booleanValue(), InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
            }
        }
        if (map.get("useOnLoadResource") != null) {
            Boolean bool9 = this.customSettings.useOnLoadResource;
            Boolean bool10 = inAppWebViewSettings.useOnLoadResource;
            if (bool9 != bool10) {
                enablePluginScriptAtRuntime(OnLoadResourceJS.FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE, bool10.booleanValue(), OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
            }
        }
        if (map.get("javaScriptCanOpenWindowsAutomatically") != null) {
            Boolean bool11 = this.customSettings.javaScriptCanOpenWindowsAutomatically;
            Boolean bool12 = inAppWebViewSettings.javaScriptCanOpenWindowsAutomatically;
            if (bool11 != bool12) {
                settings.setJavaScriptCanOpenWindowsAutomatically(bool12.booleanValue());
            }
        }
        if (map.get("builtInZoomControls") != null) {
            Boolean bool13 = this.customSettings.builtInZoomControls;
            Boolean bool14 = inAppWebViewSettings.builtInZoomControls;
            if (bool13 != bool14) {
                settings.setBuiltInZoomControls(bool14.booleanValue());
            }
        }
        if (map.get("displayZoomControls") != null) {
            Boolean bool15 = this.customSettings.displayZoomControls;
            Boolean bool16 = inAppWebViewSettings.displayZoomControls;
            if (bool15 != bool16) {
                settings.setDisplayZoomControls(bool16.booleanValue());
            }
        }
        if (map.get("safeBrowsingEnabled") != null && this.customSettings.safeBrowsingEnabled != inAppWebViewSettings.safeBrowsingEnabled) {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.SAFE_BROWSING_ENABLE)) {
                WebSettingsCompat.setSafeBrowsingEnabled(settings, inAppWebViewSettings.safeBrowsingEnabled.booleanValue());
            } else if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(inAppWebViewSettings.safeBrowsingEnabled.booleanValue());
            }
        }
        if (map.get("mediaPlaybackRequiresUserGesture") != null) {
            Boolean bool17 = this.customSettings.mediaPlaybackRequiresUserGesture;
            Boolean bool18 = inAppWebViewSettings.mediaPlaybackRequiresUserGesture;
            if (bool17 != bool18) {
                settings.setMediaPlaybackRequiresUserGesture(bool18.booleanValue());
            }
        }
        if (map.get("databaseEnabled") != null) {
            Boolean bool19 = this.customSettings.databaseEnabled;
            Boolean bool20 = inAppWebViewSettings.databaseEnabled;
            if (bool19 != bool20) {
                settings.setDatabaseEnabled(bool20.booleanValue());
            }
        }
        if (map.get("domStorageEnabled") != null) {
            Boolean bool21 = this.customSettings.domStorageEnabled;
            Boolean bool22 = inAppWebViewSettings.domStorageEnabled;
            if (bool21 != bool22) {
                settings.setDomStorageEnabled(bool22.booleanValue());
            }
        }
        if (map.get(C33812n7.f71057p) != null && !this.customSettings.userAgent.equals(inAppWebViewSettings.userAgent) && !inAppWebViewSettings.userAgent.isEmpty()) {
            settings.setUserAgentString(inAppWebViewSettings.userAgent);
        }
        if (map.get("applicationNameForUserAgent") != null && !this.customSettings.applicationNameForUserAgent.equals(inAppWebViewSettings.applicationNameForUserAgent) && !inAppWebViewSettings.applicationNameForUserAgent.isEmpty()) {
            String str3 = inAppWebViewSettings.userAgent;
            settings.setUserAgentString(((str3 == null || str3.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : inAppWebViewSettings.userAgent) + C33627eb.f69716f + this.customSettings.applicationNameForUserAgent);
        }
        if (map.get("clearCache") != null && inAppWebViewSettings.clearCache.booleanValue()) {
            clearAllCache();
        } else if (map.get("clearSessionCache") != null && inAppWebViewSettings.clearSessionCache.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (map.get("thirdPartyCookiesEnabled") != null && this.customSettings.thirdPartyCookiesEnabled != inAppWebViewSettings.thirdPartyCookiesEnabled) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, inAppWebViewSettings.thirdPartyCookiesEnabled.booleanValue());
        }
        if (map.get("useWideViewPort") != null) {
            Boolean bool23 = this.customSettings.useWideViewPort;
            Boolean bool24 = inAppWebViewSettings.useWideViewPort;
            if (bool23 != bool24) {
                settings.setUseWideViewPort(bool24.booleanValue());
            }
        }
        if (map.get("supportZoom") != null) {
            Boolean bool25 = this.customSettings.supportZoom;
            Boolean bool26 = inAppWebViewSettings.supportZoom;
            if (bool25 != bool26) {
                settings.setSupportZoom(bool26.booleanValue());
            }
        }
        if (map.get("textZoom") != null && !this.customSettings.textZoom.equals(inAppWebViewSettings.textZoom)) {
            settings.setTextZoom(inAppWebViewSettings.textZoom.intValue());
        }
        if (map.get("verticalScrollBarEnabled") != null) {
            Boolean bool27 = this.customSettings.verticalScrollBarEnabled;
            Boolean bool28 = inAppWebViewSettings.verticalScrollBarEnabled;
            if (bool27 != bool28) {
                setVerticalScrollBarEnabled(bool28.booleanValue());
            }
        }
        if (map.get("horizontalScrollBarEnabled") != null) {
            Boolean bool29 = this.customSettings.horizontalScrollBarEnabled;
            Boolean bool30 = inAppWebViewSettings.horizontalScrollBarEnabled;
            if (bool29 != bool30) {
                setHorizontalScrollBarEnabled(bool30.booleanValue());
            }
        }
        boolean z11 = false;
        if (map.get("transparentBackground") != null) {
            Boolean bool31 = this.customSettings.transparentBackground;
            Boolean bool32 = inAppWebViewSettings.transparentBackground;
            if (bool31 != bool32) {
                if (bool32.booleanValue()) {
                    setBackgroundColor(0);
                } else {
                    setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (map.get("mixedContentMode") != null && ((num4 = this.customSettings.mixedContentMode) == null || !num4.equals(inAppWebViewSettings.mixedContentMode))) {
            settings.setMixedContentMode(inAppWebViewSettings.mixedContentMode.intValue());
        }
        if (map.get("supportMultipleWindows") != null) {
            Boolean bool33 = this.customSettings.supportMultipleWindows;
            Boolean bool34 = inAppWebViewSettings.supportMultipleWindows;
            if (bool33 != bool34) {
                settings.setSupportMultipleWindows(bool34.booleanValue());
            }
        }
        if (map.get("useOnDownloadStart") != null) {
            Boolean bool35 = this.customSettings.useOnDownloadStart;
            Boolean bool36 = inAppWebViewSettings.useOnDownloadStart;
            if (bool35 != bool36) {
                if (bool36.booleanValue()) {
                    setDownloadListener(new DownloadStartListener());
                } else {
                    setDownloadListener(null);
                }
            }
        }
        if (map.get("allowContentAccess") != null) {
            Boolean bool37 = this.customSettings.allowContentAccess;
            Boolean bool38 = inAppWebViewSettings.allowContentAccess;
            if (bool37 != bool38) {
                settings.setAllowContentAccess(bool38.booleanValue());
            }
        }
        if (map.get("allowFileAccess") != null) {
            Boolean bool39 = this.customSettings.allowFileAccess;
            Boolean bool40 = inAppWebViewSettings.allowFileAccess;
            if (bool39 != bool40) {
                settings.setAllowFileAccess(bool40.booleanValue());
            }
        }
        if (map.get("allowFileAccessFromFileURLs") != null) {
            Boolean bool41 = this.customSettings.allowFileAccessFromFileURLs;
            Boolean bool42 = inAppWebViewSettings.allowFileAccessFromFileURLs;
            if (bool41 != bool42) {
                settings.setAllowFileAccessFromFileURLs(bool42.booleanValue());
            }
        }
        if (map.get("allowUniversalAccessFromFileURLs") != null) {
            Boolean bool43 = this.customSettings.allowUniversalAccessFromFileURLs;
            Boolean bool44 = inAppWebViewSettings.allowUniversalAccessFromFileURLs;
            if (bool43 != bool44) {
                settings.setAllowUniversalAccessFromFileURLs(bool44.booleanValue());
            }
        }
        if (map.get("cacheEnabled") != null) {
            Boolean bool45 = this.customSettings.cacheEnabled;
            Boolean bool46 = inAppWebViewSettings.cacheEnabled;
            if (bool45 != bool46) {
                setCacheEnabled(bool46.booleanValue());
            }
        }
        if (map.get("appCachePath") != null && ((str2 = this.customSettings.appCachePath) == null || !str2.equals(inAppWebViewSettings.appCachePath))) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", inAppWebViewSettings.appCachePath);
        }
        if (map.get("blockNetworkImage") != null) {
            Boolean bool47 = this.customSettings.blockNetworkImage;
            Boolean bool48 = inAppWebViewSettings.blockNetworkImage;
            if (bool47 != bool48) {
                settings.setBlockNetworkImage(bool48.booleanValue());
            }
        }
        if (map.get("blockNetworkLoads") != null) {
            Boolean bool49 = this.customSettings.blockNetworkLoads;
            Boolean bool50 = inAppWebViewSettings.blockNetworkLoads;
            if (bool49 != bool50) {
                settings.setBlockNetworkLoads(bool50.booleanValue());
            }
        }
        if (map.get("cacheMode") != null && !this.customSettings.cacheMode.equals(inAppWebViewSettings.cacheMode)) {
            settings.setCacheMode(inAppWebViewSettings.cacheMode.intValue());
        }
        if (map.get("cursiveFontFamily") != null && !this.customSettings.cursiveFontFamily.equals(inAppWebViewSettings.cursiveFontFamily)) {
            settings.setCursiveFontFamily(inAppWebViewSettings.cursiveFontFamily);
        }
        if (map.get("defaultFixedFontSize") != null && !this.customSettings.defaultFixedFontSize.equals(inAppWebViewSettings.defaultFixedFontSize)) {
            settings.setDefaultFixedFontSize(inAppWebViewSettings.defaultFixedFontSize.intValue());
        }
        if (map.get("defaultFontSize") != null && !this.customSettings.defaultFontSize.equals(inAppWebViewSettings.defaultFontSize)) {
            settings.setDefaultFontSize(inAppWebViewSettings.defaultFontSize.intValue());
        }
        if (map.get("defaultTextEncodingName") != null && !this.customSettings.defaultTextEncodingName.equals(inAppWebViewSettings.defaultTextEncodingName)) {
            settings.setDefaultTextEncodingName(inAppWebViewSettings.defaultTextEncodingName);
        }
        if (map.get("disabledActionModeMenuItems") != null && ((num3 = this.customSettings.disabledActionModeMenuItems) == null || !num3.equals(inAppWebViewSettings.disabledActionModeMenuItems))) {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.DISABLED_ACTION_MODE_MENU_ITEMS)) {
                WebSettingsCompat.setDisabledActionModeMenuItems(settings, inAppWebViewSettings.disabledActionModeMenuItems.intValue());
            } else {
                settings.setDisabledActionModeMenuItems(inAppWebViewSettings.disabledActionModeMenuItems.intValue());
            }
        }
        if (map.get("fantasyFontFamily") != null && !this.customSettings.fantasyFontFamily.equals(inAppWebViewSettings.fantasyFontFamily)) {
            settings.setFantasyFontFamily(inAppWebViewSettings.fantasyFontFamily);
        }
        if (map.get("fixedFontFamily") != null && !this.customSettings.fixedFontFamily.equals(inAppWebViewSettings.fixedFontFamily)) {
            settings.setFixedFontFamily(inAppWebViewSettings.fixedFontFamily);
        }
        if (map.get("forceDark") != null && !this.customSettings.forceDark.equals(inAppWebViewSettings.forceDark)) {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
                WebSettingsCompat.setForceDark(settings, inAppWebViewSettings.forceDark.intValue());
            } else if (i11 >= 29) {
                settings.setForceDark(inAppWebViewSettings.forceDark.intValue());
            }
        }
        if (map.get("forceDarkStrategy") != null && !this.customSettings.forceDarkStrategy.equals(inAppWebViewSettings.forceDarkStrategy) && WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
            WebSettingsCompat.setForceDarkStrategy(settings, inAppWebViewSettings.forceDarkStrategy.intValue());
        }
        if (map.get("geolocationEnabled") != null) {
            Boolean bool51 = this.customSettings.geolocationEnabled;
            Boolean bool52 = inAppWebViewSettings.geolocationEnabled;
            if (bool51 != bool52) {
                settings.setGeolocationEnabled(bool52.booleanValue());
            }
        }
        if (map.get("layoutAlgorithm") != null) {
            WebSettings.LayoutAlgorithm layoutAlgorithm = this.customSettings.layoutAlgorithm;
            WebSettings.LayoutAlgorithm layoutAlgorithm2 = inAppWebViewSettings.layoutAlgorithm;
            if (layoutAlgorithm != layoutAlgorithm2) {
                if (layoutAlgorithm2.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING)) {
                    settings.setLayoutAlgorithm(inAppWebViewSettings.layoutAlgorithm);
                } else {
                    settings.setLayoutAlgorithm(inAppWebViewSettings.layoutAlgorithm);
                }
            }
        }
        if (map.get("loadWithOverviewMode") != null) {
            Boolean bool53 = this.customSettings.loadWithOverviewMode;
            Boolean bool54 = inAppWebViewSettings.loadWithOverviewMode;
            if (bool53 != bool54) {
                settings.setLoadWithOverviewMode(bool54.booleanValue());
            }
        }
        if (map.get("loadsImagesAutomatically") != null) {
            Boolean bool55 = this.customSettings.loadsImagesAutomatically;
            Boolean bool56 = inAppWebViewSettings.loadsImagesAutomatically;
            if (bool55 != bool56) {
                settings.setLoadsImagesAutomatically(bool56.booleanValue());
            }
        }
        if (map.get("minimumFontSize") != null && !this.customSettings.minimumFontSize.equals(inAppWebViewSettings.minimumFontSize)) {
            settings.setMinimumFontSize(inAppWebViewSettings.minimumFontSize.intValue());
        }
        if (map.get("minimumLogicalFontSize") != null && !this.customSettings.minimumLogicalFontSize.equals(inAppWebViewSettings.minimumLogicalFontSize)) {
            settings.setMinimumLogicalFontSize(inAppWebViewSettings.minimumLogicalFontSize.intValue());
        }
        if (map.get("initialScale") != null && !this.customSettings.initialScale.equals(inAppWebViewSettings.initialScale)) {
            setInitialScale(inAppWebViewSettings.initialScale.intValue());
        }
        if (map.get("needInitialFocus") != null) {
            Boolean bool57 = this.customSettings.needInitialFocus;
            Boolean bool58 = inAppWebViewSettings.needInitialFocus;
            if (bool57 != bool58) {
                settings.setNeedInitialFocus(bool58.booleanValue());
            }
        }
        if (map.get("offscreenPreRaster") != null && this.customSettings.offscreenPreRaster != inAppWebViewSettings.offscreenPreRaster) {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.OFF_SCREEN_PRERASTER)) {
                WebSettingsCompat.setOffscreenPreRaster(settings, inAppWebViewSettings.offscreenPreRaster.booleanValue());
            } else {
                settings.setOffscreenPreRaster(inAppWebViewSettings.offscreenPreRaster.booleanValue());
            }
        }
        if (map.get("sansSerifFontFamily") != null && !this.customSettings.sansSerifFontFamily.equals(inAppWebViewSettings.sansSerifFontFamily)) {
            settings.setSansSerifFontFamily(inAppWebViewSettings.sansSerifFontFamily);
        }
        if (map.get("serifFontFamily") != null && !this.customSettings.serifFontFamily.equals(inAppWebViewSettings.serifFontFamily)) {
            settings.setSerifFontFamily(inAppWebViewSettings.serifFontFamily);
        }
        if (map.get("standardFontFamily") != null && !this.customSettings.standardFontFamily.equals(inAppWebViewSettings.standardFontFamily)) {
            settings.setStandardFontFamily(inAppWebViewSettings.standardFontFamily);
        }
        if (map.get("preferredContentMode") != null && !this.customSettings.preferredContentMode.equals(inAppWebViewSettings.preferredContentMode)) {
            int i12 = C2743421.f55840x8be7bf1[PreferredContentModeOptionType.fromValue(inAppWebViewSettings.preferredContentMode.intValue()).ordinal()];
            if (i12 == 1) {
                setDesktopMode(true);
            } else if (i12 == 2 || i12 == 3) {
                setDesktopMode(false);
            }
        }
        if (map.get("saveFormData") != null) {
            Boolean bool59 = this.customSettings.saveFormData;
            Boolean bool60 = inAppWebViewSettings.saveFormData;
            if (bool59 != bool60) {
                settings.setSaveFormData(bool60.booleanValue());
            }
        }
        if (map.get("incognito") != null) {
            Boolean bool61 = this.customSettings.incognito;
            Boolean bool62 = inAppWebViewSettings.incognito;
            if (bool61 != bool62) {
                setIncognito(bool62.booleanValue());
            }
        }
        if (this.customSettings.useHybridComposition.booleanValue() && map.get("hardwareAcceleration") != null) {
            Boolean bool63 = this.customSettings.hardwareAcceleration;
            Boolean bool64 = inAppWebViewSettings.hardwareAcceleration;
            if (bool63 != bool64) {
                if (bool64.booleanValue()) {
                    setLayerType(2, null);
                } else {
                    setLayerType(0, null);
                }
            }
        }
        if (map.get("regexToCancelSubFramesLoading") != null && ((str = this.customSettings.regexToCancelSubFramesLoading) == null || !str.equals(inAppWebViewSettings.regexToCancelSubFramesLoading))) {
            if (inAppWebViewSettings.regexToCancelSubFramesLoading == null) {
                this.regexToCancelSubFramesLoadingCompiled = null;
            } else {
                this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(this.customSettings.regexToCancelSubFramesLoading);
            }
        }
        if (inAppWebViewSettings.contentBlockers != null) {
            this.contentBlockerHandler.getRuleList().clear();
            for (Map<String, Map<String, Object>> map3 : inAppWebViewSettings.contentBlockers) {
                this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap(map3.get("trigger")), ContentBlockerAction.fromMap(map3.get(TUIConstants.TIMPush.NOTIFICATION.ACTION))));
            }
        }
        if (map.get("scrollBarStyle") != null && !this.customSettings.scrollBarStyle.equals(inAppWebViewSettings.scrollBarStyle)) {
            setScrollBarStyle(inAppWebViewSettings.scrollBarStyle.intValue());
        }
        if (map.get("scrollBarDefaultDelayBeforeFade") != null && ((num2 = this.customSettings.scrollBarDefaultDelayBeforeFade) == null || !num2.equals(inAppWebViewSettings.scrollBarDefaultDelayBeforeFade))) {
            setScrollBarDefaultDelayBeforeFade(inAppWebViewSettings.scrollBarDefaultDelayBeforeFade.intValue());
        }
        if (map.get("scrollbarFadingEnabled") != null && !this.customSettings.scrollbarFadingEnabled.equals(inAppWebViewSettings.scrollbarFadingEnabled)) {
            setScrollbarFadingEnabled(inAppWebViewSettings.scrollbarFadingEnabled.booleanValue());
        }
        if (map.get("scrollBarFadeDuration") != null && ((num = this.customSettings.scrollBarFadeDuration) == null || !num.equals(inAppWebViewSettings.scrollBarFadeDuration))) {
            setScrollBarFadeDuration(inAppWebViewSettings.scrollBarFadeDuration.intValue());
        }
        if (map.get("verticalScrollbarPosition") != null && !this.customSettings.verticalScrollbarPosition.equals(inAppWebViewSettings.verticalScrollbarPosition)) {
            setVerticalScrollbarPosition(inAppWebViewSettings.verticalScrollbarPosition.intValue());
        }
        if (map.get("disableVerticalScroll") != null) {
            Boolean bool65 = this.customSettings.disableVerticalScroll;
            Boolean bool66 = inAppWebViewSettings.disableVerticalScroll;
            if (bool65 != bool66) {
                setVerticalScrollBarEnabled(!bool66.booleanValue() && inAppWebViewSettings.verticalScrollBarEnabled.booleanValue());
            }
        }
        if (map.get("disableHorizontalScroll") != null) {
            Boolean bool67 = this.customSettings.disableHorizontalScroll;
            Boolean bool68 = inAppWebViewSettings.disableHorizontalScroll;
            if (bool67 != bool68) {
                if (!bool68.booleanValue() && inAppWebViewSettings.horizontalScrollBarEnabled.booleanValue()) {
                    z11 = true;
                }
                setHorizontalScrollBarEnabled(z11);
            }
        }
        if (map.get("overScrollMode") != null && !this.customSettings.overScrollMode.equals(inAppWebViewSettings.overScrollMode)) {
            setOverScrollMode(inAppWebViewSettings.overScrollMode.intValue());
        }
        if (map.get("networkAvailable") != null) {
            Boolean bool69 = this.customSettings.networkAvailable;
            Boolean bool70 = inAppWebViewSettings.networkAvailable;
            if (bool69 != bool70) {
                setNetworkAvailable(bool70.booleanValue());
            }
        }
        if (map.get("rendererPriorityPolicy") != null && (((map2 = this.customSettings.rendererPriorityPolicy) == null || map2.get("rendererRequestedPriority") != inAppWebViewSettings.rendererPriorityPolicy.get("rendererRequestedPriority") || this.customSettings.rendererPriorityPolicy.get("waivedWhenNotVisible") != inAppWebViewSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")) && Build.VERSION.SDK_INT >= 26)) {
            setRendererPriorityPolicy(((Integer) inAppWebViewSettings.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) inAppWebViewSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            if (map.get("verticalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarThumbColor, inAppWebViewSettings.verticalScrollbarThumbColor)) {
                setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.verticalScrollbarThumbColor)));
            }
            if (map.get("verticalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarTrackColor, inAppWebViewSettings.verticalScrollbarTrackColor)) {
                setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.verticalScrollbarTrackColor)));
            }
            if (map.get("horizontalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarThumbColor, inAppWebViewSettings.horizontalScrollbarThumbColor)) {
                setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.horizontalScrollbarThumbColor)));
            }
            if (map.get("horizontalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarTrackColor, inAppWebViewSettings.horizontalScrollbarTrackColor)) {
                setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.horizontalScrollbarTrackColor)));
            }
        }
        if (map.get("algorithmicDarkeningAllowed") != null && !Util.objEquals(this.customSettings.algorithmicDarkeningAllowed, inAppWebViewSettings.algorithmicDarkeningAllowed) && WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING) && i13 >= 29) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(settings, inAppWebViewSettings.algorithmicDarkeningAllowed.booleanValue());
        }
        if (map.get("enterpriseAuthenticationAppLinkPolicyEnabled") != null && !Util.objEquals(this.customSettings.enterpriseAuthenticationAppLinkPolicyEnabled, inAppWebViewSettings.enterpriseAuthenticationAppLinkPolicyEnabled) && WebViewFeature.isFeatureSupported(WebViewFeature.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY)) {
            WebSettingsCompat.setEnterpriseAuthenticationAppLinkPolicyEnabled(settings, inAppWebViewSettings.enterpriseAuthenticationAppLinkPolicyEnabled.booleanValue());
        }
        if (map.get("requestedWithHeaderOriginAllowList") != null && !Util.objEquals(this.customSettings.requestedWithHeaderOriginAllowList, inAppWebViewSettings.requestedWithHeaderOriginAllowList) && WebViewFeature.isFeatureSupported(WebViewFeature.REQUESTED_WITH_HEADER_ALLOW_LIST)) {
            WebSettingsCompat.setRequestedWithHeaderOriginAllowList(settings, inAppWebViewSettings.requestedWithHeaderOriginAllowList);
        }
        if (this.plugin != null) {
            WebViewAssetLoaderExt webViewAssetLoaderExt = this.webViewAssetLoaderExt;
            if (webViewAssetLoaderExt != null) {
                webViewAssetLoaderExt.dispose();
            }
            this.webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(this.customSettings.webViewAssetLoader, this.plugin, getContext());
        }
        this.customSettings = inAppWebViewSettings;
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        Map<String, Object> map;
        return (this.customSettings.useHybridComposition.booleanValue() && !this.customSettings.disableContextMenu.booleanValue() && ((map = this.contextMenu) == null || map.keySet().size() == 0)) ? super.startActionMode(callback) : rebuildActionMode(super.startActionMode(callback), callback);
    }

    /* JADX INFO: renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView$21 */
    public static /* synthetic */ class C2743421 {

        /* JADX INFO: renamed from: $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType */
        static final /* synthetic */ int[] f55840x8be7bf1;

        static {
            int[] iArr = new int[PreferredContentModeOptionType.values().length];
            f55840x8be7bf1 = iArr;
            try {
                iArr[PreferredContentModeOptionType.DESKTOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55840x8be7bf1[PreferredContentModeOptionType.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55840x8be7bf1[PreferredContentModeOptionType.RECOMMENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void addWebMessageListener(WebMessageListener webMessageListener) {
        if (WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_LISTENER)) {
            WebViewCompat.addWebMessageListener(this, webMessageListener.jsObjectName, webMessageListener.allowedOriginRules, webMessageListener.listener);
            this.webMessageListeners.add(webMessageListener);
        }
    }

    public void adjustFloatingContextMenuPosition() {
        evaluateJavascript("(function(){  var selection = window.getSelection();  var rangeY = null;  if (selection != null && selection.rangeCount > 0) {    var range = selection.getRangeAt(0);    var clientRect = range.getClientRects();    if (clientRect.length > 0) {      rangeY = clientRect[0].y;    } else if (document.activeElement != null && document.activeElement.tagName.toLowerCase() !== 'iframe') {      var boundingClientRect = document.activeElement.getBoundingClientRect();      rangeY = boundingClientRect.y;    }  }  return rangeY;})();", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.16
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                if (InAppWebView.this.floatingContextMenu != null) {
                    if (str == null || str.equalsIgnoreCase("null")) {
                        InAppWebView.this.floatingContextMenu.setVisibility(0);
                        InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
                        InAppWebView inAppWebView = InAppWebView.this;
                        inAppWebView.onFloatingActionGlobalLayout(inAppWebView.contextMenuPoint.x, InAppWebView.this.contextMenuPoint.y);
                        return;
                    }
                    int i11 = InAppWebView.this.contextMenuPoint.x;
                    int i12 = (int) (((double) (Float.parseFloat(str) * Util.getPixelDensity(InAppWebView.this.getContext()))) + (((double) InAppWebView.this.floatingContextMenu.getHeight()) / 3.5d));
                    InAppWebView.this.contextMenuPoint.y = i12;
                    InAppWebView.this.onFloatingActionGlobalLayout(i11, i12);
                }
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InputAwareWebView
    public void dispose() {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        InAppWebViewManager inAppWebViewManager;
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        super.dispose();
        getSettings().setJavaScriptEnabled(false);
        removeJavascriptInterface(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
        if (Build.VERSION.SDK_INT >= 29 && WebViewFeature.isFeatureSupported(WebViewFeature.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE)) {
            WebViewCompat.setWebViewRenderProcessClient(this, null);
        }
        setWebChromeClient(new WebChromeClient());
        setWebViewClient(new WebViewClient() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.20
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                InAppWebView.this.destroy();
            }
        });
        this.interceptOnlyAsyncAjaxRequestsPluginScript = null;
        this.userContentController.dispose();
        FindInteractionController findInteractionController = this.findInteractionController;
        if (findInteractionController != null) {
            findInteractionController.dispose();
            this.findInteractionController = null;
        }
        WebViewAssetLoaderExt webViewAssetLoaderExt = this.webViewAssetLoaderExt;
        if (webViewAssetLoaderExt != null) {
            webViewAssetLoaderExt.dispose();
            this.webViewAssetLoaderExt = null;
        }
        Integer num = this.windowId;
        if (num != null && (inAppWebViewFlutterPlugin = this.plugin) != null && (inAppWebViewManager = inAppWebViewFlutterPlugin.inAppWebViewManager) != null) {
            inAppWebViewManager.windowWebViewMessages.remove(num);
        }
        this.mainLooperHandler.removeCallbacksAndMessages(null);
        mHandler.removeCallbacksAndMessages(null);
        disposeWebMessageChannels();
        disposeWebMessageListeners();
        removeAllViews();
        Runnable runnable = this.checkContextMenuShouldBeClosedTask;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.checkScrollStoppedTask;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.callAsyncJavaScriptCallbacks.clear();
        this.evaluateJavaScriptContentWorldCallbacks.clear();
        this.inAppBrowserDelegate = null;
        InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient = this.inAppWebViewRenderProcessClient;
        if (inAppWebViewRenderProcessClient != null) {
            inAppWebViewRenderProcessClient.dispose();
            this.inAppWebViewRenderProcessClient = null;
        }
        InAppWebViewChromeClient inAppWebViewChromeClient = this.inAppWebViewChromeClient;
        if (inAppWebViewChromeClient != null) {
            inAppWebViewChromeClient.dispose();
            this.inAppWebViewChromeClient = null;
        }
        InAppWebViewClientCompat inAppWebViewClientCompat = this.inAppWebViewClientCompat;
        if (inAppWebViewClientCompat != null) {
            inAppWebViewClientCompat.dispose();
            this.inAppWebViewClientCompat = null;
        }
        InAppWebViewClient inAppWebViewClient = this.inAppWebViewClient;
        if (inAppWebViewClient != null) {
            inAppWebViewClient.dispose();
            this.inAppWebViewClient = null;
        }
        JavaScriptBridgeInterface javaScriptBridgeInterface = this.javaScriptBridgeInterface;
        if (javaScriptBridgeInterface != null) {
            javaScriptBridgeInterface.dispose();
            this.javaScriptBridgeInterface = null;
        }
        this.plugin = null;
        loadUrl("about:blank");
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void disposeWebMessageChannels() {
        Iterator<WebMessageChannel> it = this.webMessageChannels.values().iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.webMessageChannels.clear();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void disposeWebMessageListeners() {
        Iterator<WebMessageListener> it = this.webMessageListeners.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.webMessageListeners.clear();
    }

    public void enablePluginScriptAtRuntime(final String str, final boolean z11, final PluginScript pluginScript) {
        evaluateJavascript("window." + str, null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.9
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str2) {
                if (str2 == null || str2.equalsIgnoreCase("null")) {
                    if (z11) {
                        InAppWebView.this.evaluateJavascript(pluginScript.getSource(), null, null);
                        InAppWebView.this.userContentController.addPluginScript(pluginScript);
                        return;
                    }
                    return;
                }
                InAppWebView.this.evaluateJavascript("window." + str + " = " + z11 + ";", null, null);
                if (z11) {
                    return;
                }
                InAppWebView.this.userContentController.removePluginScript(pluginScript);
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public WebViewChannelDelegate getChannelDelegate() {
        return this.channelDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getContentWidth(final ValueCallback<Integer> valueCallback) {
        evaluateJavascript("document.documentElement.scrollWidth;", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.19
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : Integer.valueOf(Integer.parseInt(str)));
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> getContextMenu() {
        return this.contextMenu;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> getCustomSettings() {
        InAppWebViewSettings inAppWebViewSettings = this.customSettings;
        if (inAppWebViewSettings != null) {
            return inAppWebViewSettings.getRealSettings((InAppWebViewInterface) this);
        }
        return null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public InAppBrowserDelegate getInAppBrowserDelegate() {
        return this.inAppBrowserDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public InAppWebViewFlutterPlugin getPlugin() {
        return this.plugin;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getSelectedText(final ValueCallback<String> valueCallback) {
        evaluateJavascript(PluginScriptsUtil.GET_SELECTED_TEXT_JS_SOURCE, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.17
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : str.substring(1, str.length() - 1));
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public UserContentController getUserContentController() {
        return this.userContentController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, WebMessageChannel> getWebMessageChannels() {
        return this.webMessageChannels;
    }

    @Override // android.webkit.WebView, com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Looper getWebViewLooper() {
        return Build.VERSION.SDK_INT >= 28 ? super.getWebViewLooper() : Looper.getMainLooper();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getZoomScale(ValueCallback<Float> valueCallback) {
        valueCallback.onReceiveValue(Float.valueOf(this.zoomScale));
    }

    public void hideContextMenu() {
        removeView(this.floatingContextMenu);
        this.floatingContextMenu = null;
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onHideContextMenu();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void injectCSSFileFromUrl(String str, Map<String, Object> map) {
        String str2;
        String str3;
        String str4 = "";
        if (map != null) {
            String str5 = (String) map.get("id");
            if (str5 != null) {
                str3 = " link.id = '" + str5.replaceAll("'", "\\\\'") + "'; ";
            } else {
                str3 = "";
            }
            String str6 = (String) map.get("media");
            if (str6 != null) {
                str3 = str3 + " link.media = '" + str6.replaceAll("'", "\\\\'") + "'; ";
            }
            String str7 = (String) map.get("crossOrigin");
            if (str7 != null) {
                str3 = str3 + " link.crossOrigin = '" + str7.replaceAll("'", "\\\\'") + "'; ";
            }
            String str8 = (String) map.get("integrity");
            if (str8 != null) {
                str3 = str3 + " link.integrity = '" + str8.replaceAll("'", "\\\\'") + "'; ";
            }
            String str9 = (String) map.get("referrerPolicy");
            if (str9 != null) {
                str3 = str3 + " link.referrerPolicy = '" + str9.replaceAll("'", "\\\\'") + "'; ";
            }
            Boolean bool = (Boolean) map.get("disabled");
            if (bool != null && bool.booleanValue()) {
                str3 = str3 + " link.disabled = true; ";
            }
            Boolean bool2 = (Boolean) map.get("alternate");
            if (bool2 != null && bool2.booleanValue()) {
                str4 = "alternate ";
            }
            String str10 = (String) map.get("title");
            if (str10 != null) {
                str2 = str3 + " link.title = '" + str10.replaceAll("'", "\\\\'") + "'; ";
            } else {
                str2 = str3;
            }
        } else {
            str2 = "";
        }
        injectDeferredObject(str, null, "(function(d) { var link = d.createElement('link'); link.rel='" + str4 + "stylesheet'; link.type='text/css'; " + str2 + " link.href = %s; if (d.head != null) { d.head.appendChild(link); } })(document);", null);
    }

    public void injectDeferredObject(String str, final ContentWorld contentWorld, String str2, final ValueCallback<String> valueCallback) {
        String strReplace;
        final String string = (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) ? null : UUID.randomUUID().toString();
        if (str2 != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            String string2 = jSONArray.toString();
            strReplace = String.format(str2, string2.substring(1, string2.length() - 1));
        } else {
            strReplace = str;
        }
        if (string != null && valueCallback != null) {
            this.evaluateJavaScriptContentWorldCallbacks.put(string, valueCallback);
            strReplace = Util.replaceAll(PluginScriptsUtil.EVALUATE_JAVASCRIPT_WITH_CONTENT_WORLD_WRAPPER_JS_SOURCE, PluginScriptsUtil.VAR_RANDOM_NAME, "_flutter_inappwebview_" + Math.round(Math.random() * 1000000.0d)).replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, UserContentController.escapeCode(str)).replace(PluginScriptsUtil.VAR_RESULT_UUID, string);
        }
        final String str3 = strReplace;
        this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.10
            @Override // java.lang.Runnable
            public void run() {
                InAppWebView.this.evaluateJavascript(InAppWebView.this.userContentController.generateCodeForScriptEvaluation(str3, contentWorld), new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.10.1
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str4) {
                        ValueCallback valueCallback2;
                        RunnableC2742210 runnableC2742210 = RunnableC2742210.this;
                        if (string != null || (valueCallback2 = valueCallback) == null) {
                            return;
                        }
                        valueCallback2.onReceiveValue(str4);
                    }
                });
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void injectJavascriptFileFromUrl(String str, Map<String, Object> map) {
        String str2 = "";
        if (map != null) {
            String str3 = (String) map.get("type");
            if (str3 != null) {
                str2 = " script.type = '" + str3.replaceAll("'", "\\\\'") + "'; ";
            }
            String str4 = (String) map.get("id");
            if (str4 != null) {
                String strReplaceAll = str4.replaceAll("'", "\\\\'");
                str2 = ((str2 + " script.id = '" + strReplaceAll + "'; ") + " script.onload = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptLoaded', '" + strReplaceAll + "');  }};") + " script.onerror = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptError', '" + strReplaceAll + "');  }};";
            }
            Boolean bool = (Boolean) map.get(BaseJavaModule.METHOD_TYPE_ASYNC);
            if (bool != null && bool.booleanValue()) {
                str2 = str2 + " script.async = true; ";
            }
            Boolean bool2 = (Boolean) map.get("defer");
            if (bool2 != null && bool2.booleanValue()) {
                str2 = str2 + " script.defer = true; ";
            }
            String str5 = (String) map.get("crossOrigin");
            if (str5 != null) {
                str2 = str2 + " script.crossOrigin = '" + str5.replaceAll("'", "\\\\'") + "'; ";
            }
            String str6 = (String) map.get("integrity");
            if (str6 != null) {
                str2 = str2 + " script.integrity = '" + str6.replaceAll("'", "\\\\'") + "'; ";
            }
            Boolean bool3 = (Boolean) map.get("noModule");
            if (bool3 != null && bool3.booleanValue()) {
                str2 = str2 + " script.noModule = true; ";
            }
            String str7 = (String) map.get(AuthenticationTokenClaims.JSON_KEY_NONCE);
            if (str7 != null) {
                str2 = str2 + " script.nonce = '" + str7.replaceAll("'", "\\\\'") + "'; ";
            }
            String str8 = (String) map.get("referrerPolicy");
            if (str8 != null) {
                str2 = str2 + " script.referrerPolicy = '" + str8.replaceAll("'", "\\\\'") + "'; ";
            }
        }
        injectDeferredObject(str, null, "(function(d) { var script = d.createElement('script'); " + str2 + " script.src = %s; if (d.body != null) { d.body.appendChild(script); } })(document);", null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean isInFullscreen() {
        return this.inFullscreen;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean isLoading() {
        return this.isLoading;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void isSecureContext(final ValueCallback<Boolean> valueCallback) {
        evaluateJavascript("window.isSecureContext", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.18
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                if (str == null || str.isEmpty() || str.equalsIgnoreCase("null") || str.equalsIgnoreCase(CredentialEntry.FALSE_STRING)) {
                    valueCallback.onReceiveValue(Boolean.FALSE);
                } else {
                    valueCallback.onReceiveValue(Boolean.TRUE);
                }
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void loadFile(String str) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null) {
            return;
        }
        loadUrl(Util.getUrlAsset(inAppWebViewFlutterPlugin, str));
    }

    public void onScrollStopped() {
        if (this.floatingContextMenu != null) {
            adjustFloatingContextMenuPosition();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.lastTouch = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        ViewParent parent = getParent();
        if (parent instanceof PullToRefreshLayout) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            if (motionEvent.getActionMasked() == 0) {
                pullToRefreshLayout.setEnabled(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowVisibilityChanged(int i11) {
        if (!this.customSettings.allowBackgroundAudioPlaying.booleanValue()) {
            super.onWindowVisibilityChanged(i11);
        } else if (i11 != 8) {
            super.onWindowVisibilityChanged(0);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void postWebMessage(WebMessage webMessage, Uri uri, ValueCallback<String> valueCallback) {
        throw new UnsupportedOperationException();
    }

    public void prepareAndAddUserScripts() {
        this.userContentController.addPluginScript(PromisePolyfillJS.PROMISE_POLYFILL_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(PrintJS.PRINT_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(OnWindowBlurEventJS.ON_WINDOW_BLUR_EVENT_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(OnWindowFocusEventJS.ON_WINDOW_FOCUS_EVENT_JS_PLUGIN_SCRIPT);
        this.interceptOnlyAsyncAjaxRequestsPluginScript = InterceptAjaxRequestJS.createInterceptOnlyAsyncAjaxRequestsPluginScript(this.customSettings.interceptOnlyAsyncAjaxRequests.booleanValue());
        if (this.customSettings.useShouldInterceptAjaxRequest.booleanValue()) {
            this.userContentController.addPluginScript(this.interceptOnlyAsyncAjaxRequestsPluginScript);
            this.userContentController.addPluginScript(InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (this.customSettings.useShouldInterceptFetchRequest.booleanValue()) {
            this.userContentController.addPluginScript(InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (this.customSettings.useOnLoadResource.booleanValue()) {
            this.userContentController.addPluginScript(OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
        }
        if (!this.customSettings.useHybridComposition.booleanValue()) {
            this.userContentController.addPluginScript(PluginScriptsUtil.f55827x4e848d3b);
        }
        this.userContentController.addUserOnlyScripts(this.initialUserOnlyScripts);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public String printCurrentPage(PrintJobSettings printJobSettings) {
        Activity activity;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || (activity = inAppWebViewFlutterPlugin.activity) == null) {
            return null;
        }
        PrintManager printManager = (PrintManager) activity.getSystemService("print");
        if (printManager == null) {
            Log.e(LOG_TAG, "No PrintManager available");
            return null;
        }
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getTitle() != null ? getTitle() : getUrl());
        sb2.append(" Document");
        String string = sb2.toString();
        if (printJobSettings != null) {
            String str = printJobSettings.jobName;
            if (str != null && !str.isEmpty()) {
                string = printJobSettings.jobName;
            }
            Integer num = printJobSettings.orientation;
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
                } else if (iIntValue == 1) {
                    builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
                }
            }
            MediaSizeExt mediaSizeExt = printJobSettings.mediaSize;
            if (mediaSizeExt != null) {
                builder.setMediaSize(mediaSizeExt.toMediaSize());
            }
            Integer num2 = printJobSettings.colorMode;
            if (num2 != null) {
                builder.setColorMode(num2.intValue());
            }
            Integer num3 = printJobSettings.duplexMode;
            if (num3 != null) {
                builder.setDuplexMode(num3.intValue());
            }
            ResolutionExt resolutionExt = printJobSettings.resolution;
            if (resolutionExt != null) {
                builder.setResolution(resolutionExt.toResolution());
            }
        }
        PrintJob printJobPrint = printManager.print(string, createPrintDocumentAdapter(string), builder.build());
        if (printJobSettings == null || !printJobSettings.handledByClient.booleanValue() || this.plugin.printJobManager == null) {
            return null;
        }
        String string2 = UUID.randomUUID().toString();
        PrintJobController printJobController = new PrintJobController(string2, printJobPrint, printJobSettings, this.plugin);
        this.plugin.printJobManager.jobs.put(printJobController.f55829id, printJobController);
        return string2;
    }

    public ActionMode rebuildActionMode(ActionMode actionMode, ActionMode.Callback callback) {
        boolean z11;
        View view;
        if (!this.customSettings.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            onWindowFocusChanged(view.isFocused());
        }
        if (this.floatingContextMenu != null) {
            hideContextMenu();
            z11 = true;
        } else {
            z11 = false;
        }
        if (actionMode == null) {
            return null;
        }
        Menu menu = actionMode.getMenu();
        actionMode.hide(3000L);
        ArrayList<MenuItem> arrayList = new ArrayList();
        for (int i11 = 0; i11 < menu.size(); i11++) {
            arrayList.add(menu.getItem(i11));
        }
        menu.clear();
        actionMode.finish();
        if (this.customSettings.disableContextMenu.booleanValue()) {
            return actionMode;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(C27376R.layout.floating_action_mode, (ViewGroup) this, false);
        this.floatingContextMenu = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) ((HorizontalScrollView) linearLayout.getChildAt(0)).getChildAt(0);
        List<Map> arrayList2 = new ArrayList();
        ContextMenuSettings contextMenuSettings = new ContextMenuSettings();
        Map<String, Object> map = this.contextMenu;
        if (map != null) {
            arrayList2 = (List) map.get("menuItems");
            Map<String, Object> map2 = (Map) this.contextMenu.get("settings");
            if (map2 != null) {
                contextMenuSettings.parse2(map2);
            }
        }
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        Boolean bool = contextMenuSettings.hideDefaultSystemContextMenuItems;
        if (bool == null || !bool.booleanValue()) {
            for (final MenuItem menuItem : arrayList) {
                final int itemId = menuItem.getItemId();
                final String string = menuItem.getTitle().toString();
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C27376R.layout.floating_action_mode_item, (ViewGroup) this, false);
                textView.setText(string);
                final ActionMode actionMode2 = actionMode;
                final ActionMode.Callback callback2 = callback;
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.12
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        InAppWebView.this.hideContextMenu();
                        callback2.onActionItemClicked(actionMode2, menuItem);
                        WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                        if (webViewChannelDelegate != null) {
                            webViewChannelDelegate.onContextMenuActionItemClicked(itemId, string);
                        }
                    }
                });
                if (this.floatingContextMenu != null) {
                    linearLayout2.addView(textView);
                }
                callback = callback2;
                actionMode = actionMode2;
            }
        }
        ActionMode actionMode3 = actionMode;
        for (Map map3 : arrayList2) {
            final int iIntValue = ((Integer) map3.get("id")).intValue();
            final String str = (String) map3.get("title");
            TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(C27376R.layout.floating_action_mode_item, (ViewGroup) this, false);
            textView2.setText(str);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.13
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    InAppWebView.this.hideContextMenu();
                    WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                    if (webViewChannelDelegate != null) {
                        webViewChannelDelegate.onContextMenuActionItemClicked(iIntValue, str);
                    }
                }
            });
            if (this.floatingContextMenu != null) {
                linearLayout2.addView(textView2);
            }
        }
        Point point = this.lastTouch;
        final int i12 = point != null ? point.x : 0;
        final int i13 = point != null ? point.y : 0;
        this.contextMenuPoint = new Point(i12, i13);
        LinearLayout linearLayout3 = this.floatingContextMenu;
        if (linearLayout3 == null) {
            return actionMode3;
        }
        linearLayout3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.14
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                LinearLayout linearLayout4 = InAppWebView.this.floatingContextMenu;
                if (linearLayout4 != null) {
                    linearLayout4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    if (InAppWebView.this.getSettings().getJavaScriptEnabled()) {
                        InAppWebView.this.onScrollStopped();
                    } else {
                        InAppWebView.this.onFloatingActionGlobalLayout(i12, i13);
                    }
                }
            }
        });
        addView(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i12, i13));
        if (z11) {
            sendOnCreateContextMenuEvent();
        }
        Runnable runnable = this.checkContextMenuShouldBeClosedTask;
        if (runnable == null) {
            return actionMode3;
        }
        runnable.run();
        return actionMode3;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> requestFocusNodeHref() {
        Message messageObtainMessage = mHandler.obtainMessage();
        requestFocusNodeHref(messageObtainMessage);
        Bundle bundlePeekData = messageObtainMessage.peekData();
        HashMap map = new HashMap();
        map.put(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, bundlePeekData.getString(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY));
        map.put("url", bundlePeekData.getString("url"));
        map.put("title", bundlePeekData.getString("title"));
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> requestImageRef() {
        Message messageObtainMessage = mHandler.obtainMessage();
        requestImageRef(messageObtainMessage);
        Bundle bundlePeekData = messageObtainMessage.peekData();
        HashMap map = new HashMap();
        map.put("url", bundlePeekData.getString("url"));
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setChannelDelegate(WebViewChannelDelegate webViewChannelDelegate) {
        this.channelDelegate = webViewChannelDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setContextMenu(Map<String, Object> map) {
        this.contextMenu = map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setInAppBrowserDelegate(InAppBrowserDelegate inAppBrowserDelegate) {
        this.inAppBrowserDelegate = inAppBrowserDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setInFullscreen(boolean z11) {
        this.inFullscreen = z11;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setPlugin(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setUserContentController(UserContentController userContentController) {
        this.userContentController = userContentController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setWebMessageChannels(Map<String, WebMessageChannel> map) {
        this.webMessageChannels = map;
    }

    @Deprecated
    private void clearCookies() {
        CookieManager.getInstance().removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.7
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool) {
            }
        });
    }

    private void sendOnCreateContextMenuEvent() {
        HitTestResult hitTestResultFromWebViewHitTestResult = HitTestResult.fromWebViewHitTestResult(getHitTestResult());
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onCreateContextMenu(hitTestResultFromWebViewHitTestResult);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void callAsyncJavaScript(String str, Map<String, Object> map, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        String string = UUID.randomUUID().toString();
        if (valueCallback != null) {
            this.callAsyncJavaScriptCallbacks.put(string, valueCallback);
        }
        Iterator<String> itKeys = new JSONObject(map).keys();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            arrayList.add(next);
            arrayList2.add("obj." + next);
        }
        String strJoin = TextUtils.join(", ", arrayList);
        evaluateJavascript(this.userContentController.generateCodeForScriptEvaluation(PluginScriptsUtil.CALL_ASYNC_JAVA_SCRIPT_WRAPPER_JS_SOURCE.replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_NAMES, strJoin).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_VALUES, TextUtils.join(", ", arrayList2)).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENTS_OBJ, Util.JSONStringify(map)).replace(PluginScriptsUtil.VAR_FUNCTION_BODY, str).replace(PluginScriptsUtil.VAR_RESULT_UUID, string).replace(PluginScriptsUtil.VAR_RESULT_UUID, string), contentWorld), null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean canScrollHorizontally() {
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent()) {
            return true;
        }
        return false;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean canScrollVertically() {
        if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
            return true;
        }
        return false;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public WebMessageChannel createCompatWebMessageChannel() {
        String string = UUID.randomUUID().toString();
        WebMessageChannel webMessageChannel = new WebMessageChannel(string, this);
        this.webMessageChannels.put(string, webMessageChannel);
        return webMessageChannel;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public WebMessageChannel createWebMessageChannel(ValueCallback<WebMessageChannel> valueCallback) {
        WebMessageChannel webMessageChannelCreateCompatWebMessageChannel = createCompatWebMessageChannel();
        valueCallback.onReceiveValue(webMessageChannelCreateCompatWebMessageChannel);
        return webMessageChannelCreateCompatWebMessageChannel;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    public WebViewClient createWebViewClient(InAppBrowserDelegate inAppBrowserDelegate) {
        boolean z11;
        int i11;
        PackageInfo currentWebViewPackage = WebViewCompat.getCurrentWebViewPackage(getContext());
        if (currentWebViewPackage == null) {
            Log.d(LOG_TAG, "Using InAppWebViewClient implementation");
            return new InAppWebViewClient(inAppBrowserDelegate);
        }
        boolean z12 = true;
        if (!"com.android.webview".equals(currentWebViewPackage.packageName) && !"com.google.android.webview".equals(currentWebViewPackage.packageName) && !"com.android.chrome".equals(currentWebViewPackage.packageName)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            String str = currentWebViewPackage.versionName;
            if (str == null) {
                str = "";
            }
            try {
                if (str.contains(C33978va.f72339h)) {
                    i11 = Integer.parseInt(str.split("\\.")[0]);
                } else {
                    i11 = 0;
                }
                if (i11 < 73) {
                    z12 = false;
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            z12 = false;
        }
        if (!z12 && z11) {
            Log.d(LOG_TAG, "Using InAppWebViewClient implementation");
            return new InAppWebViewClient(inAppBrowserDelegate);
        }
        Log.d(LOG_TAG, "Using InAppWebViewClientCompat implementation");
        return new InAppWebViewClientCompat(inAppBrowserDelegate);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getContentHeight(ValueCallback<Integer> valueCallback) {
        valueCallback.onReceiveValue(Integer.valueOf(getContentHeight()));
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public HashMap<String, Object> getCopyBackForwardList() {
        WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
        int size = webBackForwardListCopyBackForwardList.getSize();
        int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < size; i11++) {
            WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i11);
            HashMap map = new HashMap();
            map.put("originalUrl", itemAtIndex.getOriginalUrl());
            map.put("title", itemAtIndex.getTitle());
            map.put("url", itemAtIndex.getUrl());
            arrayList.add(map);
        }
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("list", arrayList);
        map2.put("currentIndex", Integer.valueOf(currentIndex));
        return map2;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getHitTestResult(ValueCallback<HitTestResult> valueCallback) {
        valueCallback.onReceiveValue(HitTestResult.fromWebViewHitTestResult(getHitTestResult()));
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void loadUrl(URLRequest uRLRequest) {
        String url = uRLRequest.getUrl();
        String method = uRLRequest.getMethod();
        if (method != null && method.equals("POST")) {
            postUrl(url, uRLRequest.getBody());
            return;
        }
        Map<String, String> headers = uRLRequest.getHeaders();
        if (headers != null) {
            loadUrl(url, headers);
        } else {
            loadUrl(url);
        }
    }

    @Override // android.view.View
    public void onCreateContextMenu(ContextMenu contextMenu) {
        super.onCreateContextMenu(contextMenu);
        sendOnCreateContextMenuEvent();
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        View view;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null && !this.customSettings.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            view.getHandler().postDelayed(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.11
                @Override // java.lang.Runnable
                public void run() {
                    boolean zIsAcceptingText;
                    InputMethodManager inputMethodManager = (InputMethodManager) InAppWebView.this.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        try {
                            zIsAcceptingText = inputMethodManager.isAcceptingText();
                        } catch (Exception unused) {
                            zIsAcceptingText = false;
                        }
                    } else {
                        zIsAcceptingText = false;
                    }
                    View view2 = InAppWebView.this.containerView;
                    if (view2 == null || inputMethodManager == null || zIsAcceptingText) {
                        return;
                    }
                    inputMethodManager.hideSoftInputFromWindow(view2.getWindowToken(), 2);
                }
            }, 128L);
        }
        return inputConnectionOnCreateInputConnection;
    }

    public void onFloatingActionGlobalLayout(int i11, int i12) {
        int width = getWidth();
        getHeight();
        int width2 = this.floatingContextMenu.getWidth();
        int height = this.floatingContextMenu.getHeight();
        int i13 = i11 - (width2 / 2);
        if (i13 < 0) {
            i13 = 0;
        } else if (i13 + width2 > width) {
            i13 = width - width2;
        }
        float f11 = i12 - (height * 1.5f);
        if (f11 < 0.0f) {
            f11 = i12 + height;
        }
        updateViewLayout(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i13 + getScrollX(), ((int) f11) + getScrollY()));
        this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.15
            @Override // java.lang.Runnable
            public void run() {
                LinearLayout linearLayout = InAppWebView.this.floatingContextMenu;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
                }
            }
        });
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int i11, int i12, boolean z11, boolean z12) {
        boolean z13;
        WebViewChannelDelegate webViewChannelDelegate;
        super.onOverScrolled(i11, i12, z11, z12);
        boolean z14 = false;
        if (canScrollHorizontally() && z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (canScrollVertically() && z12) {
            z14 = true;
        }
        ViewParent parent = getParent();
        if ((parent instanceof PullToRefreshLayout) && z14 && i12 <= 10) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            setOverScrollMode(2);
            pullToRefreshLayout.setEnabled(pullToRefreshLayout.settings.enabled.booleanValue());
            setOverScrollMode(this.customSettings.overScrollMode.intValue());
        }
        if ((z13 || z14) && (webViewChannelDelegate = this.channelDelegate) != null) {
            webViewChannelDelegate.onOverScrolled(i11, i12, z13, z14);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        LinearLayout linearLayout = this.floatingContextMenu;
        if (linearLayout != null) {
            linearLayout.setAlpha(0.0f);
            this.floatingContextMenu.setVisibility(8);
        }
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onScrollChanged(i11, i12);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void scrollBy(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt("scrollX", getScrollX() + num.intValue()), PropertyValuesHolder.ofInt("scrollY", getScrollY() + num2.intValue())).setDuration(300L).start();
        } else {
            scrollBy(num.intValue(), num2.intValue());
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void scrollTo(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt("scrollX", num.intValue()), PropertyValuesHolder.ofInt("scrollY", num2.intValue())).setDuration(300L).start();
        } else {
            scrollTo(num.intValue(), num2.intValue());
        }
    }

    public void setCacheEnabled(boolean z11) {
        WebSettings settings = getSettings();
        if (z11) {
            Context context = getContext();
            if (context != null) {
                Util.invokeMethodIfExists(settings, "setAppCachePath", context.getCacheDir().getAbsolutePath());
                settings.setCacheMode(-1);
                Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
                return;
            }
            return;
        }
        settings.setCacheMode(2);
        Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
    }

    public void setDesktopMode(boolean z11) {
        String strReplace;
        WebSettings settings = getSettings();
        if (z11) {
            strReplace = settings.getUserAgentString().replace("Mobile", "eliboM").replace(KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID, "diordnA");
        } else {
            strReplace = settings.getUserAgentString().replace("eliboM", "Mobile").replace("diordnA", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
        }
        settings.setUserAgentString(strReplace);
        settings.setUseWideViewPort(z11);
        settings.setLoadWithOverviewMode(z11);
        settings.setSupportZoom(z11);
        settings.setBuiltInZoomControls(z11);
    }

    public void setIncognito(boolean z11) {
        WebSettings settings = getSettings();
        if (z11) {
            CookieManager.getInstance().removeAllCookies(null);
            settings.setCacheMode(2);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
            clearHistory();
            clearCache(true);
            clearFormData();
            settings.setSavePassword(false);
            settings.setSaveFormData(false);
            return;
        }
        settings.setCacheMode(-1);
        Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
        settings.setSavePassword(true);
        settings.setSaveFormData(true);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void takeScreenshot(final Map<String, Object> map, final MethodChannel.Result result) {
        final float pixelDensity = Util.getPixelDensity(getContext());
        this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.8
            @Override // java.lang.Runnable
            public void run() {
                Bitmap bitmap;
                int iIntValue;
                double d11;
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(InAppWebView.this.getMeasuredWidth(), InAppWebView.this.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.translate(-InAppWebView.this.getScrollX(), -InAppWebView.this.getScrollY());
                    InAppWebView.this.draw(canvas);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Bitmap.CompressFormat compressFormatValueOf = Bitmap.CompressFormat.PNG;
                    Map map2 = map;
                    if (map2 != null) {
                        Map map3 = (Map) map2.get("rect");
                        if (map3 != null) {
                            d11 = 0.5d;
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, (int) Math.floor((((Double) map3.get("x")).doubleValue() * ((double) pixelDensity)) + 0.5d), (int) Math.floor((((Double) map3.get("y")).doubleValue() * ((double) pixelDensity)) + 0.5d), Math.min(bitmapCreateBitmap.getWidth(), (int) Math.floor((((Double) map3.get("width")).doubleValue() * ((double) pixelDensity)) + 0.5d)), Math.min(bitmapCreateBitmap.getHeight(), (int) Math.floor((((Double) map3.get("height")).doubleValue() * ((double) pixelDensity)) + 0.5d)));
                        } else {
                            d11 = 0.5d;
                        }
                        Double d12 = (Double) map.get("snapshotWidth");
                        if (d12 != null) {
                            int iFloor = (int) Math.floor((d12.doubleValue() * ((double) pixelDensity)) + d11);
                            bitmapCreateBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, iFloor, (int) (iFloor / (bitmapCreateBitmap.getWidth() / bitmapCreateBitmap.getHeight())), true);
                        }
                        bitmap = bitmapCreateBitmap;
                        try {
                            compressFormatValueOf = Bitmap.CompressFormat.valueOf((String) map.get("compressFormat"));
                        } catch (IllegalArgumentException e11) {
                            Log.e(InAppWebView.LOG_TAG, "", e11);
                        }
                        iIntValue = ((Integer) map.get(C33757kf.f70665k)).intValue();
                    } else {
                        bitmap = bitmapCreateBitmap;
                        iIntValue = 100;
                    }
                    bitmap.compress(compressFormatValueOf, iIntValue, byteArrayOutputStream);
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e12) {
                        Log.e(InAppWebView.LOG_TAG, "", e12);
                    }
                    bitmap.recycle();
                    result.success(byteArrayOutputStream.toByteArray());
                } catch (IllegalArgumentException e13) {
                    Log.e(InAppWebView.LOG_TAG, "", e13);
                    result.success(null);
                }
            }
        });
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i11) {
        Map<String, Object> map;
        if (this.customSettings.useHybridComposition.booleanValue() && !this.customSettings.disableContextMenu.booleanValue() && ((map = this.contextMenu) == null || map.keySet().size() == 0)) {
            return super.startActionMode(callback, i11);
        }
        return rebuildActionMode(super.startActionMode(callback, i11), callback);
    }

    public InAppWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    public InAppWebView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    public InAppWebView(Context context, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Object obj, Integer num, InAppWebViewSettings inAppWebViewSettings, Map<String, Object> map, View view, List<UserScript> list) {
        super(context, view, inAppWebViewSettings.useHybridComposition);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
        this.plugin = inAppWebViewFlutterPlugin;
        this.f55839id = obj;
        this.channelDelegate = new WebViewChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME_PREFIX + obj));
        this.windowId = num;
        this.customSettings = inAppWebViewSettings;
        this.contextMenu = map;
        this.initialUserOnlyScripts = list;
        Activity activity = inAppWebViewFlutterPlugin.activity;
        if (activity != null) {
            activity.registerForContextMenu(this);
        }
    }
}
