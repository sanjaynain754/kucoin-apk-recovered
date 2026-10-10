package c10;

import com.kubi.sdk.web.core.WebBridge;
import com.kubi.sdk.web.scene.SceneType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: c10.d */
/* JADX INFO: compiled from: DefaultWebScene.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, m90084d2 = {"Lc10/d;", "Lc10/f;", "Lcom/kubi/sdk/web/core/WebBridge;", "bridge", "<init>", "(Lcom/kubi/sdk/web/core/WebBridge;)V", "Lcom/kubi/sdk/web/scene/SceneType;", "c", "Lcom/kubi/sdk/web/scene/SceneType;", "()Lcom/kubi/sdk/web/scene/SceneType;", "type", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C4776d extends AbstractC4778f {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final SceneType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4776d(@NotNull WebBridge bridge) {
        super(bridge);
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        this.type = SceneType.Default;
    }

    @Override // c10.AbstractC4778f
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public SceneType getType() {
        return this.type;
    }
}
