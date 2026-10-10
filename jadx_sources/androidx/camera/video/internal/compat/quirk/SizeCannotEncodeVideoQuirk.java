package androidx.camera.video.internal.compat.quirk;

import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class SizeCannotEncodeVideoQuirk implements Quirk {
    private static Set<Size> getProblematicSizes() {
        if (isMotoC()) {
            return new HashSet(Collections.singletonList(new Size(720, 1280)));
        }
        return Collections.EMPTY_SET;
    }

    private static boolean isMotoC() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean load() {
        return isMotoC();
    }

    public Rect adjustCropRectForProblematicEncodeSize(Rect rect, int i11, VideoEncoderInfo videoEncoderInfo) {
        int heightAlignment;
        Size sizeRotateSize = TransformUtils.rotateSize(TransformUtils.rectToSize(rect), i11);
        if (!isProblematicEncodeSize(sizeRotateSize)) {
            return rect;
        }
        if (videoEncoderInfo != null) {
            heightAlignment = videoEncoderInfo.getHeightAlignment() / 2;
        } else {
            heightAlignment = 8;
        }
        Rect rect2 = new Rect(rect);
        if (rect.width() == sizeRotateSize.getHeight()) {
            rect2.left += heightAlignment;
            rect2.right -= heightAlignment;
            return rect2;
        }
        rect2.top += heightAlignment;
        rect2.bottom -= heightAlignment;
        return rect2;
    }

    public boolean isProblematicEncodeSize(Size size) {
        return getProblematicSizes().contains(size);
    }
}
