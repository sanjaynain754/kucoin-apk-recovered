package com.reactnativecommunity.webview;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.ContentSizeChangeEvent;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.scroll.OnScrollDispatchHelper;
import com.facebook.react.views.scroll.ScrollEvent;
import com.facebook.react.views.scroll.ScrollEventType;
import com.google.android.gms.measurement.internal.C7081g;
import com.google.firebase.messaging.Constants;
import com.reactnativecommunity.webview.events.TopCustomMenuSelectionEvent;
import com.reactnativecommunity.webview.events.TopMessageEvent;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes59.dex */
public class RNCWebView extends WebView implements LifecycleEventListener {
    protected static final String JAVASCRIPT_INTERFACE = "ReactNativeWebView";

    @Nullable
    protected WebViewCompat.WebMessageListener bridgeListener;

    @Nullable
    protected RNCWebViewBridge fallbackBridge;
    protected boolean hasScrollEvent;

    @Nullable
    protected String injectedJS;

    @Nullable
    protected String injectedJSBeforeContentLoaded;
    protected boolean injectedJavaScriptBeforeContentLoadedForMainFrameOnly;
    protected boolean injectedJavaScriptForMainFrameOnly;
    protected String injectedJavaScriptObject;

    @Nullable
    protected RNCWebViewMessagingModule mMessagingJSModule;
    private OnScrollDispatchHelper mOnScrollDispatchHelper;

    @Nullable
    protected RNCWebViewClient mRNCWebViewClient;
    WebChromeClient mWebChromeClient;

    @Nullable
    protected List<Map<String, String>> menuCustomItems;
    protected boolean messagingEnabled;

    @Nullable
    protected String messagingModuleName;
    protected boolean nestedScrollEnabled;
    protected ProgressChangedFilter progressChangedFilter;
    protected boolean sendContentSizeChangeEvents;

    public static class ProgressChangedFilter {
        private boolean waitingForCommandLoadUrl = false;

        public boolean isWaitingForCommandLoadUrl() {
            return this.waitingForCommandLoadUrl;
        }

        public void setWaitingForCommandLoadUrl(boolean z11) {
            this.waitingForCommandLoadUrl = z11;
        }
    }

    public class RNCWebViewBridge {
        private String TAG = "RNCWebViewBridge";
        RNCWebView mWebView;

        public RNCWebViewBridge(RNCWebView rNCWebView) {
            this.mWebView = rNCWebView;
        }

