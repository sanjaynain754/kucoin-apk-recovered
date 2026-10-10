package androidx.camera.video.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: PreviewBlackScreenQuirk.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewBlackScreenQuirk;", "Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;", "<init>", "()V", "Companion", "camera-video_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class PreviewBlackScreenQuirk implements SurfaceProcessingQuirk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean isMotorolaEdge20Fusion;
    private static final boolean isSamsungSmT580;

    /* JADX INFO: compiled from: PreviewBlackScreenQuirk.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewBlackScreenQuirk$Companion;", "", "<init>", "()V", "load", "", "isMotorolaEdge20Fusion", "isSamsungSmT580", "camera-video_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final boolean load() {
            if (!PreviewBlackScreenQuirk.isMotorolaEdge20Fusion && !PreviewBlackScreenQuirk.isSamsungSmT580) {
                return false;
            }
            return true;
        }
    }

    static {
        String str = Build.BRAND;
        isMotorolaEdge20Fusion = StringsKt.equals(str, "motorola", true) && StringsKt.equals(Build.MODEL, "motorola edge 20 fusion", true);
        isSamsungSmT580 = StringsKt.equals(str, "samsung", true) && StringsKt.equals(Build.MODEL, "sm-t580", true);
    }

    @JvmStatic
    public static final boolean load() {
        return INSTANCE.load();
    }
}
