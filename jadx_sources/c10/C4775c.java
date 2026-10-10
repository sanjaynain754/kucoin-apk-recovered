package c10;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.CallSuper;
import androidx.media3.exoplayer.upstream.CmcdData;
import b10.C4454b;
import com.kubi.sdk.web.core.WebBridge;
import com.kubi.sdk.web.jsapi.C24318c;
import com.kubi.sdk.web.jsapi.JsEventObj;
import com.kubi.sdk.web.listener.holder.WebLoadListenerHolder;
import com.kubi.sdk.web.proxy.LocalFileWebProxy;
import com.kubi.sdk.web.proxy.MixWebProxy;
import com.kubi.sdk.web.proxy.ProxyType;
import com.kubi.sdk.web.proxy.RedirectIndexLocalProxy;
import com.kubi.sdk.web.scene.SceneType;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.sdk.web.util.C24335h;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import f10.C37322a;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: c10.c */
/* JADX INFO: compiled from: CachedWebScene.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ+\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u001a\u0010,\u001a\u00020(8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010/\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b \u0010.¨\u00060"}, m90084d2 = {"Lc10/c;", "Lc10/f;", "Lcom/kubi/sdk/web/core/WebBridge;", "bridge", "<init>", "(Lcom/kubi/sdk/web/core/WebBridge;)V", "Lcom/kubi/sdk/web/scene/SceneType;", "prev", "", "d", "(Lcom/kubi/sdk/web/scene/SceneType;)V", "next", "f", "", "url", "", ReportDataTable.COLUMN_PARAMS, CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "", "i", "(Ljava/lang/String;)Z", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "g", "(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Lcom/kubi/sdk/web/jsapi/JsEventObj;", "eventObj", "e", "(Lcom/kubi/sdk/web/jsapi/JsEventObj;)V", "Lf10/a;", "c", "Lf10/a;", "k", "()Lf10/a;", "tracker", "Lcom/kubi/sdk/web/listener/holder/WebLoadListenerHolder;", "Lcom/kubi/sdk/web/listener/holder/WebLoadListenerHolder;", "trackerListener", "Lcom/kubi/sdk/web/proxy/MixWebProxy;", "Lcom/kubi/sdk/web/proxy/MixWebProxy;", "j", "()Lcom/kubi/sdk/web/proxy/MixWebProxy;", "proxy", "Lcom/kubi/sdk/web/scene/SceneType;", "()Lcom/kubi/sdk/web/scene/SceneType;", "type", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCachedWebScene.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedWebScene.kt\ncom/kubi/sdk/web/scene/CachedWebScene\n+ 2 JsBridgeHelper.kt\ncom/kubi/sdk/web/jsapi/JsBridgeHelper\n*L\n1#1,70:1\n21#2,4:71\n30#2,4:75\n*S KotlinDebug\n*F\n+ 1 CachedWebScene.kt\ncom/kubi/sdk/web/scene/CachedWebScene\n*L\n35#1:71,4\n40#1:75,4\n*E\n"})
public class C4775c extends AbstractC4778f {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C37322a tracker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final WebLoadListenerHolder<C37322a> trackerListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final MixWebProxy proxy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final SceneType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4775c(@NotNull WebBridge bridge) {
        super(bridge);
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        this.tracker = new C37322a();
        this.trackerListener = WebLoadListenerHolder.Companion.holder$default(WebLoadListenerHolder.INSTANCE, getTracker(), false, 1, null);
        this.proxy = new MixWebProxy(new RedirectIndexLocalProxy(bridge.m58668p()), new LocalFileWebProxy(bridge.m58668p()));
        this.type = SceneType.CachedWebApp;
    }

    @Override // c10.AbstractC4778f
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public SceneType getType() {
        return this.type;
    }

    @Override // c10.AbstractC4778f
    /* JADX INFO: renamed from: d */
    public void mo4841d(@NotNull SceneType prev) {
        Intrinsics.checkNotNullParameter(prev, "prev");
        super.mo4841d(prev);
        C24318c c24318c = C24318c.f48486a;
        WebBridge bridge = getBridge();
        C24329b.f48558a.m58864d("jsbridgeEnable", "addJsBridge");
        c24318c.m58766a(bridge.getWebView(), bridge);
        c24318c.m58767b(bridge.getWebView());
        getBridge().m58675w().m58770a(this.trackerListener);
    }

    @Override // c10.AbstractC4778f
    /* JADX INFO: renamed from: e */
    public void mo4842e(@NotNull JsEventObj eventObj) {
        Intrinsics.checkNotNullParameter(eventObj, "eventObj");
        getBridge().getEventQueue().mo58657a(eventObj);
    }

    @Override // c10.AbstractC4778f
    /* JADX INFO: renamed from: f */
    public void mo4843f(@NotNull SceneType next) {
        Intrinsics.checkNotNullParameter(next, "next");
        C24318c c24318c = C24318c.f48486a;
        WebBridge bridge = getBridge();
        C24329b.f48558a.m58864d("jsbridgeEnable", "removeJsBridges");
        c24318c.m58768c(bridge.getWebView());
        c24318c.m58769d(bridge.getWebView());
        getBridge().m58675w().m58775f(this.trackerListener);
    }

    @Override // c10.AbstractC4778f
    @Nullable
    /* JADX INFO: renamed from: g */
    public WebResourceResponse mo4847g(@NotNull WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        C4454b c4454bMo4249a = getProxy().mo4249a(request);
        C37322a tracker = getTracker();
        ProxyType proxyType = c4454bMo4249a != null ? c4454bMo4249a.getProxyType() : null;
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "request.url.toString()");
        tracker.m83890A(proxyType, string);
        if ((c4454bMo4249a != null ? c4454bMo4249a.getProxyType() : null) == ProxyType.RedirectIndexLocal) {
            getBridge().m58664l();
        }
        return c4454bMo4249a;
    }

    @Override // c10.AbstractC4778f
    @CallSuper
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo4844h(@NotNull String url, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(params, "params");
        return C24335h.f48569a.m58884c(url, params);
    }

    @Override // c10.AbstractC4778f
    /* JADX INFO: renamed from: i */
    public boolean mo4845i(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C24335h.f48569a.m58886e(url, getBridge().getCurrentUrl());
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public MixWebProxy getProxy() {
        return this.proxy;
    }

    @Override // c10.AbstractC4778f
    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public C37322a getTracker() {
        return this.tracker;
    }
}
