package com.kubi.sdk.web.core;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.sdk.web.util.C24335h;
import com.tencent.qcloud.tuicore.TUIConstants;
import e10.InterfaceC37042a;
import e10.InterfaceC37043b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import z00.InterfaceC46621c;

/* JADX INFO: compiled from: BridgeWebChromeClient.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 =2\u00020\u0001:\u0002>?B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010$\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0018\u00010\u001e2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u0004\u0018\u00010*2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b1\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00102\u001a\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006@"}, m90084d2 = {"Lcom/kubi/sdk/web/core/BridgeWebChromeClient;", "Landroid/webkit/WebChromeClient;", "Lcom/kubi/sdk/web/core/WebBridge;", "bridge", "<init>", "(Lcom/kubi/sdk/web/core/WebBridge;)V", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/webkit/WebChromeClient$CustomViewCallback;", TUIConstants.TUIChat.CALL_BACK, "", "onShowCustomView", "(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V", "onHideCustomView", "()V", "Lcom/kubi/sdk/web/core/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "c", "(Lcom/kubi/sdk/web/core/b;)V", "Landroid/webkit/WebView;", "", "newProgress", "onProgressChanged", "(Landroid/webkit/WebView;I)V", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "webView", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "filePathCallback", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "onShowFileChooser", "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z", "Landroid/webkit/PermissionRequest;", "request", "onPermissionRequest", "(Landroid/webkit/PermissionRequest;)V", "Landroid/graphics/Bitmap;", "getDefaultVideoPoster", "()Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "config", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "b", "Lcom/kubi/sdk/web/core/WebBridge;", "getBridge", "()Lcom/kubi/sdk/web/core/WebBridge;", "Lcom/kubi/sdk/web/core/b;", "fullscreenListener", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "customViewCallback", "Lcom/kubi/sdk/web/core/BridgeWebChromeClient$ConsoleErrorLimiter;", "d", "Lcom/kubi/sdk/web/core/BridgeWebChromeClient$ConsoleErrorLimiter;", "consoleErrorLimiter", "e", "Companion", "ConsoleErrorLimiter", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBridgeWebChromeClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeWebChromeClient.kt\ncom/kubi/sdk/web/core/BridgeWebChromeClient\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,184:1\n71#2,4:185\n71#2,4:189\n*S KotlinDebug\n*F\n+ 1 BridgeWebChromeClient.kt\ncom/kubi/sdk/web/core/BridgeWebChromeClient\n*L\n70#1:185,4\n136#1:189,4\n*E\n"})
public final class BridgeWebChromeClient extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WebBridge bridge;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public InterfaceC24304b fullscreenListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public WebChromeClient.CustomViewCallback customViewCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ConsoleErrorLimiter consoleErrorLimiter;

    /* JADX INFO: compiled from: BridgeWebChromeClient.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\n\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/web/core/BridgeWebChromeClient$ConsoleErrorLimiter;", "", "<init>", "()V", "", "url", "message", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;)Z", "com/kubi/sdk/web/core/BridgeWebChromeClient$ConsoleErrorLimiter$records$1", "Lcom/kubi/sdk/web/core/BridgeWebChromeClient$ConsoleErrorLimiter$records$1;", "records", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class ConsoleErrorLimiter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final BridgeWebChromeClient$ConsoleErrorLimiter$records$1 records = new BridgeWebChromeClient$ConsoleErrorLimiter$records$1();

        /* JADX INFO: renamed from: com.kubi.sdk.web.core.BridgeWebChromeClient$ConsoleErrorLimiter$a, reason: from toString */
        /* JADX INFO: compiled from: BridgeWebChromeClient.kt */
        @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/web/core/BridgeWebChromeClient$ConsoleErrorLimiter$a;", "", "", "windowStartMs", "", "count", "<init>", "(JI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "b", "()J", "I", "c", "(I)V", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final /* data */ class Record {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            public final long windowStartMs;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            public int count;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Record)) {
                    return false;
                }
                Record record = (Record) other;
                return this.windowStartMs == record.windowStartMs && this.count == record.count;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getCount() {
                return this.count;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final long getWindowStartMs() {
                return this.windowStartMs;
            }

            /* JADX INFO: renamed from: c */
            public final void m58621c(int i11) {
                this.count = i11;
            }

            public int hashCode() {
                return (Long.hashCode(this.windowStartMs) * 31) + Integer.hashCode(this.count);
            }

            @NotNull
            public String toString() {
                return "Record(windowStartMs=" + this.windowStartMs + ", count=" + this.count + ')';
            }

            public Record(long j11, int i11) {
                this.windowStartMs = j11;
                this.count = i11;
            }
        }

        /* JADX INFO: renamed from: a */
        public final synchronized boolean m58618a(@Nullable String url, @NotNull String message) {
            boolean z11;
            Intrinsics.checkNotNullParameter(message, "message");
            z11 = true;
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                StringBuilder sb2 = new StringBuilder();
                if (url == null) {
                    url = "";
                }
                sb2.append(StringsKt.take(url, 512));
                sb2.append('\n');
                sb2.append(StringsKt.take(message, 512));
                String string = sb2.toString();
                Record record = (Record) this.records.get((Object) string);
                if (record == null || jElapsedRealtime - record.getWindowStartMs() >= 60000) {
                    this.records.put(string, new Record(jElapsedRealtime, 1));
                } else if (record.getCount() >= 3) {
                    z11 = false;
                } else {
                    record.m58621c(record.getCount() + 1);
                }
            } catch (Throwable unused) {
            }
            return z11;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m58615a(Bitmap.Config config) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, config);
            bitmapCreateBitmap.eraseColor(0);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            C24329b.m58861c(C24329b.f48558a, "BridgeWebChromeClient", "create default video poster failed,config=" + config + ",url is:" + this.bridge.getCurrentUrl(), null, 4, null);
            return null;
        }
    }

    public BridgeWebChromeClient(@NotNull WebBridge bridge) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        this.bridge = bridge;
        this.consoleErrorLimiter = new ConsoleErrorLimiter();
    }

    /* JADX INFO: renamed from: b */
    public final void m58616b(PermissionRequest request) {
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("type", "request_permission");
        String[] resources = request.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "request.resources");
        eventParametersBuilderAcquire.m42393d(Constants.BIZ, ArraysKt.toMutableList(resources).toString());
        String host = request.getOrigin().getHost();
        if (host == null) {
            host = "";
        }
        Intrinsics.checkNotNullExpressionValue(host, "request.origin.host?:\"\"");
        eventParametersBuilderAcquire.m42393d("host", host);
        String string = request.getOrigin().toString();
        Intrinsics.checkNotNullExpressionValue(string, "request.origin.toString()");
        eventParametersBuilderAcquire.m42393d("url", string);
        TechnologyEvent.m42388d("kucoin_webview", eventParametersBuilderAcquire);
    }

    /* JADX INFO: renamed from: c */
    public final void m58617c(@NotNull InterfaceC24304b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.fullscreenListener = listener;
    }

    @Override // android.webkit.WebChromeClient
    @Nullable
    public Bitmap getDefaultVideoPoster() {
        Bitmap bitmapM58615a = m58615a(Bitmap.Config.ARGB_8888);
        if (bitmapM58615a != null) {
            return bitmapM58615a;
        }
        Bitmap bitmapM58615a2 = m58615a(Bitmap.Config.RGB_565);
        if (bitmapM58615a2 != null) {
            return bitmapM58615a2;
        }
        Bitmap bitmapM58615a3 = m58615a(Bitmap.Config.ALPHA_8);
        if (bitmapM58615a3 != null) {
            return bitmapM58615a3;
        }
        C24329b.m58861c(C24329b.f48558a, "BridgeWebChromeClient", "create default video poster failed all configs,url is:" + this.bridge.getCurrentUrl(), null, 4, null);
        return null;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(@NotNull ConsoleMessage consoleMessage) {
        Intrinsics.checkNotNullParameter(consoleMessage, "consoleMessage");
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            ConsoleErrorLimiter consoleErrorLimiter = this.consoleErrorLimiter;
            String currentUrl = this.bridge.getCurrentUrl();
            String strMessage = consoleMessage.message();
            Intrinsics.checkNotNullExpressionValue(strMessage, "consoleMessage.message()");
            if (consoleErrorLimiter.m58618a(currentUrl, strMessage)) {
                C24329b.m58861c(C24329b.f48558a, "BridgeWebChromeClient", "onConsole error,url is:" + this.bridge.getCurrentUrl() + ",message:" + consoleMessage.message(), null, 4, null);
                String currentUrl2 = this.bridge.getCurrentUrl();
                Uri uriM58889h = currentUrl2 != null ? C24335h.f48569a.m58889h(currentUrl2) : null;
                if (uriM58889h != null) {
                    TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
                    TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                    eventParametersBuilderAcquire.m42393d("type", "onconsole_message");
                    String encodedPath = uriM58889h.getEncodedPath();
                    if (encodedPath == null) {
                        encodedPath = "";
                    }
                    Intrinsics.checkNotNullExpressionValue(encodedPath, "it.encodedPath?:\"\"");
                    eventParametersBuilderAcquire.m42393d("path", encodedPath);
                    String host = uriM58889h.getHost();
                    String str = host != null ? host : "";
                    Intrinsics.checkNotNullExpressionValue(str, "it.host?:\"\"");
                    eventParametersBuilderAcquire.m42393d("host", str);
                    String string = uriM58889h.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "it.toString()");
                    eventParametersBuilderAcquire.m42393d("url", string);
                    String strMessage2 = consoleMessage.message();
                    Intrinsics.checkNotNullExpressionValue(strMessage2, "consoleMessage.message()");
                    eventParametersBuilderAcquire.m42393d("error_message", strMessage2);
                    TechnologyEvent.m42388d("kucoin_webview", eventParametersBuilderAcquire);
                }
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        InterfaceC24304b interfaceC24304b = this.fullscreenListener;
        if (interfaceC24304b != null) {
            interfaceC24304b.mo58688a();
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.customViewCallback;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(@Nullable PermissionRequest request) {
        if (request == null) {
            return;
        }
        C24329b.f48558a.m58864d("BridgeWebChromeClient", "onPermissionRequest:" + request.getResources());
        try {
            m58616b(request);
            InterfaceC37043b webPermission = this.bridge.getWebPermission();
            if (webPermission == null) {
                request.deny();
            } else {
                webPermission.mo67315a(request);
            }
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("request permission error url:");
            sb2.append(request.getOrigin());
            sb2.append(", request source:");
            String[] resources = request.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "request.resources");
            sb2.append(ArraysKt.toMutableList(resources));
            C43846g.m96568c(new WebPermissionReqException(sb2.toString()), null, 2, null);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(@Nullable WebView view, final int newProgress) {
        if (view == null) {
            return;
        }
        this.bridge.m58675w().m58774e(new Function1<InterfaceC46621c, Unit>() { // from class: com.kubi.sdk.web.core.BridgeWebChromeClient.onProgressChanged.1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC46621c interfaceC46621c) {
                invoke2(interfaceC46621c);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC46621c on2) {
                Intrinsics.checkNotNullParameter(on2, "$this$on");
                on2.mo58793b(newProgress);
            }
        });
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(@NotNull View view, @NotNull WebChromeClient.CustomViewCallback callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.customViewCallback = callback;
        C24303a.f48422a.m58687d(view, callback);
        InterfaceC24304b interfaceC24304b = this.fullscreenListener;
        if (interfaceC24304b != null) {
            interfaceC24304b.mo58689b(view, callback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(@Nullable WebView webView, @Nullable ValueCallback<Uri[]> filePathCallback, @Nullable WebChromeClient.FileChooserParams fileChooserParams) {
        InterfaceC37042a fileChooser;
        if (this.bridge.getFileChooser() == null || filePathCallback == null || (fileChooser = this.bridge.getFileChooser()) == null) {
            return false;
        }
        return fileChooser.mo67298a(this.bridge.getWebView(), filePathCallback, fileChooserParams);
    }
}
