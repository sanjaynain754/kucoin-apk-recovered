package com.kubi.jsbridge.knb;

import android.content.Context;
import android.os.Looper;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.web.KWebView;
import com.kubi.widget.web.ui.KWebBaseActivity;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36577l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: KCJSApiLifeCycleModuleImpl.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00050\u0011H\u0016¢\u0006\u0002\u0010\u0014JY\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00050\u0011H\u0002¢\u0006\u0002\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/jsbridge/knb/KCJSApiLifeCycleModuleImpl;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiLifeCycleModule;", "<init>", "()V", "pageDidMount", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "pageType", "dclTime", "", "subPath", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "dispatchPageDidMount", "webView", "Lcom/kubi/sdk/web/KWebView;", "(Lcom/kubi/sdk/web/KWebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Companion", "WebBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCJSApiLifeCycleModuleImpl implements InterfaceC36577l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f27485a = new Companion(null);

    /* JADX INFO: compiled from: KCJSApiLifeCycleModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/jsbridge/knb/KCJSApiLifeCycleModuleImpl$Companion;", "", "<init>", "()V", "TAG", "", "WebBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // d00.InterfaceC36577l
    /* JADX INFO: renamed from: a */
    public void mo31854a(@NotNull Context ctx, @Nullable Object obj, @NotNull final String source, @Nullable final String str, @Nullable final Double d11, @Nullable final String str2, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        final Function2<? super Boolean, ? super ProtocolException, Unit> function2;
        Throwable th2;
        KWebView kWebViewM67452n0;
        final KWebView kWebView;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            if (obj instanceof KWebView) {
                try {
                    kWebViewM67452n0 = (KWebView) obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    function2 = callback;
                }
            } else {
                kWebViewM67452n0 = null;
            }
            if (kWebViewM67452n0 != null) {
                kWebView = kWebViewM67452n0;
            } else {
                KWebBaseActivity kWebBaseActivity = ctx instanceof KWebBaseActivity ? (KWebBaseActivity) ctx : null;
                if (kWebBaseActivity != null) {
                    kWebViewM67452n0 = kWebBaseActivity.m67452n0();
                    kWebView = kWebViewM67452n0;
                } else {
                    kWebView = null;
                }
            }
            if (kWebView == null) {
                callback.invoke(Boolean.FALSE, null);
                return;
            }
            function2 = callback;
            try {
                Runnable runnable = new Runnable() { // from class: com.kubi.jsbridge.knb.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        KCJSApiLifeCycleModuleImpl.m31853d(this.f27490b, kWebView, source, str, d11, str2, function2);
                    }
                };
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    runnable.run();
                    return;
                } else {
                    if (kWebView.post(runnable)) {
                        return;
                    }
                    function2.invoke(Boolean.FALSE, new ProtocolException("post pageDidMount to main thread failed", null, null, false, 14, null));
                    return;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            function2 = callback;
        }
        th2 = th;
        function2.invoke(Boolean.FALSE, new ProtocolException(th2.getMessage(), th2, null, false, 12, null));
    }

    /* JADX INFO: renamed from: c */
    public final void m31855c(KWebView kWebView, String str, String str2, Double d11, String str3, Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        try {
            C44128b.m97266j("KWebPageMount", "pageDidMount source=" + str + " url=" + kWebView.getUrl() + " pageType=" + str2 + " dclTime=" + d11 + " subPath=" + str3);
            kWebView.m58582v(str2, d11, null, null);
            function2.invoke(Boolean.TRUE, null);
        } catch (Throwable th2) {
            function2.invoke(Boolean.FALSE, new ProtocolException(th2.getMessage(), th2, null, false, 12, null));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m31853d(KCJSApiLifeCycleModuleImpl kCJSApiLifeCycleModuleImpl, KWebView kWebView, String str, String str2, Double d11, String str3, Function2 function2) {
        kCJSApiLifeCycleModuleImpl.m31855c(kWebView, str, str2, d11, str3, function2);
    }
}
