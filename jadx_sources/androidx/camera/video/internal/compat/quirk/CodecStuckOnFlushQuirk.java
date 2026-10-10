package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import androidx.media3.common.MimeTypes;

/* JADX INFO: loaded from: classes23.dex */
public class CodecStuckOnFlushQuirk implements Quirk {
    private static boolean isNokia1() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isNokia1();
    }

    public boolean isProblematicMimeType(String str) {
        return MimeTypes.VIDEO_MP4V.equals(str);
    }
}
