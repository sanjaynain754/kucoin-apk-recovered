package androidx.camera.video.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.camera.core.impl.Quirk;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: PreviewFreezeAfterHighSpeedRecordingQuirk.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewFreezeAfterHighSpeedRecordingQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "load", "", "isPixelPhone", "camera-video_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class PreviewFreezeAfterHighSpeedRecordingQuirk implements Quirk {

    @NotNull
    public static final PreviewFreezeAfterHighSpeedRecordingQuirk INSTANCE = new PreviewFreezeAfterHighSpeedRecordingQuirk();
    private static final boolean isPixelPhone;

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    static {
        boolean z11;
        if (StringsKt.equals(Build.BRAND, "google", true)) {
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            z11 = StringsKt.startsWith(MODEL, "Pixel", true);
        }
        isPixelPhone = z11;
    }

    @JvmStatic
    public static final boolean load() {
        return isPixelPhone;
    }

    private PreviewFreezeAfterHighSpeedRecordingQuirk() {
    }
}
