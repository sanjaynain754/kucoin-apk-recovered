package com.kubi.sdk.web.jsapi;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.core.WebBridge;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsBridgeCallbackImpl.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/web/jsapi/JsBridgeCallbackImpl;", "Lcom/kubi/sdk/web/jsapi/a;", "Lcom/kubi/sdk/web/core/WebBridge;", "bridge", "", "func", "event", "<init>", "(Lcom/kubi/sdk/web/core/WebBridge;Ljava/lang/String;Ljava/lang/String;)V", DbParams.KEY_CHANNEL_RESULT, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "Ljava/lang/String;", "b", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "c", "Ljava/lang/ref/WeakReference;", "bridgeRef", "d", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class JsBridgeCallbackImpl implements InterfaceC24316a {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String func;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String event;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<WebBridge> bridgeRef;

    /* JADX INFO: compiled from: JsBridgeCallbackImpl.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/web/jsapi/JsBridgeCallbackImpl$Companion;", "", "<init>", "()V", "Lcom/kubi/sdk/web/core/WebBridge;", "bridge", "", "func", "event", "Lcom/kubi/sdk/web/jsapi/a;", "obtain", "(Lcom/kubi/sdk/web/core/WebBridge;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/web/jsapi/a;", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final InterfaceC24316a obtain(@NotNull WebBridge bridge, @Nullable String func, @Nullable String event) {
            Intrinsics.checkNotNullParameter(bridge, "bridge");
            if (func == null || func.length() == 0 || event == null || event.length() == 0) {
                return null;
            }
            return new JsBridgeCallbackImpl(bridge, func, event);
        }
    }

    public JsBridgeCallbackImpl(@NotNull WebBridge bridge, @NotNull String func, @NotNull String event) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        Intrinsics.checkNotNullParameter(func, "func");
        Intrinsics.checkNotNullParameter(event, "event");
        this.func = func;
        this.event = event;
        this.bridgeRef = new WeakReference<>(bridge);
    }

    @Override // com.kubi.sdk.web.jsapi.InterfaceC24316a
    /* JADX INFO: renamed from: a */
    public void mo58745a(@NotNull String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        WebBridge webBridge = this.bridgeRef.get();
        if (webBridge == null) {
            return;
        }
        webBridge.getEventQueue().m58763d(new JsEventObj(this.event, result, this.func, null));
    }
}
