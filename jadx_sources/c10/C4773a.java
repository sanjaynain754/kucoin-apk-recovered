package c10;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.core.WebBridge;
import com.kubi.sdk.web.proxy.LocalBaseFileWebProxy;
import com.kubi.sdk.web.proxy.MixWebProxy;
import com.kubi.sdk.web.proxy.RedirectIndexLocalProxy;
import com.kubi.sdk.web.scene.SceneType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: c10.a */
/* JADX INFO: compiled from: BaseCachedWebAppScene.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lc10/a;", "Lc10/c;", "Lcom/kubi/sdk/web/core/WebBridge;", "bridge", "<init>", "(Lcom/kubi/sdk/web/core/WebBridge;)V", "Lcom/kubi/sdk/web/proxy/MixWebProxy;", "g", "Lcom/kubi/sdk/web/proxy/MixWebProxy;", "j", "()Lcom/kubi/sdk/web/proxy/MixWebProxy;", "proxy", "Lcom/kubi/sdk/web/scene/SceneType;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/kubi/sdk/web/scene/SceneType;", "c", "()Lcom/kubi/sdk/web/scene/SceneType;", "type", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C4773a extends C4775c {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final MixWebProxy proxy;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final SceneType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4773a(@NotNull WebBridge bridge) {
        super(bridge);
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        this.proxy = new MixWebProxy(new RedirectIndexLocalProxy(bridge.m58668p()), new LocalBaseFileWebProxy(bridge.m58668p()));
        this.type = SceneType.BaseCachedWebApp;
    }

    @Override // c10.C4775c, c10.AbstractC4778f
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public SceneType getType() {
        return this.type;
    }

    @Override // c10.C4775c
    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public MixWebProxy getProxy() {
        return this.proxy;
    }
}
