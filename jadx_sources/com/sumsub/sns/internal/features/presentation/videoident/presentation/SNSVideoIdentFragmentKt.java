package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.graphics.drawable.DrawableCompat;
import com.sumsub.sns.R$id;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, m90084d2 = {"applyIconLayerTint", "", "Landroid/graphics/drawable/Drawable;", "color", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSVideoIdentFragmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyIconLayerTint(Drawable drawable, int i11) {
        Drawable drawableFindDrawableByLayerId;
        LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
        if (layerDrawable == null || (drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R$id.icon)) == null) {
            return;
        }
        DrawableCompat.setTint(drawableFindDrawableByLayerId, i11);
    }
}
