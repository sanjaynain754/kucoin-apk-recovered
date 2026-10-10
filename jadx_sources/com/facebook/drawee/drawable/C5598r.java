package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.r */
/* JADX INFO: compiled from: ScalingUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5598r extends AbstractC5596p {

    /* JADX INFO: renamed from: l */
    public static final InterfaceC5597q f8362l = new C5598r();

    @Override // com.facebook.drawee.drawable.AbstractC5596p
    public void getTransformImpl(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        matrix.setTranslate((int) (rect.left + ((rect.width() - i11) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i12) * 0.5f) + 0.5f));
    }

    public String toString() {
        return TtmlNode.CENTER;
    }
}
