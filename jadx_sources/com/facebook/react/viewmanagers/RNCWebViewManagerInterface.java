package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes45.dex */
public interface RNCWebViewManagerInterface<T extends View> {
    void clearCache(T t11, boolean z11);

    void clearFormData(T t11);

    void clearHistory(T t11);

    void goBack(T t11);

    void goForward(T t11);

    void injectJavaScript(T t11, String str);

    void loadUrl(T t11, String str);

    void postMessage(T t11, String str);

    void reload(T t11);

    void requestFocus(T t11);

    void setAllowFileAccess(T t11, boolean z11);

    void setAllowFileAccessFromFileURLs(T t11, boolean z11);

    void setAllowUniversalAccessFromFileURLs(T t11, boolean z11);

    void setAllowingReadAccessToURL(T t11, @Nullable String str);

    void setAllowsAirPlayForMediaPlayback(T t11, boolean z11);

    void setAllowsBackForwardNavigationGestures(T t11, boolean z11);

    void setAllowsFullscreenVideo(T t11, boolean z11);

    void setAllowsInlineMediaPlayback(T t11, boolean z11);

    void setAllowsLinkPreview(T t11, boolean z11);

    void setAllowsPictureInPictureMediaPlayback(T t11, boolean z11);

    void setAllowsProtectedMedia(T t11, boolean z11);

    void setAndroidLayerType(T t11, @Nullable String str);

    void setApplicationNameForUserAgent(T t11, @Nullable String str);

    void setAutoManageStatusBarEnabled(T t11, boolean z11);

    void setAutomaticallyAdjustContentInsets(T t11, boolean z11);

    void setBasicAuthCredential(T t11, @Nullable ReadableMap readableMap);

    void setBounces(T t11, boolean z11);

    void setCacheEnabled(T t11, boolean z11);

    void setCacheMode(T t11, @Nullable String str);

    void setContentInset(T t11, @Nullable ReadableMap readableMap);

    void setContentInsetAdjustmentBehavior(T t11, @Nullable String str);

    void setContentMode(T t11, @Nullable String str);

    void setDataDetectorTypes(T t11, @Nullable ReadableArray readableArray);

    void setDecelerationRate(T t11, double d11);

    void setDirectionalLockEnabled(T t11, boolean z11);

    void setDomStorageEnabled(T t11, boolean z11);

    void setDownloadingMessage(T t11, @Nullable String str);

    void setEnableApplePay(T t11, boolean z11);

    void setForceDarkOn(T t11, boolean z11);

    void setFraudulentWebsiteWarningEnabled(T t11, boolean z11);

    void setGeolocationEnabled(T t11, boolean z11);

    void setHasOnFileDownload(T t11, boolean z11);

    void setHasOnOpenWindowEvent(T t11, boolean z11);

    void setHasOnScroll(T t11, boolean z11);

    void setHideKeyboardAccessoryView(T t11, boolean z11);

    void setIncognito(T t11, boolean z11);

    void setInjectedJavaScript(T t11, @Nullable String str);

    void setInjectedJavaScriptBeforeContentLoaded(T t11, @Nullable String str);

    void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(T t11, boolean z11);

    void setInjectedJavaScriptForMainFrameOnly(T t11, boolean z11);

    void setInjectedJavaScriptObject(T t11, @Nullable String str);

    void setJavaScriptCanOpenWindowsAutomatically(T t11, boolean z11);

    void setJavaScriptEnabled(T t11, boolean z11);

    void setKeyboardDisplayRequiresUserAction(T t11, boolean z11);

    void setLackPermissionToDownloadMessage(T t11, @Nullable String str);

    void setLimitsNavigationsToAppBoundDomains(T t11, boolean z11);

    void setMediaCapturePermissionGrantType(T t11, @Nullable String str);

    void setMediaPlaybackRequiresUserAction(T t11, boolean z11);

    void setMenuItems(T t11, @Nullable ReadableArray readableArray);

    void setMessagingEnabled(T t11, boolean z11);

    void setMessagingModuleName(T t11, @Nullable String str);

    void setMinimumFontSize(T t11, int i11);

    void setMixedContentMode(T t11, @Nullable String str);

    void setNestedScrollEnabled(T t11, boolean z11);

    void setNewSource(T t11, @Nullable ReadableMap readableMap);

    void setOverScrollMode(T t11, @Nullable String str);

    void setPagingEnabled(T t11, boolean z11);

    void setPullToRefreshEnabled(T t11, boolean z11);

    void setRefreshControlLightMode(T t11, boolean z11);

    void setSaveFormDataDisabled(T t11, boolean z11);

    void setScalesPageToFit(T t11, boolean z11);

    void setScrollEnabled(T t11, boolean z11);

    void setSetBuiltInZoomControls(T t11, boolean z11);

    void setSetDisplayZoomControls(T t11, boolean z11);

    void setSetSupportMultipleWindows(T t11, boolean z11);

    void setSharedCookiesEnabled(T t11, boolean z11);

    void setShowsHorizontalScrollIndicator(T t11, boolean z11);

    void setShowsVerticalScrollIndicator(T t11, boolean z11);

    void setSuppressMenuItems(T t11, @Nullable ReadableArray readableArray);

    void setTextInteractionEnabled(T t11, boolean z11);

    void setTextZoom(T t11, int i11);

    void setThirdPartyCookiesEnabled(T t11, boolean z11);

    void setUseSharedProcessPool(T t11, boolean z11);

    void setUserAgent(T t11, @Nullable String str);

    void setWebviewDebuggingEnabled(T t11, boolean z11);

    void stopLoading(T t11);
}
