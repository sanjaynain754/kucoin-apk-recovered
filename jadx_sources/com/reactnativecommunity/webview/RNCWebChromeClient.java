package com.reactnativecommunity.webview;

import android.content.ComponentCallbacks2;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.uimanager.UIManagerHelper;
import com.reactnativecommunity.webview.events.TopLoadingProgressEvent;
import com.reactnativecommunity.webview.events.TopOpenWindowEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class RNCWebChromeClient extends WebChromeClient implements LifecycleEventListener {
    protected static final int COMMON_PERMISSION_REQUEST = 3;
    protected static final FrameLayout.LayoutParams FULLSCREEN_LAYOUT_PARAMS = new FrameLayout.LayoutParams(-1, -1, 17);
    protected static final int FULLSCREEN_SYSTEM_UI_VISIBILITY = 7942;
    protected GeolocationPermissions.Callback geolocationPermissionCallback;
    protected String geolocationPermissionOrigin;
    protected List<String> grantedPermissions;
    protected WebChromeClient.CustomViewCallback mCustomViewCallback;
    protected View mVideoView;
    protected RNCWebView mWebView;
    protected PermissionRequest permissionRequest;
    protected boolean permissionsRequestShown = false;
    protected List<String> pendingPermissions = new ArrayList();
    protected RNCWebView.ProgressChangedFilter progressChangedFilter = null;
    protected boolean mAllowsProtectedMedia = false;
    protected boolean mHasOnOpenWindowEvent = false;
    private PermissionListener webviewPermissionsListener = new PermissionListener() { // from class: com.reactnativecommunity.webview.b
        @Override // com.facebook.react.modules.core.PermissionListener
        public final boolean onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
            return this.f55889b.lambda$new$0(i11, strArr, iArr);
        }
    };

    /* JADX INFO: renamed from: com.reactnativecommunity.webview.RNCWebChromeClient$a */
    public class C27501a extends WebViewClient {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WebView f55869a;

        public C27501a(WebView webView) {
            this.f55869a = webView;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("targetUrl", str);
            WebView webView2 = this.f55869a;
            ((RNCWebView) webView2).dispatchEvent(webView2, new TopOpenWindowEvent(RNCWebViewWrapper.getReactTagFromWebView(this.f55869a), writableMapCreateMap));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$0(int i11, String[] strArr, int[] iArr) {
        PermissionRequest permissionRequest;
        List<String> list;
        List<String> list2;
        List<String> list3;
        List<String> list4;
        GeolocationPermissions.Callback callback;
        String str;
        this.permissionsRequestShown = false;
        boolean z11 = false;
        for (int i12 = 0; i12 < strArr.length; i12++) {
            String str2 = strArr[i12];
            boolean z12 = iArr[i12] == 0;
            if (str2.equals("android.permission.ACCESS_FINE_LOCATION") && (callback = this.geolocationPermissionCallback) != null && (str = this.geolocationPermissionOrigin) != null) {
                if (z12) {
                    callback.invoke(str, true, false);
                } else {
                    callback.invoke(str, false, false);
                }
                this.geolocationPermissionCallback = null;
                this.geolocationPermissionOrigin = null;
            }
            if (str2.equals("android.permission.RECORD_AUDIO")) {
                if (z12 && (list4 = this.grantedPermissions) != null) {
                    list4.add("android.webkit.resource.AUDIO_CAPTURE");
                }
                z11 = true;
            }
            if (str2.equals("android.permission.CAMERA")) {
                if (z12 && (list3 = this.grantedPermissions) != null) {
                    list3.add("android.webkit.resource.VIDEO_CAPTURE");
                }
                z11 = true;
            }
            if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (z12 && (list2 = this.grantedPermissions) != null) {
                    list2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                }
                z11 = true;
            }
        }
        if (z11 && (permissionRequest = this.permissionRequest) != null && (list = this.grantedPermissions) != null) {
            permissionRequest.grant((String[]) list.toArray(new String[0]));
            this.permissionRequest = null;
            this.grantedPermissions = null;
        }
        if (this.pendingPermissions.isEmpty()) {
            return true;
        }
        requestPermissions(this.pendingPermissions);
        return false;
    }

    private synchronized void requestPermissions(List<String> list) {
        if (this.permissionsRequestShown) {
            this.pendingPermissions.addAll(list);
            return;
        }
        PermissionAwareActivity permissionAwareActivity = getPermissionAwareActivity();
        this.permissionsRequestShown = true;
        permissionAwareActivity.requestPermissions((String[]) list.toArray(new String[0]), 3, this.webviewPermissionsListener);
        this.pendingPermissions.clear();
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        ((RNCWebViewModule) this.mWebView.getThemedReactContext().getNativeModule(RNCWebViewModule.class)).startPhotoPickerIntent(valueCallback, str);
    }

    private PermissionAwareActivity getPermissionAwareActivity() {
        ComponentCallbacks2 currentActivity = this.mWebView.getThemedReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof PermissionAwareActivity) {
            return (PermissionAwareActivity) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    public ViewGroup getRootView() {
        return (ViewGroup) this.mWebView.getThemedReactContext().getCurrentActivity().findViewById(android.R.id.content);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (ReactBuildConfig.DEBUG) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z11, boolean z12, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        if (this.mHasOnOpenWindowEvent) {
            webView2.setWebViewClient(new C27501a(webView));
        }
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (ContextCompat.checkSelfPermission(this.mWebView.getThemedReactContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            callback.invoke(str, true, false);
            return;
        }
        this.geolocationPermissionCallback = callback;
        this.geolocationPermissionOrigin = str;
        requestPermissions(Collections.singletonList("android.permission.ACCESS_FINE_LOCATION"));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        View view = this.mVideoView;
        if (view == null || view.getSystemUiVisibility() == FULLSCREEN_SYSTEM_UI_VISIBILITY) {
            return;
        }
        this.mVideoView.setSystemUiVisibility(FULLSCREEN_SYSTEM_UI_VISIBILITY);
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        this.grantedPermissions = new ArrayList();
        ArrayList arrayList = new ArrayList();
        String[] resources = permissionRequest.getResources();
        int length = resources.length;
        int i11 = 0;
        while (true) {
            String str = null;
            if (i11 >= length) {
                break;
            }
            String str2 = resources[i11];
            if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                str = "android.permission.RECORD_AUDIO";
            } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                str = "android.permission.CAMERA";
            } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (this.mAllowsProtectedMedia) {
                    this.grantedPermissions.add(str2);
                } else {
                    str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                }
            }
            if (str != null) {
                if (ContextCompat.checkSelfPermission(this.mWebView.getThemedReactContext(), str) == 0) {
                    this.grantedPermissions.add(str2);
                } else {
                    arrayList.add(str);
                }
            }
            i11++;
        }
        if (arrayList.isEmpty()) {
            permissionRequest.grant((String[]) this.grantedPermissions.toArray(new String[0]));
            this.grantedPermissions = null;
        } else {
            this.permissionRequest = permissionRequest;
            requestPermissions(arrayList);
        }
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback) {
        ((RNCWebViewModule) this.mWebView.getThemedReactContext().getNativeModule(RNCWebViewModule.class)).startPhotoPickerIntent(valueCallback, "");
    }

    public void setAllowsProtectedMedia(boolean z11) {
        this.mAllowsProtectedMedia = z11;
    }

    public void setHasOnOpenWindowEvent(boolean z11) {
        this.mHasOnOpenWindowEvent = z11;
    }

    public void setProgressChangedFilter(RNCWebView.ProgressChangedFilter progressChangedFilter) {
        this.progressChangedFilter = progressChangedFilter;
    }

    public RNCWebChromeClient(RNCWebView rNCWebView) {
        this.mWebView = rNCWebView;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i11) {
        super.onProgressChanged(webView, i11);
        String url = webView.getUrl();
        if (this.progressChangedFilter.isWaitingForCommandLoadUrl()) {
            return;
        }
        int reactTagFromWebView = RNCWebViewWrapper.getReactTagFromWebView(webView);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", reactTagFromWebView);
        writableMapCreateMap.putString("title", webView.getTitle());
        writableMapCreateMap.putString("url", url);
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        writableMapCreateMap.putDouble("progress", i11 / 100.0f);
        UIManagerHelper.getEventDispatcherForReactTag(this.mWebView.getThemedReactContext(), reactTagFromWebView).dispatchEvent(new TopLoadingProgressEvent(reactTagFromWebView, writableMapCreateMap));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        boolean z11 = true;
        if (fileChooserParams.getMode() != 1) {
            z11 = false;
        }
        return ((RNCWebViewModule) this.mWebView.getThemedReactContext().getNativeModule(RNCWebViewModule.class)).startPhotoPickerIntent(valueCallback, acceptTypes, z11, fileChooserParams.isCaptureEnabled());
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        ((RNCWebViewModule) this.mWebView.getThemedReactContext().getNativeModule(RNCWebViewModule.class)).startPhotoPickerIntent(valueCallback, str);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }
}