        @JavascriptInterface
        public void postMessage(String str) {
            if (!this.mWebView.getMessagingEnabled()) {
                C45999a.m101488I(this.TAG, "ReactNativeWebView.postMessage method was called but messaging is disabled. Pass an onMessage handler to the WebView.");
            } else {
                RNCWebView rNCWebView = this.mWebView;
                rNCWebView.onMessage(str, rNCWebView.getUrl());
            }
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.webview.RNCWebView$a */
    public class C27502a extends ActionMode.Callback2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionMode.Callback f55871a;

        /* JADX INFO: renamed from: com.reactnativecommunity.webview.RNCWebView$a$a */
        public class a implements ValueCallback<String> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ MenuItem f55873a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ WritableMap f55874b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ActionMode f55875c;

            public a(MenuItem menuItem, WritableMap writableMap, ActionMode actionMode) {
                this.f55873a = menuItem;
                this.f55874b = writableMap;
                this.f55875c = actionMode;
            }

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
            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
                String string;
                Map<String, String> map = RNCWebView.this.menuCustomItems.get(this.f55873a.getItemId());
                this.f55874b.putString(Constants.ScionAnalytics.PARAM_LABEL, map.get(Constants.ScionAnalytics.PARAM_LABEL));
                this.f55874b.putString("key", map.get("key"));
                try {
                    string = new JSONObject(str).getString("selection");
                } catch (JSONException unused) {
                    string = "";
                }
                this.f55874b.putString("selectedText", string);
                RNCWebView rNCWebView = RNCWebView.this;
                rNCWebView.dispatchEvent(rNCWebView, new TopCustomMenuSelectionEvent(RNCWebViewWrapper.getReactTagFromWebView(RNCWebView.this), this.f55874b));
                this.f55875c.finish();
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            for (int i11 = 0; i11 < RNCWebView.this.menuCustomItems.size(); i11++) {
                menu.add(0, i11, i11, RNCWebView.this.menuCustomItems.get(i11).get(Constants.ScionAnalytics.PARAM_LABEL));
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        public C27502a(ActionMode.Callback callback) {
            this.f55871a = callback;
        }

        @Override // android.view.ActionMode.Callback2
        public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
            ActionMode.Callback callback = this.f55871a;
            if (callback instanceof ActionMode.Callback2) {
                ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
            } else {
                super.onGetContentRect(actionMode, view, rect);
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            RNCWebView.this.evaluateJavascript("(function(){return {selection: window.getSelection().toString()} })()", new a(menuItem, Arguments.createMap(), actionMode));
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.webview.RNCWebView$b */
    public class C27503b implements WebViewCompat.WebMessageListener {
        public C27503b() {
        }

        @Override // androidx.webkit.WebViewCompat.WebMessageListener
        public void onPostMessage(@NonNull WebView webView, @NonNull WebMessageCompat webMessageCompat, @NonNull Uri uri, boolean z11, @NonNull JavaScriptReplyProxy javaScriptReplyProxy) {
            RNCWebView.this.onMessage(webMessageCompat.getData(), uri.toString());
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.webview.RNCWebView$c */
    public class RunnableC27504c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ WebView f55878b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f55879c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f55880d;

        public RunnableC27504c(WebView webView, String str, String str2) {
            this.f55878b = webView;
            this.f55879c = str;
            this.f55880d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            RNCWebViewClient rNCWebViewClient = RNCWebView.this.mRNCWebViewClient;
            if (rNCWebViewClient == null) {
                return;
            }
            WritableMap writableMapCreateWebViewEvent = rNCWebViewClient.createWebViewEvent(this.f55878b, this.f55879c);
            writableMapCreateWebViewEvent.putString("data", this.f55880d);
            RNCWebView rNCWebView = RNCWebView.this;
            if (rNCWebView.mMessagingJSModule != null) {
                rNCWebView.dispatchDirectMessage(writableMapCreateWebViewEvent);
            } else {
                rNCWebView.dispatchEvent(this.f55878b, new TopMessageEvent(RNCWebViewWrapper.getReactTagFromWebView(this.f55878b), writableMapCreateWebViewEvent));
            }
        }
    }

    public void cleanupCallbacksAndDestroy() {
        setWebViewClient(null);
        destroy();
    }

    public void evaluateJavascriptWithFallback(String str) {
        evaluateJavascript(str, null);
    }

    public void createRNCWebViewBridge(RNCWebView rNCWebView) {
        if (WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_LISTENER)) {
            if (this.bridgeListener == null) {
                this.bridgeListener = new C27503b();
                WebViewCompat.addWebMessageListener(rNCWebView, JAVASCRIPT_INTERFACE, C7081g.m12913a(new Object[]{ProxyConfig.MATCH_ALL_SCHEMES}), this.bridgeListener);
            }
        } else if (this.fallbackBridge == null) {
            RNCWebViewBridge rNCWebViewBridge = new RNCWebViewBridge(rNCWebView);
            this.fallbackBridge = rNCWebViewBridge;
            addJavascriptInterface(rNCWebViewBridge, JAVASCRIPT_INTERFACE);
        }
        injectJavascriptObject();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        WebChromeClient webChromeClient = this.mWebChromeClient;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
        super.destroy();
    }

    public void dispatchDirectMessage(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.messagingModuleName);
        this.mMessagingJSModule.onMessage(writableNativeMap);
    }

    public boolean dispatchDirectShouldStartLoadWithRequest(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.messagingModuleName);
        this.mMessagingJSModule.onShouldStartLoadWithRequest(writableNativeMap);
        return true;
    }

    public boolean getMessagingEnabled() {
        return this.messagingEnabled;
    }

    @Nullable
    public RNCWebViewClient getRNCWebViewClient() {
        return this.mRNCWebViewClient;
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.mWebChromeClient;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.nestedScrollEnabled) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBasicAuthCredential(C27508a c27508a) {
        this.mRNCWebViewClient.setBasicAuthCredential(c27508a);
    }

    public void setHasScrollEvent(boolean z11) {
        this.hasScrollEvent = z11;
    }

    public void setIgnoreErrFailedForThisURL(String str) {
        this.mRNCWebViewClient.setIgnoreErrFailedForThisURL(str);
    }

    public void setInjectedJavaScriptObject(String str) {
        this.injectedJavaScriptObject = str;
        injectJavascriptObject();
    }

    public void setMenuCustomItems(List<Map<String, String>> list) {
        this.menuCustomItems = list;
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void setMessagingEnabled(boolean z11) {
        if (this.messagingEnabled == z11) {
            return;
        }
        this.messagingEnabled = z11;
        if (z11) {
            createRNCWebViewBridge(this);
        }
    }

    public void setNestedScrollEnabled(boolean z11) {
        this.nestedScrollEnabled = z11;
    }

    public void setSendContentSizeChangeEvents(boolean z11) {
        this.sendContentSizeChangeEvents = z11;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.mWebChromeClient = webChromeClient;
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof RNCWebChromeClient) {
            ((RNCWebChromeClient) webChromeClient).setProgressChangedFilter(this.progressChangedFilter);
        }
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i11) {
        return this.menuCustomItems == null ? super.startActionMode(callback, i11) : super.startActionMode(new C27502a(callback), i11);
    }

    public RNCWebView(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.bridgeListener = null;
        this.injectedJavaScriptForMainFrameOnly = true;
        this.injectedJavaScriptBeforeContentLoadedForMainFrameOnly = true;
        this.messagingEnabled = false;
        this.sendContentSizeChangeEvents = false;
        this.hasScrollEvent = false;
        this.nestedScrollEnabled = false;
        this.injectedJavaScriptObject = null;
        this.mMessagingJSModule = (RNCWebViewMessagingModule) ((ThemedReactContext) getContext()).getReactApplicationContext().getJSModule(RNCWebViewMessagingModule.class);
        this.progressChangedFilter = new ProgressChangedFilter();
    }

    private void injectJavascriptObject() {
        String str;
        if (getSettings().getJavaScriptEnabled()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(function(){\n    window.ReactNativeWebView = window.ReactNativeWebView || {};\n    window.ReactNativeWebView.injectedObjectJson = function () { return ");
            if (this.injectedJavaScriptObject == null) {
                str = null;
            } else {
                str = "`" + this.injectedJavaScriptObject + "`";
            }
            sb2.append(str);
            sb2.append("; };\n})();");
            evaluateJavascriptWithFallback(sb2.toString());
        }
    }

    public void callInjectedJavaScript() {
        String str;
        if (getSettings().getJavaScriptEnabled() && (str = this.injectedJS) != null && !TextUtils.isEmpty(str)) {
            evaluateJavascriptWithFallback("(function() {\n" + this.injectedJS + ";\n})();");
            injectJavascriptObject();
        }
    }

    public void callInjectedJavaScriptBeforeContentLoaded() {
        String str;
        if (getSettings().getJavaScriptEnabled() && (str = this.injectedJSBeforeContentLoaded) != null && !TextUtils.isEmpty(str)) {
            evaluateJavascriptWithFallback("(function() {\n" + this.injectedJSBeforeContentLoaded + ";\n})();");
            injectJavascriptObject();
        }
    }

    public void dispatchEvent(WebView webView, Event event) {
        UIManagerHelper.getEventDispatcherForReactTag(getThemedReactContext(), RNCWebViewWrapper.getReactTagFromWebView(webView)).dispatchEvent(event);
    }

    public ReactApplicationContext getReactApplicationContext() {
        return getThemedReactContext().getReactApplicationContext();
    }

    public ThemedReactContext getThemedReactContext() {
        return (ThemedReactContext) getContext();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        cleanupCallbacksAndDestroy();
    }

    public void onMessage(String str, String str2) {
        getThemedReactContext();
        if (this.mRNCWebViewClient != null) {
            post(new RunnableC27504c(this, str2, str));
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("data", str);
        if (this.mMessagingJSModule != null) {
            dispatchDirectMessage(writableMapCreateMap);
        } else {
            dispatchEvent(this, new TopMessageEvent(RNCWebViewWrapper.getReactTagFromWebView(this), writableMapCreateMap));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        if (this.hasScrollEvent) {
            if (this.mOnScrollDispatchHelper == null) {
                this.mOnScrollDispatchHelper = new OnScrollDispatchHelper();
            }
            if (this.mOnScrollDispatchHelper.onScrollChanged(i11, i12)) {
                dispatchEvent(this, ScrollEvent.obtain(RNCWebViewWrapper.getReactTagFromWebView(this), ScrollEventType.SCROLL, i11, i12, this.mOnScrollDispatchHelper.getXFlingVelocity(), this.mOnScrollDispatchHelper.getYFlingVelocity(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (this.sendContentSizeChangeEvents) {
            dispatchEvent(this, new ContentSizeChangeEvent(RNCWebViewWrapper.getReactTagFromWebView(this), i11, i12));
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof RNCWebViewClient) {
            RNCWebViewClient rNCWebViewClient = (RNCWebViewClient) webViewClient;
            this.mRNCWebViewClient = rNCWebViewClient;
            rNCWebViewClient.setProgressChangedFilter(this.progressChangedFilter);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
