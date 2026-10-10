package com.sumsub.sns.core.presentation.helper;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28956d;
import com.sumsub.sns.internal.core.presentation.theme.C28957e;
import com.sumsub.sns.internal.core.presentation.theme.C28958f;
import com.sumsub.sns.internal.core.presentation.theme.C28960h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.helper.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28233a {
    /* JADX INFO: renamed from: a */
    public static C28966p m69169a() {
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        if (theme instanceof C28966p) {
            return (C28966p) theme;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Integer m69172a(C28966p c28966p, SNSColorElement sNSColorElement, boolean z11) {
        C28955c c28955c;
        Map map = c28966p.f58877c;
        if (map == null || (c28955c = (C28955c) map.get(sNSColorElement.getValue())) == null) {
            return null;
        }
        return z11 ? c28955c.f58858a : c28955c.f58859b;
    }

    /* JADX INFO: renamed from: b */
    public static String m69173b(C28966p c28966p, SNSMetricElement sNSMetricElement) {
        Map map = c28966p.f58878d;
        AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
        C28960h c28960h = abstractC28962j instanceof C28960h ? (C28960h) abstractC28962j : null;
        if (c28960h != null) {
            return c28960h.f58868a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Float m69171a(C28966p c28966p, SNSMetricElement sNSMetricElement) {
        Map map = c28966p.f58878d;
        AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
        C28956d c28956d = abstractC28962j instanceof C28956d ? (C28956d) abstractC28962j : null;
        if (c28956d != null) {
            return c28956d.f58860a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static BitmapDrawable m69168a(C28966p c28966p, String str, String str2) {
        C28957e c28957e;
        C28957e c28957e2;
        Map map = c28966p.f58879e;
        AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(str2) : null;
        C28958f c28958f = abstractC28962j instanceof C28958f ? (C28958f) abstractC28962j : null;
        Bitmap bitmap = (c28958f == null || (c28957e2 = (C28957e) c28958f.f58865a.get(str)) == null) ? null : c28957e2.f58864d;
        Bitmap bitmap2 = (c28958f == null || (c28957e = (C28957e) c28958f.f58865a.get("default")) == null) ? null : c28957e.f58864d;
        if (bitmap == null) {
            bitmap = bitmap2;
        }
        if (bitmap != null) {
            return new BitmapDrawable(bitmap);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Float m69170a(SNSMetricElement sNSMetricElement) {
        C28966p c28966pM69169a = m69169a();
        if (c28966pM69169a != null) {
            return m69171a(c28966pM69169a, sNSMetricElement);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static ColorStateList m69167a(boolean z11, Integer num, ColorStateList colorStateList) {
        C28966p c28966pM69169a = m69169a();
        if (c28966pM69169a != null) {
            if (num == null && (num = m69172a(c28966pM69169a, SNSColorElement.CONTENT_NEUTRAL, z11)) == null) {
                num = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R$attr.sns_stateInit}, -65281)) : null;
            }
            SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WARNING;
            Integer numM69172a = m69172a(c28966pM69169a, sNSColorElement, z11);
            if (numM69172a == null) {
                numM69172a = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R$attr.sns_statePending}, -65281)) : null;
                if (numM69172a == null) {
                    numM69172a = num;
                }
            }
            Integer numM69172a2 = m69172a(c28966pM69169a, SNSColorElement.CONTENT_SUCCESS, z11);
            if (numM69172a2 == null) {
                numM69172a2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R$attr.sns_stateApproved}, -65281)) : null;
                if (numM69172a2 == null) {
                    numM69172a2 = num;
                }
            }
            Integer numM69172a3 = m69172a(c28966pM69169a, SNSColorElement.CONTENT_CRITICAL, z11);
            if (numM69172a3 == null) {
                numM69172a3 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R$attr.sns_stateRejected}, -65281)) : null;
                if (numM69172a3 == null) {
                    numM69172a3 = num;
                }
            }
            Integer numM69172a4 = m69172a(c28966pM69169a, sNSColorElement, z11);
            if (numM69172a4 == null) {
                numM69172a4 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R$attr.sns_stateProcessing}, -65281)) : null;
                if (numM69172a4 == null) {
                    numM69172a4 = num;
                }
            }
            Integer numM69172a5 = m69172a(c28966pM69169a, SNSColorElement.CONTENT_WEAK, z11);
            if (numM69172a5 == null) {
                numM69172a5 = colorStateList != null ? Integer.valueOf(colorStateList.getDefaultColor()) : null;
                if (numM69172a5 == null) {
                    numM69172a5 = num;
                }
            }
            if (num != null) {
                return new ColorStateList(new int[][]{new int[]{R$attr.sns_stateInit}, new int[]{R$attr.sns_statePending}, new int[]{R$attr.sns_stateApproved}, new int[]{R$attr.sns_stateRejected}, new int[]{R$attr.sns_stateProcessing}, new int[0]}, new int[]{num.intValue(), numM69172a.intValue(), numM69172a2.intValue(), numM69172a3.intValue(), numM69172a4.intValue(), numM69172a5.intValue()});
            }
        }
        return null;
    }
}
