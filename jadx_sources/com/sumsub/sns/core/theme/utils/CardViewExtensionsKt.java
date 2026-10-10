package com.sumsub.sns.core.theme.utils;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.material.card.MaterialCardView;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$CardStyle;
import com.sumsub.sns.internal.log.C33272c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"applyStyle", "", "Lcom/google/android/material/card/MaterialCardView;", TtmlNode.TAG_STYLE, "Lcom/sumsub/sns/core/theme/SNSThemeMetric$CardStyle;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class CardViewExtensionsKt {
    public static final void applyStyle(@NotNull MaterialCardView materialCardView, @NotNull SNSThemeMetric$CardStyle sNSThemeMetric$CardStyle) {
        if (sNSThemeMetric$CardStyle != SNSThemeMetric$CardStyle.BORDERED) {
            Logger.DefaultImpls.w$default(C33272c.f67812a, "Theme", "applyStyle: " + sNSThemeMetric$CardStyle + " NOT supported", null, 4, null);
            return;
        }
        Integer numM69174a = AbstractC28234b.m69174a(materialCardView, SNSColorElement.CONTENT_INFO);
        Integer numM69174a2 = AbstractC28234b.m69174a(materialCardView, SNSColorElement.CONTENT_WEAK);
        if (!materialCardView.isSelected()) {
            numM69174a = numM69174a2;
        }
        if (numM69174a != null) {
            materialCardView.setStrokeColor(numM69174a.intValue());
        }
    }
}
