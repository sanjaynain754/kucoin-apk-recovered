package com.sumsub.sns.core.presentation.helper;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSThemeMetric$TextAlignment;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28961i;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.helper.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28234b {
    /* JADX INFO: renamed from: a */
    public static final void m69176a(TextView textView, SNSTypographyElement sNSTypographyElement, SNSColorElement sNSColorElement) {
        Integer num;
        C28955c c28955c;
        C28955c c28955c2;
        C28961i c28961i;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num2 = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            Map map = c28966p.f58876b;
            if (map != null && (c28961i = (C28961i) map.get(sNSTypographyElement.getValue())) != null) {
                Typeface typeface = c28961i.f58872d;
                if (typeface != null) {
                    textView.setTypeface(typeface);
                }
                textView.setTextSize(c28961i.f58870b);
            }
            boolean zM69346a = AbstractC28458h.m69346a(textView.getResources().getConfiguration());
            Map map2 = c28966p.f58877c;
            if (map2 == null || (c28955c2 = (C28955c) map2.get(sNSColorElement.getValue())) == null) {
                num = null;
            } else {
                num = zM69346a ? c28955c2.f58858a : c28955c2.f58859b;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                if (textView instanceof EditText) {
                    textView.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{Color.argb(95, Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)), iIntValue}));
                } else {
                    textView.setTextColor(iIntValue);
                }
            }
            SNSColorElement sNSColorElement2 = SNSColorElement.CONTENT_LINK;
            boolean zM69346a2 = AbstractC28458h.m69346a(textView.getResources().getConfiguration());
            Map map3 = c28966p.f58877c;
            if (map3 != null && (c28955c = (C28955c) map3.get(sNSColorElement2.getValue())) != null) {
                num2 = zM69346a2 ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num2 != null) {
                textView.setLinkTextColor(num2.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Integer m69174a(View view, SNSColorElement sNSColorElement) {
        C28955c c28955c;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            boolean zM69346a = AbstractC28458h.m69346a(view.getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                if (zM69346a) {
                    return c28955c.f58858a;
                }
                return c28955c.f58859b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final void m69177a(TextView textView, String str) {
        Integer numValueOf;
        if (Intrinsics.areEqual(str, SNSThemeMetric$TextAlignment.LEFT.getValue())) {
            numValueOf = Integer.valueOf(GravityCompat.START);
        } else if (Intrinsics.areEqual(str, SNSThemeMetric$TextAlignment.RIGHT.getValue())) {
            numValueOf = Integer.valueOf(GravityCompat.END);
        } else {
            numValueOf = Intrinsics.areEqual(str, SNSThemeMetric$TextAlignment.CENTER.getValue()) ? 17 : null;
        }
        if (numValueOf != null) {
            textView.setGravity(numValueOf.intValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m69175a(TextView textView, ColorStateList colorStateList) {
        if (AbstractC28233a.m69169a() != null) {
            textView.setTextColor(AbstractC28233a.m69167a(AbstractC28458h.m69346a(textView.getResources().getConfiguration()), (Integer) null, colorStateList));
        }
    }
}
