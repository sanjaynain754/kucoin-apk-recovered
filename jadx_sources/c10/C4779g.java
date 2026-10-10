package c10;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.core.WebBridge;
import com.kubi.sdk.web.scene.SceneType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: c10.g */
/* JADX INFO: compiled from: WebSceneFactory.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lc10/g;", "", "Lcom/kubi/sdk/web/core/WebBridge;", "bridge", "<init>", "(Lcom/kubi/sdk/web/core/WebBridge;)V", "Lcom/kubi/sdk/web/scene/SceneType;", "default", "Lc10/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/sdk/web/scene/SceneType;)Lc10/f;", "Lcom/kubi/sdk/web/core/WebBridge;", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C4779g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WebBridge bridge;

    /* JADX INFO: renamed from: c10.g$a */
    /* JADX INFO: compiled from: WebSceneFactory.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SceneType.values().length];
            try {
                iArr[SceneType.BasicWebApp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SceneType.CachedWebApp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SceneType.Template.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SceneType.BaseCachedWebApp.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C4779g(@NotNull WebBridge bridge) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        this.bridge = bridge;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AbstractC4778f m4850a(@NotNull SceneType sceneType) {
        Intrinsics.checkNotNullParameter(sceneType, "default");
        int i11 = a.$EnumSwitchMapping$0[sceneType.ordinal()];
        if (i11 == 1) {
            return new C4774b(this.bridge);
        }
        if (i11 == 2) {
            return new C4775c(this.bridge);
        }
        if (i11 != 3) {
            return i11 != 4 ? new C4776d(this.bridge) : new C4773a(this.bridge);
        }
        return new C4777e(this.bridge);
    }
}
