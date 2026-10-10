package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.video.Quality;
import com.sumsub.sns.internal.p126ml.autocapture.SeamlessDocaptureMobileConfig$VideoQuality;
import p852kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC30566i {
    /* JADX INFO: renamed from: a */
    public static final Quality m70409a(SeamlessDocaptureMobileConfig$VideoQuality seamlessDocaptureMobileConfig$VideoQuality) {
        int i11 = AbstractC30560h.f61720a[seamlessDocaptureMobileConfig$VideoQuality.ordinal()];
        if (i11 == 1) {
            return Quality.UHD;
        }
        if (i11 == 2) {
            return Quality.FHD;
        }
        if (i11 == 3) {
            return Quality.f1930HD;
        }
        if (i11 == 4) {
            return Quality.f1931SD;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public static final Rect m70408a(Rect rect, float f11, float f12) {
        RectF rectF = new RectF(rect);
        return new Rect((int) (rectF.left * f11), (int) (rectF.top * f12), (int) (rectF.right * f11), (int) (rectF.bottom * f12));
    }
}
