package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.sumsub.sns.R$color;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.internal.core.common.AbstractC28427X;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC31852a {
    /* JADX INFO: renamed from: a */
    public static final void m70917a(LottieAnimationView lottieAnimationView) {
        C28955c c28955c;
        SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
        int color = ContextCompat.getColor(lottieAnimationView.getContext(), R$color.sns_contentWeak);
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            boolean zM69346a = AbstractC28458h.m69346a(lottieAnimationView.getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num != null) {
                color = num.intValue();
            }
        }
        AbstractC28427X.m69312a(lottieAnimationView, "Chip area", color);
        AbstractC28427X.m69312a(lottieAnimationView, "Phone sensor", color);
    }
}
