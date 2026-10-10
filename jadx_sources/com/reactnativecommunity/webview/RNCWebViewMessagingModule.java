package com.reactnativecommunity.webview;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: RNCWebViewMessagingModule.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m90084d2 = {"Lcom/reactnativecommunity/webview/RNCWebViewMessagingModule;", "Lcom/facebook/react/bridge/JavaScriptModule;", "onShouldStartLoadWithRequest", "", "event", "Lcom/facebook/react/bridge/WritableMap;", "onMessage", "react-native-webview_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface RNCWebViewMessagingModule extends JavaScriptModule {
    void onMessage(@NotNull WritableMap event);

    void onShouldStartLoadWithRequest(@NotNull WritableMap event);
}
