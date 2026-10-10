package c10;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.kubi.sdk.web.core.WebBridge;
import com.kubi.sdk.web.jsapi.C24318c;
import com.kubi.sdk.web.listener.holder.WebLoadListenerHolder;
import com.kubi.sdk.web.proxy.GlideImageWebProxy;
import com.kubi.sdk.web.scene.SceneType;
import com.kubi.sdk.web.tracker.BaseTracker;
import com.kubi.sdk.web.util.C24329b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: c10.e */
/* JADX INFO: compiled from: TemplateWebScene.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lc10/e;", "Lc10/f;", "Lcom/kubi/sdk/web/core/WebBridge;", "bridge", "<init>", "(Lcom/kubi/sdk/web/core/WebBridge;)V", "Lcom/kubi/sdk/web/scene/SceneType;", "prev", "", "d", "(Lcom/kubi/sdk/web/scene/SceneType;)V", "next", "f", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "g", "(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Lcom/kubi/sdk/web/proxy/GlideImageWebProxy;", "c", "Lcom/kubi/sdk/web/proxy/GlideImageWebProxy;", "proxy", "Lcom/kubi/sdk/web/listener/holder/WebLoadListenerHolder;", "Lcom/kubi/sdk/web/tracker/BaseTracker;", "Lcom/kubi/sdk/web/listener/holder/WebLoadListenerHolder;", "trackerListener", "e", "Lcom/kubi/sdk/web/scene/SceneType;", "()Lcom/kubi/sdk/web/scene/SceneType;", "type", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTemplateWebScene.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemplateWebScene.kt\ncom/kubi/sdk/web/scene/TemplateWebScene\n+ 2 JsBridgeHelper.kt\ncom/kubi/sdk/web/jsapi/JsBridgeHelper\n*L\n1#1,37:1\n21#2,4:38\n30#2,4:42\n*S KotlinDebug\n*F\n+ 1 TemplateWebScene.kt\ncom/kubi/sdk/web/scene/TemplateWebScene\n*L\n25#1:38,4\n30#1:42,4\n*E\n"})
public final class C4777e extends AbstractC4778f {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final GlideImageWebProxy proxy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final WebLoadListenerHolder<BaseTracker> trackerListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final SceneType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4777e(@NotNull WebBridge bridge) {
        super(bridge);
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        this.proxy = new GlideImageWebProxy(bridge.m58668p());
        this.trackerListener = WebLoadListenerHolder.Companion.holder$default(WebLoadListenerHolder.INSTANCE, getTracker(), false, 1, null);
        this.type = SceneType.Template;
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
        return this.proxy.mo4249a(request);
    }
}
