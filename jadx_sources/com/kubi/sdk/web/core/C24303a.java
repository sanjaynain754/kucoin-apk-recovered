package com.kubi.sdk.web.core;

import android.view.View;
import android.webkit.WebChromeClient;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.web.core.a */
/* JADX INFO: compiled from: FullscreenHolder.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/web/core/a;", "", "<init>", "()V", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/webkit/WebChromeClient$CustomViewCallback;", "cb", "", "d", "(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "fullscreenViewRef", "c", "callbackRef", "()Landroid/view/View;", "fullscreenView", "()Landroid/webkit/WebChromeClient$CustomViewCallback;", TUIConstants.TUIChat.CALL_BACK, "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C24303a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24303a f48422a = new C24303a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static WeakReference<View> fullscreenViewRef = new WeakReference<>(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static WeakReference<WebChromeClient.CustomViewCallback> callbackRef = new WeakReference<>(null);

    /* JADX INFO: renamed from: a */
    public final void m58684a() {
        fullscreenViewRef.clear();
        callbackRef.clear();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final WebChromeClient.CustomViewCallback m58685b() {
        return callbackRef.get();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final View m58686c() {
        return fullscreenViewRef.get();
    }

    /* JADX INFO: renamed from: d */
    public final void m58687d(@NotNull View view, @NotNull WebChromeClient.CustomViewCallback cb2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(cb2, "cb");
        fullscreenViewRef = new WeakReference<>(view);
        callbackRef = new WeakReference<>(cb2);
    }
}
