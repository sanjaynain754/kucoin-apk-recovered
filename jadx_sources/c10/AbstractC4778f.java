package c10;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.CallSuper;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.core.WebBridge;
import com.kubi.sdk.web.jsapi.JsEventObj;
import com.kubi.sdk.web.scene.SceneType;
import com.kubi.sdk.web.tracker.BaseTracker;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: c10.f */
/* JADX INFO: compiled from: WebScene.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ+\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001a\u0010&\u001a\u00020\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0014\u0010)\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, m90084d2 = {"Lc10/f;", "", "Lcom/kubi/sdk/web/core/WebBridge;", "bridge", "<init>", "(Lcom/kubi/sdk/web/core/WebBridge;)V", "Lcom/kubi/sdk/web/scene/SceneType;", "prev", "", "d", "(Lcom/kubi/sdk/web/scene/SceneType;)V", "next", "f", "", "url", "", ReportDataTable.COLUMN_PARAMS, CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "", "i", "(Ljava/lang/String;)Z", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "g", "(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Lcom/kubi/sdk/web/jsapi/JsEventObj;", "eventObj", "e", "(Lcom/kubi/sdk/web/jsapi/JsEventObj;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/sdk/web/core/WebBridge;", "()Lcom/kubi/sdk/web/core/WebBridge;", "Lcom/kubi/sdk/web/tracker/BaseTracker;", "b", "Lcom/kubi/sdk/web/tracker/BaseTracker;", "()Lcom/kubi/sdk/web/tracker/BaseTracker;", "tracker", "c", "()Lcom/kubi/sdk/web/scene/SceneType;", "type", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class AbstractC4778f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WebBridge bridge;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final BaseTracker tracker;

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract SceneType mo4838c();

    public AbstractC4778f(@NotNull WebBridge bridge) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        this.bridge = bridge;
        this.tracker = new BaseTracker();
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final WebBridge getBridge() {
        return this.bridge;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public BaseTracker getTracker() {
        return this.tracker;
    }

    @CallSuper
    /* JADX INFO: renamed from: d */
    public void mo4841d(@NotNull SceneType prev) {
        Intrinsics.checkNotNullParameter(prev, "prev");
        getTracker().m58845u(mo4838c());
    }

    /* JADX INFO: renamed from: e */
    public void mo4842e(@NotNull JsEventObj eventObj) {
        Intrinsics.checkNotNullParameter(eventObj, "eventObj");
        eventObj.onReceiveValue(null);
    }

    /* JADX INFO: renamed from: f */
    public void mo4843f(@NotNull SceneType next) {
        Intrinsics.checkNotNullParameter(next, "next");
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public WebResourceResponse mo4847g(@NotNull WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo4844h(@NotNull String url, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(params, "params");
        return url;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo4845i(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return true;
    }
}
